package Task6;

import java.io.*;
import java.util.*;

public class problem10{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		System.out.print("��� ���ϸ� �Է�>> ");
		File file=new File("C:\\Users\\�����\\eclipse-workspace\\task1\\src\\Task6",scanner.next());
		scanner.nextLine();
		try {
			while(true) {
				Scanner fScanner=new Scanner(new FileInputStream(file),"MS949");
				int lineNum=1;
				System.out.print("�˻��� �ܾ ����>> ");
				String searchWord=scanner.nextLine();
				if(searchWord.equals("�׸�")) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
				while(fScanner.hasNext()) {
					String line=fScanner.nextLine();
					if(line.contains(searchWord)) {
						System.out.println(lineNum+":"+line);
					}
					lineNum++;
				}
				
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}
	}
}
