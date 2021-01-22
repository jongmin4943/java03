package org.comstudy21.ch06HW;

public class searchId extends Operator{
	public static void searchId() {
		System.out.println(":::::아이디 찾기:::::");
		System.out.print("E-mail Address : ");
		String email = scan.nextLine();
		String answer = user.get(email);

		for (UserInfo searching : userArr) {
			if (answer.length() == 0 || answer == null || !(searching.emailAddress.equals(email))) {
				System.out.println("해당 이메일로 생성된 계정이 존재하지 않습니다.");
			} else {
				System.out.println("본 이메일로 생성된 계정의 ID : " + answer);
			}
		}
	}

}
