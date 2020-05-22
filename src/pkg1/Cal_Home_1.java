package pkg1;

public class Cal_Home_1 {
	public int sum (int a,int b) {
		int c;
		c=a+b;
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
	 c2= a2*b2;
	 System.out.println("Mul="+c2);
	 return c2;
 }
 public void div(int a3, int b3)
 {
	 int c3;
	 c3=a3/b3;
	 System.out.println("Final result="+c3);
 }
public static void main (String[] args) {
	Cal_Home_1 obj= new Cal_Home_1();
	int sum_result=obj.sum(10, 2);
	int sub_result=obj.sub(sum_result, 2);
	int sum_result2=obj.sum(sub_result,2);
	int mul_result=obj.mul(sum_result2, 2);
	System.out.println("Final result-----");
	obj.div(mul_result, 2);
}
}

