package Q2;

import java.util.List;
import java.util.stream.Collectors;


public class AveNum {
	
	List<Integer> num;

	public List<Integer> getNum() {
		return num;
	}

	public void setNum(List<Integer> num) {
		this.num = num;
	}
	
	
	public void show()
	{
		double ave=num.stream().collect(Collectors.averagingDouble(i->i));
		System.out.println("Average of numbers : "+ave);
		
	}
	

}
