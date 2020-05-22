package pkg2;

public class Parent_obj {
	public void c1() {
		this.c5(1, 2, 3, 4);
		System.out.println("Default cons.");
	}
	
	public void c2(int a) {
		this.c3(1, 2);
		System.out.println("One para.");
	}
	public void c3(int a, int b) {
		this.c1();
		System.out.println("Two para.");
	}
	
	public void m4(int a, int b, int c) {
		this.c2(1);
		System.out.println("Three para.");
	}
	
	public void c5(int a, int b, int c, int d) {
		
		System.out.println("Four para.");
	}

}
