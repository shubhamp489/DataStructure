package dynamicProgrammingPattern;

public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "A man, a plan,w a canal: Panama";
		int i =0;
		int j =s.length()-1;
		while(i<j) {
			Character start = s.charAt(i);
			Character end =s.charAt(j);
			
			if(!Character.isLetterOrDigit(start)) {
				i++;
				continue;
			}
			if(!Character.isLetterOrDigit(end)) {
				j--;
				continue;
			}
			if(Character.toLowerCase(start) !=Character.toLowerCase(end)) {
				System.out.println("false"); 
			}
			i++;
			j--;
			
			
		}
		System.out.println(true);
		
	}

}
