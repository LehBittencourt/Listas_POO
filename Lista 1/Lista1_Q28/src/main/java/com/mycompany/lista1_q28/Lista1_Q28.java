/*28. Calcular o salário líquido do funcionário sabendo que este é constituído pelo salário bruto 
mais o valor das horas extras subtraindo 8% de INSS do total. Serão lidos nesse problema o 
salário bruto, o valor das horas extras e o número de horas extras. Apresentar ao final o 
salário líquido.
*/

package com.mycompany.lista1_q28;

import java.util.Scanner;

// @author Letícia
 
public class Lista1_Q28 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double salario_b, valor_horas, salario_l, desconto_INSS;
        int n_horas;

        System.out.println("Digite o valor do salario bruto: ");
        salario_b = sc.nextDouble();

        System.out.println("Digite o valor da hora extra: ");
        valor_horas = sc.nextDouble();

        System.out.println("Digite o número das horas: ");
        n_horas = sc.nextInt();

        salario_l = salario_b + (valor_horas * n_horas);
        desconto_INSS = salario_l * 0.08;
        salario_l -= desconto_INSS; 
        
        System.out.println("Salário Liquido com Deconto do INSS: " + salario_l);
        
    }
}
