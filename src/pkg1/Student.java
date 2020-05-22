package pkg1;

public class Student 
{
	int age;
	int roll_number;
	
	public void Display1() 
	{
		System.out.println("Welcome All");
	}
	
	public void Display2()
	{
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) 
	{
		System.out.println("Execution starts");
		Student Deepak=new Student();
		Student Shubham=new Student();
		//Deepak.age=10;
		Deepak.roll_number=1;
		Deepak.Display1();
		Deepak.Display2();
		Shubham.Display1();
		System.out.println("Age="+Deepak.age);
		System.out.println("Roll Number="+ Deepak.roll_number);
		
	}
}
