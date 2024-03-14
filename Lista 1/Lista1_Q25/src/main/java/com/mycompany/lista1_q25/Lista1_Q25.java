/*25. Faça um programa para calcular o aumento que será dado a um funcionário, 
obtendo do usuário o salário atual e a porcentagem de aumento. Apresentar o 
novo valor do salário e o valor do aumento.*/

package com.mycompany.lista1_q25;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q25 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double salario, porcentagem, novoSalario, aumento;
        
        System.out.println("Digite o seu salário: ");
        salario = sc.nextDouble();
        
        System.out.println("Digite a porcentagem de aumento: ");
        porcentagem = sc.nextDouble();
        
        aumento = salario * (porcentagem/100);
        novoSalario = salario + aumento;        
                
        System.out.printf("Valor do novo salário: R$ %.2f\n", novoSalario);
        System.out.printf("Valor do aumento: R$ %.2f\n", aumento);
        
    }
}
