package com.kh.app.product;

public class OrderVo {
	
	private String order_No;
	private String order_Id;
	private String order_User;
	private String order_Cnt;
	private String order_Date;
	private String delivery_Address;
	private String delivery_Type;
	private String order_Size;
	public OrderVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderVo(String order_No, String order_Id, String order_User, String order_Cnt, String order_Date,
			String delivery_Address, String delivery_Type, String order_Size) {
		super();
		this.order_No = order_No;
		this.order_Id = order_Id;
		this.order_User = order_User;
		this.order_Cnt = order_Cnt;
		this.order_Date = order_Date;
		this.delivery_Address = delivery_Address;
		this.delivery_Type = delivery_Type;
		this.order_Size = order_Size;
	}
	@Override
	public String toString() {
		return "OrderVo [order_No=" + order_No + ", order_Id=" + order_Id + ", order_User=" + order_User
				+ ", order_Cnt=" + order_Cnt + ", order_Date=" + order_Date + ", delivery_Address=" + delivery_Address
				+ ", delivery_Type=" + delivery_Type + ", order_Size=" + order_Size + "]";
	}
	public String getOrder_No() {
		return order_No;
	}
	public void setOrder_No(String order_No) {
		this.order_No = order_No;
	}
	public String getOrder_Id() {
		return order_Id;
	}
	public void setOrder_Id(String order_Id) {
		this.order_Id = order_Id;
	}
	public String getOrder_User() {
		return order_User;
	}
	public void setOrder_User(String order_User) {
		this.order_User = order_User;
	}
	public String getOrder_Cnt() {
		return order_Cnt;
	}
	public void setOrder_Cnt(String order_Cnt) {
		this.order_Cnt = order_Cnt;
	}
	public String getOrder_Date() {
		return order_Date;
	}
	public void setOrder_Date(String order_Date) {
		this.order_Date = order_Date;
	}
	public String getDelivery_Address() {
		return delivery_Address;
	}
	public void setDelivery_Address(String delivery_Address) {
		this.delivery_Address = delivery_Address;
	}
	public String getDelivery_Type() {
		return delivery_Type;
	}
	public void setDelivery_Type(String delivery_Type) {
		this.delivery_Type = delivery_Type;
	}
	public String getOrder_Size() {
		return order_Size;
	}
	public void setOrder_Size(String order_Size) {
		this.order_Size = order_Size;
	}
	
	
	
	
	
	
	
	
	
}
