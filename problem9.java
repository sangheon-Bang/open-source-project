package Task5;

import java.util.Scanner;
import java.util.*;

class Game2 {
	Scanner scanner = new Scanner(System.in);
	HashMap<String,String> dic= new HashMap<String,String>();
	
	public void addList() {	
		
	}
	
	public void input() {
		
		int n=dic.size();
		System.out.println("����"+n+"�� ����� ������ �ԷµǾ� �ֽ��ϴ�.");
		n++;
		while(true) {
			
			System.out.print("����� ���� �Է�"+n+">>");
			String country = scanner.next();
			
			if(country.equals("�׸�")) {
				break;
			}
			else {
				String capital = scanner.next();
	
				if(dic.containsKey(country)) {
					System.out.println(country+"�� �̹� �ֽ��ϴ�");
					continue;
				}
				dic.put(country, capital);
				n++;
			}
		}
		
	}
	
	public void quiz() {
		Set<String> keys=dic.keySet();
		Object [] array=(keys.toArray());
		while(true) {
			int ran=(int)(Math.random()*array.length);
			String question=(String)array[ran];
			String answer=dic.get(question);
			System.out.print(question+"�� ������?");
			String UserAnwser = scanner.next();
			if(UserAnwser.equals("�׸�")) {
				break;
			}
			if(UserAnwser.equals(answer))
				System.out.println("����!!");
			else
				System.out.println("�ƴմϴ�!!");	
		}
	}
	
}


public class problem9 {
	public static void main(String[] args) {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		Game2 nationGame = new Game2();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {

			int menu;
			System.out.print("�Է�:1, ����:2, ����:3>>");
				
			menu = scanner.nextInt();
			
			if(menu==1) {
				nationGame.input();
			}
			else if(menu==2) {
				nationGame.quiz();
			}
			else if(menu==3) {
				System.out.println("������ �����մϴ�.");
				break;
			}
		}	
		scanner.close();
		}
	}