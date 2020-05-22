package pkg1;

public class Constructor {
	public Constructor() {
		this(1,2,3,4);
		System.out.println("Default constructor");
	}
	public Constructor(int a) {
		this();
		System.out.println("One parameterized constructor");
	}

	public Constructor(int b, int c) {
		this(2,3,4);
		System.out.println("Two parameterized constructor");
	}
	public Constructor(int d, int e, int f) {
		this(1);
		System.out.println("Three parameterized constructor");
}
	public Constructor(int g, int h, int i, int j) {
		System.out.println("Four parameterized constructor");
	}
	public static void main(String[] args) {
		Constructor obj=new Constructor(12,2);
	}
}

