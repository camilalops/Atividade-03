package com.mycompany.asoma;

public class Asoma {

    public static void main(String[] args) {
        int soma = 0;
        
        System.out.print("A soma dos 50 primeiros números:");
        for(int i = 1; i<=50; i++)
            soma += i;
        
            System.out.println(soma);
            
            System.out.print("A soma utilizando a instrução WHILE:");
            int soma2 = 0, i2 = 0;
            while(i2<=50){
                soma2+=i2;
                i2++;
            }
            System.out.println(soma2);
    }
}
