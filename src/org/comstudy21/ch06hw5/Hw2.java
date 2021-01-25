package org.comstudy21.ch06hw5;

import java.util.ArrayList;
import java.util.Scanner;

//5번
//class Circle {
//	private double x, y;
//	private int radius;
//	public Circle(double x, double y, int radius) {
//		this.x = x;
//		this.y = y;
//		this.radius = radius;
//	}
//	public void show() {
//		System.out.println("x : "+ x+", y : "+y+"radius : "+radius);
//	}
//}
//6번
class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void show() {
		System.out.println("x : " + x + ", y : " + y + " radius : " + radius);
	}
}

//7번
class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	Scanner scan = new Scanner(System.in);
	String work;
	int date;

	public MonthSchedule() {

	}

	public MonthSchedule(String work, int date) {
		this.work = work;
		this.date = date;
	}

	public Day input(String work) {
		Day day = new Day();
		day.set(work);
		return day;
	}
}

//8번
class Phone {
	private String name;
	private String number;
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
		return String.format("%s의 번호는 %s 입니다.", name, number );
	}
}
class PhoneBook {
	public Phone store(String name, String number) {
		Phone phone = new Phone();
		phone.setName(name);
		phone.setNumber(number);
		return phone;
	}
}

public class Hw2 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean done = false;
		ArrayList<Phone> phone = new ArrayList<>();
		PhoneBook book = new PhoneBook();
		System.out.print("인원수>>>");
		int numOfPpl = scan.nextInt();
		while(numOfPpl>phone.size()) {
			System.out.print("이름과 전화번호(빈칸없이 입력)>>>");
			String name = scan.next();
			String number = scan.next();
			phone.add(book.store(name,number));
		}
		System.out.println("저장되었습니다.");
		while(!done) {
			System.out.print("검색할 이름>>>");
			String search = scan.next();
			if(search.equals("그만")) {
				break;
			} else {
				for(int i = 0; i < phone.size(); i++) {
					Phone searching = phone.get(i);
					if(searching.getName().equals(search)) {
						System.out.println(searching);
						break;
					} else if (i == phone.size()-1){
						System.out.println(search + "이 없습니다.");
						continue;
					}
				}
			}
		}
	}

	public static void main07(String[] args) {
		boolean done = false;
		System.out.println("이번달 스케쥴 관리 프로그램");
		Day[] dayArr = new Day[30];
		MonthSchedule sche = new MonthSchedule();
		while (!done) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3 >>");
			int whichOne = scan.nextInt();
			switch (whichOne) {
			case 1:
				System.out.print("날짜(1~30)?");
				int date = scan.nextInt();
				if(date<1 || date>30) {System.out.println("해당사항 없습니다."); continue;}
				System.out.print("할일(빈칸없이입력)?");
				String work = scan.next();
				dayArr[date - 1] = sche.input(work);
				break;
			case 2:
				System.out.print("날짜(1~30)?");
				int date2 = scan.nextInt();
				if(date2<1 || date2>30) {System.out.println("해당사항 없습니다."); continue;}
				System.out.print(date2 + "일의 할 일은 ");
				if (dayArr[date2 - 1] != null) {
					dayArr[date2 - 1].show();
				} else {
					System.out.println("없습니다.");
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				done = true;
				break;
			default:
				System.out.println("해당사항 없습니다.");
			}
		}
	}

	public static void main06(String[] args) {
		Circle c[] = new Circle[3];
		for (int i = 0; i < c.length; i++) {
			System.out.print("x, y, radius >> ");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		int max = 0;
		for (int i = 0; i < c.length; i++) {
			if (max < c[i].getRadius()) {
				max = c[i].getRadius();
			}
		}
		for (Circle cir : c) {
			if (max == cir.getRadius()) {
				System.out.print("가장 면적이 큰 원은 ");
				cir.show();
			}
		}
		scan.close();
		;
	}
}
