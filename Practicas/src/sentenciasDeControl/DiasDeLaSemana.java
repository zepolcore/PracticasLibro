
package sentenciasDeControl;

import java.util.Scanner;

/**
 *
 * @author martinlopez
 */
public class DiasDeLaSemana {
    public static void main (String[] args){
        /*
        Escribe un programa que dado un numero del 1 al 7 escriba el 
        correpondiente dia de la semana
        */
        
        //Ingreso de datos 
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero de uno al 7 y se le dira el dia");
        int dia = teclado.nextInt();
        
        switch (dia) {
            case 1:
                System.out.println("El dia es Lunes");
                break;
            case 2:
                System.out.println("EL dia es Martes");
                break;
            case 3:
                System.out.println("El dia es Miercoles");
                break;
            case 4:
                System.out.println("El dia es Jueves");
                break;
            case 5:
                System.out.println("E dia es Viernes");
                break;
            case 6:
                System.out.println("El dia es Sabado");
                break;
            case 7:
                System.out.println("El dia es Domingo");
                break;
            
            default:
                System.out.println("No introdujo un numero del 1 al 7");
        }
        
    }
}
