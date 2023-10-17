package com.mycompany.prova_paulo_medeiros;

import java.io.DataInputStream;
import java.io.IOException;

public class Q6 {
    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String s;
        int aux = 0,numb = 0,soma = 0,quantidade = 0;
        float media = 0;
        do{
            try{
            System.out.println("Digite um numero:");
            System.out.println("Caso deseja encerrar, digite o numero 0");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            numb = Integer.parseInt(s);
          
            }catch(Exception error){
                System.out.println("Ocorreu um erro de : "+ error);  
            }
         
            if(numb==0){
                aux = 1; 
            }else{
                soma += numb;
                quantidade += 1;
            }
            
        }while(aux == 0);
        
        media = soma/quantidade;
        System.out.printf("A média foi %.1f , a soma de tudo foi %d e a quantidade %d",media,soma,quantidade);
    }
}
