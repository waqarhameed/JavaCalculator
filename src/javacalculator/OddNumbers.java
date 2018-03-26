package javacalculator;

public class OddNumbers {

	public static void main(String[] args) {
		System.out.println("print the odd number by for loop");
		int[] arr= printOddNumberByForLoop( );
		for(int i=0;i<5;i++){
			System.out.println(arr[i]);
		}
		// System.out.println("print the odd number by while loop");
		// printOddNumbersByWhileLoop();

	}

	public static int[] printOddNumberByForLoop() {

		// print the odd numbers
		int[] arr = new int[5];

		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				int index=i/2;
				arr[index] = i;
			}
		}
		return arr;
	}

	public static void printOddNumbersByWhileLoop() {

		// print odd numbers using while loop
		int n = 0;
		while (n < 50) {
			if (n % 2 != 0) {
				System.out.println("Odd numbers :" + n);
			}
			n++;
		}

	}

}
