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
public class Guia5_EjExtra2_ComparaVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Escriba un programa que averigüe si dos vectores de N enteros son
//iguales (la comparación deberá detenerse en cuanto se detecte alguna
//diferencia entre los elementos).
        Scanner leer = new Scanner(System.in);
        boolean control=false;
        System.out.print("\nElegir cardinalidad de los vectores:  \n");
//        int card = leer.nextInt();
        int card = 5;
       

        int vec1[] = new int[card];
        int vec2[] = new int[card];

        for (int i = 0; i < vec1.length; i++) {
//             System.out.print("\nIngresar posicion "+i+":  ");
//             vec[i]= leer.nextFloat();
            vec1[i] = (int) (Math.random() * 9 + 1);
            vec2[i] = (int) (Math.random() * 9 + 1);
            //Descomentar para hacer los vectores iguales
//            vec2[i] = vec1[i];
            System.out.print(" [" + vec1[i] + "]");

        }
        System.out.println("");
        for (int i = 0; i < vec2.length; i++) {

            System.out.print(" [" + vec2[i] + "]");

        }
        System.out.println("");
        for (int i = 0; i < vec2.length; i++) {

            if (vec2[i] != vec1[i]) {
                System.out.println("La comparacion se detuvo por elemento desigual en posicion " + i);
                break;
            }else{
                control=true;                   
            }
             
        }
        if(control){
         System.out.println("Los vectores son iguales");    
        }
         
    }

}
