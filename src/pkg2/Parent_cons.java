package pkg2;

public class Parent_cons {
	public Parent_cons() {
		this(1,2,3,4);
		System.out.println("Default cons.");
	}
	
	public Parent_cons(int a) {
		this(1,2);
		System.out.println("One para.");
	}
	public Parent_cons(int a, int b) {
		this();
		System.out.println("Two para.");
	}
	
	public Parent_cons(int a, int b, int c) {
		this(1);
		System.out.println("Three para.");
	}
	
	public Parent_cons(int a, int b, int c, int d) {
		
		System.out.println("Four para.");
	}



}
