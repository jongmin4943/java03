package org.comstudy21.ch06;

import java.util.ArrayList;
import java.util.Vector;

public class PointVectorEx {
	public static void main(String[] args) {
//		Vector<Point> v= new Vector<Point>();
//		
//		Point a = new Point(2,3);
//		Point b = new Point(-5,20);
//		Point c = new Point(30,-8);
//		//3개의 Point 객체 삽입
//		v.add(a);
//		v.add(b);
//		v.add(c);
//		
//		v.remove(1);
//		
//		//벡터에 있는 Point 객체 모두 검색하여 출력
//		for(int i = 0; i<v.size(); i++) {
//			Point p = v.get(i); //벡터의 i번째 Point 객체 얻어내기
//			System.out.println(p); // p.toString을 이용하여 객체 p 출력 
//		}
		
		ArrayList<Point> w = new ArrayList<Point>();
		
		Point a = new Point(2,3);
		Point b = new Point(-5,20);
		Point c = new Point(30,-8);
		
		w.add(a);
		w.add(b);
		w.add(c);
		
		w.remove(1);
		
		for(int i = 0; i<w.size(); i++) {
			Point p = w.get(i);
			System.out.println(p);
		}
	}
}
