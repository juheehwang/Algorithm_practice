package com.algo.prac1;

public class DetermineColorofaChessboardSquare {

	public static void main(String[] args) {
		String co = "a4";
		
		//문자열을 int형으로 바꾸는 변수 생성
		int firstInt = (int) co.charAt(0);
		int secondInt = (int) co.charAt(1);

		//최종 결과값을 담을 변수
		int result = 0;
		int result2=0;
		
		for(int i =97; i<105;i++) {
			if(firstInt == i) {
				if(firstInt%2 !=0) {
					result = 1;
				}
			}
		}
		for(int i=49; i<57;i++) {
			if(secondInt==i) {
				if(i%2!=0) {
					result++;
				}
			}
		}
		
		
		int sum = result + result2;
		
        
	}
}
