package org.comstudy21.ch06hw3;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameApp {
	private Scanner scan;
	private String currWord;
	private String preWord;
	private int count;
	private boolean done;

	public WordGameApp() {
		currWord = "";
		preWord = "아버지";
		count = 0;
		done = false;
	}

	public void start(ArrayList<Player> p) {
		System.out.println("시작단어 : 아버지");
		while (!done) {
			if(count < p.size()) {
				System.out.print(p.get(count).getName() + " : ");
				currWord = scan.next();
				scan.nextLine();
				if(checkLastWord(currWord, preWord)) {
					done = true;
					System.out.println("끝말잇기 종료!");
					System.out.println(p.get(count).getName() + " 패배!");
					break;
				} else {
					preWord = currWord;
					count++;
				}
			} else {
				count = 0;
			}
			
		}
	}

	private boolean checkLastWord(String currWord, String preWord) {
		boolean result = false;
		int preLastIndex = preWord.length()-1;
		if (currWord.charAt(0) != preWord.charAt(preLastIndex)) {
			result = true;
		}
		return result;

	}

	public void scan(Scanner scan) {
		this.scan = scan;
	}

}
