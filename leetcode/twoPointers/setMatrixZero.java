package leetcode.twoPointers;

import java.util.ArrayList;

public class setMatrixZero {

	 public static void setZeroes(int[][] matrix) {
         int row = matrix.length;
         int col = matrix[0].length;
         
         if(row <= 1 && col<=1) return;
         
         ArrayList<ArrayList<Integer>> index = new  ArrayList<ArrayList<Integer>>();
         
         
         for(int i=0; i<row; i++){
              for(int j=0; j<col; j++){
            	  ArrayList<Integer> arr = new ArrayList<Integer>();
                  if(matrix[i][j] == 0){
                      arr.add(i);
                      arr.add(j);
                  }
                  index.add(arr);
              }
             
         }
         
         for(ArrayList<Integer> m:index){
        	 if(!m.isEmpty()){
        		 int r = m.get(0);
                 int c = m.get(1);
                 set(matrix, r, c);
        	 }
             
         }
    }
    
    static void set(int[][] m, int r, int c){
        for(int i=0; i < m[0].length; i++){
            m[r][i] = 0;
        }
        for(int j=0; j < m.length; j++){
            m[j][c] = 0;
        }
    }
    
    static void print(int[][]m){
    	  for(int i=0; i < m.length; i++){
    		  for(int j=0; j<m[0].length; j++){
    			  System.out.print(m[i][j] + " ");
    		  }
    		  System.out.println();
    		
    	  }
    }
    
	public static void main(String[] args) {
		int[][] m = {{1,2,3},
				{0,1,1},
				{4,0,2}};
		int[][] m1 = {{1},{0}};
		int[][] m2 = {
				{0,0,0,5},
				{4,3,4,1},
				{0,1,1,4},
				{1,2,1,3},
				{0,0,1,1}
		};
		setMatrixZero.setZeroes(m);
		setMatrixZero.setZeroes(m2);
		print(m);
		System.out.println("------------------------");
		
		print(m2);
	}

}
