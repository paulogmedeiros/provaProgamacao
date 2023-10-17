package com.mycompany.prova_paulo_medeiros;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Q8 {
    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String s;
        int numb=0,calculo;

        try{
            System.out.println("Digite um número:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            numb = Integer.parseInt(s);
        }catch(Exception error){
            System.out.println("Ocorreu um erro de : "+ error);  
        }
        
        FileWriter arq = new FileWriter("C:\\Users\\pmedeiros\\Desktop\\Q8\\tabuada.txt");
        PrintWriter gravar = new PrintWriter(arq);
        
        gravar.printf("Tabuada do numero %d\n",numb);
        gravar.println("-----------------------------");
        for(int i = 1; i<=10; i++){
            calculo = numb * i;
            gravar.printf("%d x %d = %d\n",numb,i,calculo);
        }
        gravar.println("-----------------------------");
        arq.close();
    }
}
