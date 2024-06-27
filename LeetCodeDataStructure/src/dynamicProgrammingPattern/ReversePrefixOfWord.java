package dynamicProgrammingPattern;

public class ReversePrefixOfWord {
	 public static String reversePrefix(String word, char ch) {
	        StringBuilder sb = new StringBuilder();
	        int temp=0;
	        char[] wordArray=word.toCharArray();
	        for(int a=0; a<wordArray.length;a++){
	            if(wordArray[a]!=ch){
	                sb.append(wordArray[a]);
	            }
	            else {
	            	temp=a+1;
	            break;
	            }
	        }
	        sb.append(ch);
	        System.out.println(temp);
	        return reverseString(sb.toString());
	       

	    }

	    public static String reverseString(String s){
	        if(s.isEmpty())return s;

	        return reverseString(s.substring(1))+s.charAt(0);
	    }
	    
	    public static void main(String[] args) {
	    String s="abcdefd";
	    char ch='d';
	   System.out.println(s.substring(4));
	   
	    System.out.println();
	    
	    //System.out.println(reversePrefix(s,ch));
	    }
	    
}
