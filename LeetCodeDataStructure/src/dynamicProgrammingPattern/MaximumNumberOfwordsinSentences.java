package dynamicProgrammingPattern;

public class MaximumNumberOfwordsinSentences {
	public static int mostWordsFound(String[] sentences) {
        int result=0;
        int size =sentences.length-1;
        while(size >=0) {
        	String[] str = sentences[size].split(" ");
        	result = result > str.length ? result : str.length;
        	
        	size--;
        
        }
        
        
        
        return result;
    }
	
	public static void main(String args[]) {
		String[] str = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		System.out.println(mostWordsFound(str));
	}
	
}
