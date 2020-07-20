package com.sist.exception;

// 부분 처리

public class MainClass3 {

	public static void main(String[] args) {

		try {
		
			for(int i=1; i<=10; i++) {
				
				try {
					
					System.out.println("i="+i);
					int a=i/(int)(Math.random()*3); // error
					System.out.println("a="+a);
				} catch (Exception e) {
			
					System.out.println("for문 i++로 이동");
				}
			}
			
		}catch (Exception e) {
			
			System.out.println("에러발생");
		}
		
		System.out.println("프로그램 정상종료");
	}

}
