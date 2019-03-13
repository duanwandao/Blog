package com.zjx.atest;

public class Goodsinfo {
	
	
	
	private int id;
	private String picture;
	private String name;
	private int price;
	
	public Goodsinfo() {}
	
	public Goodsinfo(int id, String picture, String name, int price) {
		this.id = id;
		this.picture = picture;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "{\"id\":\"" + id + "\", \"picture\":\"" + picture + "\", \"name\":\"" + name + "\", \"price\":\""
				+ price + "\"}\n";
	}
	
	/*@Override
	public String toString() {
		return "Goodsinfo [id=" + id + ", picture=" + picture + ", name=" + name + ", price=" + price + "]";
	}*/
	
	
}
