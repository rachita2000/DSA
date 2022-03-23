package hashMaps;
import java.util.*;
public class ExtractUniqueCharacters {

	public static String uniqueChar(String str){
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		for(int i=0;i<str.length();i++)
		{
			if(map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			else
				map.put(str.charAt(i), 1);
		}
		StringBuilder st=new StringBuilder();
		Set<Character> s=map.keySet();
		for(Character m:s)
		{
			st.append(m);
		}
		return st.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(uniqueChar("abacdab"));
	}
}
