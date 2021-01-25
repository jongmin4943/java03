package org.comstudy21.ch06hw4;

public class Product {
	protected String serialNumber;
	protected String name;
	protected String instruction;
	protected String producer;
	protected int price;
	
	public Product() {
	}
	public Product(String serialNumber, String name, String instruction, String producer, int price) {
		super();
		this.serialNumber = serialNumber;
		this.name = name;
		this.instruction = instruction;
		this.producer = producer;
		this.price = price;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [serialNumber=" + serialNumber + ", name=" + name + ", instruction=" + instruction
				+ ", producer=" + producer + ", price=" + price + "]";
	}
	
}
