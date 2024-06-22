package inherit;

public class Parent {
	
	static String s;
	
	public Parent() {
		System.out.println("Parent Constructor");
		s = "String";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p1 = new Parent();
		p1.method1();
		p1.method2(s);

	}
	
	public void method1() {
		System.out.println("Method 1");
	}
	
	public void method2(String s) {
		s = Parent.s;
		System.out.println(s);
	}

}
