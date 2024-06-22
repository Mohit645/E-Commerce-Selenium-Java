package GaneshJavaPrac;

public class LearnNonaccessModifier {
	
	final Integer pi = 3;
	Integer instancevariable = 20;
	static Integer staticvariable = 80;
	
	static void teststatic() {
		System.out.println("static method");		
	}
	
	void testnonstatic() {
		Integer localvariable = 10;
		System.out.println("Non static method "+ localvariable);		
	}
	public static void main(String[] args) {
		LearnNonaccessModifier obj = new LearnNonaccessModifier();
		obj.instancevariable = 40;
		LearnNonaccessModifier obj1 = new LearnNonaccessModifier();
		obj1.instancevariable = 50;
		
		System.out.println("hello world");
		LearnNonaccessModifier.staticvariable = 100;
		System.out.println(staticvariable);
		
		System.out.println(obj1.instancevariable);
		teststatic();
		obj.testnonstatic();
	}

}
