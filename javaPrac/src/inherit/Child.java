package inherit;

public class Child extends Parent{
	
	public Child()
	{
		super();
		System.out.println("Child Constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1 = new Child();
		c1.method1();
		c1.method2("sunny");
	}
	public void method1() {
		System.out.println("Child method1");
	}
}
