package TASK2;

import java.util.Scanner;
import java.util.Random;

public class problem2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
		while(true) {
			System.out.println("���� ���� ��!>>");
			String yourChoice = scanner.next();
			String comChoice[]= {"����","����","��"};
			Random random = new Random();
			int randNum = random.nextInt(comChoice.length);
			
			if(yourChoice.equals("����")&&comChoice[randNum].equals("����"))
				System.out.println("����� =����, ��ǻ��=����,�����ϴ�.");
			else if(yourChoice.equals("����")&&comChoice[randNum].equals("����"))
				System.out.println("����� =����, ��ǻ��=����,�����ϴ�.");
			else if(yourChoice.equals("��")&&comChoice[randNum].equals("��"))
				System.out.println("����� =��, ��ǻ��=��,�����ϴ�.");
			else if(yourChoice.equals("����")&&comChoice[randNum].equals("����"))
				System.out.println("����� =����, ��ǻ��=����,����ڰ� �����ϴ�.");
			else if(yourChoice.equals("����")&&comChoice[randNum].equals("��"))
				System.out.println("����� =����, ��ǻ��=��,����ڰ� �̰���ϴ�.");
			else if(yourChoice.equals("����")&&comChoice[randNum].equals("����"))
				System.out.println("����� =����, ��ǻ��=����,����ڰ� �̰���ϴ�.");
			else if(yourChoice.equals("����")&&comChoice[randNum].equals("��"))
				System.out.println("����� =����, ��ǻ��=��,����ڰ� �����ϴ�.");
			else if(yourChoice.equals("��")&&comChoice[randNum].equals("����"))
				System.out.println("����� =��, ��ǻ��=����,����ڰ� �����ϴ�.");
			else if(yourChoice.equals("��")&&comChoice[randNum].equals("����"))
				System.out.println("����� =��, ��ǻ��=����,����ڰ� �̰���ϴ�.");
			else if(yourChoice.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				break;
			}
		}
		scanner.close();
	}
}
