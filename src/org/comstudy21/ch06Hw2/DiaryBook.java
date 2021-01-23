package org.comstudy21.ch06Hw2;

import java.util.ArrayList;
import java.util.Scanner;

public class DiaryBook {
	ArrayList<Diary> diaries;
	int diariesIndex;
	Scanner scan;
	
	DiaryBook() {
		diaries = new ArrayList<Diary>();
		diariesIndex = 1;
	}

	void showDoList() {
		System.out.println(":::::::::::::::::::::::::");
		System.out.println("List 	:	일기 목록보기");
		System.out.println("Add 	:	일기 쓰기");
		System.out.println("Detail	: 	일기 내용보기");
		System.out.println("Edit 	:	일기 수정하기");
		System.out.println("Delete 	:	일기 삭제하기");
		System.out.println("Help 	:	명령어 다시보기");
		System.out.println("Exit 	:	저장 후 종료");
		System.out.println(":::::::::::::::::::::::::");
	}
	public void start() {
		showDoList();
		
		while(true) {
			System.out.print("명령어>>> ");
			String input = scan.nextLine();
			input.toLowerCase();						//명령어 대문자,소문자 구분없이 받음.
			
			if(input.equals("list")) {
				System.out.println("::::::::::일기 목록:::::::::");
				showList();
				System.out.println(":::::::::::::::::::::::::");
				continue;
			}
			if(input.equals("add")) {
				System.out.println("::::::::::일기 추가:::::::::");
				diaries.add(doAdd());
				System.out.println(":::::::::::::::::::::::::");
				continue;
			}
			if(input.equals("detail")) {
				if(diariesIndex <= 1) {
					System.out.println(":::일기장이 비어있습니다.:::");
				} else {
					System.out.println("::::::::::일기 내용보기:::::::::");
					showDetail();
					System.out.println("::::::::::::::::::::::::::::");
				}
				scan.nextLine();
				continue;
			}
			if(input.equals("edit")) {
				if(diariesIndex <= 1) {
					System.out.println(":::수정 할 일기가 없습니다.:::");
				} else {
					System.out.println("::::::::::일기 수정하기:::::::::");
					edit();
					System.out.println("::::::::::::::::::::::::::::");
				}
				scan.nextLine();
				continue;
			}
			if(input.equals("delete")) {
				if(diariesIndex <= 1) {
					System.out.println(":::삭제 할 일기가 없습니다.:::");
					continue;
				} else {
					System.out.println("::::::::::일기 삭제하기:::::::::");
					delete();
					System.out.println("::::::::::::::::::::::::::::");
					continue;
				}
			}
			if(input.equals("help")) {
				showDoList();
				continue;
			}
			if(input.equals("exit")) {
				System.out.println(":::::종료합니다:::::");
				break;
			}
			else {
				System.out.println("해당사항 없습니다.");
				continue;
			}
		}
	}
	

	/**
	 * 일기삭제
	 */
	private void delete() {
		System.out.println("삭제하실 일기의 번호를 입력해주세요.");
		showList();
		System.out.print("번호 >>> ");
		int index = scan.nextInt();
		scan.nextLine();
		showDetail(index);
		System.out.printf("%d번을 정말 삭제하시겠습니까? Yes(Y) or No(N)\n",index);
		String confirm = scan.nextLine();
		if(confirm.equals("Yes")||confirm.equals("Y")||confirm.equals("y")) {
			diaries.remove(index-1);
			diariesIndex--;
			System.out.printf("%d번이 삭제되었습니다.\n",index);
		} else return;
	}

	/**
	 * 일기 수정
	 */
	private void edit() {
		System.out.println("수정하실 일기의 번호를 입력해주세요.");
		System.out.print("번호 >>> ");
		int index = scan.nextInt();
		scan.nextLine();
		System.out.println("무엇을 수정하시겠습니까? [1]작성자  [2]제목  [3]내용");
		System.out.println("번호 >>> ");
		String whichOne = scan.nextLine();
		
		if(whichOne.equals("작성자") ||whichOne.equals("1")) {
			System.out.print("작성자 : ");
			diaries.get(index).name = scan.nextLine();
		}
		if(whichOne.equals("제목") ||whichOne.equals("2")) {
			System.out.print("제목 : ");
			diaries.get(index).title = scan.nextLine();
		}
		if(whichOne.equals("내용") ||whichOne.equals("3")) {
			System.out.print("내용 : ");
			diaries.get(index).body = scan.nextLine();
		}
	}

	/**
	 * 일기 내용보기
	 */
	private void showDetail() {
		System.out.println("보고싶은것의 번호를 입력해주세요");
		showList();
		System.out.print("번호 >>> ");
		int number = scan.nextInt();
		System.out.println("::::::::::"+number+"의 내용::::::::::");
		for(Diary a : diaries) {
			if(a.number == number) {
				System.out.println(a.body);
			}
		}
	}
	
	/**
	 * 해당 번호의 일기 내용보기
	 * @param index 번호
	 */
	private void showDetail(int index) {
		System.out.println("번호\t제목\t작성자");
		for(Diary a : diaries) {
			if(a.number == index) {
				System.out.println(a);
				System.out.println("내용");
				System.out.println(a.body);
			}
		}
	}
	
	/**
	 * 일기 목록보기
	 */
	private void showList() {
		System.out.println("번호\t제목\t작성자");
		for(int i = 0; i < diaries.size() ; i++) {
			Diary a = diaries.get(i);
			System.out.println(a);
		}
	}

	/**
	 * 일기 추가하기
	 * @return 일기 한장
	 */
	private Diary doAdd() {
		Diary diary = new Diary();
		System.out.print("작성자 : ");
		diary.name = scan.nextLine();
		System.out.print("제목 : ");
		diary.title = scan.nextLine();
		System.out.print("내용 : ");
		diary.body = scan.nextLine();
		
		diary.number = diariesIndex;
		System.out.printf("%d번 글이 생성되었습니다.\n",diariesIndex);
		diariesIndex++;
		
		return diary;
	}

	public void scan(Scanner scan) {
		this.scan = scan;
	}
	
	
}

