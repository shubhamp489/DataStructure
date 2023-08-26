package dynamicProgrammingPattern;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String s = "Hello World";
		String newstr = s.trim();
        s=s.trim();
       int count=0;
        int i = s.length()-1;
        while(i >= 0 && newstr.charAt(i)!=' '){
            count++;
            i--;
        } 
        System.out.println(count);
        	
		
	}

}
