/**
 * 
 */
package com.vn.googleBuf;

import com.example.tutorial.ItemProto.Item;

/**
 * @author pc
 * 
 */
public class ItemModel {
	private int id;
	private String name;
	private String type;
	private String price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public ItemModel(int id, String name, String type, String price) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	public ItemModel() {
		super();
	}
	public ItemModel(Item item) {
		this.id = item.getId();
		this.name = item.getName();
		this.type = item.getType();
		this.price = item.getPrice();
	}
	
}
