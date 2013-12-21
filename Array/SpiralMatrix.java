package Array;

import java.util.ArrayList;

public class SpiralMatrix {
	//if the matrix is not n*n 
	// then we cannot use layer...
	
	public static void main(String[] args){
		int[][] m = {
			{6,8,7},
			{2,7,9},
			{5,8,3},
			
		};
		
		int[][] n = {
				{1,2,3,4,5,6,7,8,9,10},
				{11,12,13,14,15,16,17,18,19,20}
//				{2,7,9,4,3},
//				{5,8,3,9,5},
//				{1,4,5,9,7},
//				{1,3,6,9,12}
			};
//		SpiralMatrix.printSpiral(n);
		
		System.out.println(spiralOrder(m));
	}
	
	//for leetcode online judge!! 
	public static ArrayList<Integer> spiralOrder(int[][] matrix) {
		ArrayList<Integer> a = new ArrayList<Integer> ();
		if(matrix==null || matrix.length==0 || matrix[0].length==0) return new ArrayList<Integer>();
		
		//only one row
		if(matrix.length == 1){
			for(int i=0; i<matrix[0].length; i++){
				a.add(matrix[0][i]);
			}
			return a;
		}
		
		//only one column
		if(matrix[0].length == 1){
			for(int i=0; i<matrix.length; i++){
				a.add(matrix[i][0]);
			}
			return a;
		}
		int row = matrix.length-1;
		int col = matrix[0].length-1;
		int layer = Math.min(row+1, col+1)/2;
		
		for(int l=0; l<=layer; l++){
//			int first = l;
			int lastcol = col-l;
			int lastrow = row-l;
			
			System.out.println("I am the last column and my value is :" + lastcol);
			System.out.println("I am the last column and my value is :" + lastrow);
			System.out.println("I am the layer and my value is :" + l);
			
			for(int i=l; i<=lastcol; i++){
				a.add(matrix[l][i]);
			}
			
			for(int j=l; j<lastrow; j++){
				a.add(matrix[j][lastcol]);
			}
			for(int h=lastcol; h>l; h--){
				a.add(matrix[lastrow][h]);
			}
			for(int q=lastrow; q>l; q--){
				a.add(matrix[q][l]);
			}
		}
	
		return a;
	}
	static void printSpiral(int[][] m){
		int row = m.length;
		int col = m[0].length;
		int layer = col/2;
		
		for(int i=0; i<layer; i++){
			int first = i;
			int lastcol = col-1-i;
			int lastrow = row-1-i;

			for(int j = first; j < lastcol; j++){
				System.out.print(m[i][j] +" ");
			}
			for(int k = first; k < lastcol; k++){
				System.out.print(m[k][lastcol] +" ");
			}
			for(int q = lastrow; q > first; q--){
				System.out.print(m[lastrow][q]+" ");
			}
			for(int n = first; n < lastrow; n++){
				System.out.print(m[lastrow-i-n][first]+" ");
			}
		
		}
		
	}
}
