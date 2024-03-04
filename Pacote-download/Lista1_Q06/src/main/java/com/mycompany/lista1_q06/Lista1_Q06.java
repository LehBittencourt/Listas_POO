/*06. Crie um programa para efetuar a leitura do número de quilowatts consumidos em um mês 
em uma residência e calcular o valor a ser pago de energia elétrica, sabendo-se que o valor 
a pagar por quilowatt é de R$ 0,12. Apresentar o valor total a ser pago pelo usuário 
acrescido de 18% de ICMS.*/

package com.mycompany.lista1_q06;

// @author Letícia

import java.util.Scanner;

public class Lista1_Q06 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double kw, valor_energia, ICMS;
        
        System.out.println("Digite o número de quilowatts consumidos em um mês na sua residência: ");
        kw = sc.nextDouble();
        
        valor_energia = kw * 0.12;
        ICMS = valor_energia * 0.18;
        valor_energia += ICMS;
        
        System.out.println("Valor total da energia: " + valor_energia);
        
    }
}
