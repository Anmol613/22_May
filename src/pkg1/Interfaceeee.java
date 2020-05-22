package pkg1;

public class Interfaceeee extends Interface{
	public void m4() {
		super.m4();
		//System.out.println("I am child mthd....");
	}
public static void main(String[] args) {
	Interfaceeee obj=new Interfaceeee();
	obj.m3();
	obj.m4();
}
}
