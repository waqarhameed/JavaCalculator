package javacalculator;

public class JavaLoops {

	public static void main(String[] args) {
		
		System.out.println("While loop");
		 int x = 10;

	      while( x < 20 )
	      {
	         System.out.print("value of x : " + x );
	         x++;
	         System.out.print("\n");
	      }
	      
			System.out.println("For loop");
			 for( x = 15; x < 20; x = x + 1) 
			 {
		         System.out.print("value of x : " + x );
		         System.out.print("\n");
		      }
			 
			 System.out.println("Do While loop");
		   do {
		         System.out.print("value of x : " + x );
		         x++;
		         System.out.print("\n");
		      }while( x < 20 );
		   
		   System.out.println("Break loop");
		   int [] numbers = {10, 20, 30, 40, 50};

		      for( int y : numbers ) 
		      {
		         if( y == 30 ) 
		         {
		            break;
		         }
		         System.out.print( y );
		         System.out.print("\n");
		      }
		      
		      System.out.println("continue loop");
		      int [] number = {10, 20, 30, 40, 50};

		      for(int z : number ) {
		         if( z == 30 ) {
		            continue;
		         }
		         System.out.print( z );
		         System.out.print("\n");
		      }
	}
}
