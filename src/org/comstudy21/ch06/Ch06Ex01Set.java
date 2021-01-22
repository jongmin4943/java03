package org.comstudy21.ch06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;


public class Ch06Ex01Set {
	
	static Random ran = new Random();
	
	public static void main(String[] args) {
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size() < 6) {
			lotto.add(1 + ran.nextInt(45));
		}
		
		Iterator<Integer> iter = lotto.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}

	public static void exam(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("오징어");
		set.add("꼴뚜기");
		set.add("대구");
		set.add("대구");
		
		
		System.out.println("현재 set에 담긴 데이터의 수 : " + set.size());
		
		Iterator<String> iter = set.iterator(); // 열거자.. get으로 뽑아 낼수없으니 -> 인덱스나 키가 없어서 -> 그걸 형변환 시켜서 열거 시켜 이용한다.
		while(iter.hasNext()) {					// 열거시킨것들을 hasNext를 이용해 하나씩 확인
			System.out.println(iter.next());	// 열거시킨것을 하나씩 출력.....
		}
		
		//set에 있는 내용을 옮겨 담을 배열을 선언.
		String[] fishArr = new String[set.size()];
		set.toArray(fishArr);					//()안에것을 array로 전환..
		for(String fish : fishArr) {
			System.out.println(fish);
		}
		
		
	}
}
