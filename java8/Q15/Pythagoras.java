package Q15;

public class Pythagoras {

	public static void main(String[] args) {
		int ar[] = {3,4,5,12,13}; //3,4,5 // 

		int count = 0;
		for (int i = 0; i <= ar.length - 3; i++) {
			int a = ar[i] * ar[i];
			int b = ar[i + 1] * ar[i + 1];
			int c = ar[i + 2] * ar[i + 2];

			if (a == b + c || b == a + c || c == a + b) {
				count++;
			}

		}
		System.out.println(count);

	}
}
