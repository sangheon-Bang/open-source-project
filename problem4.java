package TASK2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class problem4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n,m;
		while(true) {
			System.out.print("���ϰ��� �ϴ� �� �� �Է�>>");
			try {
				n=scanner.nextInt();
				m=scanner.nextInt();
				break;
			}
			catch(InputMismatchException e){
				System.out.println("�Ǽ��� �Է��ϸ� �ȵ˴ϴ�.");
				scanner.nextLine();
			}
		}
		System.out.println(n+"x"+m+"="+n*m);
		
		scanner.close();
	}
}
