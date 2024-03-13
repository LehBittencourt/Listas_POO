/*27. Faça um algoritmo para ler o salário de um funcionário e aumentá-lo em 15%. 
Após o aumento, desconte 8% de impostos. Imprima o salário inicial, o salário 
com o aumento e o salário final.*/

package com.mycompany.lista1_q27;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q27 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double salarioAumento, salario, salarioDesconto;
        
        System.out.println("Digite o seu salário: ");
        salario = sc.nextDouble();
        
        salarioAumento = salario * 1.15;
        salarioDesconto = salarioAumento * 0.92;
        
        System.out.printf("Valor do salário inicial: R$ %.2f\n", salario);
        System.out.printf("Valor do salário com aumento: R$ %.2f\n", salarioAumento);
        System.out.printf("Valor do salário com desconto: R$ %.2f\n", salarioDesconto);
        
    }
}
