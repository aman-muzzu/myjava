package javaLectures2Methods;

/*
 * 
 * calculator - add, sub, mul, div
 * 1. methods---> add sub mul div
 * 2.return --->int
 * 3.Parameters ---2 int
 * 
 * 
 * 
 */

public class LearningMethods3 {

	//instance/ local/ class variable
	/*
	 * 
	 * Instance----declared  in class body\
	 * local variable -----declared inside method body
	 * 
	 */
	
	 static int i=10;//  instance variable--->Global variable
	         //  This  variable belongs to instance of this class.
	
	public void go() {
		
	// method
	
	}
	public static void main(String[] args) {
		Calculator calc= new Calculator();
		int i= calc.getsum(10, 4);
		System.out.println(calc.getsum(10, 4));
		System.out.println(calc.getsub(10, 4));
		System.out.println(calc.getmul(10, 4));
		System.out.println(calc.getdiv(8, 4));
		

	}

}
