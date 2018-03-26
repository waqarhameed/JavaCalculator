package javacalculator;

public class ExcepttionsMethods {

	public static void main(String[] args) {
		
		
		
		try {
		//	 int a = 20/0;
        } catch (Exception e)
        {
            // getMessage method
            // Prints only the message of exception
            // and not the name of exception
            System.out.println(e.getMessage());
             
            // Prints what exception has been thrown
            // System.out.println(e);
		}
	}

}
