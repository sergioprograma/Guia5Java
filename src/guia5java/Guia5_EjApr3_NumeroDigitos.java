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
public class Guia5_EjApr3_NumeroDigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Recorrer un vector de N enteros contabilizando cuántos números son de
//1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
       
        Scanner leer = new Scanner(System.in);

        System.out.print("Elegir cardinalidad del vector:  \n");
        int card = leer.nextInt();
//        int card = 100;
         int num[] = new int[card];
        int parcial, cinco = 0, cuatro = 0, tres = 0, dos = 0, uno = 0;
        


        for (int i = 0; i < num.length; i++) {
            int cont = 1;
            num[i] = (int) (Math.random() * 100000);
            System.out.println(" [ " + num[i] + " ] ");

            for (int j = 1; j < 6; j++) {
                parcial = (num[i] /= 10);
                if (parcial != 0) 
                    cont++;                  
//                System.out.println(parcial+"  "+cont);

                }
                if (cont==5) {
                    cinco++;                    
                }
                 if (cont==4) {
                    cuatro++;                    
                }
                  if (cont==3) {
                    tres++;                    
                }
                   if (cont==2) {
                    dos++;                    
                } if (cont==1) {
                    uno++;                    
                }           }
                System.out.println("\nHay: \n\n"
                        + cinco+" numeros de cinco cifras\n"
                        + cuatro+ " numeros de cuatro cifras\n"
                                + tres+  " numeros de tres cifras\n"
                                        + dos+ " numeros de dos cifras\n"
                                                + uno+  " numeros de una cifra\n");    
    }
        
}
        
 

