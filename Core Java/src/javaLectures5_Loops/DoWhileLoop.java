package javaLectures5_Loops;

public class DoWhileLoop {

	/*
	 * 
	 * Do while loop is similar to "While loop" but difference is loop block will run atleast one time!!!!
	 * 
	 */
	public static void main(String[] args) {
		
		int i=12;
		
		do {               // diff: FIRST CONDITION WILL RUN.
			
			System.out.println(i);
			i++;
		}
		while(i<=14);
		System.out.println(i);
		System.out.println("After the loop");
		
	}

}
