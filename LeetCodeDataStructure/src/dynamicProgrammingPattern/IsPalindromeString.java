package dynamicProgrammingPattern;

public class IsPalindromeString {
	public static boolean isPalindrome(String s) {
        String removedAlphanumeric= s.replaceAll("[^a-zA-z]","");
        String reverseAlphnumericString=reverseString(removedAlphanumeric);
        Boolean result= removedAlphanumeric.equals(reverseAlphnumericString)? true:false;

        return result;
    
    
    }


    public static String reverseString(String str){
        if(str.isEmpty()){
            return str;
        }
        
            return reverseString(str.substring(1))+str.charAt(0);
        }
    
    public static void main(String args[]) {
    	String abc="Was it a car or a cat I saw?";
    	  String removedAlphanumeric= abc.replaceAll("[^a-zA-z]","");
    	  String rev= reverseString(removedAlphanumeric);
    	  System.out.println(removedAlphanumeric);
    	  System.out.println(reverseString(removedAlphanumeric));
    	  Boolean result= removedAlphanumeric.equalsIgnoreCase(rev)? true:false;
    	  
    	  System.out.println(removedAlphanumeric.equals(rev));
    	  System.out.println(result);
    }
    
    
}
