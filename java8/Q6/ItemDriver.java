package Q6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemDriver {
	
	public static void main(String[] args) {
		
		List<Item> list=new ArrayList<Item>();
		
		list.add(new Item("pen",10));
		list.add(new Item("notebook",30));
		list.add(new Item("bag",250));
		list.add(new Item("pencil",15));
		
		Double avePrice=list.stream().collect(Collectors.averagingInt(a->a.price));
		
		System.out.println("average price "+avePrice);
		
		List<Item> price=list.stream().filter(a->a.price<avePrice).collect(Collectors.toList());
		
		for (Item item : price) {
			
		System.out.println(item.itemname);
			
		}
		
		
		
		
	}

}
