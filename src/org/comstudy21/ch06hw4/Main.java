package org.comstudy21.ch06hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<Product> list = new ArrayList<>();

	public static void main(String[] args) {
		while (true) {
			System.out.println("[1]상품추가  [2]모든 상품 조회  [3]끝내기");
			System.out.print("번호 >>> ");
			int select = scan.nextInt();
			scan.nextLine();
			switch (select) {
			case 1:
				System.out.println("::::상품을 추가합니다::::");
				addProduct();
				break;
			case 2:
				System.out.println("::::: 상품 리스트 :::::");
				list();
				break;
			case 3:
				exit();
				break;
			default:
				System.out.println("존재하지 않는 명령입니다.");
			}
		}
	}

	private static void addProduct() {
		System.out.println(":::상품 종류:::");
		System.out.println("[1]책  [2]음악CD [3]회화책");
		System.out.print("번호 >>> ");
		int select = scan.nextInt();
		scan.nextLine();
		switch (select) {
		case 1:
			list.add(addBook());
			System.out.println(":::상품추가 완료:::");
			break;
		case 2:
			list.add(addCD());
			System.out.println(":::상품추가 완료:::");
			break;
		case 3:
			list.add(addConversaBook());
			System.out.println(":::상품추가 완료:::");
			break;
		default:
			System.out.println("해당 사항 없습니다.");
		}
	}

	private static Product addConversaBook() {
		System.out.print("상품 설명 : ");
		String instruction = scan.nextLine();
		System.out.print("생산자 : ");
		String producer = scan.nextLine();
		System.out.print("가격 : ");
		String price = scan.nextLine();
		System.out.print("책 제목 : ");
		String albumTitle = scan.nextLine();
		System.out.print("저자 : ");
		String author = scan.nextLine();
		System.out.print("언어 : ");
		String language = scan.nextLine();
		System.out.print("ISBN : ");
		String isbn = scan.nextLine();
		ConversationBook converBook = new ConversationBook(isbn, author, albumTitle, language);
		converBook.setInstruction(instruction);
		converBook.setProducer(producer);
		converBook.setPrice(Integer.parseInt(price));
		return converBook;
	}

	private static Product addCD() {
		System.out.print("상품 설명 : ");
		String instruction = scan.nextLine();
		System.out.print("생산자 : ");
		String producer = scan.nextLine();
		System.out.print("가격 : ");
		String price = scan.nextLine();
		System.out.print("앨범 제목 : ");
		String albumTitle = scan.nextLine();
		System.out.print("가수 : ");
		String singer = scan.nextLine();
		CompactDisc compact = new CompactDisc(albumTitle, singer);
		compact.setInstruction(instruction);
		compact.setProducer(producer);
		compact.setPrice(Integer.parseInt(price));
		return compact;
	}

	private static Product addBook() {
		System.out.print("ISBN : ");
		String isbn = scan.nextLine();
		System.out.print("Author : ");
		String author = scan.nextLine();
		System.out.print("Title : ");
		String title = scan.nextLine();
		Book book = new Book(isbn, author, title);
		return book;
	}

	private static void list() {
		int count = 1;
		for (Product p : list) {
			System.out.println("[" + count + "] 번째 상품");
			System.out.println(p);
			count++;
		}

	}

	private static void exit() {
		System.out.println("종료합니다.");
		System.exit(0);
	}
}
