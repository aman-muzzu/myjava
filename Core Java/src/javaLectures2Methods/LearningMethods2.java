package javaLectures2Methods;

public class LearningMethods2 {

	int i;  //decleration, initilize
	int j;
	
	//public int,char,boolean  display1() // this is not possible
	//public int display1(int k,char c,float f) // this is possible, we will not assign value only we can declare here
	//display
	// return type--->datatype of the value returened by methosd
	//Keyword--->return
	public void show() {
	
		/*	int a;
		int b;
		String c;*/
	}

	public int display(int k, String a, char c, float f, boolean b) //declare--->we cannot define like-- int k=100, 
	
	// here we need to add Keyword---return
		{  //start
			/*
			 *  all definitions goes here!!
			 */
		int j=100;
		System.out.println("inside the display method");
		return 10; // here return type is int so return type to me mentioned.   it should be last statement
		
		}
	

	public static void main(String[]args) {
		/*LearningMethods2 learn = new LearningMethods2();
	    learn.show();
	    //learn.display(k, a, c, f, b);
	    
	    LearningMethods2 learn1 = new LearningMethods2();
	    learn1.show();*/
	
	LearningMethods3 l =new LearningMethods3();  //l --->object--->i=10
	l.i++;  //object--->i=11;
	
	LearningMethods3 l2 =new LearningMethods3();    //l2--->object2--->i=10
	l2.i++;   //object--->i= 11;
	
	LearningMethods3 l3 =new LearningMethods3();  //  l3--->objet3--->i=10;
	System.out.println(l3.i);    //10
	
	    
	    
		
	}
}
	
