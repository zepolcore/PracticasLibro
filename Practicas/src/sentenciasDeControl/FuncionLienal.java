
package sentenciasDeControl;

import java.util.Scanner;

/**
 *
 * @author martinlopez
 */
public class FuncionLienal {
    public static void main(String[] args) {
        /*
        Realice un programa que resuelva la ecuacion de la funcion lineal 
        a*x+b=y
        Solo buscaremos los valores de y estebleceremos los valores de a,b,x
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al calculador de Funcion Lineal = a*x+b");
        System.out.println("Proximamente se le solicitara los valores correspondiente para hallar la ordenada al origen ");
        
        System.out.println("Ingrese la pendiente:");
        int a = teclado.nextInt();
        System.out.println("La pendiente es: "+a);
        
        System.out.println("ingrese la ordenada al origen en 0, osea b:");
        int b = teclado.nextInt();
        System.out.println("La ordenada al origen en y = 0 es de: "+b);
        
        System.out.println("Ingrese el parametro x:");
        int x = teclado.nextInt();
        System.out.println("El parametro x es: "+x);
        
        System.out.println("La ecuacion resultante es: " + a + "*" + x + "+" + b + "= y");
        int resultado = (a*x)+b;
        System.out.println("La ordenada al origen par la ecuacion anterior es: "+resultado);
    }
    
}
