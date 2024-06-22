package javaPrac;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		armstrongNumber(370);
	}
	
	static void armstrongNumber(int num){
		int tempNum =0;
		int sum = 0;
		String flag = "The number is not an armstrong Number";
		String number = String.valueOf(num);
		for(int i = 0; i<number.length(); i++) {
			tempNum = Integer.parseInt(number.substring(i,i+1));
			sum = (int) (sum + Math.pow(tempNum,3));
			
		}
		
		if(sum==num) {
			flag = "The number is an armstrong Number";
		}
		
		System.out.println(flag);
	}

}
