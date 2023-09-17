package dynamicProgrammingPattern;

public class ReverseBits {
	 public int reverseBits(int n) {
	        int reversed = 0; 

	        for (int i = 0; i < 32; i++) {
	            
	            // Left shift the reversed cause
	            // we need to set new bit value and
	            // don't need to override the previous one
	            reversed <<= 1; 

	            // Add the least significant bit of n to reversed
	            reversed += n & 1; 
	            
	            // Right shift n to move to the next bit
	            n >>= 1; 
	        }

	        return reversed;
	    }
}
