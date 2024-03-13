/*24. Faça um programa que receba o salário de um funcionário, calcule e imprima 
o novo salário sabendo-se que este sofreu um aumento de 25%.*/

package com.mycompany.lista1_q24;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double salario, novoSalario;
        
        System.out.println("Digite o seu salário: ");
        salario = sc.nextDouble();
        
        novoSalario = salario * 1.25;
        
        System.out.println("Salário com aumento: R$ " + novoSalario);
        
    }
}
