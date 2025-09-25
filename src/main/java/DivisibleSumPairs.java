import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     *  
     *  Given an array of integers and a positive integer k , determine the number of (i,j) pairs where  i<j and ar[i] + ar[j]  is divisible by k.
     *  
     *  
     *  Dado un arreglo de números enteros y un número entero positivo k, 
     *  determina el número de pares (i, j) donde i < j y ar[i] + ar[j] sea divisible por k. 
     *  ejemplo : ar =[1,2,3,4,5,6] 
     *  k=5 tres pares cumplen el criterio : [1,4],[2,3][4,6] 
     *  Descripción de la función parámetros 
     *  int n: el tamaño del ar 
     *  int ar[n] : un arreglo de enteros 
     *  int k: el entero divisor 
     *  Regresa int : el numero de pares
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
    
        int contador = 0;

        // Recorremos todos los pares (i, j) donde i < j
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    contador++;
                }
            }
        }

        return contador;

    }

}

public class DivisibleSumPairs {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.divisibleSumPairs(n, k, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
