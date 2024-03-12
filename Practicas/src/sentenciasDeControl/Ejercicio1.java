
package sentenciasDeControl;

import java.util.Scanner;

/**
 *
 * @author martinlopez
 */
public class Ejercicio1 {
/* escriba un programa que pida por teclado un dia de la semana y que diga que 
asignatura toca a primera hora.
*/

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique el dia y se le informara con que asignatura comenzara");
        String dia = teclado.nextLine();
        
        /*
        Los casos deben ir entre comillas, lo voy a compara con el valor de dia el cual es de tipo String
        */
        
        switch (dia) {
            case "lunes":
                System.out.println("Los lunes se cursa Pensamiento Computacional");
                break;
            case "martes":
                System.out.println("Los martes se cursa Analisis Matematico");
                break;
            case "miercoles":
                System.out.println("Los miercoles se cursa Algebra");
                break;
            case "jueves":
                System.out.println("Los jueves se cursa Fisica");
                break;
            case "viernes":
                System.out.println("Los viernes se practica");
                break;
            case "sabado":
                System.out.println("Los sabados se practica");
                break;
            case "domingo":
                System.out.println("Los domingos se practica");    
                break;
            default:
                System.out.println("EL dia ingresado es incorrecto;"); 
        }
    }
}