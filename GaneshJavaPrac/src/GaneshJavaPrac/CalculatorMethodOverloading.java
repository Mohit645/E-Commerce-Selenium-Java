package GaneshJavaPrac;

public class CalculatorMethodOverloading {
	
	private Integer add(int arg1, int arg2) {
		arg1 =100;
		int sum = arg1 + arg2;
		return sum;
	}
	
	private Integer add(int arg1, int arg2, int arg3) {

		int sum = arg1 + arg2 +arg3;
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorMethodOverloading obj = new CalculatorMethodOverloading();
		int arg1 = 20;
		int arg2 = 30;
		int arg3 = 40;
		System.out.println("arg1 before call by value"+ arg1);
		int result = obj.add(arg1, arg2);
		System.out.println("arg1 after call by value"+ arg1);
        System.out.println(result);
        
        int result2methodoverload = obj.add(arg1, arg2, arg3);
        System.out.println(result2methodoverload);
	}

}
