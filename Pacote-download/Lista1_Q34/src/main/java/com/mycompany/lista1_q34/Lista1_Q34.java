/*34. Faça um algoritmo para ler três notas de um aluno em uma disciplina e 
imprimir a sua média ponderada (as notas tem pesos respectivos de 1, 2 e 3)*/

package com.mycompany.lista1_q34;

// @author Letícia

import java.util.Scanner;


public class Lista1_Q34 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double nota1, nota2, nota3, mediaP;
        
        System.out.println("Digite a nota da 1º prova: ");
        nota1 = sc.nextDouble();
        
        System.out.println("Digite a nota da 2º prova: ");
        nota2 = sc.nextDouble();
        
        System.out.println("Digite a nota da 3º prova: ");
        nota3 = sc.nextDouble();
        
        mediaP = (nota1 * 1 + nota2 * 2 + nota3 * 3) / (1 + 2 + 3);

        System.out.println("Média ponderada do aluno é: " + mediaP);
        
    }
}
