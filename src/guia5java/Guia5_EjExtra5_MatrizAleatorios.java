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
public class Guia5_EjExtra5_MatrizAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Realizar un programa que llene una matriz de tamaño NxM con valores
//aleatorios y muestre la suma de sus elementos.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar numero de filas de la matriz");
        int N= leer.nextInt();
        
        System.out.println("Ingresar numero de columnas de la matriz");
        int M= leer.nextInt();
        
        float suma=0;
       

        float mat[][] = new float[N][M];
        
        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[0].length; j++) {

                mat[i][j] = (float) (Math.random() * 100000);
                suma+=mat[i][j];
            }
        }
         System.out.println("");
        
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(" [" + mat[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("Las suma de los elementos de la matriz es "+suma);
    }
 }
       
    
