package pkg1;

public class Cons_Method {
	public void mthd() {
		System.out.println("Defauylt mthd");
		this.mthd1(3);
	}
	
	public void mthd1(int a) {
		System.out.println("One parameterized");
	}
public void mthd2(int a, int b) {
	System.out.println("Two par.mthd");
	this.mthd();
}
public void mthd3(int a, int b, int c) {
	System.out.println("Three para");
}
public static void main(String[]args) {
	Cons_Method aa=new Cons_Method();
	aa.mthd2(1, 2);
}
}
