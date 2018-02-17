/**
 * ProductUpdateRequestMessageSystemProductTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class ProductUpdateRequestMessageSystemProductTypeBean  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String department;

    private java.lang.String _class;

    private java.lang.String sub_class;

    private java.lang.String master_style_code;

    private com.microsretail.Locate.ProductUpdateRequestMessageProductLocationTypeBean[] product_locations;

    private java.lang.String system_code;  // attribute

    private java.lang.String system_product_code;  // attribute

    private java.lang.String product_code;  // attribute

    public ProductUpdateRequestMessageSystemProductTypeBean() {
    }

    public ProductUpdateRequestMessageSystemProductTypeBean(
           java.lang.String description,
           java.lang.String department,
           java.lang.String _class,
           java.lang.String sub_class,
           java.lang.String master_style_code,
           com.microsretail.Locate.ProductUpdateRequestMessageProductLocationTypeBean[] product_locations,
           java.lang.String system_code,
           java.lang.String system_product_code,
           java.lang.String product_code) {
           this.description = description;
           this.department = department;
           this._class = _class;
           this.sub_class = sub_class;
           this.master_style_code = master_style_code;
           this.product_locations = product_locations;
           this.system_code = system_code;
           this.system_product_code = system_product_code;
           this.product_code = product_code;
    }


    /**
     * Gets the description value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the department value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @return _class
     */
    public java.lang.String get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @param _class
     */
    public void set_class(java.lang.String _class) {
        this._class = _class;
    }


    /**
     * Gets the sub_class value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @return sub_class
     */
    public java.lang.String getSub_class() {
        return sub_class;
    }


    /**
     * Sets the sub_class value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @param sub_class
     */
    public void setSub_class(java.lang.String sub_class) {
        this.sub_class = sub_class;
    }


    /**
     * Gets the master_style_code value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @return master_style_code
     */
    public java.lang.String getMaster_style_code() {
        return master_style_code;
    }


    /**
     * Sets the master_style_code value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @param master_style_code
     */
    public void setMaster_style_code(java.lang.String master_style_code) {
        this.master_style_code = master_style_code;
    }


    /**
     * Gets the product_locations value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @return product_locations
     */
    public com.microsretail.Locate.ProductUpdateRequestMessageProductLocationTypeBean[] getProduct_locations() {
        return product_locations;
    }


    /**
     * Sets the product_locations value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @param product_locations
     */
    public void setProduct_locations(com.microsretail.Locate.ProductUpdateRequestMessageProductLocationTypeBean[] product_locations) {
        this.product_locations = product_locations;
    }


    /**
     * Gets the system_code value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @return system_code
     */
    public java.lang.String getSystem_code() {
        return system_code;
    }


    /**
     * Sets the system_code value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @param system_code
     */
    public void setSystem_code(java.lang.String system_code) {
        this.system_code = system_code;
    }


    /**
     * Gets the system_product_code value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @return system_product_code
     */
    public java.lang.String getSystem_product_code() {
        return system_product_code;
    }


    /**
     * Sets the system_product_code value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @param system_product_code
     */
    public void setSystem_product_code(java.lang.String system_product_code) {
        this.system_product_code = system_product_code;
    }


    /**
     * Gets the product_code value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @return product_code
     */
    public java.lang.String getProduct_code() {
        return product_code;
    }


    /**
     * Sets the product_code value for this ProductUpdateRequestMessageSystemProductTypeBean.
     * 
     * @param product_code
     */
    public void setProduct_code(java.lang.String product_code) {
        this.product_code = product_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductUpdateRequestMessageSystemProductTypeBean)) return false;
        ProductUpdateRequestMessageSystemProductTypeBean other = (ProductUpdateRequestMessageSystemProductTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.sub_class==null && other.getSub_class()==null) || 
             (this.sub_class!=null &&
              this.sub_class.equals(other.getSub_class()))) &&
            ((this.master_style_code==null && other.getMaster_style_code()==null) || 
             (this.master_style_code!=null &&
              this.master_style_code.equals(other.getMaster_style_code()))) &&
            ((this.product_locations==null && other.getProduct_locations()==null) || 
             (this.product_locations!=null &&
              java.util.Arrays.equals(this.product_locations, other.getProduct_locations()))) &&
            ((this.system_code==null && other.getSystem_code()==null) || 
             (this.system_code!=null &&
              this.system_code.equals(other.getSystem_code()))) &&
            ((this.system_product_code==null && other.getSystem_product_code()==null) || 
             (this.system_product_code!=null &&
              this.system_product_code.equals(other.getSystem_product_code()))) &&
            ((this.product_code==null && other.getProduct_code()==null) || 
             (this.product_code!=null &&
              this.product_code.equals(other.getProduct_code())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getSub_class() != null) {
            _hashCode += getSub_class().hashCode();
        }
        if (getMaster_style_code() != null) {
            _hashCode += getMaster_style_code().hashCode();
        }
        if (getProduct_locations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct_locations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduct_locations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSystem_code() != null) {
            _hashCode += getSystem_code().hashCode();
        }
        if (getSystem_product_code() != null) {
            _hashCode += getSystem_product_code().hashCode();
        }
        if (getProduct_code() != null) {
            _hashCode += getProduct_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductUpdateRequestMessageSystemProductTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageSystemProductTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("system_code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "system_code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("system_product_code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "system_product_code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("product_code");
        attrField.setXmlName(new javax.xml.namespace.QName("", "product_code"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sub_class");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sub_class"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("master_style_code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "master_style_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product_locations");
        elemField.setXmlName(new javax.xml.namespace.QName("", "product_locations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageProductLocationTypeBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "product_location"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
