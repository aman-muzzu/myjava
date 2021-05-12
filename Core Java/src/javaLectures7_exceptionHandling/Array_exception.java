package javaLectures7_exceptionHandling;

public class Array_exception {
// RUNTIME EXCEPTION
	public static void main(String[] args) {
		
		System.out.println("@ Befor Beginning");
		try {
		
		int i[]= new int[4];
		i[5]=100;
		}catch(Exception e) {
			
			System.out.println("Error occured");
	

	}
		System.out.println("Ending");
	}
}
