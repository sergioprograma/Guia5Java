/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5java;



/**
 *
 * @author usand
 */
public class Guia5_EjApr6_MatrizMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
//1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
//idénticas. Crear un programa que permita introducir un cuadrado por
//teclado y determine si este cuadrado es mágico o no. El programa
//deberá comprobar que los números introducidos son correctos, es decir,
//están entre el 1 y el 9.


       
        int cont=0;
        
        int mat[][] = new int[3][3];
        int sumaF[]= new int[3];
        int sumaC[]= new int[3];
        boolean dif=false;
        boolean des=false;
        int sumaDiaPr =0, sumaDiaSec=0;
        
//       Matrices antisimetricas deben ser cuadradas y tener la diagonal principal cero

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                mat[i][j] = (int) (Math.random() *9+1);
                //Descomentar para evaluar la resolucion de si es magica
//                 mat[i][j] = 8;
                if (mat[i][j] < 1 || (mat[i][j] > 9)) {
                  dif=true;
                  break;
                }
            }
        }

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" [" + mat[i][j] + "]");
            }
        System.out.println("");
        }
        
       
        if (!dif) {
            System.out.println("\nTodos los componentes de la matriz estan entre 1 y 9"
                    + " Se procede a evaluar si es matriz magica\n");
            
            for (int i = 0; i < 3; i++) {
                int sumaFila = 0;
                for (int j = 0; j < 3; j++) {

                    sumaFila += mat[i][j];

                    if (i == j) {
                        sumaDiaPr += mat[i][j];
                    }
                    if ((i + j) == 2) {
                        sumaDiaSec += mat[i][j];
                    }
                }
                sumaF[i] = sumaFila;
                System.out.println("  " + sumaF[i]);
            }
            
            for (int j = 0; j < 3; j++) {
                int sumaCol = 0;
                for (int i = 0; i < 3; i++) {
                 sumaCol += mat[i][j];
                   
                }
                sumaC[j] = sumaCol;
                System.out.println(" ** " + sumaC[j]);
            }
            
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (sumaF[i] != sumaC[j]) {
                       des=true;
                       break;
                    }
                }
            }
            
            
            if ((sumaDiaPr==sumaDiaSec&&!des)) {
                System.out.println("\nLa matriz es magica\n");
                
                
            }else{
               System.out.println("\nLa matriz no es magica\n");
            }
           
        }         
        else
            System.out.println("\nNo todos los componentes de la matriz estan entre 1 y 9\n");
    }    
    
}
