package com.mycompany.prova_paulo_medeiros;

import java.io.DataInputStream;
import java.io.IOException;

public class Q7 {
    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String filme = "", tentativa = "";
        String pistas[] = new String[5];
        int aux=0;

        System.out.println("Olá jogador 1");
        System.out.println("Qual o nome do filme?");
        dado = new DataInputStream(System.in);
        filme = dado.readLine();
        
        for(int i = 0; i<5;i++){
            try{
                System.out.printf("Digite a %d° pista\n",i+1);
                dado = new DataInputStream(System.in);
                pistas[i] = dado.readLine();
                
             }catch(Exception error){
                System.out.println("Ocorreu um erro de : "+ error);  
            }
        }
        System.out.println("\n\nOlá jogador 2");
        
        while(aux < 5){  
            System.out.printf("Sua %d° pista\n",aux+1);
            System.out.println(pistas[aux]);
            try{
                System.out.println("Qual o nome do filme?");
                dado = new DataInputStream(System.in);
                tentativa = dado.readLine();
                
             }catch(Exception error){
                System.out.println("Ocorreu um erro de : "+ error);  
            }
            if(tentativa.equals(filme)){
                System.out.println("Parabéns você acertou!!!");
                aux = 5;
            }else{
                System.out.println("Você errou!!");
            }
            aux += +1;
        }
        
        
        
        
    }
}
