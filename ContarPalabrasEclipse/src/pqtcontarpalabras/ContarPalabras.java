package pqtcontarpalabras;

/**
 *
 * @author Ana
 */
public class ContarPalabras {
    /**
     * 
     * @param cadena Conjunto de caracteres que mete el usuario por consola
     * @return int numero de caracteres que ha contado
     */
    public int contarNumCaracteres(String cadena) {
        int numCaracteresSinBlancos = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter != ' ') {
                numCaracteresSinBlancos++;
            }
        }
        return numCaracteresSinBlancos;
    }
    /**
     * 
     * @param cadena Conjunto de caracteres que mete el usuario por consola
     * @return int numero de palabras que ha contado
     */
    public int contarNumPalabras(String cadena) {
        int palabras = 1;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (caracter == ' ') {
                palabras++;
            }
        }
        return palabras;
    }
    
    /**
     * 
     * @param cadena Conjunto de caracteres que mete el usuario por consola
     * @return int numero de caracteres repetidos uno a uno que ha contado
     */
    public int[] contarCaracteresRepetidos(String cadena) {
        int[] contador = new int[65536];
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            int ascii = caracter;
            contador[ascii]++;
        }
        return contador;
    }
}
