/**
 * Locate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsretail.Locate;

public interface Locate extends java.rmi.Remote {
    public com.microsretail.Locate.StatusResponseMessageTypeBean statusRequest(com.microsretail.Locate.StatusInquiryRequestMessageTypeBean status_request_message) throws java.rmi.RemoteException;
    public com.microsretail.Locate.ProductUpdateResponseMessageTypeBean productUpdate(com.microsretail.Locate.ProductUpdateRequestMessageTypeBean product_update_request_message) throws java.rmi.RemoteException;
    public com.microsretail.Locate.OrderUpdateResponseMessageTypeBean orderUpdate(com.microsretail.Locate.OrderUpdateRequestMessageTypeBean order_update_request_message) throws java.rmi.RemoteException;
    public java.lang.String echoTest(java.lang.String testMesg) throws java.rmi.RemoteException;
    public com.microsretail.Locate.StatusResponseMessageTypeBean orderSearch(com.microsretail.Locate.OrderSearchRequestMessageTypeBean order_search_request_message) throws java.rmi.RemoteException;
    public com.microsretail.Locate.StatusUpdateResponseMessageTypeBean statusUpdate(com.microsretail.Locate.StatusUpdateRequestMessageTypeBean status_update_request_message) throws java.rmi.RemoteException;
    public com.microsretail.Locate.FulfillmentResponseMessageTypeBean fulfillments(com.microsretail.Locate.FulfillmentRequestMessageTypeBean fulfillment_request_message) throws java.rmi.RemoteException;
    public com.microsretail.Locate.StatusListInquiryResponseMessageTypeBean statusListRequest(com.microsretail.Locate.StatusListInquiryRequestMessageTypeBean status_list_request_message) throws java.rmi.RemoteException;
    public com.microsretail.Locate.SubmitOrderResponseMessageTypeBean submitOrder(com.microsretail.Locate.SubmitOrderRequestMessageTypeBean order_request_message) throws java.rmi.RemoteException;
    public com.microsretail.Locate.ProductAvailabilityResponseMessageTypeBean productAvailability(com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageTypeBean product_availability_request_message) throws java.rmi.RemoteException;
    public com.microsretail.Locate.LocateItemsResponseMessageTypeBean locateItems(com.microsretail.Locate.LocateItemsRequestMessageTypeBean location_request_message) throws java.rmi.RemoteException;
}
