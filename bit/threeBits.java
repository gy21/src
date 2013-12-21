package bit;

public class threeBits {

	/* 
	 * thirdBits - return word with every third bit (starting from the LSB) set to 1
	 *   Legal ops: ! ~ & ^ | + << >>
	 *   Max ops: 8
	 *   Rating: 1
	 */
	static int thirdBits() {
	    int x = 1;
		x = (x<<3)+1;
		x = x + (x<<6);
		x = x + (x<<12);
		x = x + (x<<24);
		return x;
	}
	
	public static void main(String[] args){
		System.out.println(threeBits.thirdBits());
	}
}
