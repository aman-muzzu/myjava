package javaLectures7_exceptionHandling;

public class Caught_exception {

	
	//InterruptedException
	public static void main(String[] args) throws InterruptedException {
		int i[]= new int[4];
		i[5]=100;
		
		
	/*	try {
		Thread.sleep(1000);
		
	}   catch(InterruptedException e) {
		e.printStackTrace();
	}*/

		
		Thread.sleep(1000);  //  throws InterruptedException {
		
		Thread.sleep(1000);
	}
}
