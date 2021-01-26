package org.comstudy21.ch06hw5;

import java.util.Scanner;

//공연은 하루에 한번
//좌석은 S석,A석,B석으로 나뉘며 각각 10개의 좌석
//예약 시스템 메뉴는 "예약", "조회", "취소", "끝내기" 가 있다.
//예약은 한 자리만 가능하고, 좌석 타입, 예약자 이름, 좌석 번호를 순서대로 입력받는다
//조회는 모든 좌석을 출력한다.
//취소는 예약자의 이름을 입력받아 취소한다.
//없는 이름, 없는 번호, 없는 메뉴, 잘못된 취소 등에 대해서 오류메세지를 출력, 다시하도록 한다.

class PersonalInfo {
	private String seat;
	private String name;
	private String number;

	public PersonalInfo() {
		name = "---";
	}

	public String getSeat() {
		return seat;
	}

	public void setSeat(String seat) {
		this.seat = seat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return name;
	}

}

class Booking {
	public static PersonalInfo info = new PersonalInfo();
	public static PersonalInfo[] seatsS = new PersonalInfo[10];
	public static PersonalInfo[] seatsA = new PersonalInfo[10];
	public static PersonalInfo[] seatsB = new PersonalInfo[10];
	private static Scanner scan = new Scanner(System.in);

