package org.comstudy21.ch06Hw2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class Saver{
	public Saver() {
	}

	public void saving(ArrayList<Diary> diaries) {
		OutputStream out = null;
		ObjectOutputStream objout = null;
		try { // 파일 저장하기
			out = new FileOutputStream("src/org/comstudy21/ch06Hw2/Diary.txt");
			objout = new ObjectOutputStream(out);
			objout.writeObject(diaries);
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
	}
}
