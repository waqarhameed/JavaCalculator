package javacalculator;

public class MathService {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		 add();
		 sub();
		 mul();
		 div();
		 
	}

	public static void add() {
		int a=2,b=10;
		int add=a+b;
		System.out.println("add ="+ add);
	}
	private static void sub() {
		int a=2,b=10;
		int sub=a-b;
		System.out.println("sub =" +sub);
	}
	private static void mul() {
		int a=2,b=10;
		int mul=a*b;
		System.out.println("mul ="+ mul);
		
	}
	private static void div() {
		int a=20,b=10;
		int div=a/b;
		System.out.println("div ="+ div);
		
	}
}
