
package salidaFormateada;

/**
 *
 * @author martinlopez
 */
public class SalidaFormateada {
    public static void main(String[] args){
        System.out.printf("el nro %.02f es un decimal\n",12.0);
        // formateadores
        /*
            \n. Salto de línea.
            \t. Tabulador.
            \\. Diagonal inversa.
            \". Comillas dobles.
            \'. Comillas simples.
            (%s, "string"); para escribir un string 
            (%S, "string"); para escribir un STRING
            (%f, float)
            (%d, int)
            ("el nro %d es un decimal", 12) = "el numero 12 es un decimal "
        */
        // incluso hasta podria formar uan tabla dando este formato
        System.out.printf("%s   %s  %s\n","identificador","Nombre","precio");
        System.out.printf("%d   %-10s  %.2f\n",1,"manzana",20.34365635);
        System.out.printf("%d   %-10s  %d\n",2,"banana",25);
        System.out.printf("%d   %-10s  %d\n",3,"naranja",18);
        System.out.printf("%d   %-10s  %d\n",4,"uva",25);
        System.out.printf("%d   %-10s  %d\n",5,"ciruela",22);
        System.out.printf("%d   %-10s  %d\n",6,"durazno",20);
    }
}
