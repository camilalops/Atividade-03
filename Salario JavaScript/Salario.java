package com.mycompany.javascript;

import java.util.Scanner;


public class JavaScript {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double aumento = 1.5, salario = 1000, ano = 2011;
        
        do{
            salario = salario + (salario * aumento / 100);
            aumento = aumento * 2;
            ano++;
            
        }while(ano <= 2012);
        
        System.out.println(salario);
        
        
    }
}
