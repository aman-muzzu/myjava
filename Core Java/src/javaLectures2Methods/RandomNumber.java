package javaLectures2Methods;

public class RandomNumber {
	
	//type cast-->

	public static void main(String[] args) {
	/*	double num= Math.random()*100;  // here if we *10 it will generate 0.1 -9.0   if we do*100 then from 0.1--99.0
		System.out.println(num);*/

	// type casting if we include int and change toBOdmas then result will be coming in shorter	
		int num= (int) (Math.random()*100); 
		System.out.println(num);

		double num1= (int) (Math.random()*100);   // if we need decimal then use double instead of int
		System.out.println(num1);
	}

}
