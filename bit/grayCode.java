package bit;
import java.util.*;

public class grayCode {
	public static ArrayList<Integer> code(int n) {
		ArrayList<Integer> resultList = new ArrayList<Integer>();
		if (n <= 1) {
			resultList.add(0);
			if (n == 1) resultList.add(1);
			return resultList;
		}
		 
			ArrayList<Integer> prevList = code(n - 1);
			int highest_bit = 1 << (n - 1);
			
			System.out.println(highest_bit);
			for (int i = prevList.size() - 1; i >= 0; i--) {
			resultList.add(prevList.get(i) + highest_bit);
		}
		 
			prevList.addAll(resultList);
			return prevList;
		}
	
	public static void main(String[] args) {
		System.out.println(code(1));
	}

}
