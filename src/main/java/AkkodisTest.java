import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AkkodisTest {

	public static void main(String[] args) {

		
		List<String> names = new ArrayList<String>();//new LinkedList<String>();//Arrays.asList("valentina","francisco","Carlos","Brenda","Susana");
		names.add("valentina");
		names.add("francisco");
		names.add("Carlos");
		names.add("Brenda");
		names.add("Susana");
		
		printNames(names);
		Character vowel = 'u';
		countVowelsinName(names,vowel);
		System.out.println("--------------------------");
		countVowelinNameWithStream(names,vowel);
		
	}
	
	static void  printNames(List<String> names) {
		
		for (Iterator iterator = names.iterator(); iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
			
			
		}
	}
	
	static void countVowelsinName(List<String> names, Character vowel) {
		
		Map<String, Integer> mapnames = new HashMap<String, Integer>();
		
		for (String name : names) {
			
			Integer counter = 0;	
			char[] chrarr = name.toCharArray();
			
			for (int i = 0; i < chrarr.length; i++) {
				if(chrarr[i]==vowel) {
					counter=+1;
				}
				
			}
			mapnames.put(name, counter);
			
		}
		for (var entry : mapnames.entrySet()) {
			var key = entry.getKey();
			var val = entry.getValue();
			System.out.println(key+" "+val);
			
		}
		
		
	}
static void countVowelinNameWithStream(List<String> names, Character vowel) {
	
	Map<String, Long> mapnames = names.stream()
			.collect(Collectors.toMap(str->str, str->str.chars().filter(ch->ch==vowel).count()));
	
	mapnames.forEach((str,count)->System.out.println("name: "+str+" ,count of vowel: "+count));
	
	
	
}
}
