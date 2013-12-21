package integer;

public class reverseInt {
	
    public int reverse(int x) {
        if(x == 0){
            return 0;
        }
        //the first time I didn't consider negative numbers.
     
        int result = 0;
        while( x!= 0){
            int tail = x%10;
            x = x/10;
            result = result*10+tail;
        }
        return result;
         
     }
    
    public static void main(String [] args){
    	reverseInt r = new reverseInt();
    	System.out.println(r.reverse(900));
    }

}
