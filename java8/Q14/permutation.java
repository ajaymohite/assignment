package Q14;

import java.util.Scanner;
import java.util.stream.IntStream;

public class permutation {
	public static void main(String[] args) {

		System.out.println("All permutation of given string");
		generatePermutation("", "ABCD");
	}

	public static void generatePermutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			System.out.println(prefix+" ");
		} else {
			IntStream.range(0, n).parallel().forEach(
					i -> generatePermutation(prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i
							)));
			

		}
	
	}
}
