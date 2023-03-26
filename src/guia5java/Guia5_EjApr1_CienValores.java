/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5Java;

import java.util.Scanner;

/**
 *
 * @author usand
 */
public class Guia5_EjApr1_CienValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Realizar un algoritmo que llene un vector con los 100 primeros números
//enteros y los muestre por pantalla en orden descendente.

        Scanner leer = new Scanner(System.in);
        
        int num[]= new int[100];
        
        for (int i = 0; i < num.length; i++) {
           
           num[i]=i;
           
        }
        
        for (int i=num.length-1; i >=0 ; i--) {
            System.out.println( " [ "+num[i]+ " ] ");
            
        // TODO code application logic here
        }
    }
}
