/*26. Uma empresa paga R$10,00 por hora normal trabalhada, e R$15,00 por hora extra. Faça 
um algoritmo para calcular e imprimir o salário bruto e o salário líquido de um determinado 
funcionário. Considere que o salário líquido é igual ao salário bruto descontando-se 10% de 
impostos.*/

package com.mycompany.lista1_q24;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double horaNormal, horaExtra, salBruto, salLiquido;
        
        System.out.println("Digite as horas trabalhadas: ");
        horaNormal = sc.nextDouble();
        
        System.out.println("Digite as horas extras trabalhadas: ");
        horaExtra = sc.nextDouble();
        
        salBruto = (horaNormal * 10) + (horaExtra * 15);
        salLiquido = salBruto - (salBruto * 0.1);
        
        System.out.println("Salário Bruto: R$ " + salBruto);
        System.out.println("Salário Líquido: R$ " + salLiquido);
        
    }
}
