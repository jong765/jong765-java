/**
 * StatusInquiryRequestMessageHeaderTypeBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class StatusInquiryRequestMessageHeaderTypeBean  implements java.io.Serializable {
    private java.lang.String datetime;

    private java.lang.String version;

    private java.lang.String source;

    private java.lang.String destination;

    private java.lang.String xaction_type;  // attribute

    private java.lang.String xaction_response;  // attribute

    private java.lang.String message_type;  // attribute

    public StatusInquiryRequestMessageHeaderTypeBean() {
    }

    public StatusInquiryRequestMessageHeaderTypeBean(
           java.lang.String datetime,
           java.lang.String version,
           java.lang.String source,
           java.lang.String destination,
           java.lang.String xaction_type,
           java.lang.String xaction_response,
           java.lang.String message_type) {
           this.datetime = datetime;
           this.version = version;
           this.source = source;
           this.destination = destination;
           this.xaction_type = xaction_type;
           this.xaction_response = xaction_response;
           this.message_type = message_type;
    }


    /**
     * Gets the datetime value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @return datetime
     */
    public java.lang.String getDatetime() {
        return datetime;
    }


    /**
     * Sets the datetime value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @param datetime
     */
    public void setDatetime(java.lang.String datetime) {
        this.datetime = datetime;
    }


    /**
     * Gets the version value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the source value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the destination value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the xaction_type value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @return xaction_type
     */
    public java.lang.String getXaction_type() {
        return xaction_type;
    }


    /**
     * Sets the xaction_type value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @param xaction_type
     */
    public void setXaction_type(java.lang.String xaction_type) {
        this.xaction_type = xaction_type;
    }


    /**
     * Gets the xaction_response value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @return xaction_response
     */
    public java.lang.String getXaction_response() {
        return xaction_response;
    }


    /**
     * Sets the xaction_response value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @param xaction_response
     */
    public void setXaction_response(java.lang.String xaction_response) {
        this.xaction_response = xaction_response;
    }


    /**
     * Gets the message_type value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @return message_type
     */
    public java.lang.String getMessage_type() {
        return message_type;
    }


    /**
     * Sets the message_type value for this StatusInquiryRequestMessageHeaderTypeBean.
     * 
     * @param message_type
     */
    public void setMessage_type(java.lang.String message_type) {
        this.message_type = message_type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusInquiryRequestMessageHeaderTypeBean)) return false;
        StatusInquiryRequestMessageHeaderTypeBean other = (StatusInquiryRequestMessageHeaderTypeBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datetime==null && other.getDatetime()==null) || 
             (this.datetime!=null &&
              this.datetime.equals(other.getDatetime()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            ((this.xaction_type==null && other.getXaction_type()==null) || 
             (this.xaction_type!=null &&
              this.xaction_type.equals(other.getXaction_type()))) &&
            ((this.xaction_response==null && other.getXaction_response()==null) || 
             (this.xaction_response!=null &&
              this.xaction_response.equals(other.getXaction_response()))) &&
            ((this.message_type==null && other.getMessage_type()==null) || 
             (this.message_type!=null &&
              this.message_type.equals(other.getMessage_type())));
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
        if (getDatetime() != null) {
            _hashCode += getDatetime().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        if (getXaction_type() != null) {
            _hashCode += getXaction_type().hashCode();
        }
        if (getXaction_response() != null) {
            _hashCode += getXaction_response().hashCode();
        }
        if (getMessage_type() != null) {
            _hashCode += getMessage_type().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusInquiryRequestMessageHeaderTypeBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryRequestMessageHeaderTypeBean"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("xaction_type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "xaction_type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("xaction_response");
        attrField.setXmlName(new javax.xml.namespace.QName("", "xaction_response"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("message_type");
        attrField.setXmlName(new javax.xml.namespace.QName("", "message_type"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
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
