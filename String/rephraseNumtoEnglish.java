package String;

public class rephraseNumtoEnglish {

	static String[] bigs = {"", "thousand","million"};
	static String[] digits = {"One", "Two", "Three", "four", "five", "six", "seven", "eight", "nine"};
	static String[] teens = {"eleven", "twelve", "thirteen","fourteen","fifteen", "sixteen","seventeen","eighteen","nineteen"};
	static String[] tens = {"ten", "twenty", "thirty", "fourty", "fifty","sixty","seventy","eighty","ninety"};
	
	
	static String toEnglish(int n){
	
		int count = 0;
		String str = "";
		
		while(n > 0){
			//n is greater than 1000
			if(n % 1000 != 0){
				str = numToString100(n % 1000) + bigs[count] + " " + str;
			}
			n = n/1000;
			count++;
		}
		return str;
	}
	
	
	private static String numToString100(int i) {
		
		String str = "";
		
		if(i >= 100){
			str += digits[i/100-1] + " " + "hundred"+" ";
			i = i%10;
		}
		
		if(i >= 11 && i <= 19){
			str += teens[i-11]+" ";
		}else if( i>=20 || i==10){
			str += tens[i/10-1]+" ";
			i %= 10;
		}
		
		if(i>=1 && i<=9){
			str += digits[i-1]+" ";
		}
		
		return str;
	}


	public static void main(String[] args) {
		System.out.println(toEnglish(19323984));
	}

}
