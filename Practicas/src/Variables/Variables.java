
package Variables;

/**
 *
 * @author martinlopez
 */
public class Variables {
    public static void main(String[] args){
        /*
        Escriba un programa que declare 5 variables de tipo char. A continuacion, crea otra variable como cadena de
        caracteres y asignale como valor la concatenacion de las variables anteriores. Por ultimo, muestra
        la cadena de caracteres por consola
        */
    
        //declaracion de las 5 variables 
        char caracter1 = 'a';
        char caracter2 = 'b';
        char caracter3 = 'c';
        char caracter4 = 'd';
        char caracter5 = 'e';
        
        String cadena = "" + caracter1 + caracter2 + caracter3 + caracter4 + caracter5;
        //va el "" para que tome eso como string y luego concatene, sin el "" tomara la suma de valores ascii
        //en vez de concatenar, y la suma no la podra guardar en un String.
        
        System.out.println(cadena);
    
        
    }
}
