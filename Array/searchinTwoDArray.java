package Array;

public class searchinTwoDArray {

	public static void main(String[] args) {
		int[][] m = {
				{1,3,5,7},
				{10,11,16,20},
				{23,30,34,50}
		};
		System.out.println(searchinTwoDArray.Search(m, 44));
	}
	
	static boolean Search(int[][] m, int target){
		//name with column and row to avoid confusion
		int col = m[0].length-1;
		int row = 0;
		
		while(row <= m.length -1 && col >= 0){
			if(m[row][col] == target) 	return true;
			else if(target > m[row][col]) row++;
			else col--;
				
		}
	
		return false;
	}
}
