package pkg2;

import java.util.Scanner;

public class Overloading {
	public static void  m1(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Result="+c);
		}
	public static void m1(int a, int b, int c) {
		int d;
		d=a+b+c;
		System.out.println("Result="+d);
	}
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value of a");
		int a=s.nextInt();
		System.out.println("Enter vcalue of b");
		int b= s.nextInt();
		
		Overloading obj=new Overloading();
	    obj.m1(a, b);
	}

}
