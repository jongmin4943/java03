package org.comstudy21.ch06hw4;

public class CompactDisc extends Product {
	private String title;
	private String singer;
	public CompactDisc(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return String.format("상품 설명 : %s\n생산자 : %s\n가격 : %d\n앨범 제목 : %s\n가수 : %s\n", instruction,producer,price,title,singer);
	}
	
}
