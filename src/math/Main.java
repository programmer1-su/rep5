package math;

public class Main {

	public static void main(String[] args) {
		int value1 = 10;
		int value2 = -10;
		
		double d = 10.5;
		
		int num1 = 123984;
		int num2 = 9934;
		
		int i = 2;
		int t = 3;
		
		System.out.println(Math.abs(value1));
		System.out.println(Math.abs(value2));
		
		System.out.println(Math.ceil(d));
		System.out.println(Math.floor(d));
		
		System.out.println(Math.max(num1,num2));
		System.out.println(Math.min(num1,num2));
		
		System.out.println(Math.pow(i,t));
		
		for(int ran = 0; ran < 100 ; ran++) {
			System.out.println((int)(Math.random() * 100) + 1);
		}
		
		System.out.println(Math.round(d));
	}

}
