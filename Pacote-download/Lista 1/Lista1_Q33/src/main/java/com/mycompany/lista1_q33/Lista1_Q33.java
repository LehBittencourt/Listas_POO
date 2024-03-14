/*33. Escrever um algoritmo que leia o nome de um aluno e as notas das três 
provas que ele obteve no semestre. No final informar o nome do aluno e a sua 
média (aritmética).*/

package com.mycompany.lista1_q33;

// @author Letícia

import java.util.Scanner;


public class Lista1_Q33 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome;
        double nota1, nota2, nota3, media;
        
        System.out.println("Digite seu nome: ");
        nome = sc.next();
        
        System.out.println("Digite a nota da 1º prova: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Digite a nota da 2º prova: ");
        nota2 = sc.nextDouble();
        
        System.out.println("Digite a nota da 3º prova: ");
        nota3 = sc.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("----- Dados do Aluno -----");
        System.out.println("Nome: " + nome);
        System.out.println("Média: " + media);
        
        
    }
}
