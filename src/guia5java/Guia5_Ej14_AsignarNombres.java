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
public class Guia5_Ej14_AsignarNombres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        String compa[]= new String [9];
        
        for (int i = 0; i < compa.length; i++) {
            System.out.print("Ingresar nombre de compañero "+(i+1)+":  ");
            compa[i]=leer.nextLine();
           
        }
        
        for (int i = 0; i < compa.length; i++) {
            System.out.println("El compañero: "+(i+1)+ " es "+compa[i]);
            
        }
        // TODO code application logic here
    }
    
}
