/*13. Elaborar um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um 
valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também 
a quantidade de dólares disponíveis com o usuário.
*/

package com.mycompany.lista1_q13;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double qtdeDolar, cotacao, conversaoReais;
        
        System.out.println("Digite a cotação do dolar: ");
        cotacao = sc.nextDouble();
        
        System.out.println("Digite a quantidade de dólares disponíveis: ");
        qtdeDolar = sc.nextDouble();
        
        conversaoReais = qtdeDolar * cotacao;
        
        System.out.println("O valor em reias é: R$ " + conversaoReais);
        
    }
}
