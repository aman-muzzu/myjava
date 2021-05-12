package javaLectures5_Loops;

public class NestedLoop {
	
/*
* while--3
* for---4
* do while---5
* 
*how many times it will run==3*4*5=60 times
* 
*/
	public static void main(String[] args) {
		int i=0;  // standard format to start loop
		while(i<3) {
			//System.out.println(i);
			
			for(int j=0; j<4; j++) {
		int k=0;
		    do {
		    	System.out.println("i="+i + "j="+j +  "k="+k);
		    	k++;
		       }
		    while(k<5);
			}
			
		i++;
		}	

		       // System.out.println("total count is:"+ count);
	}

}
