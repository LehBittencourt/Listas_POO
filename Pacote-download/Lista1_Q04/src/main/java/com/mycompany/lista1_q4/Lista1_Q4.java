/*04. Faça um programa que receba um valor que é o valor pago, um segundo valor que é o preço 
do produto e retorne o troco a ser dado.*/

package com.mycompany.lista1_q4;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q4 {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        double valor,preco; 
        
        System.out.println("Digite o valor: ");
        valor = sc.nextDouble();
        
        System.out.println("Digite o preço do produto: ");
        preco = sc.nextDouble();
        
        System.out.println("Troco: " + (valor - preco));
        
    }
}
