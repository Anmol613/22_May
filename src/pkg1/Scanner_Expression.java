package pkg1;

import java.util.Scanner;

public class Scanner_Expression {
	public int sum(int a, int b) {
		int c;
		c= a+b;
		System.out.println("Sum="+c);
		return c;
	}
	public int sub (int a1, int b1) {
		int c1;
		c1=a1-b1;
		System.out.println("Sub="+c1);
		return c1;
	}
	public int mul(int a2, int b2) {
		int c2;
		c2=a2*b2;
		System.out.println("Mul="+c2);
		return c2;
	}
	public void div(float a3, float b3) {
		float c3;
		c3=a3/b3;
		System.out.println("Resukt="+c3);
	}
	
public static void main (String[]args) {
	
Scanner s=new Scanner(System.in);
	System.out.println("Enter value of x1");
	int x1=s.nextInt();
	System.out.println("value of x1="+x1);
	int x2= s.nextInt();
	System.out.println("value of x2="+x2);
	int x3=s.nextInt();
	System.out.println("value of x3="+x3);
	int x4= s.nextInt();
	System.out.println("value of x4="+x4);
	int x5=s.nextInt();
	System.out.println("value of x5="+x5);
	int x6= s.nextInt();
	System.out.println("value of x6="+x6);
	
	
	Scanner_Expression ref=new Scanner_Expression();
	int sum_result=ref.sum(x1, x2);
	int sub_result=ref.sub(sum_result, x3);
	int sum_result2= ref.sum(sub_result, x4);
	int mul_resukt=ref.mul(sum_result2, x5);
	System.out.println("Final result of expression");
	ref.div( mul_resukt, x6); 
	
	
	
}

}

