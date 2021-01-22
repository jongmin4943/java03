package org.comstudy21.ch06HW;

import java.util.*;

public class UserManage {
	static Scanner scan = new Scanner(System.in);
	static Scanner scan2 = new Scanner(System.in);

	UserManage() {
	}

	static ArrayList<UserInfo> userArr = new ArrayList<UserInfo>();
	static HashMap<String, String> user = new HashMap<String, String>();
	static HashMap<Integer,Operator> map = new HashMap<>();

	static int count = 0;

	/**
	 * 방금 저장받은값을 해쉬맵에 아이디 패스워드 형태로 저장
	 * 
	 * @param count..
	 */
	protected static void store(int i) {
		user.put(userArr.get(i).emailAddress, userArr.get(i).id);
	}





	public static void main(String[] args) {
		while (true) {
			int choice = menu();
			Set<Integer> keys = map.keySet();
			
			}
			
		} // end while

	public static int menu() {
		int choice = 0;
		System.out.println(
				"<<<1.Log In   2.Create Accout   3.Search Password   4.Search ID   5.Delete Account   6.Exit>>>");
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

	public static void logIn() {
		System.out.println("구현중..");

	}

}
