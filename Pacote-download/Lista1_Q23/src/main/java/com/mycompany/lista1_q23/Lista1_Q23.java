/*23. Faça um programa que receba o salário de um funcionário, calcule e imprima o valor do 
imposto de renda a ser pago, sabendo que o imposto equivale a 27% do salário. */

package com.mycompany.lista1_q23;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double salario, imposto;
        
        System.out.println("Digite seu salário: ");
        salario = sc.nextDouble();
        
        imposto = salario * 0.27;
        
        System.out.println("Valor do imposto de renda: R$ " + imposto);
        
    }
}
