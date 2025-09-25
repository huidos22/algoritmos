import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountChars {

	public static void main(String[] args) {
		
		
		char [] countchars = {'a','a','b','b','c','c','c','a'};
		
		String strResult="";
		int counter = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i<countchars.length; i++) {
			char charac = countchars[i];
			if(map.containsKey(charac) ) {
					counter =+1;
					map.put(charac, map.get(charac)+1);
				
			}else {
				map.put(charac, 1);
			}
			
		}
		
		for (Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			strResult= strResult+key+val;
			
		}
		System.out.println(strResult);
		
		var map2 = Arrays.asList(countchars).stream().collect(Collectors.toMap(chr->chr, chr->chr.toString().chars().count()));
		for (var entry : map.entrySet()) {
			var key = entry.getKey();
			var val = entry.getValue();
			System.out.println(key+ "  "+ val );
			
		}
		
	}

}