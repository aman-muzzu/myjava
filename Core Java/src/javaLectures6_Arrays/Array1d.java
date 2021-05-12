package javaLectures6_Arrays;

public class Array1d {
	
	/*
	 * 
	 * Length we use final key word
	 * ex: public class array{
	 * public final int length;
	 * }
	 * 
	 * final keyword: can be used in below  3 also
	 * variable: 	constant 	
	 * method:   cannot override
	 * class:   cannot  inherit
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		
		
		int[] array =new int[10];
		//String[] myArray = new String[35];	
		
		//System.out.println(array.length);  // finally lenght is final variable which cannot be  changed
		
		//System.out.println(array);    // it will store only reference value
		//System.out.println(myArray.length);
		
		array[1]= 10;
		array[2]=20;
		array[3]=60;
		array[6]=40;
		
		//System.out.println(array[3]);   //harcoded
		
		
		for(int index = 0; index < array.length; index++); {  //logic   
		int index = 0;
		array[index]= (int)(Math.random()*1000);
		//System.out.println(array[index]);
		
		}
		
		
		
		for (int var: array) {
		
		System.out.println(var);
		}
		
		System.out.println("print in reverse order------->");

		
		for (int index=array.length-1; index>=0; index--) {
			System.out.println(array[index]);
			
			
		/*	//Hardcode directly
			{
			int array1[] = {1,2,3,4,5};
			System.out.println(array1.length);
			}*/
		}
				

	
	}
}
