package task1;
import java.util.Scanner;

public class problem1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 원의 중심과 반지름 입력>>");
		double xPos1 = scanner.nextDouble();
		double yPos1 = scanner.nextDouble();
		double radius1 = scanner.nextDouble();
		
		System.out.println("두번째 원의 중심과 반지름 입력>>");
		double xPos2 = scanner.nextDouble();
		double yPos2 = scanner.nextDouble();
		double radius2 = scanner.nextDouble();
		
		double distance = Math.sqrt((xPos1-xPos2)*(xPos1-xPos2)
				+(yPos1-yPos2)*(yPos1-yPos2));
		double sumOfRadius = radius1 + radius2;
		
		if(distance > sumOfRadius)
			System.out.println("두 원은 서로 겹치지 않는다.");
		else
			System.out.println("두 원은 서로 겹친다.");
		
		scanner.close();
		
		
	}

}
