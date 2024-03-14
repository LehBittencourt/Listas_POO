/*36. Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir 
quantos dias de vida ela possui. Considere sempre anos completos, e que um ano 
possui 365 dias.*/

package com.mycompany.lista1_q36;

//@author Letícia

import java.util.Scanner;


public class Lista1_Q36 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade, dias;
        
        System.out.println("Digite o nome: ");
        nome = sc.next();
        
        System.out.println("Digite a idade: ");
        idade = sc.nextInt();
        
        dias = idade * 365;
        
        System.out.println("----- Dados da Pessoa -----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Idade em dias: " + dias);
        System.out.println("---------------------------");
        
    }
}
