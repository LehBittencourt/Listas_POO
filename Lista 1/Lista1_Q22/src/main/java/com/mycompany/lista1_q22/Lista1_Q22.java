/*22.Escreva um algoritmo que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e 
y. De acordo com equações lineares. */

package com.mycompany.lista1_q22;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, d, e, f, x, y;
        
        System.out.println("Digite o valor do coeficiente a: ");
        a = sc.nextInt();
        
        System.out.println("Digite o valor do coeficiente b: ");
        b = sc.nextInt();
        
        System.out.println("Digite o valor do coeficiente c: ");
        c = sc.nextInt();
        
        System.out.println("Digite o valor do coeficiente d: ");
        d = sc.nextInt();
        
        System.out.println("Digite o valor do coeficiente e: ");
        e = sc.nextInt();
        
        System.out.println("Digite o valor do coeficiente f: ");
        f = sc.nextInt();
        
        x = ((c*e) - (b*f)) / ((a*e) - (b*d));
        y = ((a*f) - (c*d)) / ((a*e) - (b*d));
        
        System.out.println("Valor de x: " + x);
        System.out.println("Valor de y: " + y);
        
    }
}
