import java.util.HashMap;
import java.util.Map;

public class TwoSumTarget {

	
	/**
	 * 
	 * dado un array y un target debe imprimir los indices que en total suman el target 
	 * ejemplo dado un array {9,5,3,2,1,4} 
	 * target = 10 print 0,4 porque 9 y 1 dan 10 de lo contrario devolver -1,-1
	 */
	
	 public static int[] findTwoSum(int[] nums, int target) {
	        // HashMap para guardar el número y su índice
	        Map<Integer, Integer> map = new HashMap<>();

	        for (int i = 0; i < nums.length; i++) {
	            int complemento = target - nums[i];

	            // Si el complemento existe, devolvemos los índices
	            if (map.containsKey(complemento)) {
	                return new int[] { map.get(complemento), i };
	            }

	            // Guardar el número actual y su índice
	            map.put(nums[i], i);
	        }

	        // Si no se encuentra, devolver -1,-1
	        return new int[] { -1, -1 };
	    }

	    public static void main(String[] args) {
	        int[] nums = new int[]{ 9, 5, 3, 2, 1, 4 };
	        int target = 10;
	        int[] result = findTwoSum(nums, target);
	        System.out.println(result[0] + "," + result[1]);
	    }
}
