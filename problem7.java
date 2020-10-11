package Task4;

import java.util.Random;
import java.util.Scanner;

class Person{
	
	private String personName;
	
	public Person() {
		Scanner scanner = new Scanner(System.in);
		
		String personName = scanner.next();
		this.personName=personName;
	}
	
	public String getName() {
		return personName;
	}
}



public class problem7 {
	public static void main(String[] args)throws java.io.IOException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1번째 선수 이름>>");
		Person per1= new Person();
		System.out.print("2번째 선수 이름>>");
		Person per2= new Person();
		
		
		while(true) {
			int a,b,c,d,e,f;
			Random random = new Random();
			a=random.nextInt(3)+1;
			b=random.nextInt(3)+1;
			c=random.nextInt(3)+1;
			d=random.nextInt(3)+1;
			e=random.nextInt(3)+1;
			f=random.nextInt(3)+1;
			
			int keyCode1=0;
			int keyCode2=0;
			
			
			System.out.print("["+per1.getName()+"]:<Enter>");
			keyCode1 = System.in.read();
			System.in.skip(1);
			if(keyCode1==13) {
				if(a==b&&b==c) {
					System.out.println("      "+a+"  "+b+"  "+c+"  "+per1.getName()+"님이 이겼습니다!");
					break;
				}
				else {
					System.out.println("      "+a+"  "+b+"  "+c+"  "+"아쉽군요!");
				}
			}
			
			
			System.out.print("["+per2.getName()+"]:<Enter>");
			keyCode2 = System.in.read();
			System.in.skip(1);
			if(keyCode2==13) {
				if(d==e&&e==f) {
					System.out.println("      "+d+"  "+e+"  "+f+"  "+per2.getName()+"님이 이겼습니다!");
					break;
				}
				else {
					System.out.println("      "+d+"  "+e+"  "+f+"  "+"아쉽군요!");
				}
			}
		}
		
		
	}
}
