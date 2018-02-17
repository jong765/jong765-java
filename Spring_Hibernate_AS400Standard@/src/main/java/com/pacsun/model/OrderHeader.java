package com.pacsun.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "JKORDHDR", catalog = "JKIM2")
public class OrderHeader implements Serializable {

	private static final long serialVersionUID = 4939516827733200628L;

	@Id
	@Column(name = "OHORD")
	private int orderNumber;

	@Column(name = "OHRCST")
	private String status;

	@Column(name = "OHCST")
	private int customerNumber;

	@Temporal(TemporalType.DATE)
	@Column(name = "OHORDT")
	private Date orderDate;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "ODORD")
	private Set<OrderDetail> orderDetailSet = new HashSet<OrderDetail>(0);

	public OrderHeader() {
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Set<OrderDetail> getOrderDetail() {
		return orderDetailSet;
	}

	public void setOrderDetail(Set<OrderDetail> orderDetailSet) {
		this.orderDetailSet = orderDetailSet;
	}

	@Override
	public String toString() {
		return "Order " + orderNumber + ":[Status: " + status + ", Customer Number: "
				+ customerNumber + ", Order Date: " + "orderDate + ]";
	}
}
