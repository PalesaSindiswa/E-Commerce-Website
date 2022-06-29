package com.Ecommerce.W_Buy.W_Buy.Model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "Orders", //
        uniqueConstraints = { @UniqueConstraint(columnNames = "Order_num") })

	public class Order implements Serializable {

	    private static final long serialVersionUID = -2576670215015463100L;

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "OrderId", length = 20, nullable= false)
	    private int orderId;

	    @Column(name = "OrderDate", nullable = false)
	    private Date order_Date;

	    @Column(name = "Order_num", nullable = false)
	    private int orderNum;

	    @Column(name = "Amount", nullable = false)
	    private double amount;

	    @Column(name = "CustomerName", length = 255, nullable = false)
	    private String customer_Name;

	    @Column(name = "Customer_Address", length = 255, nullable = false)
	    private String customerAddress;

	    @Column(name = "Customer_Email", length = 128, nullable = false)
	    private String customerEmail;

	    @Column(name = "Customer_Phone", length = 128, nullable = false)
	    private String customerPhone;

	    public int getId() {
	        return orderId;
	    }

	    public void setId(int orderId) {
	        this.orderId = orderId;
	    }

	    public Date getOrderDate() {
	        return order_Date;
	    }

	    public void setOrderDate(Date order_Date) {
	        this.order_Date = order_Date;
	    }

	    public int getOrderNum() {
	        return orderNum;
	    }

	    public void setOrderNum(int orderNum) {
	        this.orderNum = orderNum;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public void setAmount(double amount) {
	        this.amount = amount;
	    }

	    public String getCustomerName() {
	        return customer_Name;
	    }

	    public void setCustomerName(String customerName) {
	        this.customer_Name = customerName;
	    }

	    public String getCustomerAddress() {
	        return customerAddress;
	    }

	    public void setCustomerAddress(String customerAddress) {
	        this.customerAddress = customerAddress;
	    }

	    public String getCustomerEmail() {
	        return customerEmail;
	    }

	    public void setCustomerEmail(String customerEmail) {
	        this.customerEmail = customerEmail;
	    }

	    public String getCustomerPhone() {
	        return customerPhone;
	    }

	    public void setCustomerPhone(String customerPhone) {
	        this.customerPhone = customerPhone;
	    }


}
