package TASK3;

import java.util.InputMismatchException;
import java.util.Scanner;


class Reservation{
	String[][] seat = new String[3][10];
	
	
	public Reservation() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<10;j++) {
				seat[i][j]=" ---";
			}
		}
	}
	
	
	public void reserve() {
		System.out.print("�¼����� S(1), A(2), B(3)>>");
		Scanner scanner = new Scanner(System.in);
		int seatGrade = scanner.nextInt();
		if(seatGrade==1) {
			while(true) {
				try {
					System.out.print("S>>");
					for(int i=0;i<10;i++) {
						System.out.print(seat[0][i]);
					}
					System.out.print("\n�̸�>>");
					String resName = scanner.next();
					System.out.print("��ȣ>>");
					int seatNum=scanner.nextInt();
					seatNum=seatNum-1;
					if(seatNum>=0&&seatNum<10&&seat[0][seatNum].equals(" ---")) {
						seat[0][seatNum]=" "+resName;
						break;
					}
					else if(seatNum>=0&&seatNum<10&&!" ---".equals(seat[0][seatNum])){
						System.out.println("�̹� ����� �¼��Դϴ�.");	
					}
					else {
						System.out.println("���� �¼� ��ȣ�Դϴ�. �ٽ� �õ����ּ���");
					}
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �õ����ּ���");
				}
			}
		}
		else if(seatGrade==2) {
			while(true) {
				try {
					System.out.print("A>>");
					for(int i=0;i<10;i++) {
						System.out.print(seat[1][i]);
					}
					System.out.print("\n�̸�>>");
					String resName = scanner.next();
					System.out.print("��ȣ>>");
					int seatNum=scanner.nextInt();
					seatNum=seatNum-1;
					if(seatNum>=0&&seatNum<10&&seat[1][seatNum].equals(" ---")) {
						seat[1][seatNum]=" "+resName;
						break;
					}
					else if(seatNum>=0&&seatNum<10&&!seat[1][seatNum].equals(" ---")){
						System.out.println("�̹� ����� �¼��Դϴ�.");
					}
					else {
						System.out.println("���� �¼� ��ȣ�Դϴ�. �ٽ� �õ����ּ���");
					}
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �õ����ּ���");
				}
			}
		}
		else if(seatGrade==3) {
			while(true) {
				try {
					System.out.print("B>>");
					for(int i=0;i<10;i++) {
						System.out.print(seat[2][i]);
					}
					System.out.print("\n�̸�>>");
					String resName = scanner.next();
					System.out.print("��ȣ>>");
					int seatNum=scanner.nextInt();
					seatNum=seatNum-1;
					if(seatNum>=0&&seatNum<10&&seat[2][seatNum].equals(" ---")) {
						seat[2][seatNum]=" "+resName;
						break;
					}
					else if(seatNum>=0&&seatNum<10&&!seat[2][seatNum].equals(" ---")){
						System.out.println("�̹� ����� �¼��Դϴ�.");
					}
					else {
						System.out.println("���� �¼� ��ȣ�Դϴ�. �ٽ� �õ����ּ���");
					}
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �õ����ּ���");
				}
			}
		}
		else {
			System.out.println("���� �޴� ��ȣ �Դϴ�.");
		}
	}
	
	public void check() {
		System.out.print("S>>");
		for(int i=0;i<10;i++) {
			System.out.print(seat[0][i]);
		}
		
		System.out.print("\nA>>");
		for(int j=0;j<10;j++) {
			System.out.print(seat[1][j]);
		}
		
		System.out.print("\nB>>");
		for(int k=0;k<10;k++) {
			System.out.print(seat[2][k]);
		}
		System.out.println("\n<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
	}

	public void cancel() {
		System.out.print("�¼� S:1, A:2, B:3>>");
		Scanner scanner = new Scanner(System.in);
		int seatGrade = scanner.nextInt();
		if(seatGrade==1) {
			System.out.print("S>>");
			for(int i=0;i<10;i++) {
				System.out.print(seat[0][i]);
			}
			System.out.print("\n�̸�>>");
			String cancelName = scanner.next();
			cancelName=" "+cancelName;
			for(int i=0;i<10;i++) {
				if(cancelName.equals(seat[0][i])) {
					seat[0][i]=" ---";
				}
			}
		}
		if(seatGrade==2) {
			System.out.print("A>>");
			for(int i=0;i<10;i++) {
				System.out.print(seat[1][i]);
			}
			System.out.print("\n�̸�>>");
			String cancelName = scanner.next();
			cancelName=" "+cancelName;
			for(int i=0;i<10;i++) {
				if(cancelName.equals(seat[1][i])) {
					seat[1][i]=" ---";
				}
			}
		}
		if(seatGrade==3) {
			System.out.print("B>>");
			for(int i=0;i<10;i++) {
				System.out.print(seat[2][i]);
			}
			System.out.println("\n�̸�>>");
			String cancelName = scanner.next();
			cancelName=" "+cancelName;
			for(int i=0;i<10;i++) {
				if(cancelName.equals(seat[2][i])) {
					seat[2][i]=" ---";
				}
			}
		}
	}
	
	
}

public class problem6 {
	public static void main(String[] args) {
		System.out.print("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.\n");
		Reservation res= new Reservation();
		Scanner scanner = new Scanner(System.in);
		

		while(true) {
			try{
				int menu;
				System.out.print("����:1, ��ȸ:2, ���:3, ������:4>>");
				
				menu = scanner.nextInt();
			
				if(menu==1) {
					res.reserve();
					menu=0;
				}
				else if(menu==2) {
					res.check();
					menu=0;
				}
				else if(menu==3) {
					res.cancel();
					menu=0;
				}
				else if(menu==4) {
					System.out.println("���� �ý����� �����մϴ�.");
					break;
				}
				else {
					System.out.println("���� �޴� ��ȣ�Դϴ�.");
				}
			}
			catch(InputMismatchException e){
				System.out.println("���ڸ� �Է����ּ���.");
				scanner.nextLine();
			}
		}
		scanner.close();
	}
	
}
