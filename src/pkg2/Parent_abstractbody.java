package pkg2;

import pkg1.Class_Abstract;

public class Parent_abstractbody extends Class_Abstract {
	public void m1() {
		System.out.println("Hello parent");
	}
	public void m2() {
		//super.m2();
		System.out.println("I am parent method");
	}
public static void main(String[] args) {
Parent_abstractbody obj=new Parent_abstractbody();
	obj.m2();
	
}

}
