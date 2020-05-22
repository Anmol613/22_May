package pkg1;

public class static_1 extends static_2 {
	static int a;
	static int x;
	public static void mthd1() {
		a=a+1;
		System.out.println("value="+a);
		}
	public void mthd3() {
		super.mthd2();
		x=x+1;
		System.out.println("Value of x="+x);
	}
	public static void main(String[]args) {
		//mthd1();
		//static_1.mthd1();
		static_1 obj=new static_1();
		obj.mthd1();
		static_2 objj= new static_2();
		objj.mthd2();
		static_2.mthd2();
		obj.mthd3();
		
	}

}
