/*14. Certa loja está vendendo seus produtos em 5 prestações sem juros. Faça um 
algoritmo que receba um valor de uma compra e mostre o valor das prestações.*/

package com.mycompany.lista1_q14;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q14 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double p, compra;
        
        System.out.println("Digite o valor da compra: ");
        compra = sc.nextDouble();
        
        p = compra/5;
        
        for(int i=0;i<=4;i++){
            System.out.println("Prestação " + (i+1) + "º : " + p);
        }
        
    }
}
