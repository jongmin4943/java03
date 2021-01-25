package org.comstudy21.ch06hw3;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatePlayer {
	private Scanner scan;
	private int count;
	private ArrayList<Player> playerArr;

	CreatePlayer() {
		playerArr = new ArrayList<>();
		count = 0;
	}

	public ArrayList<Player> createPlayer(int players) {
		for (int i = 0; i < players; i++) {
			Player p = new Player();
			System.out.print((count+1) + "번 플레이어 네임 : ");
			p.setName(scan.nextLine());
			playerArr.add(p);
			count++;
		}
		return playerArr;
	}

	public void scan(Scanner scan) {
		this.scan = scan;
	}

}
