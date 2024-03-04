/* 30. Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para 
ler o preço do litro da gasolina e o valor do pagamento, e exibir quantos litros ele conseguiu 
colocar no tanque.*/

package com.mycompany.lista1_q30;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q30 {
    
    public static void main(String[] args) {
        
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = Scanner.nextDouble();

        System.out.print("Digite o valor do pagamento: ");
        double pagamento = Scanner.nextDouble();

        double litrosAbastecidos = pagamento / precoLitro;

        System.out.println("O motorista conseguiu colocar " + litrosAbastecidos + " litros no tanque.");
        
    }
}


