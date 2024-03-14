/*05. Certa imobiliária vende apenas terrenos retangulares. Faça um algoritmo 
para ler as dimensões de um terreno e depois exibir a área do terreno.*/

package com.mycompany.lista1_q5;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q5 {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        
        double b, h, area;
        
        System.out.println("Digite o valor da base do terreno em cm: ");
        b = sc.nextDouble();
        
        System.out.println("Digite o valor da altura do terreno em cm: ");
        h = sc.nextDouble();
        
        area = b * h;
        
        System.out.println("A área do terreno é: " + area);
        
    }
}
