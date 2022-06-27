package Q12;

interface A {
	void max(int a[]);
}

public class Max {
	public static void main(String[] args) {

		A aa = (a) -> {
			//int temp = 0;
			int n = a.length;
			for (int i = 0; i < n; i++) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] > a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
			System.out.println("max no " + a[n - 1]);
			for (int k = 1; k <= 5; k++) {
				System.out.println("largest "+k+" "+a[n-k]);
				
				
			}
		};
		int a[] = { 1, 2, 3, 40, 30 ,66,45,324,33,88,77};
		aa.max(a);

	}
}