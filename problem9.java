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
	
				if(dic.containsKey(country)) {
					System.out.println(country+"는 이미 있습니다");
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
			System.out.print(question+"의 수도는?");
			String UserAnwser = scanner.next();
			if(UserAnwser.equals("그만")) {
				break;
			}
			if(UserAnwser.equals(answer))
				System.out.println("정답!!");
			else
				System.out.println("아닙니다!!");	
		}
	}
	
}


public class problem9 {
	public static void main(String[] args) {
		System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
		Game2 nationGame = new Game2();
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