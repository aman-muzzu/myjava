package javaLectures;

 class DataTypes {

	public static void main(String[] args) {
		
		
		int i= 1234567;         //int --will give integer value only for 10 digits
		float f= 1.3456789f;    // float will give decimal values with suffix f
		long l=234567890789l;   // long number will give integer number above 10 digits also but suffix to be l
		double d=3.45678904567890567890;   //  double will store decimal points with out suffix compare to float
		boolean b=true;                    //  boolean will store only true/false
		char c='t';                        //   char will store only single character 
		String s= "This is aman";         //  string will store more characters compare to char.  // class in java
		
		DataTypes dt;
		
		String xyz ="sdffghjk";
		int batmanBegins;                //  batmanbegins  this not readable so we use camel casing
		int theDarkKnight;               //   thedarkknight   first letter should be small and thereafter capital as 
		int theDarkKnightRises;         //  thedarkknightrises(not readable if it is so long
		
		String abc = new String();
		abc="Hello";
		
		String abc1 = "Hello";
		
		
		String S1="Aman ";  // here space will be considered in output
		String S2="is ";
		String S3="Engineer";
		
		String S4= S1+"Muzammil  "  +  S2+    S3;// here space is not considered in out put
		
		//String+string--->concaneted string
		
		System.out.println(S4);
		System.out.println(S1+S2+S3);
		
		
		// we can do the same with integers also
		
		//int + int------>int
		int Num1=10;
		int Num2=20;
		System.out.println(Num1+Num2);
		System.out.println(Num1+Num2+ "After");
		System.out.println("before"+Num1+Num2+"After"); // this will not be added it shows (before1020After)so we need to  use BODMAS rule
		System.out.println("before"+(Num1+Num2)+"After");  // bodmas is applied +(Num1+Num2)
		
		
		System.out.println(!true);    // this is how we use logical operator
		
		/*
		 * 12 + 45// operands
		 * Unary Operators---accepts single operands
		 * Binary Operator--->2 operands
		 * Ternary Operators--->3 operands
		 * 
		 * i++ increment operator
		 * I-- decrement operator
		 * !   logicalcomplimant operator
		 * 
		 * ARTHAMATIC OPERATORS
		 * +  add
		 * - sub
		 * * mul
		 * / div
		 * % reminder
		 * 
		 * 
		 */
		//Equlaty operator
		
		System.out.println(786==787);  // false condition

		System.out.println(786==786); // true condition
		
		// conditional operator
		System.out.println(true && true);  // true condition
		
		System.out.println((123==122) && (55 >= 10));
	}

}
