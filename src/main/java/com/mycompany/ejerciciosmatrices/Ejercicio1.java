package com.mycompany.ejerciciosmatrices;

import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Atributos y variables:
        char [] alfabeto= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int num=-1;
        
        //Bucle de petición de letra:
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número:"));
            if (num<=25&&num>=0) {
                System.out.print(alfabeto[num]);
            }
            if (num>25){
                JOptionPane.showMessageDialog(null, "Inserte un número entre 0 y 25");
            }
        }while(num>=0);
        JOptionPane.showMessageDialog(null, "Fin");
    } 
}
