package com.huidos22.algoritmos;

import java.util.Scanner;

public class Triangulo {
/**
 *  calcule la posibilidad de la existencia de un triángulo basado en las longitudes de sus lados.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int firstSide = sc.nextInt();
        int secSide = sc.nextInt();
        int thirdSide = sc.nextInt();
        
        int sum23 = secSide+thirdSide;
        int sum12 = firstSide+secSide;
        int sum13 = firstSide+thirdSide;
        
        if(firstSide<sum23 && secSide<sum13 && thirdSide<sum12 ){
                System.out.println("Es un triángulo");
            
        }else if(firstSide>sum23 || secSide>sum13 || thirdSide>sum12 ){
            System.out.println("No es un triángulo");
        }else{
            System.out.println("No es un triángulo");
        }
	}

}
