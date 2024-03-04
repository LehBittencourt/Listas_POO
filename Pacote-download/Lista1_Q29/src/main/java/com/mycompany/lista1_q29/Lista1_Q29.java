/*29. Escreva um algoritmo para calcular o consumo médio de um automóvel (medido em Km/l), 
dado que são requisitados a distância total percorrida e o volume de combustível consumido 
para percorrê-la (medido em litros).*/

package com.mycompany.lista1_q29;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q29 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double d, combustivel;
        
        System.out.println("Digite a distância total percorrida (em km): ");
        d = sc.nextDouble();
        
        System.out.println("Digite o volume de combustível consumido para percorrê-la (em litros): ");
        combustivel = sc.nextDouble();
        
        System.out.println("O consumo médio do automóvel é: " + d/combustivel + " km/l");
        
    }
}
