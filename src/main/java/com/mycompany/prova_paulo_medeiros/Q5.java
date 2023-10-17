package com.mycompany.prova_paulo_medeiros;

import java.io.DataInputStream;
import java.io.IOException;

public class Q5 {
    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        String s;
        int codigo=0, senha=0;

        try{
            System.out.println("Digite seu código de usuário:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            codigo = Integer.parseInt(s);
        }catch(Exception error){
            System.out.println("Ocorreu um erro de : "+ error);  
        }
        
        if(codigo == 1234){
           try{
            System.out.println("Digite sua senha:");
            dado = new DataInputStream(System.in);
            s = dado.readLine();
            senha = Integer.parseInt(s);
            }catch(Exception error){
                System.out.println("Ocorreu um erro de : "+ error);  
            }
           
           if(senha !=9999){
               System.out.println("Senha incorreta");
           }else{
               System.out.println("Acesso permitido");
           }
        }else{
            System.out.println("Usuário inválido!");
        }
    }
}
