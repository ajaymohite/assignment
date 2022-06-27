package Q16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ItemDriver {
	
	public static void main(String[] args) {
		
		List<Item> ilist=new ArrayList<Item>();
		
		
		/*
		 * int itemId; String itemName; String categoryName; double price ; String
		 * dateOfMmanufacturing; String dateOfExpiring;
		 */
		 
		ilist.add(new Item(1,"bag","travel",3000,"22/10/2024","22/10/2026"));
		ilist.add(new Item(2,"mouse","electronics",4500,"02/01/2020","26/10/2029"));
		ilist.add(new Item(3,"pen","study",500,"22/10/2020","11/05/2027"));
		ilist.add(new Item(4,"notebook","study",300,"15/04/2024","16/09/2029"));
		ilist.add(new Item(5,"table","furniture",6000,"23/10/2021","23/10/2026"));
		ilist.add(new Item(6,"keyboard","electronics",2000,"23/10/2018","23/10/2025"));
		
		
		
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter category name");
		 String category=sc.next();
		List<Item> i=ilist.stream().filter(e->e.categoryName.contains(category)).collect(Collectors.toList());
		i.stream().forEach(System.out::println);
		
		/*
		 * for(Item i2:i) { System.out.println(i2.itemName+" "+i2.price); }
		 */


		 System.out.println("Enter item starting char");
		String item=sc.next();
		List<Item> start=ilist.stream().filter(e->e.itemName.startsWith(item)).collect(Collectors.toList());
		start.stream().forEach(System.out::println);

		 System.out.println("Enter date of manufacturing");

		String dom=sc.next();
		System.out.println("Enter date of expiring");

		String doe=sc.next();
		List<Item> date1=ilist.stream().filter(e->e.dateOfExpiring.contains(doe)&&e.dateOfManufacturing.contains(dom)).collect(Collectors.toList());
		date1.stream().forEach(System.out::println);

		System.out.println("Enter min price");
		int minPrice=sc.nextInt();
		
		System.out.println("Enter max price");
		int maxPrice=sc.nextInt();
		
		List<Item> price=ilist.stream().filter(e->e.price >minPrice && e.price<maxPrice).collect(Collectors.toList());
		price.stream().forEach(System.out::println);
	}

}
