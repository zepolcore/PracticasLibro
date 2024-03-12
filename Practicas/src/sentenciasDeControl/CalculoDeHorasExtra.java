
package sentenciasDeControl;

import java.util.Scanner;

/**
 *
 * @author martinlopez
 */
public class CalculoDeHorasExtra {
    public static void main(String[] args) {
        /*
        Escribe un programa que calcule el salario semanal de un trabajador 
        teniendo en cuenta que las horas ordinarias (40 semanales) se pagan
        12 euros la hora, a partir de la 41 se paga 16 euros
        */
        
        //ingreso de datos 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las Horas trabajadas esta semana");
        int cantidadHoras = teclado.nextInt();
        
        if (cantidadHoras <= 40){
            System.out.println("El salario de esta semana es de: " + cantidadHoras * 12 + " euros");
        }else if (cantidadHoras > 40){
            int salarioBasico = 40*12;
            int horasExtras = cantidadHoras - 40;
            int salarioExtra = (salarioBasico + (horasExtras * 16));
            System.out.println("EL salario de esta semana es de: " + salarioExtra + " euros");
        }else {
            System.err.println("El dato ingresado es el incorrecto");
        }
    }
    
}
