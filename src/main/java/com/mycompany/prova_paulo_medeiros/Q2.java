package com.mycompany.prova_paulo_medeiros;

import java.io.DataInputStream;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String s;
        int anos = 0, meses = 0, dias = 0, diasTotal;

        try{
            System.out.println("Digite seus anos de vida:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            anos = Integer.parseInt(s);
        }catch(Exception error){
            System.out.println("Ocorreu um erro de : "+ error);  
        }
        
        try{
            System.out.println("Digite seus meses de vida:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            meses = Integer.parseInt(s);
        }catch(Exception error){
            System.out.println("Ocorreu um erro de : "+ error);  
        }
        
        try{
            System.out.println("Digite seus dias de vida:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            dias = Integer.parseInt(s);
        }catch(Exception error){
            System.out.println("Ocorreu um erro de : "+ error);  
        }
        
        diasTotal = (anos*365)+(meses*30)+dias;
         System.out.printf("Seus dias de vida: %d anos, %d meses e %d dias = %d dias ",anos,meses,dias,diasTotal);
    } 
} 

   

