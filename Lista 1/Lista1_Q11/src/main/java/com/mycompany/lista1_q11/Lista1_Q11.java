/*11.Elabore um algoritmo para ler dois valores para as variáveis A e B, e efetuar as trocas dos 
valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe 
a possuir o valor da variável A. Apresentar os valores trocados.*/

package com.mycompany.lista1_q11;

//  @author Letícia

import java.util.Scanner;
        
public class Lista1_Q11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
     
        double A, B, x;
    
        System.out.println("Digite o valor de A: ");
        A = sc.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        B = sc.nextDouble();
     
        x = A;
        A = B;
        B = x;
        
        System.out.println("Valores trocados");
        System.out.println("A = " + A);
        System.out.println("B = " + B);
        
        
        
        
        
        
    }
}
