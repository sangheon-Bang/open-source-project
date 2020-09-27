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
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		Scanner scanner = new Scanner(System.in);
		int seatGrade = scanner.nextInt();
		if(seatGrade==1) {
			while(true) {
				try {
					System.out.print("S>>");
					for(int i=0;i<10;i++) {
						System.out.print(seat[0][i]);
					}
					System.out.print("\n이름>>");
					String resName = scanner.next();
					System.out.print("번호>>");
					int seatNum=scanner.nextInt();
					seatNum=seatNum-1;
					if(seatNum>=0&&seatNum<10&&seat[0][seatNum].equals(" ---")) {
						seat[0][seatNum]=" "+resName;
						break;
					}
					else if(seatNum>=0&&seatNum<10&&!" ---".equals(seat[0][seatNum])){
						System.out.println("이미 예약된 좌석입니다.");	
					}
					else {
						System.out.println("없는 좌석 번호입니다. 다시 시도해주세요");
					}
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("잘못 입력하셨습니다. 다시 시도해주세요");
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
					System.out.print("\n이름>>");
					String resName = scanner.next();
					System.out.print("번호>>");
					int seatNum=scanner.nextInt();
					seatNum=seatNum-1;
					if(seatNum>=0&&seatNum<10&&seat[1][seatNum].equals(" ---")) {
						seat[1][seatNum]=" "+resName;
						break;
					}
					else if(seatNum>=0&&seatNum<10&&!seat[1][seatNum].equals(" ---")){
						System.out.println("이미 예약된 좌석입니다.");
					}
					else {
						System.out.println("없는 좌석 번호입니다. 다시 시도해주세요");
					}
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("잘못 입력하셨습니다. 다시 시도해주세요");
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
					System.out.print("\n이름>>");
					String resName = scanner.next();
					System.out.print("번호>>");
					int seatNum=scanner.nextInt();
					seatNum=seatNum-1;
					if(seatNum>=0&&seatNum<10&&seat[2][seatNum].equals(" ---")) {
						seat[2][seatNum]=" "+resName;
						break;
					}
					else if(seatNum>=0&&seatNum<10&&!seat[2][seatNum].equals(" ---")){
						System.out.println("이미 예약된 좌석입니다.");
					}
					else {
						System.out.println("없는 좌석 번호입니다. 다시 시도해주세요");
					}
				}
				catch(ArrayIndexOutOfBoundsException e){
					System.out.println("잘못 입력하셨습니다. 다시 시도해주세요");
				}
			}
		}
		else {
			System.out.println("없는 메뉴 번호 입니다.");
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
		System.out.println("\n<<<조회를 완료하였습니다.>>>");
	}

	public void cancel() {
		System.out.print("좌석 S:1, A:2, B:3>>");
		Scanner scanner = new Scanner(System.in);
		int seatGrade = scanner.nextInt();
		if(seatGrade==1) {
			System.out.print("S>>");
			for(int i=0;i<10;i++) {
				System.out.print(seat[0][i]);
			}
			System.out.print("\n이름>>");
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
			System.out.print("\n이름>>");
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
			System.out.println("\n이름>>");
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
		System.out.print("명품콘서트홀 예약 시스템입니다.\n");
		Reservation res= new Reservation();
		Scanner scanner = new Scanner(System.in);
		

		while(true) {
			try{
				int menu;
				System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
				
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
					System.out.println("예약 시스템을 종료합니다.");
					break;
				}
				else {
					System.out.println("없는 메뉴 번호입니다.");
				}
			}
			catch(InputMismatchException e){
				System.out.println("숫자만 입력해주세요.");
				scanner.nextLine();
			}
		}
		scanner.close();
	}
	
}
