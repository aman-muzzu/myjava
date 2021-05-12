package javaLectures6_Arrays;

public class Array2d {

	public static void main(String[] args) {
		
		int[][] myArray= new int[2][3];
		myArray[0][0]=1;
		myArray[0][1]=2;
		myArray[0][2]=3;
		
		myArray[1][0]=4;
		myArray[1][1]=5;
		myArray[1][2]=6;
		
		/*System.out.println(myArray[1][1]=5);
		System.out.println(myArray.length);
		System.out.println(myArray[0].length);*/
		 for(int i=0; i<myArray.length; i++) {
			  for(int j=0; j<myArray[i].length;j++)
			  {
			  //System.out.println(myArray[i] [j]);   //shows in vertical line
			  //System.out.print(myArray[i] [j] +"   "); //shows in vertical line remove ln from println
			  System.out.print(myArray[i] [j] +"   "); // space between and each character
		 }
			  
			  System.out.println();   // if you add this you will get seperate rows, run this
		 }

	}

}
