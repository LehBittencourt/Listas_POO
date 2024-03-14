/*16. Faça um algoritmo para calcular um valor A elevado a um expoente B. Os valores A e B 
deverão ser lidos.*/

package com.mycompany.lista1_q16;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q16 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double A, B, resultado;
        
        System.out.println("Digite o valor de A: ");
        A = sc.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        B = sc.nextDouble();
        
        resultado = Math.pow(A, B);
        
        System.out.println(A + " elevado a " + B + " é igual a: " + resultado);
        
    }
}
