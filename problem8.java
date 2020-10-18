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
		System.out.println("현재"+n+"개 나라와 수도가 입력되어 있습니다.");
		n++;
		while(true) {
			
			System.out.print("나라와 수도 입력"+n+">>");
			String country = scanner.next();
			if(country.equals("그만")) {
				break;
			}
			else {
				String capital = scanner.next();
				if(contains(country)) {
					System.out.println(country+"는 이미 있습니다");
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
			System.out.print(question+"의 수도는?");
			String UserAnswer = scanner.next();
			if(UserAnswer.equals("그만")) {
				break;
			}
			if(UserAnswer.equals(answer))
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");	
		}
	}
	
}


public class problem8 {
	public static void main(String[] args) {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		Game1 nationGame = new Game1();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {

			int menu;
			System.out.print("입력:1, 퀴즈:2, 종료:3>>");
				
			menu = scanner.nextInt();
			
			if(menu==1) {
				nationGame.input();
			}
			else if(menu==2) {
				nationGame.quiz();
			}
			else if(menu==3) {
				System.out.println("게임을 종료합니다.");
				break;
			}
		}	
		scanner.close();
		}
	}
