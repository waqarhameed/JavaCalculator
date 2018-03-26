package javacalculator;

public class Methods {
	// constructors or parameterized
	int x;

	// Following is the constructor
	Methods(int i) {
		x = i;
	}

	public static void main(String[] args) {
		// constructors
		Methods t1 = new Methods(10);
		Methods t2 = new Methods(23);
		System.out.println(t1.x + "\n" + t2.x);
		//
        boolean res=methodRankPoints(255.7);
        System.out.println(res);
		// Method Overloading
		int a = 11;
		int b = 6;
		double c = 7.3;
		double d = 9.4;
		int result1 = minFunction(a, b);
       
		// same function name with different parameters
		double result2 = minFunction(c, d);
		System.out.println("Minimum Value = " + result1);
		System.out.println("Minimum Value = " + result2);
		//
		// Command line method
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]: " + args[i]);
		}
	}

	// by using void return type
	public static boolean methodRankPoints(double points) {
		if (points >= 202.5) {
			System.out.println("blblblblbb");
		} else if (points >= 122.4) {
			System.out.println("ffhfhjfh");
		} else {
			System.out.println("hhhhhhhh");
		}
		return true;
	}

	// Method Overloading
	public static int minFunction(int n1, int n2) {
		int min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;
	}

	// for double
	public static double minFunction(double n1, double n2) {
		double min;
		if (n1 > n2)
			min = n2;
		else
			min = n1;

		return min;

	}
}
