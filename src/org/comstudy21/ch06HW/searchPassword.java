package org.comstudy21.ch06HW;

public class searchPassword extends Operator{
	public static void searchPassword() {
		System.out.println(":::::비밀번호 찾기:::::");
		System.out.print("ID : ");
		String id = scan.nextLine();
		System.out.print("E-mail Address : ");
		String email = scan.nextLine();
		for (UserInfo searching : userArr) {
			if (id.equals(searching.id) && email.equals(searching.emailAddress)) {
				System.out.println(":::비밀번호 : " + searching.password + ":::");
				break;
			} else {
				System.out.println("입력한 정보가 존재하지 않습니다.");
				searchPassword();
				break;
			}
		}

	}
}
