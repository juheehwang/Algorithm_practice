package com.algo.prac1;

import java.util.Scanner;

public class CheckifAllCharactersHaveEqualNumberofOccurrences {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("글자 입력: ");
		String s = sc.nextLine();
		
		
       System.out.println(areOccurrencesEqual(s));
        
        
	}
	public static boolean areOccurrencesEqual(String s) {
	
		 String answer = "";

		 // s의 중복제거단어 만들기
	     for(int i =0;i<s.length();i++){
	     	if(s.indexOf(s.charAt(i))==i) {
	     		answer += s.charAt(i);
	     	}
	     }
	     
	     int count = 0;
	     int temp = 0;
	     int[] countTotal = new int[answer.length()];
	     
	     //중복제거된 answer단어와 매개변수 s와 비교하여 같은 수를 카운트 후 배열에 담기
	     for(int i=0; i<answer.length();i++) {
	     	for(int j=0; j<s.length();j++){
	     		if(answer.indexOf(s.charAt(j))==i) {
	     			count++;
	     		}
	     	}
	     	temp=count;
	     	countTotal[i]=temp;
	     	count = 0;
	     }
	     
	     int result =1;
	     
	     // 담긴 배열의 수가 모두 같은지 비교 (한개라도 다를시 결과값 false)
	     for(int i =0; i<countTotal.length;i++) {
	     	for(int j=i+1;j<countTotal.length;j++) {
	     		
	     		if(countTotal[i]!=countTotal[j]){
	     			result=0;
	     			break;
	     		}
	     	}
	     }
	     if(result>0) {
	     	return true;
	     }else {
	     	return false;
	     }
	}

}
