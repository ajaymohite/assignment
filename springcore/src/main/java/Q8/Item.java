package Q8;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Item {
	
	List item;

	public List getItem() {
		return item;
	}

	public void setItem(List item) {
		this.item = item;
	}
	
	public void show()
	{
		System.out.println(this.item);
	}
	
	public void ascending()
	{
		System.out.println("values in ascending");
		item.stream().sorted().forEach(System.out::println);
	}
	public void descending() {
		System.out.println("values in descending");
		
		item.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
	
	public void removeDuplicate()
	{
		System.out.println("after removing duplicates");
		Set result = (Set) item.stream().collect(Collectors.toSet());
		System.out.println(result);
		
	}

}
