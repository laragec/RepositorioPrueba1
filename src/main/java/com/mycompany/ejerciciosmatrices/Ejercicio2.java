package com.mycompany.ejerciciosmatrices;

import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Atributos y variables:
        char [] alfabeto= new char[25];
        int num=-1;
        
        //Bucle de relleno automático del array:
        for(int i=65;i<alfabeto.length;i++){
            alfabeto[i]=(char)i;
        }
        
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