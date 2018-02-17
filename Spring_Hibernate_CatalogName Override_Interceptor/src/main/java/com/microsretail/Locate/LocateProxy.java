package com.microsretail.Locate;

public class LocateProxy implements com.microsretail.Locate.Locate {
  private String _endpoint = null;
  private com.microsretail.Locate.Locate locate = null;
  
  public LocateProxy() {
    _initLocateProxy();
  }
  
  public LocateProxy(String endpoint) {
    _endpoint = endpoint;
    _initLocateProxy();
  }
  
  private void _initLocateProxy() {
    try {
      locate = (new com.microsretail.Locate.LocateServiceLocator()).getLocatePort();
      if (locate != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)locate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)locate)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (locate != null)
      ((javax.xml.rpc.Stub)locate)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.microsretail.Locate.Locate getLocate() {
    if (locate == null)
      _initLocateProxy();
    return locate;
  }
  
  public com.microsretail.Locate.StatusResponseMessageTypeBean statusRequest(com.microsretail.Locate.StatusInquiryRequestMessageTypeBean status_request_message) throws java.rmi.RemoteException{
    if (locate == null)
      _initLocateProxy();
    return locate.statusRequest(status_request_message);
  }
  
  public com.microsretail.Locate.ProductUpdateResponseMessageTypeBean productUpdate(com.microsretail.Locate.ProductUpdateRequestMessageTypeBean product_update_request_message) throws java.rmi.RemoteException{
    if (locate == null)
      _initLocateProxy();
    return locate.productUpdate(product_update_request_message);
  }
  
  public com.microsretail.Locate.OrderUpdateResponseMessageTypeBean orderUpdate(com.microsretail.Locate.OrderUpdateRequestMessageTypeBean order_update_request_message) throws java.rmi.RemoteException{
    if (locate == null)
      _initLocateProxy();
    return locate.orderUpdate(order_update_request_message);
  }
  
  public java.lang.String echoTest(java.lang.String testMesg) throws java.rmi.RemoteException{
    if (locate == null)
      _initLocateProxy();
    return locate.echoTest(testMesg);
  }
  
  public com.microsretail.Locate.StatusResponseMessageTypeBean orderSearch(com.microsretail.Locate.OrderSearchRequestMessageTypeBean order_search_request_message) throws java.rmi.RemoteException{
    if (locate == null)
      _initLocateProxy();
    return locate.orderSearch(order_search_request_message);
  }
  
  public com.microsretail.Locate.StatusUpdateResponseMessageTypeBean statusUpdate(com.microsretail.Locate.StatusUpdateRequestMessageTypeBean status_update_request_message) throws java.rmi.RemoteException{
    if (locate == null)
      _initLocateProxy();
    return locate.statusUpdate(status_update_request_message);
  }
  
  public com.microsretail.Locate.FulfillmentResponseMessageTypeBean fulfillments(com.microsretail.Locate.FulfillmentRequestMessageTypeBean fulfillment_request_message) throws java.rmi.RemoteException{
    if (locate == null)
      _initLocateProxy();
    return locate.fulfillments(fulfillment_request_message);
  }
  
  public com.microsretail.Locate.StatusListInquiryResponseMessageTypeBean statusListRequest(com.microsretail.Locate.StatusListInquiryRequestMessageTypeBean status_list_request_message) throws java.rmi.RemoteException{
    if (locate == null)
      _initLocateProxy();
    return locate.statusListRequest(status_list_request_message);
  }
  
  public com.microsretail.Locate.SubmitOrderResponseMessageTypeBean submitOrder(com.microsretail.Locate.SubmitOrderRequestMessageTypeBean order_request_message) throws java.rmi.RemoteException{
    if (locate == null)
      _initLocateProxy();
    return locate.submitOrder(order_request_message);
  }
  
  public com.microsretail.Locate.ProductAvailabilityResponseMessageTypeBean productAvailability(com.microsretail.Locate.AvailabilityByOrderTypeRequestMessageTypeBean product_availability_request_message) throws java.rmi.RemoteException{
    if (locate == null)
      _initLocateProxy();
    return locate.productAvailability(product_availability_request_message);
  }
  
  public com.microsretail.Locate.LocateItemsResponseMessageTypeBean locateItems(com.microsretail.Locate.LocateItemsRequestMessageTypeBean location_request_message) throws java.rmi.RemoteException{
    if (locate == null)
      _initLocateProxy();
    return locate.locateItems(location_request_message);
  }
  
  
}