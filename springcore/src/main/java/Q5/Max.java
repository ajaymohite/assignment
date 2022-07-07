package Q5;

import java.util.List;

public class Max {
	
	List<Integer> numbers;

	public List<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(List<Integer> numbers) {
		this.numbers = numbers;
	}
	
	
	public void show()
	{
		numbers.stream().forEach(System.out::println);
		
	}

	public void maxNum()
	{
		int cname=numbers.stream().max((a,b)->a>b?1:-1).get();
		System.out.println("maximum number is : "+cname);
	}
}
