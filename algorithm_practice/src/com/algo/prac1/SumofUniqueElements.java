package com.algo.prac1;

import java.util.ArrayList;
import java.util.List;

public class SumofUniqueElements {

	public static void main(String[] args) {

		int[] nums = {1,2,3,4,5};
		int temp = 0;
        int sumNum =0;
        List<Integer> sameNum = new ArrayList<>() ;
        
        // 중복된 수 찾아내기 반복문 시작!
        for(int i =0; i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                temp = nums[i];
                if(temp == nums[j] && !sameNum.contains(nums[j])){
                   
                   sameNum.add(nums[j]);
                }
            }
        }
        //중복된 숫자 sameNum에 담겼다!
        System.out.println("위에"+sameNum);
        
        List<Integer> newList = new ArrayList<>() ;
        
        // 중복된 숫자랑 원래 리스트와 비교하여 같지 않은 숫자를 추출하여 newList에 담는 반복문
        if(sameNum.isEmpty()) {
        	for(int i=0; i<nums.length;i++) {
        		newList.add(nums[i]);
        	}
        }else {
	        for(int i=0; i<nums.length;i++){
	        	for(int j=0; j<sameNum.size();j++) {
	        		
	        		//원래리스트 중 중복숫자와 같지않고 새로 추가되는 배열에도 없고 중복숫자리스트에도 없는 숫자만 newList에 추가하기!
		        	if(nums[i] != sameNum.get(j)&& !newList.contains(nums[i])&& !sameNum.contains(nums[i])){
		        		newList.add(nums[i]);
		        		
		        		System.out.println("for문 sumNum"+newList);
		            }else {}
	        	}
	        }
        }
        
        for(int i=0;i<newList.size();i++) {
        	sumNum+=newList.get(i);
        	
        }
        
        System.out.println(sumNum);
	
	}

}
