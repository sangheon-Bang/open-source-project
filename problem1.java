package task1;
import java.util.Scanner;

public class problem1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù��° ���� �߽ɰ� ������ �Է�>>");
		double xPos1 = scanner.nextDouble();
		double yPos1 = scanner.nextDouble();
		double radius1 = scanner.nextDouble();
		
		System.out.println("�ι�° ���� �߽ɰ� ������ �Է�>>");
		double xPos2 = scanner.nextDouble();
		double yPos2 = scanner.nextDouble();
		double radius2 = scanner.nextDouble();
		
		double distance = Math.sqrt((xPos1-xPos2)*(xPos1-xPos2)
				+(yPos1-yPos2)*(yPos1-yPos2));
		double sumOfRadius = radius1 + radius2;
		
		if(distance > sumOfRadius)
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		else
			System.out.println("�� ���� ���� ��ģ��.");
		
		scanner.close();
		
		
	}

}
