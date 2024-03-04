/*08. Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário 
forneça a quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a 
máquina informe quanto será o valor arrecadado.*/

package com.mycompany.lista1_q08;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q08 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int camisaP = 10, camisaM = 12, camisaG = 15, qtdeP, qtdeM, qtdeG, valorArrecadado;
        
        System.out.println("Digite a quantidade de camisetas desejadas: ");
        
        System.out.println("Camisa P: ");
        qtdeP = sc.nextInt();
        
        System.out.println("Camisa M: ");
        qtdeM= sc.nextInt();
        
        System.out.println("Camisa G: ");
        qtdeG = sc.nextInt();
        
        valorArrecadado = (camisaP * qtdeP) + (camisaM * qtdeM) + (camisaG * qtdeG);
        
        System.out.println("Valor arrecadado: " + valorArrecadado);
        
    }
}
