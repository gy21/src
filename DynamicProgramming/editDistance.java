package DynamicProgramming;

public class editDistance {
	
	 public static int minDistance(String word1, String word2) {
		 int l1 = word1.length();
		 int l2 = word2.length();
		 if(l1 == l2 && l2==0){
		     return 0;
		 }
		 if(l1 == 0)    return l2;
		 if(l2 == 0)    return l1;
		 //Here we need a matrix larger than the original one
		 //Since in the matrix, we start from [1][1], but in the two strings, we start from
		 //char index at i-1 and j-1(0,0);
		 int[][] m = new int[l1+1][l2+1];
		 
		 m[0][0] = 0;
		 
		 for(int i=1; i<=l2; i++){
			 m[0][i] = i;
		} 
		 for(int j=1; j<=l1; j++){
			 m[j][0] = j;
		 }
		 
		 for(int i=1; i <= l1; i++ ){
			 for(int j=1; j <= l2; j++ ){
				 if(word1.charAt(i-1) == word2.charAt(j-1)){
					 m[i][j] = m[i-1][j-1]; 
				 }
				 else{
					 m[i][j] = Math.min(Math.min(m[i-1][j-1], m[i][j-1]),m[i-1][j]) + 1;
				 }
			 
			 }
			 
		 }
	     return m[l1][l2];
	     
	 }
	 public static void main(String [] args){
		 System.out.println(minDistance("abccc","abdeg"));
	 }

}
