package javaLectures5_Loops;


/*
 * 
 * when we us this loops
 * while---when no of iteration is unknown
 * for---->no of iteration is known
 * do while--->run atleast for one time irrespective of the condition.
 * 
 * 
 */

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i=1 ;i<=10; i++)
		//for(int i=1 ; ; )   // if we remove i<=10 and i++  then it seems condition will default be true. & print output infinite times 111
		
		//int i=1;
		//for( ; i<=10; i++)   // this out put will be same as line num 7
		//int i=1;
		//for(  ; ; i++)        // here i will be incrementing infinite times.
		{
			  
			 System.out.println(i);
			 
			 
		
		 }
			 

	}

}
