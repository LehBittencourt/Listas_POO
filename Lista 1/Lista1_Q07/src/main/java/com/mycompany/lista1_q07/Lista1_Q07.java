/*07. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. 
Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual 
informado pelo usuário.*/ 
 

package com.mycompany.lista1_q07;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q07 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double preco_custo, i, valor_venda;
        
        System.out.println("Digite o preço do produto: ");
        preco_custo = sc.nextDouble();
        
        System.out.println("Digite o percentual: ");
        i = sc.nextDouble();
        
        valor_venda = preco_custo * (1 + i/100);
        
        System.out.println("Valor da venda: " + valor_venda);
        
    }
}
