package org.comstudy21.ch06hw4;

public class ConversationBook extends Book {
	private String language;

	public ConversationBook(String isbnNum, String author, String title, String language) {
		super(isbnNum, author, title);
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String toString() {
		return String.format("상품 설명 : %s\n생산자 : %s\n가격 : %d\n책 제목 : %s\n저자 : %s\n언어 : %s\nISBN : %s\n", instruction,producer,price,this.title,this.author,language,this.isbnNum);
	}
}
