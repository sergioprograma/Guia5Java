/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5Java;

import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Scanner;

/**
 *
 * @author usand
 */
public class Guia5_EjApr2_AdivinaAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Realizar un algoritmo que llene un vector de tamaño N con valores
//aleatorios y le pida al usuario un número a buscar en el vector. El
//programa mostrará dónde se encuentra el numero y si se encuentra
//repetido
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
      
        
        System.out.print("Elegir cardinalidad del vector:  ");
        int card=leer.nextInt();
        System.out.print("Elegir un numero entre 1 y 10 para ser encontrado:  ");
        int elec=leer.nextInt();
        
        int num[]= new int[card];
        int k=0;
        
        for (int i = 0; i < num.length; i++) {
           
           num[i]= (int) (Math.random() * 10) ;
           System.out.println( " [ "+num[i]+ " ] ");
           
            if (num[i]==elec) {
                System.out.println("La posicion "+i+" es equivalente");
             k++;  
            }
           
               
           }
          System.out.println("El numero total de equivalencias es: "+k); 
//          
//           for (int i = 0; i < num.length; i++) {
//            System.out.println( " [ "+num[i]+ " ] ");
//            
//        // TODO code application logic here
//        }
    }
      
       
}

    
    
