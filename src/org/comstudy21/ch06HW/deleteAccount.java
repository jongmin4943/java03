package org.comstudy21.ch06HW;

public class deleteAccount extends Operator{

	public static void delete() {
		scan.nextLine();
		System.out.println("::: DELETE :::");
		System.out.print("ID : ");
		String id = scan.nextLine();
		System.out.print("E-mail Address : ");
		String email = scan.nextLine();
		System.out.print("Password : ");
		String password = scan.nextLine();
		for (UserInfo searching : userArr) {
			if (id.equals(searching.id) && email.equals(searching.emailAddress)
					&& password.equals(searching.password)) {
				System.out.println(":::계정이 삭제되었습니다. 안녕히 가십시오.:::");
				userArr.remove(searching);
				count--;
				break;
			} else {
				System.out.println("입력한 정보가 존재하지 않습니다.");
				//searchPassword();
				break;
			}
		}

	}
}
