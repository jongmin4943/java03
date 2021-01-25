package org.comstudy21.ch06hw4;

public class Book extends Product {
	protected String isbnNum;
	protected String author;
	protected String title;
	public Book(String isbnNum, String author, String title) {
		super();
		this.isbnNum = isbnNum;
		this.author = author;
		this.title = title;
	}
	public String getIsbnNum() {
		return isbnNum;
	}
	public void setIsbnNum(String isbnNum) {
		this.isbnNum = isbnNum;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return String.format("ISBN : %s\n저자 : %s\n제목 : %s\n", isbnNum,author,title);
	}
	
	
}
