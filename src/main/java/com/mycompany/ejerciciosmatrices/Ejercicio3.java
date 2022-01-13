package com.mycompany.ejerciciosmatrices;
import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Petición al usuario:
        String frase;
        frase=JOptionPane.showInputDialog("Escriba una frase:");
        char [] fraseArray= new char [frase.length()];
        
        //Bucle de relleno automático del array:
        for(int i=0;i<frase.length();i++){
            fraseArray[i]=frase.charAt(i);
        }
        
        JOptionPane.showMessageDialog(null, fraseArray[frase.length()]);
        
    }
    
}
