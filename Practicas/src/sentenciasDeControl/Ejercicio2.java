
package sentenciasDeControl;

import java.util.Scanner;

/**
 *
 * @author martinlopez
 */
public class Ejercicio2 {
    public static void main(String[] args){
        /*
        Realiza un programam que pida una hora por teclado y que muestre 
        - buenos dias. 
        - buenas tardes.
        - buenas noches.
        Se utilzara el tramo de:
        - 6 a 12.
        - 13 a 20.
        - 21 a 5.
        */
    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese solo la hora");
        int hora = teclado.nextInt();
        
        if ((hora > 6)&&(hora <= 12)){
            System.out.println("Buenos Dias!!");
        } else if((hora > 12)&&(hora <= 20)){
            System.out.println("Buenas Tardes!!");
        } else if ((hora > 20)&&(hora <= 24)){
            System.out.println("Buenas Nohes!!");
        }else if ((hora > 00)&&(hora <= 6)){
            System.out.println("Buenas Nohes!!");
        }else {
            System.out.println("No estas introduciendo bien la hora");
        }
    }
}
