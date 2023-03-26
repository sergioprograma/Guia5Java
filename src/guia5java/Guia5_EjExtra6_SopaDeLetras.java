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
public class Guia5_EjExtra6_SopaDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
//caracteres y, a medida que el usuario las va ingresando, construya una
//“sopa de letras para niños” de tamaño de 20 x 20 caracteres. Las
//palabras se ubicarán todas en orden horizontal en una fila que será
//seleccionada de manera aleatoria. Una vez concluida la ubicación de las
//palabras, rellene los espacios no utilizados con un número aleatorio del 0
//al 9. Finalmente imprima por pantalla la sopa de letras creada.
//Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las
//siguientes funciones de Java substring(), Length() y Math.random().


         Scanner leer = new Scanner(System.in);
        
        
        String sopa[][]= new String[20][20];
        
        String pal[]= new String[5];
        
        
       
        for (int i = 0; i < pal.length; i++) {
            System.out.println("Ingresar palabra entre 3 y 5 caracteres: N° "+(i+1));
            pal[i]= leer.nextLine();
            while (pal[i].length()<3||pal[i].length()>5){
                System.out.println("Debe tener entre 3 y 5 caracteres. ingresar de nuevo");
               pal[i]= leer.nextLine();
            }    
        }
        int n,m;
        for (int i = 0; i < sopa.length; i++){
            for (int j = 0; j < sopa[0].length; j++) {
                n=(int) (Math.random() * 19);
                m=(int) (Math.random() * 14);
                if (sopa[i][j]==null)  {
                 sopa[n][m+j]=pal[i].substring(j, j+1);
                }
            }
            
        }
        
        
        for (int i = 0; i < sopa.length; i++){
            for (int j = 0; j < sopa[0].length; j++) {
                
                System.out.print(" [" + sopa[i][j] + "]");
            }
            System.out.println("");
        }
        
     }
    
//    public static void ubicar (String car]{
//        
//        return null;
//    }
//         mat[i][j] = (float) (Math.random() * 100000);
        
        
       
    
    
}
