package com.vn.googleBuf;

import com.example.tutorial.ItemProto.Item;
//import com.google.gson.Gson;
import com.googlecode.protobuf.format.JsonFormat;
import com.googlecode.protobuf.format.JsonFormat.ParseException;

public class ItemBuilder {
	public static Item buidler() {
		Item.Builder item = Item.newBuilder();
//		item.setId(1);
//		item.setName("not null");
//		item.setPrice("10000");
//		item.setType("1");
		String jsonData = "{\"id\":12,\"name\":\"Dtag\",\"type\":\"banner\",\"price\":\"2000\"}";
		try {
			JsonFormat.merge(jsonData, item);
			System.out.println(item);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return item.build();
	}
}
