package javacalculator;

public class Decisionaking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" if statement");
		 int x = 10;

	      if( x < 20 ) {
	         System.out.println("This is if statement");
	      }
			System.out.println(" if-else statement");      
	       x = 30;

	      if( x < 20 ) {
	         System.out.println("This is if statement");
	      }else {
	         System.out.println("This is else statement");
	      }
			System.out.println(" if-else-if statement");
	      if( x == 0 ) {
	          System.out.println("Value of X is 10");
	       }else if( x == 20 ) {
	          System.out.println("Value of X is 20");
	       }else if( x == 30 ) {
	          System.out.println("Value of X is 30");
	       }else {
	          System.out.println("This is else statement");
	       }
	      
			System.out.println(" nested-if statement");
	      int y = 10;

	      if( x == 30 ) {
	         if( y == 10 ) {
	            System.out.println("X = 30 and Y = 10");
	         }
	      }
			System.out.println(" switch statement");    
			 char grade = 'C';

		      switch(grade) {
		         case 'A' :
		            System.out.println("Excellent!"); 
		            break;
		         case 'B' :
		         case 'C' :
		            System.out.println("Well done");
		            break;
		         case 'D' :
		            System.out.println("You passed");
		         case 'F' :
		            System.out.println("Better try again");
		            break;
		         default :
		            System.out.println("Invalid grade");
		      }
		      System.out.println("Your grade is " + grade);
	      
  }
}


