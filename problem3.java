package task1;

import java.util.Scanner;


public class problem3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("����>>");
		double num1 = scanner.nextDouble();
		char operator = scanner.next().charAt(0);
		double num2 = scanner.nextDouble();
	
	
		switch(operator) {
		case '+':
			System.out.println(num1+"+"+num2+"�� ��� ����� "+Calculate.add(num1, num2));
			break;
		case '-':
			System.out.println(num1+"-"+num2+"�� ��� ����� "+Calculate.min(num1, num2));
			break;
		case '*':
			System.out.println(num1+"*"+num2+"�� ��� ����� "+Calculate.mul(num1, num2));
			break;
		case '/':
			if(num2==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				System.exit(0);
			}
			else if(num2!=0)
				System.out.println(num1+"/"+num2+"�� ��� ����� "+Calculate.div(num1, num2));
				break;
		}
	
		
		scanner.close();
	}
		
}
