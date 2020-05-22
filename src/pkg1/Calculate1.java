package pkg1;

public class Calculate1 {
	public int sum(int a, int b) 
	{
		int c;
        c=a+b;
        System.out.println("Sum="+c);
        return c;
	}

	public int sub (int a1, int b1)
	{
		int c1=a1-b1;
		System.out.println("Sub="+c1);
		return c1;
	}
	public void mul (int a2, int b2)
	{
		int c2=a2*b2;
		System.out.println("Mul="+c2);
		
	}
	public static void main (String[] args) {
		Calculate1 obj=new Calculate1();
		int sum_result=obj.sum(10,2);
		int sub_result=obj.sub(10,2);
	 obj.mul(sum_result,sub_result);
	}
}
