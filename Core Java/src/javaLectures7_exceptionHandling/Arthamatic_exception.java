package javaLectures7_exceptionHandling;

public class Arthamatic_exception {

	public static void main(String[] args) {
		
		
		System.out.println("@Befor Beginning");
		
		try {
			System.out.println("Begining");
			
			int divide= 20/0;
			
			System.out.println(divide);
			
		} catch (Exception e){
			System.out.println("Error Occured");
			
			System.out.println(e.getMessage());     // it will print  " / by zero "
    	e.printStackTrace();    // print java.lang.ArithmeticException: / by zero   at 
			//javaLectures7_exceptionHandling.Arthamatic_exception.main(Arthamatic_exception.java:13)
			
			
		}
			System.out.println("After try catch block");
			
			System.out.println("@After Ending");
			
	}
	
		
}
