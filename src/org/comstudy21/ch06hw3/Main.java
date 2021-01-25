package org.comstudy21.ch06hw3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Player> p = new ArrayList();
		System.out.print("플레이어 인원 수 : ");
		int players = scan.nextInt();
		scan.nextLine();
		CreatePlayer player = new CreatePlayer();
		player.scan(scan);
		p = player.createPlayer(players);	//플레이어 생성
		WordGameApp game = new WordGameApp();
		game.scan(scan);
		game.start(p);
		scan.close();
	}
}
