/*20. Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, 
P(x1,y1) e P(x2,y2), escreva a distância entre eles.*/

package com.mycompany.lista1_q20;

//@author Letícia

import java.util.Scanner;

public class Lista1_Q20 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        Double x1, x2, y1, y2, d;
        
        System.out.println("Digite as coordenadas de do Ponto 1: ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();
        
        System.out.println("Digite as coordenadas de do Ponto 2: ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        
        d = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        
        System.out.println("A distância é: " + d);
        
        
    }
}
