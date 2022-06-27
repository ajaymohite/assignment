package Q7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Q6.*;

public class Even {

	public static void main(String[] args) {
		
		List<Item> list=new ArrayList<Item>();
		list.add(new Item("pen",10));
		list.add(new Item("notebook",35));
		list.add(new Item("bag",250));
		list.add(new Item("pencil",15));
		
		
		List<Item> price=list.stream().filter(a->a.price%2==0).collect(Collectors.toList());
		
		System.out.println("item with price is even no");
		
		for (Item item : price) {
			
		System.out.println(item.itemname+" "+item.price);
		
		
		
	}
	}
}


