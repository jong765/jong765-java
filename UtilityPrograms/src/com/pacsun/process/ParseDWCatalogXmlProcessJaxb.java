package com.pacsun.process;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pacsun.catalog.jaxb.Catalog;
import com.pacsun.catalog.jaxb.ComplexTypeProduct;
import com.pacsun.catalog.jaxb.ComplexTypeProductVariationsVariant;
import com.pacsun.catalog.jaxb.SharedTypeSiteSpecificCustomAttribute;
import com.pacsun.dao.ProductDAO;
import com.pacsun.dao.ProductVariantDAO;
import com.pacsun.dto.ProductDTO;
import com.pacsun.dto.ProductVariantDTO;

public class ParseDWCatalogXmlProcessJaxb {

	@SuppressWarnings("resource")
	public void run() throws JAXBException {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
				"parseDWCatalogXMLApplicationContext.xml");

		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		ProductVariantDAO productVariantDAO = (ProductVariantDAO) context.getBean("productVariantDAO");
		
		JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Catalog catalog = (Catalog) jaxbUnmarshaller.unmarshal(new File(
				"Custom/QUA/xml/catalog_20140701_232604.xml"));
		
		//Product list
		List<ProductDTO> products = new ArrayList<ProductDTO>();
		List<ProductVariantDTO> productVariants = new ArrayList<ProductVariantDTO>();
		
		List<ComplexTypeProduct> productList = catalog.getProduct();
		
		for (ComplexTypeProduct product : productList) {
			ProductDTO productDTO = new ProductDTO();
			productDTO.setProductId(product.getProductId());
			if (product.getDisplayName().size() > 0)
				productDTO.setDisplayName(product.getDisplayName().get(0).getValue());
			productDTO.setBrand(product.getBrand());
			productDTO.setUpc(product.getUpc());

			List<SharedTypeSiteSpecificCustomAttribute> customAttributes = product.getCustomAttributes().getCustomAttribute();
			
			for(SharedTypeSiteSpecificCustomAttribute customAttribute: customAttributes) {
				
				if (customAttribute.getAttributeId().equalsIgnoreCase("department")) {
					productDTO.setDepartment(customAttribute.getContent().get(0).toString());
				}
				else if (customAttribute.getAttributeId().equalsIgnoreCase("division")) {
					productDTO.setDivision(customAttribute.getContent().get(0).toString());
				}
				else if (customAttribute.getAttributeId().equalsIgnoreCase("color")) {
					productDTO.setColor(customAttribute.getContent().get(0).toString());
				}
				else if (customAttribute.getAttributeId().equalsIgnoreCase("size")) {
					productDTO.setSize(customAttribute.getContent().get(0).toString());
				}
			}
			products.add(productDTO);
			
			if (product.getVariations() != null) {
				List<ComplexTypeProductVariationsVariant> variants = product.getVariations().getVariants().getVariant();
				for(ComplexTypeProductVariationsVariant variant : variants) {
					ProductVariantDTO productVariantDTO = new ProductVariantDTO();
					productVariantDTO.setProductId(product.getProductId());
					productVariantDTO.setVariantProductId(variant.getProductId());
					productVariants.add(productVariantDTO);
				}
			}
		}
		
		productDAO.insertBatch1(products);
		productVariantDAO.insertBatch(productVariants);
	}

}
