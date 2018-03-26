package javacalculator;

public class JavaOprators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //Arithmetic operators
	      System.out.println("Atithmetic operators"); 
		  int a = 2;
	      int b = 1;
	      int c = 25;
	      int d = 25;

	      System.out.println("a + b = " + (a + b) );
	      System.out.println("a - b = " + (a - b) );
	      System.out.println("a * b = " + (a * b) );
	      System.out.println("b / a = " + (b / a) );
	      System.out.println("b % a = " + (b % a) );
	      System.out.println("c % a = " + (c % a) );
	      System.out.println("a++   = " +  (a++) );
	      System.out.println("b--   = " +  (a--) );

	      // Check the difference in d++ and ++d
	      System.out.println("d++   = " +  (d++) );
	      System.out.println("++d   = " +  (++d) );
	     //Assignment Operators 
	      System.out.println("Assignment operators"); 
	      c = a + b;
	      System.out.println("c = a + b = " + c );
	      c += a ;
	      System.out.println("c += a  = " + c );
	      c -= a ;
	      System.out.println("c -= a = " + c );
	      c *= a ;
	      System.out.println("c *= a = " + c );
	      a = 10;
	      c = 15;
	      c /= a ;
	      System.out.println("c /= a = " + c );
	      a = 10;
	      c = 15;
	      c %= a ;
	      System.out.println("c %= a  = " + c );
	      c <<= 2 ;
	      System.out.println("c <<= 2 = " + c );
	      c >>= 2 ;
	      System.out.println("c >>= 2 = " + c );
	      c >>= 2 ;
	      System.out.println("c >>= 2 = " + c );
	      c &= a ;
	      System.out.println("c &= a  = " + c );
	      c ^= a ;
	      System.out.println("c ^= a   = " + c );
	      c |= a ;
	      System.out.println("c |= a   = " + c );
	//Logical operators
	      System.out.println("Logical operators");     
	      boolean e = true;
	      boolean f = false;

	      System.out.println("e && f = " + (e&&f));
	      System.out.println("e || f = " + (e||f) );
	      System.out.println("!(e && f) = " + !(e && f));
	//bitwise operators
	      System.out.println("bitwise operators");    
	      a = 60;	/* 60 = 0011 1100 */
	      b = 13;	/* 13 = 0000 1101 */
	      c = 0;

	      c = a & b;        /* 12 = 0000 1100 */
	      System.out.println("a & b = " + c );

	      c = a | b;        /* 61 = 0011 1101 */
	      System.out.println("a | b = " + c );

	      c = a ^ b;        /* 49 = 0011 0001 */
	      System.out.println("a ^ b = " + c );

	      c = ~a;           /*-61 = 1100 0011 */
	      System.out.println("~a = " + c );

	      c = a << 2;       /* 240 = 1111 0000 */
	      System.out.println("a << 2 = " + c );

	      c = a >> 2;       /* 15 = 1111 */
	      System.out.println("a >> 2  = " + c );

	      c = a >>> 2;      /* 15 = 0000 1111 */
	      System.out.println("a >>> 2 = " + c );
	//Rational operators
	      System.out.println("Rational operators");     
	      a = 10;
	      b = 20;

	      System.out.println("a == b = " + (a == b) );
	      System.out.println("a != b = " + (a != b) );
	      System.out.println("a > b = " + (a > b) );
	      System.out.println("a < b = " + (a < b) );
	      System.out.println("b >= a = " + (b >= a) );
	      System.out.println("b <= a = " + (b <= a) );
	}

}