	public static void book() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		String choice = scan.nextLine();
		if (choice.equals("1")) {
			if (showseat(choice)) {
				System.out.print("번호>>");
				int whichSeat = scan.nextInt();
				scan.nextLine();
				if (seatsS[(whichSeat) - 1] == null || seatsS[(whichSeat) - 1].getName().equals("---")) {
					seatsS[(whichSeat) - 1] = booking(whichSeat);
					return;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					return;
				}
			}
		}
		if (choice.equals("2")) {
			if (showseat(choice)) {
				System.out.print("번호>>");
				int whichSeat = scan.nextInt();
				scan.nextLine();
				if (seatsA[(whichSeat) - 1] == null || seatsA[(whichSeat) - 1].getName().equals("---")) {
					seatsA[(whichSeat) - 1] = booking(whichSeat);
					return;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					return;
				}
			}
		}
		if (choice.equals("3")) {
			if (showseat(choice)) {
				System.out.print("번호>>");
				int whichSeat = scan.nextInt();
				scan.nextLine();
				if (seatsB[(whichSeat) - 1] == null || seatsB[(whichSeat) - 1].getName().equals("---")) {
					seatsB[(whichSeat) - 1] = booking(whichSeat);
					return;
				} else {
					System.out.println("이미 예약된 자리입니다.");
					return;
				}
			}
		} else {
			System.out.println("잘못된 입력입니다. 다시 시도해주십시오");
			return;
		}

	}

	private static PersonalInfo booking(int whichSeat) {
		PersonalInfo person = new PersonalInfo();
		System.out.print("이름>>");
		String name = scan.nextLine();
		person.setName(name);
		person.setNumber(Integer.toString(whichSeat));
		return person;
	}

	/**
	 * 각 seat 상황 보여주기
	 * 
	 * @param choice 1(S) or 2(A) or 3(B)
	 */
	private static boolean showseat(String choice) {
		boolean result = true;
		if (choice.equals("1")) {
			result = checkSAvail();
		}
		if (choice.equals("2")) {
			result = checkAAvail();
		}
		if (choice.equals("3")) {
			result = checkBAvail();
		}
		return result;
	}

	private static boolean checkSAvail() {
		boolean result = true;
		int count = 0;
		showSSeats(count);
		if (count == 10) {
			System.out.println("더이상 예약할수 없습니다.");
			result = false;
		}
		return result;
	}

	private static boolean checkAAvail() {
		boolean result = true;
		int count = 0;
		showASeats(count);
		if (count == 10) {
			System.out.println("더이상 예약할수 없습니다.");
			result = false;
		}
		return result;
	}

	private static boolean checkBAvail() {
		boolean result = true;
		int count = 0;
		showBSeats(count);
		if (count == 10) {
			System.out.println("더이상 예약할수 없습니다.");
			result = false;
		}
		return result;
	}

	private static int showSSeats(int count) {
		System.out.print("S>>");
		for (int i = 0; i < seatsS.length; i++) {
			if (seatsS[i] == null) {
				System.out.print("--- ");
			} else {
				System.out.print(seatsS[i].getName() + " ");
				count++;
			}
		}
		System.out.println();
		return count;
	}

	private static void showSSeats() {
		System.out.print("S>>");
		for (int i = 0; i < seatsS.length; i++) {
			if (seatsS[i] == null) {
				System.out.print("--- ");
			} else {
				System.out.print(seatsS[i].getName() + " ");
			}
		}
		System.out.println();
	}

	private static int showASeats(int count) {
		System.out.print("A>>");
		for (int i = 0; i < seatsA.length; i++) {
			if (seatsA[i] == null) {
				System.out.print("--- ");
			} else {
				System.out.print(seatsA[i].getName() + " ");
				count++;
			}
		}
		System.out.println();
		return count;
	}

	private static void showASeats() {
		System.out.print("A>>");
		for (int i = 0; i < seatsA.length; i++) {
			if (seatsA[i] == null) {
				System.out.print("--- ");
			} else {
				System.out.print(seatsA[i].getName() + " ");
			}
		}
		System.out.println();
	}

	private static int showBSeats(int count) {
		System.out.print("B>>");
		for (int i = 0; i < seatsB.length; i++) {
			if (seatsB[i] == null) {
				System.out.print("--- ");
			} else {
				System.out.print(seatsB[i].getName() + " ");
				count++;
			}
		}
		System.out.println();
		return count;
	}

	private static void showBSeats() {
		System.out.print("B>>");
		for (int i = 0; i < seatsB.length; i++) {
			if (seatsB[i] == null) {
				System.out.print("--- ");
			} else {
				System.out.print(seatsB[i].getName() + " ");
			}
		}
		System.out.println();
	}

	public static void retrieve() {
		System.out.println("::::현재 좌석 상태::::");
		showSSeats();
		showASeats();
		showBSeats();
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}

	public static void cancle() {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		String choice = scan.next();
		if (choice.equals("1")) {
			showSSeats();
			System.out.print("이름>>");
			String name = scan.next();
			for (PersonalInfo a : seatsS) {
				if (name.equals(a.getName())) {
					a.setName("---");
					a = null;
					System.out.println("취소되었습니다.");
					break;
				} else {
					System.out.println("이름이 존재하지 않습니다.");
					break;
				}
			}
		}
		if (choice.equals("2")) {
			showASeats();
			System.out.print("이름>>");
			String name = scan.next();
			for (PersonalInfo a : seatsA) {
				if (name.equals(a.getName())) {
					a.setName("---");
					a = null;
					System.out.println("취소되었습니다.");
					break;
				} else {
					System.out.println("이름이 존재하지 않습니다.");
					break;
				}
			}
		}
		if (choice.equals("3")) {
			showBSeats();
			System.out.print("이름>>");
			String name = scan.next();
			for (PersonalInfo a : seatsB) {
				if (name.equals(a.getName())) {
					a.setName("---");
					a = null;
					System.out.println("취소되었습니다.");
					break;
				} else {
					System.out.println("이름이 존재하지 않습니다.");
					break;
				}
			}
		}
	}
}

class Reservation {
	private Scanner scan;

	public void start() {
		while (true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			String choice = scan.nextLine();
			if (choice.equals("1")) {
				Booking.book();
				continue;
			} else if (choice.equals("2")) {
				Booking.retrieve();
				continue;
			} else if (choice.equals("3")) {
				Booking.cancle();
				continue;
			} else if (choice.equals("4")) {
				System.out.println(":::예약시스템 종료:::");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
			}
		}
	}

	public void scan(Scanner scan) {
		this.scan = scan;
	}

}

public class Hw4 {
	public static void main(String[] args) {
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		Scanner scan = new Scanner(System.in);
		Reservation reserve = new Reservation();
		reserve.scan(scan);
		reserve.start();
		scan.close();
	}
}
