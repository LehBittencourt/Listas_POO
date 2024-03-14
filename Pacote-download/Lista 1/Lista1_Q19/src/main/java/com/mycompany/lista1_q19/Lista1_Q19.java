/*19. Um restaurante cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo que leia o 
peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a 
balança já desconte o peso do prato (tarada).*/

package com.mycompany.lista1_q19;

// @author Letícia

import java.util.Scanner;


public class Lista1_Q19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double peso, preco = 12, valor;
        
        System.out.println("Digite o peso do seu prato em quilos: ");
        peso = sc.nextDouble();
        
        valor = peso * preco;
        
        System.out.println("Valor da refeição: " + valor);
        
    }
}
