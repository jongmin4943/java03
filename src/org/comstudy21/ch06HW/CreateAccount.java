package org.comstudy21.ch06HW;

public class CreateAccount extends Operator{
	
	public static void createAccout() {
		userArr.add(makeAccout());
		store(count);
		count++;
		System.out.println("계정생성 완료.");
	}
	
	public static UserInfo makeAccout() {
		UserInfo newUser = new UserInfo();
		System.out.println("어서 오세요. 계정을 생성합니다.");
		System.out.print("Name : ");
		newUser.name = scan.nextLine();
		System.out.print("ID : ");
		newUser.id = scan.nextLine();
		System.out.print("Password : ");
		newUser.password = scan.nextLine();
		System.out.print("E-mail Address : ");
		newUser.emailAddress = scan.nextLine();
		System.out.print("Age : ");
		newUser.age = scan.nextInt();
		scan.nextLine();

		return newUser;
	}
}
