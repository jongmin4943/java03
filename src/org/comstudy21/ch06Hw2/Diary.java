package org.comstudy21.ch06Hw2;

class Diary {
	int number;
	String name;
	String title;
	String body;
	@Override
	public String toString() {
		return String.format("[%d]\t%s\t%s\t", number,title,name);
	}
}

