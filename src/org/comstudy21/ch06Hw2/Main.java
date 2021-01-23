package org.comstudy21.ch06Hw2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DiaryBook diary = new DiaryBook();
		File file = new File("src/org/comstudy21/ch06Hw2/Diary.txt");
		
		InputStream in = null;
		BufferedInputStream bufin = null;
		ObjectInputStream objin = null;
		try {						//파일 불러오기
			if(file.exists()) {
				in = new FileInputStream("src/org/comstudy21/ch06Hw2/Diary.txt");
			} else {
				file.createNewFile();
				in = new FileInputStream("src/org/comstudy21/ch06Hw2/Diary.txt");
			}
			bufin = new BufferedInputStream(in);
			objin = new ObjectInputStream(bufin);
			diary.diaries =(ArrayList<Diary>)objin.readObject();
			for(Diary m : diary.diaries){
				System.out.println("::::::::::일기 목록::::::::::");
				System.out.println(m);
				System.out.println("::::::::::::::::::::::::::");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
//			try {						//오류가 난다..
////				objin.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		}
		diary.scan(scan);
		diary.start();
		OutputStream out = null;
		BufferedOutputStream bufout = null;
		ObjectOutputStream objout = null;
		try {						//파일 저장하기
			out = new FileOutputStream("src/org/comstudy21/ch06Hw2/Diary.txt");
			bufout = new BufferedOutputStream(out);
			objout = new ObjectOutputStream(bufout);
			objout.writeObject(diary.diaries); 
			System.out.println("파일 저장 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				objout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		scan.close();
	}
	
}

