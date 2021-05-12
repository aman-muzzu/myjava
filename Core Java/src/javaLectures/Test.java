package javaLectures;


public class Test
{// Instance ---w.r.t vs instance--copy/clone
				// class def: class is used to create an object
	
	//Jdk====java compiler + JRE(JVM + lib files)

	
	public static void main(String[] args) {
		
		Test t= new Test();  // t is reference
		System.out.println(t);
		
		t=null;
	//	t=12234;  this wrong
	//	Test t1=1234; this is wrong
		//Test t= t;   //we can store in reference variable in t
		//new Test();
		
		/*for(int i=0; ;i++)
		{
		new Test();
		System.out.println(i);
		
		
		}*/
		

	}

}
