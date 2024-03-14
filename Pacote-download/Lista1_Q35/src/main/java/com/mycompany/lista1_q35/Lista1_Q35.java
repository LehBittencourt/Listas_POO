/*35. Desenvolva um algoritmo para calcular e exibir o percentual de faltas de 
um aluno em determinada disciplina. Devem ser lidos a carga horária da 
disciplina, a quantidade de horas/aula por encontro e a quantidade de faltas 
do aluno.*/

package com.mycompany.lista1_q35;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q35 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int cargaH, qtdeAulas, qtdeFaltas;
        double percentualFaltas;
        
        System.out.println("Digite a carga horária da disciplina (em horas): ");
        cargaH = sc.nextInt();
        
        System.out.println("Digite a quantidade de horas/aulas por encontro: ");
        qtdeAulas = sc.nextInt();
        
        System.out.println("Digite a quantidade de faltas do aluno: ");
        qtdeFaltas = sc.nextInt();
        
        int totalAulas = cargaH / qtdeAulas;
        
        percentualFaltas = ((double) qtdeFaltas / totalAulas) * 100;
        
        System.out.println("O percentual de faltas do aluno é: " + percentualFaltas + "%");
        
    }
}


