/*18. Escreva um algoritmo para calcular a área de uma pizza que possui um raio R (informado 
pelo usuário). Armazene o valor de PI em uma constante.*/

package com.mycompany.lista1_q18;

import java.util.Scanner;

//@author Letícia

public class Lista1_Q18 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final double pi = 3.14;
        double r, area;
        
        System.out.print("Digite o raio da pizza (em cm): ");
        r = sc.nextDouble();
        
        area = pi * r * r;
        
        System.out.println("Área da pizza: " + area + " cm2");
        
    }
}
