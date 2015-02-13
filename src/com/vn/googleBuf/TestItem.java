/**
 * 
 */
package com.vn.googleBuf;
import com.example.tutorial.ItemProto.Item;

/**
 * @author pc
 * 
 */
public class TestItem {
	public static void main(String[] args) {
		ItemBuilder builder = new ItemBuilder();
		@SuppressWarnings("static-access")
		Item item =  builder.buidler();
		ItemModel model =new ItemModel(item);
		System.out.println("---data---");
		System.out.println(model.getId());
		System.out.println(model.getName());
		System.out.println(model.getPrice());
		System.out.println(model.getType()); 
	}
}
