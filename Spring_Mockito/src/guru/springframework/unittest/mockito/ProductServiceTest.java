package guru.springframework.unittest.mockito;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

	@InjectMocks
	private ProductService productService;

	@Mock
	private ProductDao productDao;

	@Mock
	private Product product;

	private int purchaseQuantity = 15;

	@Before
	public void initializeMockito() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testBuy() throws InsufficientProductsException {
		int availableQuantity = 30;

		System.out.println("Stubbing getAvailableProducts(product) to return " + availableQuantity);
		when(productDao.getAvailableProducts(product)).thenReturn(availableQuantity);

		System.out.println("Calling ProductService.buy(product," + purchaseQuantity + ")");
		productService.buy(product, purchaseQuantity);

		System.out.println("Verifying ProductDao(product, " + purchaseQuantity + ") is called");
		verify(productDao).orderProduct(product, purchaseQuantity);

		System.out.println("Verifying getAvailableProducts(product) is called at least once");
		verify(productDao, atLeastOnce()).getAvailableProducts(product);

		System.out
				.println("Verifying order of method calls on ProductDao: First call getAvailableProducts() followed by orderProduct()");
		InOrder order = inOrder(productDao);
		order.verify(productDao).getAvailableProducts(product);
		order.verify(productDao).orderProduct(product, purchaseQuantity);

	}

	@Test(expected = InsufficientProductsException.class)
	public void purchaseWithInsufficientAvailableQuantity() throws InsufficientProductsException {
		int availableQuantity = 3;

		System.out.println("Stubbing getAvailableProducts(product) to return " + availableQuantity);
		when(productDao.getAvailableProducts(product)).thenReturn(availableQuantity);

		try {
			System.out.println("productService.buy(product" + purchaseQuantity
					+ ") should throw InsufficientProductsException");
			productService.buy(product, purchaseQuantity);
		} catch (InsufficientProductsException e) {
			System.out.println("InsufficientProductsException has been thrown");
			verify(productDao, times(0)).orderProduct(product, purchaseQuantity);
			System.out.println("Verified orderProduct(product, " + purchaseQuantity
					+ ") is not called");
			throw e;
		}
	}

}