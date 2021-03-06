package org.comstudy21.ch06Hw2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DiaryBook diary = new DiaryBook();
		Loader loader = new Loader();
		diary.diaries = loader.loading(diary.diaries,diary.diariesIndex);
		diary.diariesIndex = loader.getIndexOfDiary();
		diary.scan(scan);
		diary.start();
		Saver saver = new Saver();
		saver.saving(diary.diaries);
	
		scan.close();
	}

}
