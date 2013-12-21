package String;

// Input  -> "I have  36 books, 40 pens2, and 1 notebook."
//Output -> "I evah  36 skoob, 40 2snep, dna 1 koobeton."




public class reverseAnotherWayString {

	static reverse(String s){
		char[] c = s.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == ' '){
				int start = i+1;
				int end = start;
				
				while(end < s.length()){
					if(s.charAt(end) != ' '){
						end ++;
					}
					else{
						break;
					}
				}
			}
				
		}
		
		
	}
	
	void swap(char c1, char c2){
		char temp = c1;
		c1 = c2;
		c2 = temp;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
