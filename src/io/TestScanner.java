package io;

import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入選項: 1.AAA 2.BBB");
		
		String answer = scanner.nextLine();//使用者沒有按enter，程式會一直等
		System.out.println("你輸入的是:"+answer);
	}
}
