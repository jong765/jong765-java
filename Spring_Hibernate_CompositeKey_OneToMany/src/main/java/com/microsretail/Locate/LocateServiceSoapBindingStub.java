/**
 * LocateServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public class LocateServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.microsretail.Locate.Locate {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[11];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OrderUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://microsretail.com/Locate", "order_update_request_message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateRequestMessageTypeBean"), com.microsretail.Locate.OrderUpdateRequestMessageTypeBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateResponseMessageTypeBean"));
        oper.setReturnClass(com.microsretail.Locate.OrderUpdateResponseMessageTypeBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "order_update_response_message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProductUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://microsretail.com/Locate", "product_update_request_message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageTypeBean"), com.microsretail.Locate.ProductUpdateRequestMessageTypeBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateResponseMessageTypeBean"));
        oper.setReturnClass(com.microsretail.Locate.ProductUpdateResponseMessageTypeBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "product_update_response_message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StatusRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://microsretail.com/Locate", "status_request_message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryRequestMessageTypeBean"), com.microsretail.Locate.StatusInquiryRequestMessageTypeBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusResponseMessageTypeBean"));
        oper.setReturnClass(com.microsretail.Locate.StatusResponseMessageTypeBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status_response_message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EchoTest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TestMesg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OrderSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://microsretail.com/Locate", "order_search_request_message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderSearchRequestMessageTypeBean"), com.microsretail.Locate.OrderSearchRequestMessageTypeBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusResponseMessageTypeBean"));
        oper.setReturnClass(com.microsretail.Locate.StatusResponseMessageTypeBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "order_search_response_message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StatusUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://microsretail.com/Locate", "status_update_request_message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageTypeBean"), com.microsretail.Locate.StatusUpdateRequestMessageTypeBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateResponseMessageTypeBean"));
        oper.setReturnClass(com.microsretail.Locate.StatusUpdateResponseMessageTypeBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generic_response_message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Fulfillments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://microsretail.com/Locate", "fulfillment_request_message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentRequestMessageTypeBean"), com.microsretail.Locate.FulfillmentRequestMessageTypeBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentResponseMessageTypeBean"));
        oper.setReturnClass(com.microsretail.Locate.FulfillmentResponseMessageTypeBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "fulfillment_response_message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StatusListRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://microsretail.com/Locate", "status_list_request_message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageTypeBean"), com.microsretail.Locate.StatusListInquiryRequestMessageTypeBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageTypeBean"));
        oper.setReturnClass(com.microsretail.Locate.StatusListInquiryResponseMessageTypeBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status_list_request_message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SubmitOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://microsretail.com/Locate", "order_request_message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestMessageTypeBean"), com.microsretail.Locate.SubmitOrderRequestMessageTypeBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderResponseMessageTypeBean"));
        oper.setReturnClass(com.microsretail.Locate.SubmitOrderResponseMessageTypeBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "generic_response_message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LocateItems");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://microsretail.com/Locate", "location_request_message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageTypeBean"), com.microsretail.Locate.LocateItemsRequestMessageTypeBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageTypeBean"));
        oper.setReturnClass(com.microsretail.Locate.LocateItemsResponseMessageTypeBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "location_response_message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProductAvailability");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://microsretail.com/Locate", "product_availability_request_message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageTypeBean"), com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageTypeBean.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductAvailabilityResponseMessageTypeBean"));
        oper.setReturnClass(com.microsretail.Locate.ProductAvailabilityResponseMessageTypeBean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "product_availability_response_message"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

    }

    public LocateServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public LocateServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public LocateServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AddressTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AddressTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderResponseMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderResponseMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageAddressTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageAddressTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageFulfillmentsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean");
            qName2 = new javax.xml.namespace.QName("", "fulfillment_type");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageFulfillmentTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageItemsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageItemTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageItemTypeBean");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageItemTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageItemTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeRequestMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageFulfillmentsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean");
            qName2 = new javax.xml.namespace.QName("", "fulfillment_type");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageFulfillmentTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageItemsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageItemTypeBean");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageItemTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean");
            qName2 = new javax.xml.namespace.QName("", "locations_lu");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationLookupTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageLocationsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageLocationTypeBean");
            qName2 = new javax.xml.namespace.QName("", "location");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "AvailabilityByOrderTypeResponseMessageLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.AvailabilityByOrderTypeResponseMessageLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "customerTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.CustomerTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "DSSalesOrderCustomizationsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.DSSalesOrderCustomizationTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "DSSalesOrderCustomizationTypeBean");
            qName2 = new javax.xml.namespace.QName("", "customization");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "DSSalesOrderCustomizationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.DSSalesOrderCustomizationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentRequestMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.FulfillmentRequestMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentRequestMessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.FulfillmentRequestMessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentRequestMessageStoreLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.FulfillmentRequestMessageStoreLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentRequestMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.FulfillmentRequestMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentResponseMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.FulfillmentResponseMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentResponseMessageItemsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.FulfillmentResponseMessageItemTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentResponseMessageItemTypeBean");
            qName2 = new javax.xml.namespace.QName("", "item_detail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentResponseMessageItemTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.FulfillmentResponseMessageItemTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentResponseMessageOrdersTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.FulfillmentResponseMessageOrderTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentResponseMessageOrderTypeBean");
            qName2 = new javax.xml.namespace.QName("", "order");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentResponseMessageOrderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.FulfillmentResponseMessageOrderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentResponseMessageStoreLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.FulfillmentResponseMessageStoreLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "FulfillmentResponseMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.FulfillmentResponseMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateIemsRequestMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateIemsRequestMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageAddressTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsRequestMessageAddressTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsRequestMessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageItemsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsRequestMessageItemTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageItemTypeBean");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageItemTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsRequestMessageItemTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageRangeTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsRequestMessageRangeTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageRequestedLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsRequestMessageRequestedLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageStoreLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsRequestMessageStoreLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsRequestMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsRequestMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsResponseMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageItemsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsResponseMessageLocationLookupTypeBean[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageItemTypeBean");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageItemTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsResponseMessageLocationLookupTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageLocationLookupTypeBean");
            qName2 = new javax.xml.namespace.QName("", "locations_lu");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageLocationLookupTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsResponseMessageLocationLookupTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageLocationsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsResponseMessageLocationTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageLocationTypeBean");
            qName2 = new javax.xml.namespace.QName("", "location");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsResponseMessageLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItemsResponseMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.LocateItemsResponseMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "MessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.MessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "NameTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.NameTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderSearchMessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderSearchMessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderSearchRequestMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderSearchRequestMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderSearchRequestMessageLookupDataTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderSearchRequestMessageLookupDataTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderSearchRequestMessageStoreLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderSearchRequestMessageStoreLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderSearchRequestMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderSearchRequestMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateRequestMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderUpdateRequestMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateRequestMessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderUpdateRequestMessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateRequestMessageOrderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderUpdateRequestMessageOrderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateRequestMessageStoreLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderUpdateRequestMessageStoreLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateRequestMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderUpdateRequestMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateResponseMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderUpdateResponseMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateResponseMessageResponseTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderUpdateResponseMessageResponseTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdateResponseMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.OrderUpdateResponseMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductAvailabilityResponseMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.ProductAvailabilityResponseMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.ProductUpdateRequestMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.ProductUpdateRequestMessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageProductLocationsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.ProductUpdateRequestMessageProductLocationTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageProductLocationTypeBean");
            qName2 = new javax.xml.namespace.QName("", "product_location");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageProductLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.ProductUpdateRequestMessageProductLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageSystemProductTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.ProductUpdateRequestMessageSystemProductTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateRequestMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.ProductUpdateRequestMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateResponseMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.ProductUpdateResponseMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateResponseMessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.ProductUpdateResponseMessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdateResponseMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.ProductUpdateResponseMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SoldToCustomerTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SoldToCustomerTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryRequestMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusInquiryRequestMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryRequestMessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusInquiryRequestMessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryRequestMessageLookupDataTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusInquiryRequestMessageLookupDataTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryRequestMessageStoreLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusInquiryRequestMessageStoreLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryRequestMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusInquiryRequestMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryResponseMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusInquiryResponseMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryResponseMessageItemsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusInquiryResponseMessageItemTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryResponseMessageItemTypeBean");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryResponseMessageItemTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusInquiryResponseMessageItemTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryResponseMessageOrdersTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusInquiryResponseMessageOrderTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryResponseMessageOrderTypeBean");
            qName2 = new javax.xml.namespace.QName("", "order");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusInquiryResponseMessageOrderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusInquiryResponseMessageOrderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryRequestMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryRequestMessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageLookupDataTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryRequestMessageLookupDataTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageRequestIdBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryRequestMessageRequestIdBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageRequestIdsBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryRequestMessageRequestIdBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageRequestIdBean");
            qName2 = new javax.xml.namespace.QName("", "request_ids");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageStatusBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryRequestMessageStatusBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageStatusesBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryRequestMessageStatusBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageStatusBean");
            qName2 = new javax.xml.namespace.QName("", "statuses");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageStoreLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryRequestMessageStoreLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryRequestMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryRequestMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryResponseMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageItemsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryResponseMessageItemTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageItemTypeBean");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageItemTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryResponseMessageItemTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageOrdersTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryResponseMessageOrderTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageOrderTypeBean");
            qName2 = new javax.xml.namespace.QName("", "order");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageOrderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryResponseMessageOrderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListInquiryResponseMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusListInquiryResponseMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusResponseMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusResponseMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusUpdateRequestMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusUpdateRequestMessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageItemsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusUpdateRequestMessageItemTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageItemTypeBean");
            qName2 = new javax.xml.namespace.QName("", "item");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageItemTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusUpdateRequestMessageItemTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageOrderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusUpdateRequestMessageOrderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageStoreLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusUpdateRequestMessageStoreLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateRequestMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusUpdateRequestMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateResponseMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusUpdateResponseMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateResponseMessageResponseTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusUpdateResponseMessageResponseTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdateResponseMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StatusUpdateResponseMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "StoreLocationTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.StoreLocationTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderRequestMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestMessageHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderRequestMessageHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestMessageTransactionHeaderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderRequestMessageTransactionHeaderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestMessageTransactionsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderRequestMessageTransactionsTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderRequestMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestTransactionDetailsTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderRequestTransactionDetailTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestTransactionDetailTypeBean");
            qName2 = new javax.xml.namespace.QName("", "transaction_detail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderRequestTransactionDetailTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderRequestTransactionDetailTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderResponseMessageBodyTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderResponseMessageBodyTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderResponseMessageFulfillmentDetail");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderResponseMessageFulfillmentDetail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderResponseMessageFulfillmentDetails");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderResponseMessageFulfillmentDetail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderResponseMessageFulfillmentDetail");
            qName2 = new javax.xml.namespace.QName("", "fulfillment_detail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderResponseMessageResponseTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderResponseMessageResponseTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrderResponseMessageTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.SubmitOrderResponseMessageTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "TaxesTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.TaxTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "TaxTypeBean");
            qName2 = new javax.xml.namespace.QName("", "tax");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "TaxTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.TaxTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "TransactionTendersTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.TransactionTenderTypeBean[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "TransactionTenderTypeBean");
            qName2 = new javax.xml.namespace.QName("", "transaction_tender");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://microsretail.com/Locate", "TransactionTenderTypeBean");
            cachedSerQNames.add(qName);
            cls = com.microsretail.Locate.TransactionTenderTypeBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public com.microsretail.Locate.OrderUpdateResponseMessageTypeBean orderUpdate(com.microsretail.Locate.OrderUpdateRequestMessageTypeBean order_update_request_message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {order_update_request_message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsretail.Locate.OrderUpdateResponseMessageTypeBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsretail.Locate.OrderUpdateResponseMessageTypeBean) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsretail.Locate.OrderUpdateResponseMessageTypeBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.microsretail.Locate.ProductUpdateResponseMessageTypeBean productUpdate(com.microsretail.Locate.ProductUpdateRequestMessageTypeBean product_update_request_message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {product_update_request_message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsretail.Locate.ProductUpdateResponseMessageTypeBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsretail.Locate.ProductUpdateResponseMessageTypeBean) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsretail.Locate.ProductUpdateResponseMessageTypeBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.microsretail.Locate.StatusResponseMessageTypeBean statusRequest(com.microsretail.Locate.StatusInquiryRequestMessageTypeBean status_request_message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {status_request_message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsretail.Locate.StatusResponseMessageTypeBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsretail.Locate.StatusResponseMessageTypeBean) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsretail.Locate.StatusResponseMessageTypeBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String echoTest(java.lang.String testMesg) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://microsretail.com/Locate", "EchoTest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {testMesg});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.microsretail.Locate.StatusResponseMessageTypeBean orderSearch(com.microsretail.Locate.OrderSearchRequestMessageTypeBean order_search_request_message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://microsretail.com/Locate", "OrderSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {order_search_request_message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsretail.Locate.StatusResponseMessageTypeBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsretail.Locate.StatusResponseMessageTypeBean) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsretail.Locate.StatusResponseMessageTypeBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.microsretail.Locate.StatusUpdateResponseMessageTypeBean statusUpdate(com.microsretail.Locate.StatusUpdateRequestMessageTypeBean status_update_request_message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {status_update_request_message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsretail.Locate.StatusUpdateResponseMessageTypeBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsretail.Locate.StatusUpdateResponseMessageTypeBean) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsretail.Locate.StatusUpdateResponseMessageTypeBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.microsretail.Locate.FulfillmentResponseMessageTypeBean fulfillments(com.microsretail.Locate.FulfillmentRequestMessageTypeBean fulfillment_request_message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://microsretail.com/Locate", "Fulfillments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {fulfillment_request_message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsretail.Locate.FulfillmentResponseMessageTypeBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsretail.Locate.FulfillmentResponseMessageTypeBean) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsretail.Locate.FulfillmentResponseMessageTypeBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.microsretail.Locate.StatusListInquiryResponseMessageTypeBean statusListRequest(com.microsretail.Locate.StatusListInquiryRequestMessageTypeBean status_list_request_message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://microsretail.com/Locate", "StatusListRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {status_list_request_message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsretail.Locate.StatusListInquiryResponseMessageTypeBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsretail.Locate.StatusListInquiryResponseMessageTypeBean) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsretail.Locate.StatusListInquiryResponseMessageTypeBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.microsretail.Locate.SubmitOrderResponseMessageTypeBean submitOrder(com.microsretail.Locate.SubmitOrderRequestMessageTypeBean order_request_message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://microsretail.com/Locate", "SubmitOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {order_request_message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsretail.Locate.SubmitOrderResponseMessageTypeBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsretail.Locate.SubmitOrderResponseMessageTypeBean) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsretail.Locate.SubmitOrderResponseMessageTypeBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.microsretail.Locate.LocateItemsResponseMessageTypeBean locateItems(com.microsretail.Locate.LocateItemsRequestMessageTypeBean location_request_message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://microsretail.com/Locate", "LocateItems"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {location_request_message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsretail.Locate.LocateItemsResponseMessageTypeBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsretail.Locate.LocateItemsResponseMessageTypeBean) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsretail.Locate.LocateItemsResponseMessageTypeBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.microsretail.Locate.ProductAvailabilityResponseMessageTypeBean productAvailability(com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageTypeBean product_availability_request_message) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://microsretail.com/Locate", "ProductAvailability"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {product_availability_request_message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.microsretail.Locate.ProductAvailabilityResponseMessageTypeBean) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.microsretail.Locate.ProductAvailabilityResponseMessageTypeBean) org.apache.axis.utils.JavaUtils.convert(_resp, com.microsretail.Locate.ProductAvailabilityResponseMessageTypeBean.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
