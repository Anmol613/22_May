package pkg1;

import pkg2.Parent_obj;

public class child_obj extends Parent_obj {
	public void m1() {
	     this.m4(1, 2, 3);
			System.out.println("Child Default cons.");
		}
		public void m2(int a) {
			this.m5(1, 2, 3, 4);
			System.out.println("Child One cons.");}
			
			public void m3(int a, int b) {
				this.m2(1);
				System.out.println("Child Two cons.");}
				
				public void m4(int a, int b, int c) {
					super.m4(1, 2, 3);
					System.out.println("Child Three cons.");}
				public void m5(int a, int b, int c, int d) {
					this.m1();
					System.out.println("Child Four cons.");}
				
				public static void main(String[] args) {
				child_obj c= new child_obj();
				c.m3(1, 2);
				}

}
