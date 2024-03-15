
package sentenciasDeControl;

import java.util.Scanner;

/**
 *
 * @author martinlopez
 */
public class CaidaLibre {
    public static void main(String[] args) {
        /*
        Realizar un programa que calcule el tiempo que tardara en caer un objeto 
        desde cierta altura.
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la altura desde la cual el objeto sera lanzado");
        double altura = teclado.nextDouble();
        System.out.println("La altura es: "+ altura);
        
        double tiempo = Math.sqrt((2*altura)/9.81d);
        System.out.println("El tiempo que tardara en caer sera de: " + tiempo + " segundos");
        
    }
}
