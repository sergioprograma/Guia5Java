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
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner neme = new Scanner(System.in);
		int opcion;
		
		do {
    		System.out.println("Seleccione una de las opciones:");
    		System.out.println("1.-Calcular el area de un triangulo\n2.-Calcular el area de un rectangulo\n3.-Calcular el area de un cuadrado\n4.-Salir");
    		opcion = neme.nextInt();
    		double base=0.0,altura=0.0,area=0.0,baserec=0.0,alturarec=0.0,arearec=0.0,basecua=0.0,alturacua=0.0,areacua=0.0;
			
    		if(opcion==1) {
        		System.out.println("Ingrese la base del triangulo");
        		base = neme.nextDouble();
        		System.out.println("Introduce la altura del triangulo");
        		altura = neme.nextDouble();
        		area=(base*altura)/2;
        		System.out.println("El area del triangulo de base = " + base + " y altura = " + altura + ", es de " + area + " m2 ");
    		}
    		else if(opcion==2) {
        		System.out.println("Introduce la base del rectangulo");
        		baserec=neme.nextDouble();
        		System.out.println("Introduce la altura del rectangulo");
        		alturarec=neme.nextDouble();
        		arearec=baserec*alturarec;
        		System.out.println("El area del rectangulo de base = " + baserec + " y altura = " + alturarec + ", es de " + arearec + " m2 ");
    		}
    		else if(opcion==3) {
        		System.out.println("Introdusca la bace del cuadrado");
        		basecua=neme.nextDouble();
        		System.out.println("Introdusca la altura del cuadrado");
        		alturacua=neme.nextDouble();
        		areacua=basecua*alturacua;
        		System.out.println("El area del cuadrado de base = " + basecua + "y altura = " + alturacua + ", es de " + areacua + " m2 ");
    		} else if (opcion == 4) {
    		    System.out.println("\nFIN DE PROGRAMA");
    		} else { //Por si se introduce un valor que no es una opción de menú
    		    System.out.println("Opcion invalida");
    		}
    		//Para pausar la ejecución del programa
    		neme.nextLine(); //Limpiamos buffer del System.in
    		System.out.println("\n\t\tPRESIONE ENTER PARA CONTINUAR..."); //Mensaje en pantalla
    		neme.nextLine(); //Ahora el programa se detiene hasta que se pulse ENTER
       }while(opcion != 4);
        // TODO code application logic here
    }
    
}
