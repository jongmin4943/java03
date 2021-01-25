package org.comstudy21.ch06hw5;

import java.util.Scanner;

//1번
class TV {
	private String brand;
	private int year;
	private int size;

	public TV(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;
	}

	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인지 TV", brand, year, size);
	}
}

//2번
class Grade {
	private int math;
	private int science;
	private int english;

	public Grade(int math, int science, int english) {
		super();
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public double average() {
		return (math + science + english) / 3.0;
	}
}

//3번
class Song {
	private String title;
	private String artist;
	private String year;
	private String country;

	public Song() {
	}

	public Song(String title, String artist, String year, String country) {
		super();
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public String show() {
		return String.format("%s년 %s국적의 %s가 부른 %s", year, country, artist, title);
	}
}

//4번
class Rectangle {
	private int x, y, width, height;

	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public int square() {
		return width * height;
	}

	public void show() {
		System.out.println("x : " + x + ", y : " + y + " 넓이 : " + this.square());
	}

	public boolean contains(Rectangle r) {
		boolean result = false;
		if (r.x >= this.x && r.y >= this.y) {
			if ((this.width+this.x)>(r.width+r.x) && (this.height + this.y)>(r.height +r.y)) {
				result = true;
			}
		}
		return result;
	}
}

public class Hw1 {

	public static void main04(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if (t.contains(r))
			System.out.println("t는 r을 포함합니다.");
		if (t.contains(s))
			System.out.println("t는 s을 포함합니다.");
	}

	public static void main03(String[] args) {
		Song song = new Song("Dancing Queen", "ABBA", "1978", "스웨덴");
		System.out.println(song.show());
	}

	public static void main02(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scan.nextInt();
		int science = scan.nextInt();
		int english = scan.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());

		scan.close();
	}

	public static void main01(String[] args) {
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}
}
