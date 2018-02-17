package com.pacsun.locate.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.pacsun.locate.bean.Customer;

@Entity
@Table(name = "PSLCORDH")
public class OrderHeader {

	@EmbeddedId
	private OrderHeaderId id;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumns({ @JoinColumn(name = "DORDNO", referencedColumnName = "HORDNO"),
			@JoinColumn(name = "DPCKCD", referencedColumnName = "HPCKCD"),
			@JoinColumn(name = "DFULOC", referencedColumnName = "HFULOC") })
	Set<OrderDetail> orderDetailList = new HashSet<OrderDetail>();

	@Embedded
	private Customer customer;

	@Column(name = "HPROC")
	private String processFlag;

	@Column(name = "HPRDAT")
	private Integer processDate;

	@Column(name = "HPRTIM")
	private Integer processTime;

	@Column(name = "HRFORD")
	private Integer referenceOrderNumber;

	@Column(name = "HORDDT")
	private Date orderDate;

	@Column(name = "HTYPID")
	private String transactionTypeId;

	@Column(name = "HREQID")
	private String requestId;

	@Column(name = "HORSTS")
	private String locateOrderStatus;

	@Column(name = "HSBTOT")
	private Double orderSubtotal;

	@Column(name = "HTOTAX")
	private Double totalTax;

	@Column(name = "HTRTOT")
	private Double total;

	@Column(name = "HSPINS")
	private String specialInstruction;

	@Column(name = "HTRSTS")
	private String transactionStatus;

	@Column(name = "HTRCHN")
	private String transactionChannel;

	@Column(name = "HSPVIA")
	private String shipVia;

	@Column(name = "HSVDES")
	private String shipViaDescription;

	@Column(name = "HORMSG")
	private String orderMessage;

	@Column(name = "HGFTFG")
	private String gift;

	@Column(name = "HSHPAM")
	private Double shippingCharge;

	@Column(name = "HTODIS")
	private Double totalDiscount;

	@Column(name = "HBALDU")
	private Double balanceDue;

	@Column(name = "HREVFG")
	private String underReviewFlag;

	@Column(name = "HLOCCD")
	private String locationCode;

	@Column(name = "HSYSCD")
	private String systemCode;

	public OrderHeader() {
	}

	public OrderHeaderId getId() {
		return id;
	}

	public void setOrderHeaderId(OrderHeaderId id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getProcessFlag() {
		return processFlag;
	}

	public void setProcessFlag(String processFlag) {
		this.processFlag = processFlag;
	}

	public Integer getProcessDate() {
		return processDate;
	}

	public void setProcessDate(Integer processDate) {
		this.processDate = processDate;
	}

	public Integer getProcessTime() {
		return processTime;
	}

	public void setProcessTime(Integer processTime) {
		this.processTime = processTime;
	}

	public Integer getReferenceOrderNumber() {
		return referenceOrderNumber;
	}

	public void setReferenceOrderNumber(Integer referenceOrderNumber) {
		this.referenceOrderNumber = referenceOrderNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getTransactionTypeId() {
		return transactionTypeId;
	}

	public void setTransactionTypeId(String transactionTypeId) {
		this.transactionTypeId = transactionTypeId;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getLocateOrderStatus() {
		return locateOrderStatus;
	}

	public void setLocateOrderStatus(String locateOrderStatus) {
		this.locateOrderStatus = locateOrderStatus;
	}

	public Double getOrderSubtotal() {
		return orderSubtotal;
	}

	public void setOrderSubtotal(Double orderSubtotal) {
		this.orderSubtotal = orderSubtotal;
	}

	public Double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(Double totalTax) {
		this.totalTax = totalTax;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public String getSpecialInstruction() {
		return specialInstruction;
	}

	public void setSpecialInstruction(String specialInstruction) {
		this.specialInstruction = specialInstruction;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionChannel() {
		return transactionChannel;
	}

	public void setTransactionChannel(String transactionChannel) {
		this.transactionChannel = transactionChannel;
	}

	public String getShipVia() {
		return shipVia;
	}

	public void setShipVia(String shipVia) {
		this.shipVia = shipVia;
	}

	public String getShipViaDescription() {
		return shipViaDescription;
	}

	public void setShipViaDescription(String shipViaDescription) {
		this.shipViaDescription = shipViaDescription;
	}

	public String getOrderMessage() {
		return orderMessage;
	}

	public void setOrderMessage(String orderMessage) {
		this.orderMessage = orderMessage;
	}

	public String getGift() {
		return gift;
	}

	public void setGift(String gift) {
		this.gift = gift;
	}

	public Double getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(Double shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public Double getTotalDiscount() {
		return totalDiscount;
	}

	public void setTotalDiscount(Double totalDiscount) {
		this.totalDiscount = totalDiscount;
	}

	public Double getBalanceDue() {
		return balanceDue;
	}

	public void setBalanceDue(Double balanceDue) {
		this.balanceDue = balanceDue;
	}

	public String getUnderReviewFlag() {
		return underReviewFlag;
	}

	public void setUnderReviewFlag(String underReviewFlag) {
		this.underReviewFlag = underReviewFlag;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getSystemCode() {
		return systemCode;
	}

	public void setSystemCode(String systemCode) {
		this.systemCode = systemCode;
	}

	public Set<OrderDetail> getOrderDetailList() {
		return orderDetailList;
	}

	public void setOrderDetailList(Set<OrderDetail> orderDetailList) {
		this.orderDetailList = orderDetailList;
	}

	@Override
	public String toString() {
		return "OrderHeader [id=" + id + ", orderDetailSet=" + orderDetailList + ", customer=" + customer
				+ ", processFlag=" + processFlag + ", processDate=" + processDate + ", processTime=" + processTime
				+ ", referenceOrderNumber=" + referenceOrderNumber + ", orderDate=" + orderDate
				+ ", transactionTypeId=" + transactionTypeId + ", requestId=" + requestId + ", locateOrderStatus="
				+ locateOrderStatus + ", orderSubtotal=" + orderSubtotal + ", totalTax=" + totalTax + ", total="
				+ total + ", specialInstruction=" + specialInstruction + ", transactionStatus=" + transactionStatus
				+ ", transactionChannel=" + transactionChannel + ", shipVia=" + shipVia + ", shipViaDescription="
				+ shipViaDescription + ", orderMessage=" + orderMessage + ", gift=" + gift + ", shippingCharge="
				+ shippingCharge + ", totalDiscount=" + totalDiscount + ", balanceDue=" + balanceDue
				+ ", underReviewFlag=" + underReviewFlag + ", locationCode=" + locationCode + ", systemCode="
				+ systemCode + "]";
	}

}
