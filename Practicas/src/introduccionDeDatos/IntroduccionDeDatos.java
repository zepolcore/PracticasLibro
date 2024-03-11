
package introduccionDeDatos;

import java.util.Scanner;

/**
 *
 * @author martinlopez
 */
public class IntroduccionDeDatos {
    public static void main(String[] args){
        /*
        Realizar un programa que calcule la nota que hace falta sacar en el segundo ezamen de la asignatura
        programacion, para obtener la media deseada, la nota del primer examen cuenta un 40% y la del segundo
        examen un 60%
        */
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido al calculador de notas, recorda ingresar los datos con COMA, sino el programam lanza un error");
        System.out.println("Ingrese calificacion del PRIMER EXAMEN");
        float primerExamen = teclado.nextFloat();
        
        System.out.println("Ingrese calificacion FINAL deseada");
        float finalDeseado = teclado.nextFloat();
        
 
        float segundoExamen = (finalDeseado-(0.4f*primerExamen))/0.6f;
           
        System.out.println("La nota necesaria en el segundo examen es de: " + segundoExamen);
        
        teclado.close();
    }   
}
