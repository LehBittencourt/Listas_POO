/*12.O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem 
do distribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e 
depois a percentagem do distribuidor sobre o resultado). Supondo que a percentagem do 
distribuidor seja de 28% e os impostos 45%. Escrever um algoritmo que leia o custo de 
fábrica de um carro e informe o custo ao consumidor do mesmo.*/

package com.mycompany.lista1_q12;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double custoFabrica, impostos, distribuidor, custoCarroNovo;
                
        System.out.println("Digite o custo de fábrica de um carro: ");
        custoFabrica = sc.nextDouble();
        
        impostos = custoFabrica * 0.45;
        
        distribuidor = (custoFabrica + impostos) * 0.28;
        
        custoCarroNovo = custoFabrica + distribuidor + impostos;
                
        System.out.println("O custo ao consumidor desse carro é: " + custoCarroNovo);
        
    }
}
