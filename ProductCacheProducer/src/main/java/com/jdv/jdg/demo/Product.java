package com.jdv.jdg.demo;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator=",")
public class Product  {
	
	@DataField(pos=1 , required=true)
	long itemId;
	
	@DataField(pos=2 , required=true)
	String name;
	
	@DataField(pos=3 , required=true)
	String description;
	
	@DataField(pos=4 , required=true)
	double price;

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [itemId=" + itemId + ", name=" + name + ", description=" + description + ", price=" + price
				+ "]";
	}

}
