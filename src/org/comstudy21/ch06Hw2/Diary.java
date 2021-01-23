package org.comstudy21.ch06Hw2;

import java.io.Serializable;

public class Diary implements Serializable{
	private int number;
	private String name;
	private String title;
	private String body;

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return String.format("[%d]\t%s\t%s\t", number, title, name);
	}
}
