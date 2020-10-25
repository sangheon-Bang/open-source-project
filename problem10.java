package Task6;

import java.io.*;
import java.util.*;

public class problem10{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		System.out.print("대상 파일명 입력>> ");
		File file=new File("C:\\Users\\방상헌\\eclipse-workspace\\task1\\src\\Task6",scanner.next());
		scanner.nextLine();
		try {
			while(true) {
				Scanner fScanner=new Scanner(new FileInputStream(file),"MS949");
				int lineNum=1;
				System.out.print("검색할 단어나 문장>> ");
				String searchWord=scanner.nextLine();
				if(searchWord.equals("그만")) {
					System.out.println("프로그램을 종료합니다.");
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
			System.out.println("파일을 찾을 수 없습니다.");
		}
	}
}
