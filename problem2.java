package TASK2;

import java.util.Scanner;
import java.util.Random;

public class problem2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		while(true) {
			System.out.println("가위 바위 보!>>");
			String yourChoice = scanner.next();
			String comChoice[]= {"가위","바위","보"};
			Random random = new Random();
			int randNum = random.nextInt(comChoice.length);
			
			if(yourChoice.equals("가위")&&comChoice[randNum].equals("가위"))
				System.out.println("사용자 =가위, 컴퓨터=가위,비겼습니다.");
			else if(yourChoice.equals("바위")&&comChoice[randNum].equals("바위"))
				System.out.println("사용자 =바위, 컴퓨터=바위,비겼습니다.");
			else if(yourChoice.equals("보")&&comChoice[randNum].equals("보"))
				System.out.println("사용자 =보, 컴퓨터=보,비겼습니다.");
			else if(yourChoice.equals("가위")&&comChoice[randNum].equals("바위"))
				System.out.println("사용자 =가위, 컴퓨터=바위,사용자가 졌습니다.");
			else if(yourChoice.equals("가위")&&comChoice[randNum].equals("보"))
				System.out.println("사용자 =가위, 컴퓨터=보,사용자가 이겼습니다.");
			else if(yourChoice.equals("바위")&&comChoice[randNum].equals("가위"))
				System.out.println("사용자 =바위, 컴퓨터=가위,사용자가 이겼습니다.");
			else if(yourChoice.equals("바위")&&comChoice[randNum].equals("보"))
				System.out.println("사용자 =바위, 컴퓨터=보,사용자가 졌습니다.");
			else if(yourChoice.equals("보")&&comChoice[randNum].equals("가위"))
				System.out.println("사용자 =보, 컴퓨터=가위,사용자가 졌습니다.");
			else if(yourChoice.equals("보")&&comChoice[randNum].equals("바위"))
				System.out.println("사용자 =보, 컴퓨터=바위,사용자가 이겼습니다.");
			else if(yourChoice.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				break;
			}
		}
		scanner.close();
	}
}
