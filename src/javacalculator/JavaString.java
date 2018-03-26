package javacalculator;
import java.util.*;
import java.text.*;
public class JavaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Date date=new Date();
 		SimpleDateFormat ft=new SimpleDateFormat("dd.MM.yyyy");
         System.out.println(ft.format(date));
         
         char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
	      String helloString = new String(helloArray);  
	      System.out.println( helloString );
	      
	      String palindrome = "Dot saw I was Tod";
	       
	      System.out.println( "String Length is : " + palindrome.length() );
	}

}
