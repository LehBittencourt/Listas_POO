/*32. Escrever um algoritmo que leia o nome de um vendedor, o seu salário fixo e 
o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este 
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, 
o salário fixo e salário no final do mês.*/

package com.mycompany.lista1_q32;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q32 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome;
        Double salarioFixo, salarioFinal, comissao, totalVendas;
        
        System.out.println("Digite o nome do vendedor: ");
        nome = sc.next();
        
        System.out.println("Digite seu salário fixo: ");
        salarioFixo = sc.nextDouble();
        
        System.out.println("Digite o o total de vendas efetuadas por ele no mês (em dinheiro): ");
        totalVendas = sc.nextDouble();
        
        comissao = totalVendas * 0.15;
        salarioFinal = salarioFixo + comissao;
     
        System.out.println("----- Dados do Vendedor -----");
        System.out.println("Nome: " + nome);
        System.out.println("Salário Fixo: " + salarioFixo);
        System.out.println("Salário Final: " + salarioFinal);
        
    }
}
