package com.algo.prac1;

public class DeepestLeavesSum {
	
	public static void main(String[] args) {
		/* Given the root of a binary tree, 
		 * return the sum of values of its deepest leaves.
		 */
		
		DeepestLeavesSum solution = new DeepestLeavesSum();
		
		// case 1
		// Input: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
		// Output: 15
		System.out.println(solution.deepestLeavesSum(new TreeNode(6, // level 0
						new TreeNode(7, // level 1
								new TreeNode(2, // level 2
										new TreeNode(9), null), // level 3
								new TreeNode(7, //level 2
										new TreeNode(1), new TreeNode(4))), // level 3
						new TreeNode(8, // level 1
								new TreeNode(1), new TreeNode(3, // level 2
										null, new TreeNode(5)) // level 3
								)))); // sum level 3 values = 7 + 8
	}
	
	public int deepestLeavesSum(TreeNode root) {
		
		int sum = 0;
		int sum1 = 0;
		int finalSum = 0;
		int rightMax =0;
		int leftMax =0;
		TreeNode temp = root;
		int num = temp.val;
		int numLSub = 0;
		int numRsub = 0;
		
		while(temp.left != null) {
			
			leftMax++;
			num= temp.left.val;
			temp = temp.left;
			TreeNode Lefttemp = temp;
			//if(temp.left !=null) {
				//temp=temp.left;
			//}
			if(Lefttemp.right !=null || temp.left ==null) {
				while(Lefttemp.right !=null) {
					numLSub = Lefttemp.right.val;
					Lefttemp=Lefttemp.right;
					if(Lefttemp.left !=null) {
						numLSub = Lefttemp.right.val+Lefttemp.left.val;
						Lefttemp=Lefttemp.right;
					}else {
						numLSub =0;
					}
					}
				}
			
			sum = num+numLSub;
		}
		System.out.println("leftMax: "+leftMax);
		System.out.println("leftNum: "+ num);
		System.out.println("leftSubRightNum: "+ numLSub);
		System.out.println("sumLeft:" + sum);
		
		TreeNode temp1 = root;
		int num1 = temp1.val;
		while (temp1.right != null) {
			rightMax++;
			num1=temp1.right.val;
			temp1 = temp1.right;
			
			TreeNode rightTemp = temp1;
//			if(temp1.right !=null) {
//				temp1 = temp1.right;
//			}
			System.out.println("rightTemp: "+ rightTemp.val);
			if(rightTemp.left !=null || temp.right == null) {
				while(rightTemp.left !=null) {
					numRsub = rightTemp.left.val;
					rightTemp=rightTemp.left;
					if(rightTemp.right !=null) {
						numLSub = rightTemp.right.val+rightTemp.left.val;
						rightTemp=rightTemp.left;
					}else {
						numRsub = 0;
					}
				}
			}
			sum1= num1+numRsub;
		}
		System.out.println("rightMax: "+rightMax);
		System.out.println("rightNum: "+num1);
		System.out.println("rightSubLeftNum: "+ numRsub);
		System.out.println("sumRight: "+sum1);
		
		finalSum = sum+sum1;
        return finalSum;
    }
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
	    this.val = val;
	    this.left = left;
	    this.right = right;
	}
}