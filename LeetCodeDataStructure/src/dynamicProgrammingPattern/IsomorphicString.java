package dynamicProgrammingPattern;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
	public boolean isIsomorphic(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		Map<Character,Character> charMappingMap= new HashMap<>();
		for(int i =0;i<s.length();i++) {
			char original = s.charAt(i);
			char replacement = t.charAt(i);
			if(!charMappingMap.containsKey(original)) {
				if(!charMappingMap.containsValue(replacement))
					charMappingMap.put(original,replacement);
				else
					return false;
			}
			else {
				char mappedCharacter = charMappingMap.get(original);
				if(mappedCharacter != replacement)
					return false;
			}
		}
		
		return true;
	}
}
