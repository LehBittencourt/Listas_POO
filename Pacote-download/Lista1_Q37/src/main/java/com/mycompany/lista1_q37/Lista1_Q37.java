/*37. Crie um algoritmo para converter uma quantidade de horas digitadas pelo 
usuário em minutos. Informe o resultado em minutos.*/

package com.mycompany.lista1_q37;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q37 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int hora, minutos;
        
        System.out.println("Digite a hora desejada: ");
        hora = sc.nextInt();
        
        minutos = hora * 60;
        
        System.out.println(hora + " horas em minutos é: " + minutos);
        
    }
}
