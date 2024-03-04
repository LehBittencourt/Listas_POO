/* Escreva um algoritmo que leia três números inteiros e positivos (A, B, C) e calcule a 
seguinte expressão: d = (R+S)/2, onde R = (A+B)^2 e S (B+C)^2.
*/

package com.mycompany.lista1_q21;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q21 {

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        int A, B, C, R, S, d;
        
        do{
            System.out.println("Digite o valor de A, sendo ele um número inteiro e positivo: ");
            A = sc.nextInt();
        } while(A <= 0);
        
        do{
            System.out.println("Digite o valor de B, sendo ele um número inteiro e positivo: ");
            B = sc.nextInt();
        } while(B <= 0);
        
        do{
            System.out.println("Digite o valor de C, sendo ele um número inteiro e positivo: ");
            C = sc.nextInt();
        } while(C <= 0);
        
        R = (int) Math.pow (A+B, 2);
        S = (int) Math.pow(B+C, 2);
        
        d = (R+S)/2;
        
        System.out.println("O valor de d é: " + d);
        
    }
}
