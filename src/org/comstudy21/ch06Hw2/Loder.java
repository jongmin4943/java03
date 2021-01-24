package org.comstudy21.ch06Hw2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Loder{
	private int indexOfDiary = 0;
	public int getIndexOfDiary() {
		return indexOfDiary;
	}
	public void setIndexOfDiary(int indexOfDiary) {
		this.indexOfDiary = indexOfDiary;
	}

	public Loder() {
	}

	File file = new File("src/org/comstudy21/ch06Hw2/Diary.txt");
	public void texting() {
		System.out.println(":::::::저장된 일기 목록:::::::");
		System.out.println("번호\t제목\t작성자\t저장된 날짜");
	}
	public ArrayList<Diary> loading(ArrayList<Diary> diaries,int diariesIndex) {
		FileInputStream in = null;
		ObjectInputStream objin = null;
		try { // 파일 불러오기
			if (file.exists()) {
				in = new FileInputStream("src/org/comstudy21/ch06Hw2/Diary.txt");
			} else {
				file.createNewFile();
				in = new FileInputStream("src/org/comstudy21/ch06Hw2/Diary.txt");
			}
			if (in.getChannel().size() != 0) {
				objin = new ObjectInputStream(in);
				diaries = (ArrayList<Diary>) objin.readObject();
				texting();
				for (Diary m : diaries) {
					System.out.println(m);
					diariesIndex++;
					this.indexOfDiary = diariesIndex;
				}
			} else {
				texting();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in.getChannel().size() != 0) {
					try { // 파일이 비어있으면 오류가 난다..
						objin.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			} catch (IOException e) {
				texting();
			}
		}
		return diaries;
	}
}
