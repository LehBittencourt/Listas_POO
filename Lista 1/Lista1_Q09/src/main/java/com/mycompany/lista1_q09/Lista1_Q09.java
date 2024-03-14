/*09.Uma padaria vende uma certa quantidade de pães franceses e uma quantidade de broas a 
cada dia. Cada pãozinho custa R$ 0,12 e a broa custa R$ 1,50. Ao final do dia, o dono quer 
saber quanto arrecadou com a venda dos pães e broas (juntos), e quanto deve guardar 
numa conta de poupança (10% do total arrecadado). Com base nestes fatos, faça um 
algoritmo para ler as quantidades de pães e de broas, e depois calcular os dados solicitados.
 */

package com.mycompany.lista1_q09;

// @author Letícia

import java.util.Scanner;


public class Lista1_Q09 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double pao = 1.2, broa = 1.50, qtdePao, qtdeBroa, valorArrecadado, poupanca;
        
        System.out.println("Digite a quantidade dos produtos vendidos no dia: ");
        
        System.out.println("Pão francês: ");
        qtdePao = sc.nextDouble();
        
        System.out.println("Broa: ");
        qtdeBroa = sc.nextDouble();
        
        valorArrecadado = (pao * qtdePao) + (broa * qtdeBroa);
        poupanca = valorArrecadado  * 0.1;
        
        System.out.println("Valor arrecadado: " + valorArrecadado);
        System.out.println("Valor que deverá ser guardado na poupança: " + poupanca);
        
    }
}
