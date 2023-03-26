/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5java;

import java.util.Scanner;

/**
 *
 * @author usand
 */
public class Guia5_EjExtra1_Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Realizar un algoritmo que calcule la suma de todos los elementos de un
//vector de tamaño N, con los valores ingresados por el usuario.


        Scanner leer = new Scanner(System.in);

        System.out.print("\nElegir cardinalidad del vector:  ");
        int card = leer.nextInt();
//        int card = 5;
        float suma = 0;

        float vec[] = new float[card];
        
         for (int i = 0; i < vec.length; i++) { 
             System.out.print("\nIngresar posicion "+i+":  ");
             vec[i]= leer.nextFloat();
//                vec[i] =(float) (Math.random() * 9+1);
                System.out.print(" [" + vec[i] + "]\n");
                suma+=vec[i];                      
        
        }
             
                
        
        System.out.println("\nLa suma de los elementos del vector es: "+suma+"\n");
    }
    
}
