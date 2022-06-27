package Q9;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class OddEvenCount {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,22,432,453,23,76,77,63,66);

		//System.out.println(list.get(8));
		int even = 0, odd = 0;

		for (int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i));
			Predicate<Integer> p = a -> a % 2 == 0;
			//boolean b = p.test(list.get(i));
			if(p.test(list.get(i)))
			//if (b == true)
				{
				even++;
			} //else if (b == false)
			else
			{
				odd++;
			}

		}

		System.out.println("count of Even no : " + even);
		System.out.println("count of Odd no : " + odd);

	}

}
