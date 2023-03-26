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
public class Guia5_EjApr4_MatrizTranspuesta {
//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
//y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
//A se denota por B y se obtiene cambiando sus filas por columnas (o
//viceversa).
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        

        int parcial;
        int mat[][] = new int[4][4];
       

//        for (int[] mat1 : mat) {
//            for (int j = 0; j < mat.length; j++) {
//                mat1[j] = (int) (Math.random() * 10);   
//            }
//        }
//        
//        
//        for (int[] mat1 : mat) {
//            for (int j = 0; j < mat.length; j++) {
//                System.out.print(" [ "+mat1[j]+" ]");
//                   
//            }
//            System.out.println("");
//        }
        
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                  mat[i][j] = (int) (Math.random() *9)+1;      
                }
            
            }
            System.out.println("\nMatriz\n");   
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                  System.out.print(" ["+mat[i][j]+"]");   
                }
            System.out.println("");
            
            }
            System.out.println("\nMatriz transpuesta\n"); 
            
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                  System.out.print(" ["+mat[j][i]+"]");   
                }
            System.out.println("");
            }
            
            
            

        
        
        
      
               
                   
            
            
        
//            System.out.println(" [ " + num[i] + " ] ");
        // TODO code application logic here
       }
    
}
