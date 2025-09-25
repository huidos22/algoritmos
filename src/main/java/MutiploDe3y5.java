
public class MutiploDe3y5 {

	 public static void fizzBuzz(int n) {
		    // Write your code here
		        for(int i = 1; i<=n; i++){
		            
		            if(isMultiple(i,3) && isMultiple(i,5) ){
		                System.out.println("FizzBuzz");
		            }else if(isMultiple(i,3) && !isMultiple(i,5)){
		                
		                System.out.println("Fizz");
		            }else if(isMultiple(i,5) && !isMultiple(i,3)){
		                
		                System.out.println("Buzz");
		            }else if(!isMultiple(i,5) && !isMultiple(i,3)){
		                
		                System.out.println(i);
		            }
		            
		        }
		    }
		    public static boolean isMultiple(Integer n, Integer m){
		        boolean isMulti= false;
		        if(n%m==0){ //para saber si un numero es multiplo su modulo debe devolver 0
		            isMulti= true;
		        }
		        return isMulti;
		    }

		    public static void main(String[] args)  {

		    	MutiploDe3y5.fizzBuzz(15);

		    }
}
