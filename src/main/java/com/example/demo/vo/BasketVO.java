package com.example.demo.vo;

public class BasketVO {
	private int basketNo, spcode, quantity;
	private String id;

	public BasketVO() {
		super();
	}
	
	
	public BasketVO(int basketNo, int spcode, int quantity, String id) {
		setBasketNo(basketNo);
		setSpcode(spcode);
		setQuantity(quantity);
		setId(id);
	}


	public int getBasketNo() {
		return basketNo;
	}
	public void setBasketNo(int basketNo) {
		this.basketNo = basketNo;
	}
	public int getSpcode() {
		return spcode;
	}
	public void setSpcode(int spcode) {
		this.spcode = spcode;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "BasketVO [basketNo=" + basketNo + ", spcode=" + spcode + ", quantity=" + quantity + ", id=" + id + "]";
	}
	
	
}
