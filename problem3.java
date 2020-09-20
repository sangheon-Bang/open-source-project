package task1;

import java.util.Scanner;


public class problem3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("연산>>");
		double num1 = scanner.nextDouble();
		char operator = scanner.next().charAt(0);
		double num2 = scanner.nextDouble();
	
	
		switch(operator) {
		case '+':
			System.out.println(num1+"+"+num2+"의 계산 결과는 "+Calculate.add(num1, num2));
			break;
		case '-':
			System.out.println(num1+"-"+num2+"의 계산 결과는 "+Calculate.min(num1, num2));
			break;
		case '*':
			System.out.println(num1+"*"+num2+"의 계산 결과는 "+Calculate.mul(num1, num2));
			break;
		case '/':
			if(num2==0) {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);
			}
			else if(num2!=0)
				System.out.println(num1+"/"+num2+"의 계산 결과는 "+Calculate.div(num1, num2));
				break;
		}
	
		
		scanner.close();
	}
		
}
