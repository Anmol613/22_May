package pkg2;

public class Override_1 {
	
	public void m(int a, int b) {
		this.m1(2,3);
		int c;
		c=a-b;
	System.out.println("Result_sub="+c);	
	System.out.println("I am parent method");
	}
    public void m1(int c, int d) {
    	int e;
    	e=c-d;
    	System.out.println("VALue="+e);
    }
}
