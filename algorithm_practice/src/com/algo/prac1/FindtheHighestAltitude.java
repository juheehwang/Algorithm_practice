package com.algo.prac1;

public class FindtheHighestAltitude {

	public static void main(String[] args) {
		
		//샘플 배열 (무엇이든 바꾸기 가능)
		int[] gain = {-5,1,5,0,-7};
		
		// gain으로 새로운 배열 만들기
		int[] newList = new int[gain.length+1];
		
		// newList의 첫번째 수를 "0"으로 지정
		newList[0]=0;
	
		//gain 배열 맨 앞에 0을 포함한 새로운 배열을 구함과 동시에 각수를 합한 최종 newList 배열을 만드는 for문 
		for(int i=0;i<gain.length;i++) {
			newList[i+1]=gain[i];
			if(i+1<newList.length) {
				newList[i+1] = newList[i]+newList[i+1];
				}
		}
		
		// 각 수의 합을 넣은 최종 newList에서 Max 넘버를 찾기위해 
		// 내림차순으로 한 후 그 첫번째 숫자를 뽑아내려고하는 for문
		for(int i=0;i<newList.length;i++) {
			for(int j=i+1;j<newList.length;j++) {
				
				if(newList[i]<newList[j]) {
					int temp =newList[i];
					newList[i]=newList[j];
					newList[j]=temp;
				}else {}
			}
		}

		// 답 출력
		System.out.println("최종"+newList[0]);
	
	}
}
