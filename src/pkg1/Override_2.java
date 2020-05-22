package pkg1;

import pkg2.Override_1;

public class Override_2 extends Override_1 {
	public void m1(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Resultt="+c);
		System.out.println("I am child method");
	}
public static void main(String[] args) {
Override_2 obj= new Override_2();
obj.m(5, 6);
	
//	Override_1 objj=new Override_1();
//	objj.m(2, 3);	
}
}
