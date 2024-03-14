/* 10.Crie um algoritmo para ler uma temperatura em graus Celsius e apresentá-la convertida em 
graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em 
Fahrenheit e C a temperatura em Celsius.*/

package com.mycompany.lista1_q10;

//  @author Letícia

import java.util.Scanner;

public class Lista1_Q10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double tCelsius, tFahrenheit;
        
        System.out.println("Digite uma temperatura em graus Celsius: ");
        tCelsius = sc.nextDouble();
        
        tFahrenheit = (9* tCelsius + 160) / 5;
        
        System.out.println(tCelsius + " celsius em Fahrenheit é: " + tFahrenheit);
        
    }
}
