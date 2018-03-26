package javacalculator;

public class PrimeNumberTest {

	public static void main(String[] args) {

		for (int s = 2; s < 100; s++) {
			for (int j = 2; j <= s; j++) {
				if (j == s) {
					System.out.println(s);
				} 
				else if (s % j == 0) {
					break;
				}
			}
		}
	}
}