/*02. Faça um algoritmo que receba três números e exiba o resultado da sua soma.
*/

package com.mycompany.lista1_q2;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n1, n2, n3, soma;
        
        System.out.print("Digite o valor do 1º número: ");
        n1 = sc.nextInt();
        
        System.out.print("Digite o valor do 2º número: ");
        n2 = sc.nextInt();
        
        System.out.print("Digite o valor do 3º número: ");
        n3 = sc.nextInt();
         
        soma = n1+n2+n3;
        
        System.out.println(n1 + " + " + n2 + " + " + n3 + " = " + soma);
    
    }
}
