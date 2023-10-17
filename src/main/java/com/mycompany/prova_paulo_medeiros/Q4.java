package com.mycompany.prova_paulo_medeiros;

import java.io.IOException;
import javax.swing.JOptionPane;


public class Q4 {
    public static void main(String[] args) throws IOException {
        String s;
        int numb=0;

        try{
            s = JOptionPane.showInputDialog(null,"Digite um número");
            numb = Integer.parseInt(s); 
        }catch(Exception error){
            System.out.println("Ocorreu um erro de : "+ error);  
        }
        
        JOptionPane.showMessageDialog(null, "O sucessor desse número é :"+(numb+1));
        JOptionPane.showMessageDialog(null, "O antecessor desse número é :"+(numb-1));
        
    }
}
