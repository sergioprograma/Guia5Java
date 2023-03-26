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
public class Guia5_EjExtra4_Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Los profesores del curso de programación de Egg necesitan llevar un
//registro de las notas adquiridas por sus 10 alumnos para luego obtener
//una cantidad de aprobados y desaprobados. Durante el período de
//cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos
//evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
//Primer trabajo práctico evaluativo 10%
//Segundo trabajo práctico evaluativo 15%
//Primer Integrador 25%
//Segundo integrador 50%
//Una vez cargadas las notas, se calcula el promedio y se guarda en el
//arreglo. Al final del programa los profesores necesitan obtener por
//pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta
//que solo aprueban los alumnos con promedio mayor o igual al 7 de sus
//notas del curso.
        Scanner leer = new Scanner(System.in);
        
        float promedio;      

        float notas[][] = new float[10][6];
        
        for (int i = 0; i < notas.length; i++) {
            System.out.println("***********************************");
            System.out.print("Ingresar notas del alumno: "+(i+1)+" \n");
            for (int j = 0; j < notas[0].length; j++) {
                
                
                if (j==0) {
                    
                    notas[i][j] = (i+1);
                }    
                if (j==1) {
                    System.out.print("\nPrimer trabajo práctico evaluativo alumno: "+i+" \n");
//                    notas[i][j] = leer.nextFloat();
                    notas[i][j] = (int) (Math.random() * 10); 
                    System.out.println ("["+notas[i][j]+"]");
                }
                if (j==2) {
                    System.out.print("Segundo trabajo práctico evaluativo alumno: "+i+" \n");
//                    notas[i][j] = leer.nextFloat();
                    notas[i][j] = (int) (Math.random() * 10); 
                    System.out.println ("["+notas[i][j]+"]");
                }
                if (j==3) {
                    System.out.print("Primer integrador alumno: "+i+" \n");
//                    notas[i][j] = leer.nextFloat();
                    notas[i][j] = (int) (Math.random() * 10);
                    System.out.println ("["+notas[i][j]+"]");
                }
                if (j==4) {
                    System.out.print("Segundo integrador alumno: "+i+" \n");
//                    notas[i][j] = leer.nextFloat();
                    notas[i][j] = (int) (Math.random() * 10);
                    System.out.println ("["+notas[i][j]+"]");
                }
                if (j==5) {
                    System.out.print("Promedio alumno: "+i+" \n");
                    notas[i][j] = (float)(notas[i][1]*0.1+notas[i][2]*0.15+notas[i][3]*0.25+notas[i][4]*0.5);
                    System.out.println ("["+notas[i][j]+"]");
                    
                }
            }
        }
        System.out.println("");
        for (int i = 0; i < notas.length; i++){
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print(" [" + notas[i][j] + "]");
            }
            System.out.println("");
        }
        
        for (int j = 0; j < notas[0].length; j++){
            for (int i = 0; i < notas.length; i++) {
                System.out.print(" [" + notas[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
}
