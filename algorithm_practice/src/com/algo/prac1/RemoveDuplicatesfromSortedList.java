package com.algo.prac1;

public class RemoveDuplicatesfromSortedList {
	
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	 
	class Solution {
	    public ListNode deleteDuplicates(ListNode head) {

	    	//head를 비교하기 위해 temp 변수에 담는다.
	         ListNode temp = head;

	         if(head == null){
	        	 return head;
	         }       
	        
	        while(temp.next != null){
	          
	            ListNode nodeNext = temp.next;
	            
	            if(temp.val == nodeNext.val){
	                
	                temp.next = nodeNext.next;
	                
	            } else {
	                temp = temp.next;
	            }
	         
	        }
	        return head;
	    }
	    
	}

}
