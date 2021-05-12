package javaLectures5_Loops;

public class BreakandContinue {
	
	/*
	 * Break and continue are used for change normal flow to compound statement.
	 * 
	 * Break will jump to end of compound statement
	 * 
	 * Continue will jump to next iteration of the compound statement.
	 *
	 */
	
	public void go() {
		
		System.out.println("first");
		//break;
		//continue;   this break &continue cannot be used outside the loop or switch
		
		System.out.println("last");
	}

	public static void main(String[] args) {
	//	BreakandContinue b = new BreakandContinue();
		//b.go();                                         // for time being will comment this
		
		for ( int i=0; i<10; i++) {
			
			if (i==5)
				break;
			System.out.println(i);
			
			for (int j=0; j<10; j++) {
				if(j>5 && j<7)
					continue;
				System.out.println(i);
				
				
			}
				
			
		}
		

	}

}
