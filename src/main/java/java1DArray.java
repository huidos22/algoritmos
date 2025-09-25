
public class java1DArray {

	
	/**
	 * 
	 * 
Let's play a game on an array! You're standing at index 0 of an -element array named . From some index i (where 0<= i<n), you can perform one of the following moves:

Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell i-1 .
Move Forward:
If cell i+1  contains a zero, you can walk to cell i+1.
If cell i+leap  contains a zero, you can jump to cell i+leap .
If you're standing in cell n-1 or the value of i+leap>=n , you can walk or jump off the end of the array and win the game.
In other words, you can move from index i to index i+1,i-1 , or i+leap  as long as the destination index is a cell containing a 0 . 
If the destination index is greater than n-1, you win the game.

Function Description

Complete the canWin function in the editor below.

canWin has the following parameters:

int leap: the size of the leap
int game[n]: the array to traverse
Returns

boolean: true if the game can be won, otherwise false

It is guaranteed that the value of  is always game[0] is always 0.


¡Juguemos un juego en un arreglo! Estás parado en el índice 0 de un arreglo de n elementos llamado game. Desde algún índice i (donde 0 ≤ i < n), puedes realizar uno de los siguientes movimientos:

Mover hacia atrás:

Si la celda i-1 existe y contiene un 0, puedes retroceder a la celda i-1.

Mover hacia adelante:

Si la celda i+1 contiene un 0, puedes avanzar a la celda i+1.

Si la celda i+leap contiene un 0, puedes saltar a la celda i+leap.

Si estás parado en la celda n-1 o si i + leap >= n, puedes caminar o saltar fuera del arreglo y ganar el juego.

En otras palabras, puedes moverte desde el índice i a i+1, i-1 o i+leap, siempre y cuando el índice de destino sea una celda que contenga un 0.
Si el índice de destino es mayor que n-1, ganas el juego.

Descripción de la función:

Completa la función canWin en el editor.

Parámetros de canWin:

int leap: el tamaño del salto.

int game[n]: el arreglo que se debe recorrer.

Retorna:

boolean: true si se puede ganar el juego, de lo contrario false.

Garantía:

El valor de game[0] siempre es 0.
	 */

    // Función principal que inicia el juego desde la posición 0
    public static boolean canWin(int leap, int[] game) {
        return canWinFromPosition(0, leap, game);
    }

    // Función recursiva que intenta ganar desde la posición 'i'
    private static boolean canWinFromPosition(int i, int leap, int[] game) {
        int n = game.length;

        // Caso base: si nos salimos del arreglo, ganamos
        if (i >= n) {
            return true;
        }

        // Si estamos en una celda con 1 o índice negativo, no se puede avanzar
        if (i < 0 || game[i] == 1) {
            return false;
        }

        // Marcar la celda como visitada para evitar ciclos
        game[i] = 1;

        // Intentar moverse hacia adelante, hacia atrás y con salto
        return canWinFromPosition(i + leap, leap, game) ||
               canWinFromPosition(i + 1, leap, game) ||
               canWinFromPosition(i - 1, leap, game);
    }

    public static void main(String[] args) {
        int[] game1 = {0, 0, 0, 1, 1, 1};
        int leap1 = 3;

        int[] game2 = {0, 0, 1, 1, 1, 0};
        int leap2 = 5;

        System.out.println(canWin(leap1, game1)); // true
        System.out.println(canWin(leap2, game2)); // true
    }
}
