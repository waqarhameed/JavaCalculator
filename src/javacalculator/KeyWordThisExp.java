package javacalculator;

public class KeyWordThisExp {

	// Instance variable num
	int numb = 10;
    
	// default constructor
	KeyWordThisExp() {
		System.out.println("This is an example program on keyword this");
	}

	// parameterized constructor
	KeyWordThisExp(int num) {
		// Invoking the default constructor
		this();

		// Assigning the local variable num to the instance variable num
		this.numb = num;
	}
      // greet method
	public void greet() {
		System.out.println("Hi Welcome to Tutorialspoint");
	}

	public void print() {
		// Local variable num
		int num = 20;
		// Printing the local variable
		System.out.println("value of local variable num is : " + num);

		// Printing the instance variable
		System.out.println("value of instance variable num is : " + this.numb);

		// Invoking the greet method of a class
		this.greet();
	}

	public static void main(String[] args) {
		// Instantiating the class
		KeyWordThisExp obj1 = new KeyWordThisExp();

		// Invoking the print method
		obj1.print();

		// Passing a new value to the num variable through parametrized
		// constructor
		KeyWordThisExp obj2 = new KeyWordThisExp(30);

		// Invoking the print method again
		obj2.print();
	}
}
