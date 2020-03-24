package pqtcontarpalabras;

import java.util.Scanner;

public class LeerMain {
    //int [] contador;
   char caracter;
   static final String TEXTO_PEDIR_CADENA = "Introduzca un conjunto de caracteres:";


    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        System.out.println(TEXTO_PEDIR_CADENA);
        String cadena = scan.nextLine().trim();
        ContarPalabras c = new ContarPalabras();
        int numCaracteresSinBlancos = c.contarNumCaracteres(cadena);
        int numPalabras = c.contarNumPalabras(cadena);
        int[] contador = c.contarCaracteresRepetidos(cadena);
        Imprimir i = new Imprimir();
        i.mostrarCaracteresTotal(numCaracteresSinBlancos);
        i.mostrarNumPalabras(numPalabras);
        i.mostrarCaracteres(contador);

        scan.close();
    }
}