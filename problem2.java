package task1;

import java.util.Scanner;

class Calculate{
	static double add(double x,double y) {
		return x+y;
	}
	static double min(double x,double y) {
		return x-y;
	}
	static double mul(double x,double y) {
		return x*y;
	}
	static double div(double x,double y) {
		return x/y;
	}
}

public class problem2 {
		
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("����>>");
		double num1 = scanner.nextDouble();
		char operator = scanner.next().charAt(0);
		double num2 = scanner.nextDouble();
		
		
		if(operator == '+')
			System.out.println(num1+"+"+num2+"�� ��� ����� "+Calculate.add(num1, num2));
		else if(operator == '-')
			System.out.println(num1+"-"+num2+"�� ��� ����� "+Calculate.min(num1, num2));
		else if(operator == '*')
			System.out.println(num1+"*"+num2+"�� ��� ����� "+Calculate.mul(num1, num2));
		else if(operator == '/')
			if(num2==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(0);
			}
			else if(num2!=0)
				System.out.println(num1+"/"+num2+"�� ��� ����� "+Calculate.div(num1, num2));
		
			
		scanner.close();
			
			
		}

}
