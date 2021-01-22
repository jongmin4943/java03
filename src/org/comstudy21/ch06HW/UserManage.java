package org.comstudy21.ch06HW;

import java.util.*;
public class UserManage {
	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);
	
	UserManage(){}
	static ArrayList<UserInfo> userArr = new ArrayList<UserInfo>();
	static HashMap<String,String> user = new HashMap<String,String>();
	
	static int count = 0;
	/**
	 * 계정생성후 userArr 에 하나씩 추가...
	 */
	private static void createAccout() {
		userArr.add(makeAccout());
		store(count);
		count++;
		System.out.println("계정생성 완료.");
	}
	
	/**
	 * 방금 저장받은값을 해쉬맵에 아이디 패스워드 형태로 저장
	 * @param count..
	 */
	private static void store(int i) {
		user.put(userArr.get(i).emailAddress, userArr.get(i).id);
	}
	
	/**
	 * 계정 생성
	 */
	private static UserInfo makeAccout() {
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
	
	
	/**
	 * 아이디와 이메일값으로 비밀번호 찾기
	 */
	private static void searchPassword() {
		System.out.println(":::::비밀번호 찾기:::::");
		System.out.print("ID : ");
		String id = scan.nextLine();
		System.out.print("E-mail Address : ");
		String email = scan.nextLine();
		for(UserInfo searching : userArr) {
			if(id.equals(searching.id) && email.equals(searching.emailAddress)) {
				System.out.println(":::비밀번호 : "+searching.password+":::");
				break;
			}
			else {
				System.out.println("입력한 정보가 존재하지 않습니다.");
				searchPassword();
				break;
			}
		}
		
	}
	
	/**
	 * id찾기
	 */
	private static void searchId() {
		System.out.println(":::::아이디 찾기:::::");
		System.out.print("E-mail Address : ");
		String email = scan.nextLine();
		String answer = user.get(email);
		
		for(UserInfo searching : userArr) {
			if(answer.length() == 0 ||answer == null || !(searching.emailAddress.equals(email)) ) {
				System.out.println("해당 이메일로 생성된 계정이 존재하지 않습니다.");
			} else {
				System.out.println("본 이메일로 생성된 계정의 ID : "+answer);
			}
		}
	}
	/**
	 * 계정 삭제
	 */
	
	private static void delete() {
		scan.nextLine();
		System.out.println("::: DELETE :::");
		System.out.print("ID : ");
		String id = scan.nextLine();
		System.out.print("E-mail Address : ");
		String email = scan.nextLine();
		System.out.print("Password : ");
		String password = scan.nextLine();
		for(UserInfo searching : userArr) {
			if(id.equals(searching.id) && email.equals(searching.emailAddress) && password.equals(searching.password)) {
				System.out.println(":::계정이 삭제되었습니다. 안녕히 가십시오.:::");
				userArr.remove(searching);
				count--;
				break;
			}
			else {
				System.out.println("입력한 정보가 존재하지 않습니다.");
				searchPassword();
				break;
			}
		}
		
	}
	
	/**
	 * 종료
	 */
	private static void exit() {
		System.out.println(":::::안녕히 가십시오:::::");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		while(true) {
			int choice = menu();
			switch(choice) {
			case 1 :
				logIn();
				break;
			case 2 :
				createAccout();
				break;
			case 3 :
				searchPassword();
				break;
			case 4 :
				searchId();
				break;
			case 5 :
				delete();
				break;
			case 6 :
				exit();
				break;
			default :
				scan.nextLine();
				System.out.println("해당 메뉴는 존재하지않습니다.");
			}//end switch
		}//end while
	}







	private static int menu() {
		int choice = 0;
		System.out.println("<<<1.Log In   2.Create Accout   3.Search Password   4.Search ID   5.Delete Account   6.Exit>>>");
		try {
			choice = scan.nextInt();
			scan.nextLine();
		} catch (Exception e) {
			System.out.println("숫자만 입력 가능합니다.");
			scan.nextLine();
			return menu();
		}
		
		return choice;
	}




	private static void logIn() {
		System.out.println("구현중..");
		
	}

}
