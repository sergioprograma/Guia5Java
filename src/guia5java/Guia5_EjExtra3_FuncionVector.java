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
public class Guia5_EjExtra3_FuncionVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Crear una función rellene un vector con números aleatorios, pasándole
//un arreglo por parámetro. Después haremos otra función o
//procedimiento que imprima el vector.
        Scanner leer = new Scanner(System.in);

        System.out.print("\nElegir cardinalidad de los vectores:  \n");
        int card = leer.nextInt();
//        int card = 5;       
        System.out.println("");
        float vec[] = new float[card];
       

        for (int i = 0; i < vec.length; i++) {

            vec[i]= posicionAleatoria(vec[i]);
             imprimeMatriz(vec[i]);
            
        }
        System.out.println("");
    }
    public static float posicionAleatoria( float nu) {
        
        nu = (float) (Math.random() * 9 + 1);        
        return nu;
        
    }
    public static void imprimeMatriz( float nu) {        
        System.out.println(" [" + nu + "] ");     
        
    }
}
