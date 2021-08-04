package com.algo.prac1;

public class FindCenterofStarGraph {

	public static void main(String[] args) {

		//sample array of edges Pharam
		int[][] edges = {{1,2},{5,1},{1,3},{1,4}};
		int sameNum = 0;
		
		for(int i =1; i<edges.length; i++) {
			int first = edges[0][0];
            int second= edges[0][1];
			
			if(first == edges[i][0]) {
				sameNum = first;
			}else if(second == edges[i][0]){
                sameNum = second;
            }
            if(first == edges[i][1]){
                sameNum = first;
            }else if(second == edges[i][1]){
                sameNum = second;
            }
		}
		System.out.println(sameNum);
	}

}
