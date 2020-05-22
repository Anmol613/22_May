package pkg1;

import pkg2.Parent_cons;

public class child_cons extends Parent_cons {
	public child_cons() {
     this(1,2,3);
		System.out.println("Child Default cons.");
	}
	public child_cons(int a) {
		this(1,2,3,4);
		System.out.println("Child One cons.");}
		
		public child_cons(int a, int b) {
			this(1);
			System.out.println("Child Two cons.");}
			
			public child_cons(int a, int b, int c) {
				super(1,2,3);
				System.out.println("Child Three cons.");}
			public child_cons(int a, int b, int c, int d) {
				this();
				System.out.println("Child Four cons.");}
			
			public static void main(String[] args) {
			child_cons c= new child_cons(2,3);
//			Making parent class object in child
//				Parent p=new Parent(2,3);
				
			}

}
