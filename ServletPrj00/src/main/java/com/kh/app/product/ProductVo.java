package com.kh.app.product;

public class ProductVo {
	private String product_Id;
	private String product_No;
	private String product_Cnt;
	private String product_Name;
	private String product_Price;
	private String product_Size;
	public ProductVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductVo(String product_Id, String product_No, String product_Cnt, String product_Name,
			String product_Price, String product_Size) {
		super();
		this.product_Id = product_Id;
		this.product_No = product_No;
		this.product_Cnt = product_Cnt;
		this.product_Name = product_Name;
		this.product_Price = product_Price;
		this.product_Size = product_Size;
	}
	@Override
	public String toString() {
		return "ProductVo [product_Id=" + product_Id + ", product_No=" + product_No + ", product_Cnt=" + product_Cnt
				+ ", product_Name=" + product_Name + ", product_Price=" + product_Price + ", product_Size="
				+ product_Size + "]";
	}
	public String getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(String product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_No() {
		return product_No;
	}
	public void setProduct_No(String product_No) {
		this.product_No = product_No;
	}
	public String getProduct_Cnt() {
		return product_Cnt;
	}
	public void setProduct_Cnt(String product_Cnt) {
		this.product_Cnt = product_Cnt;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getProduct_Price() {
		return product_Price;
	}
	public void setProduct_Price(String product_Price) {
		this.product_Price = product_Price;
	}
	public String getProduct_Size() {
		return product_Size;
	}
	public void setProduct_Size(String product_Size) {
		this.product_Size = product_Size;
	}
	
	
	
	
	
	
	
}
