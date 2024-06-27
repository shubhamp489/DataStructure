package dynamicProgrammingPattern;

import java.util.Arrays;

public class JewelsAndStones {

	public static void main(String[] args) {
		String jewel ="z";
		String stones="ZZ";
		char[] ch = jewel.toCharArray();
		char[] ch2 = stones.toCharArray();
		int count =0;
		
		for(int a = 0; a<ch.length;a++) {
			for(int b=0;b<ch2.length;b++) {
				if(ch2[b]==ch[a]) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
