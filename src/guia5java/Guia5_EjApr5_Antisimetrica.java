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
public class Guia5_EjApr5_Antisimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Realice un programa que compruebe si una matriz dada es antisimétrica.
//Se dice que una matriz A es antisimétrica cuando ésta es igual a su
//propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
//A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
//obtiene cambiando sus filas por columnas (o viceversa).


        Scanner leer = new Scanner(System.in);

        System.out.print("\nElegir cardinalidad de la matriz cuadrada:  ");
//        int card = leer.nextInt();
        int card = 8;        
        boolean anti=false;

        int mat[][] = new int[card][card];

//       Matrices antisimetricas deben ser cuadradas y tener la diagonal principal cero
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                //diagonal principal cero
                if (j == i) {
                    mat[i][j] = 0;
                } else {
                    mat[i][j] = (int) (Math.random() * 10) - 5;

                    //si quiero generar de una matriz antisimetrica descomentar
//                     mat[j][i]= -mat[i][j];
                }
            }
        }

        System.out.println("\nMatriz\n");
        for (int[] mat1 : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(" [" + mat1[j] + "]");
            }
            System.out.println("");
        }
        System.out.println("\nMatriz transpuesta\n");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                System.out.print(" [" + mat[j][i] + "]");
            }
            System.out.println("");
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[j][i] != -mat[i][j] ) {

                    anti=true;
                    break;
                }
            }
        }

        if (!anti) {
            System.out.println("\nLa matriz transpuesta es antisimetrica\n");
        } else {
            System.out.println("\nLa matriz transpuesta no es antisimetrica\n");
        }

    }
    
}
