import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CharsAndNumbers {

	
	/**
	 * Share your screen, open a Java compiler, and the Task is to assign the values 
	 * 1 to 26 to all the alphabets in an order, a=1, b=2, c=3, … z= 26,
	and then input an alphanumeric string and calculate the sum of that string? 
 
Example: 
Input: hello123 
Output: 58 
Explanation: (Where h=8, e=5, l=12, l=12, o=15, 1=1, 2=2, 3=3) 
 
 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Character, Integer> mapAplha = new HashMap<Character, Integer>();
		//char()
		int counter =1;
		for(int i = 97 ; i<=122; i++) {
			
			char c = (char) i;
			System.out.println(c+""+i);
			mapAplha.put( c,counter );
			counter++;
		}
		
		int sum =0;
		
		String input ="hello123";
		
		char [] chararr = input.toCharArray();
		
		for (int i = 0; i <chararr.length; i++) {
			
			if(Objects.nonNull(mapAplha.get( Character.valueOf( chararr[i])))) {
				sum = sum + mapAplha.get(chararr[i]);
			}
			if(Character.isDigit(chararr[i])) {
				sum = sum + Integer.valueOf(""+chararr[i]);
			}
		}
		System.out.println(sum);

	}

}
