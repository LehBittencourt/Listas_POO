/*31. Faça um programa para calcular e exibir o valor a ser pago por um 
motorista para “completar” o tanque de seu carro. Devem ser lidos o valor 
do litro de combustível e a capacidade do tanque do carro.*/

package com.mycompany.lista1_q31;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q31 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double valorLitro, capacidade, valorTotal;
        
        System.out.println("Digite o valor do litro do combustível: ");
        valorLitro = sc.nextDouble();
        
        System.out.println("Digite a capacidade do taque (em litros): ");
        capacidade = sc.nextDouble();
        
        valorTotal = capacidade * valorLitro;
        
        System.out.println("O valor total a ser pago para completar o tanque é: R$ " + valorTotal);
        
    }
}
