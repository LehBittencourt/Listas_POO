/*15. Faça um algoritmo para calcular quantas ferraduras são necessárias para equipar todos os 
cavalos comprados para um haras. */

package com.mycompany.lista1_q15;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q15 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int cavalos, ferraduras;
        
        System.out.println("Digite a quantidade de cavalos comprados no haras: ");
        cavalos = sc.nextInt();
        
        ferraduras = cavalos * 4;
        
        System.out.println("Total de ferraduras necessárias para equipar todos os cavalos: " + ferraduras);
        
    }
}
