package javaLectures3IF_ELSE;

public class IfElseStatement {

	public static void main(String[] args) {
		
		int num=(int)(Math.random()*20);
		System.out.println(num);
		
		if(num>10)                               // here it is not mandatory to have curly open/close braces
		 	System.out.println(num + "  is grater than 10");
		
		else if (num<10 &&num>5)                  // we can have number of else if statements
			System.out.println(num + "  is between 10 & 15 ");
		
		else
		 	System.out.println(num + "  is lesser than 10");
		
	}

}
