package javaLectures7_exceptionHandling;

public class Finnay_blocks_exception {

	
	/*
	 * @params args
	 *
	 */
	public static void main(String[] args) {
		
	
		
		 try {
			 
			 
			  // DB connection
			  // Executing some queries
			  //validating and comparong date with website
			  //closing connection
			  
				int i[]= new int[4];
				i[4]=100;
				
				System.out.println("Close Db connection in ty block");
		 
		 }catch (Throwable e) {
		
		System.out.println("Error Occured");
		
	}finally {
		
		System.out.println("closing DB connection in finally block");
	}


}
}

