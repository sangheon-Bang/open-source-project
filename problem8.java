package Task5;

import java.util.Scanner;
import java.util.*;

class Nation{
	private String country;
	private String capital;
	
	public Nation(String country, String capital) {
		this.country=country;
		this.capital=capital;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getCapital() {
		return capital;
	}
}

class Game1 {
	Scanner scanner = new Scanner(System.in);
	private Vector<Nation> dic =new Vector<Nation>();
	
	private boolean contains(String country) {
		for(int i=0; i<dic.size(); i++) {
			if(dic.get(i).getCountry().equals(country)) { 
				return true;
			}
		}
		
		return false;
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
				if(contains(country)) {
					System.out.println(country+"�� �̹� �ֽ��ϴ�");
					continue;
				}
				dic.add(new Nation(country,capital));
				n++;
			}
		}
		
	}
	
	public void quiz() {
		while(true) {
			int ran=(int)(Math.random()*dic.size());
			Nation nation=dic.get(ran);
			String question=nation.getCountry();
			String answer=nation.getCapital();
			System.out.print(question+"�� ������?");
			String UserAnswer = scanner.next();
			if(UserAnswer.equals("�׸�")) {
				break;
			}
			if(UserAnswer.equals(answer))
				System.out.println("����!!");
			else
				System.out.println("�ƴմϴ�!!");	
		}
	}
	
}


public class problem8 {
	public static void main(String[] args) {
		System.out.println("**** ���� ���߱� ������ �����մϴ�. ****");
		Game1 nationGame = new Game1();
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
