package bit;

public class lab1 {
	
	static int bitAnd(int x, int y) {
		  int a = ~x;
		  int b = ~y;
		  int result = ~(a|b);
		  return result;
   }

   static int rightbitAnd(int x, int y){
	   return x&y;
   }
   
   /* 
    * getByte - Extract byte n from word x
    *   Bytes numbered from 0 (LSB) to 3 (MSB)
    *   Examples: getByte(0x12345678,1) = 0x56
    *   Legal ops: ! ~ & ^ | + << >>
    *   Max ops: 6
    *   Rating: 2
    */
   static int getByte(int x, int n)
   {
   	// n << 3 adjusts n so its value is represented in bit form.
   	// x is arithmetically shifted right to n*(2^3) bits.
   	// The mask 0xFF is applied to return only the least significant byte, byte n
	int result = n << 3;
	x = x >> result;
	result = 0xFF & x;
   	return result;
   }
   
   /*
    * fitsBits - return 1 if x can be represented as an
    *  n-bit, two's complement integer.
    *   1 <= n <= 32
    *   Examples: fitsBits(5,3) = 0, fitsBits(-4,3) = 1
    *   Legal ops: ! ~ & ^ | + << >>
    *   Max ops: 15
    *   Rating: 2
    */
   int fitsBits(int x, int n) {
           /* This algorithm attempts to "slide" the number to the left and back
            * to the right based on the number of bits entered by the user.
            * If a number can fit in an n-bit number, we should be able to move
            * it 32-n times to the left and back to the right without changing
            * the value of the number. If we move back to the right and pieces
            * of the number are missing, or we've accidentally "dragged"
            * the sign over to the right when it wasn't there before,
            * then it can't fit.
            *
            * The right shift behaves differently than I intended it to, but
            * it makes the program work, so it's staying!
            */
//           int num;
//           int equal;
//           num = x;
//           num = num << (32+(~n+1));
//           num = num >> (32+(~n+1));
//           equal = x ^ num;
//           equal = equal + 1;
//           equal = equal >> 1;
//           return !(equal);
	   return 0;
   }
   /*
   
   
   /* 
    * sign - return 1 if positive, 0 if zero, and -1 if negative
    *  Examples: sign(130) = 1
    *            sign(-23) = -1
    *  Legal ops: ! ~ & ^ | + << >>
    *  Max ops: 10
    *  Rating: 2
    */
   
	public static void main(String[] args){
		System.out.println(lab1.rightbitAnd(1, 6));
//		System.out.println(lab1.bitAnd(1, 6));
		System.out.println(lab1.getByte(0x12345678,1));//answer is 0x56
		
	}
}
