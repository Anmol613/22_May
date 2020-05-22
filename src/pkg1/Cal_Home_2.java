package pkg1;

public class Cal_Home_2 {
	public int div (int a,int b) {
		int c;
		c=a/b;
		System.out.println("Div="+c);
		return c;
	}
	public int sub (int a1, int b1) {
		int c1;
		c1=a1-b1;
		System.out.println("Sub="+ c1);
		return c1;
	}
	public int sum (int a2, int b2) {
		int c2;
		c2=a2+b2;
		System.out.println("Sum"+ c2);
		return c2;
	}
public void mul (int a3, int b3) {
	int c3;
	c3=a3*b3;
	System.out.println("Mul="+c3);
}
public static void main (String[] args) {
	Cal_Home_2 obj=new Cal_Home_2();
	int div_result=obj.div(10,2);
	int sub_result=obj.sub(div_result, 2);
	int sum_result=obj.sum(sub_result,2);
	int sum_result2=obj.sum(sum_result,2);
	System.out.println("Final result");
	obj.mul(sum_result2, 2);
	
	
}
}
