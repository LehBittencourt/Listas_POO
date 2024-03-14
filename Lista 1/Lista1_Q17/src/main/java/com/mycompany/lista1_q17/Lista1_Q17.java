/*17. Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento 
após um mês. Considere fixo o juro da poupança em 0,70% a. m (armazene em uma 
constante).*/

package com.mycompany.lista1_q17;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q17 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double deposito, rendimento, taxaR = 0.007;
        
        System.out.println("Digite o valor depositado: ");
        deposito = sc.nextDouble();
        
        rendimento = deposito + (deposito * taxaR); 
        
        System.out.println("Valor do rendimento após um mês: R$ " + rendimento);
        
    }
}
