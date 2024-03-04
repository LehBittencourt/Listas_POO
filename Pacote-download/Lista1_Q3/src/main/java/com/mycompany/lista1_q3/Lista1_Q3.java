/*03. Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, 
multiplicação e a divisão dos números lidos.*/

package com.mycompany.lista1_q3;

//@author Letícia

import java.util.Scanner;

public class Lista1_Q3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n1, n2, soma, divisao, multi, subtracao;
        
        System.out.println("Digite o 1º número: ");
        n1 = sc.nextInt();
        
        System.out.println("Digite o 2º número: ");
        n2 = sc.nextInt();
        
        soma = n1 + n2;
        subtracao = n1 - n2;
        multi = n1 * n2;
        divisao = n1 / n2;
        
        System.out.println(n1 + " + " + n2 + " = " + soma);
        System.out.println(n1 + " - " + n2 + " = " + subtracao);
        System.out.println(n1 + " * " + n2 + " = " + multi);
        System.out.println(n1 + " / " + n2 + " = " + divisao);
        
    }
}
