package javaLectures2Methods;

public class MethodCalling {
	
	//static component--->cannot give call to non-static component directly
	//static --->static
	//non-static-->nonstatic , staticv(allowed)
	//Non static components cannot be called without making object
	
	// static -->object orientations 
	
	/*
	 * compile
	 * execute--jvm 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		MethodCalling m= new MethodCalling();
		m.go1();
		//m.go1();
		//m.go2();
		System.out.println("after calling go1 method");
		
		
	}
	
	public void go() {
		
		System.out.println("Inside the go method");
		go2();
		System.out.println("after calling go2 method");
		
	}

   public void go1() {
		
		System.out.println("Inside the go1 method");
		go();
		System.out.println("after calling go method");
	}
   public void go2() {
	
	System.out.println("Inside the go2 method");
}
   public void go3() {
		
		System.out.println("Inside the go3 method");
		go3();
	}
}
