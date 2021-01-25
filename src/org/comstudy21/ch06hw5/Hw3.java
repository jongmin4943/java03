package org.comstudy21.ch06hw5;
import java.util.Arrays;
import java.util.Scanner;


//9번
class ArrayUtil {
	public static int [] concat(int[] a ,int[] b) {
		int[] array = new int[a.length+b.length];
		for(int i = 0; i < array.length; i++ ) {
			if(i<a.length) array[i] = a[i];
			else array[i] = b[i-a.length];
		}
		return array;
	}
	public static void print(int[] a ) {
		System.out.println(Arrays.toString(a));
	}
}


//10번
class Dictionary {
	private static String[] kor = {"사랑","아기","돈","미래","희망"};
	private static String[] eng = {"love","baby","money","future","hope"};
	public static String kor2Eng(String word) {
		String ans = "";
		for(int i = 0; i < kor.length;i++) {
			if(word.equals(kor[i])) {
				ans = eng[i];
				break;
			}
			else {
				ans = word+"는 저의 사전에 없습니다.";
			}
		}
		return ans;
	}
}

//11번
class Cal {
	protected int a,b;
	protected void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
class Add extends Cal{
	public int calculate() {
		return a+b;
	}
}
class Sub extends Cal{
	public int calculate() {
		return a-b;
	}
}
class Mul extends Cal{
	public int calculate() {
		return a*b;
	}
}
class Div extends Cal{
	public int calculate() {
		return a/b;
	}
}
public class Hw3 {
	static Scanner scan = new Scanner(System.in);
	
	public static void main11(String[] args) {
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scan.nextInt();
		int b = scan.nextInt();
		String c = scan.next();
		if(c.equals("+")) {
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
		} else if(c.equals("-")) {
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
		} else if(c.equals("*")) {
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
		} else if(c.equals("/")) {
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
		} else {
			System.out.println("입력이 틀렸습니다.");
		}
	}
	
	public static void main10(String[] args) {
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			String word = scan.nextLine();
			if(word.equals("그만")) break;
			else
			System.out.println(word +"은 "+Dictionary.kor2Eng(word));
		}
	}
	
	public static void main09(String[] args) {
		int[] array1 = {1,5,7,9};
		int[] array2 = {3,6,-1,100,77};
		int[] array3 = ArrayUtil.concat(array1,array2);
		ArrayUtil.print(array3);
	}
}
