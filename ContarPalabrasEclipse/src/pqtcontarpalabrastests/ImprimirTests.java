package pqtcontarpalabrastests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pqtcontarpalabras.Imprimir;

class ImprimirTests {

	/**
	 * Test para probar el metodo mostrarCaracteresTotal de la clase Imprimir
	 */
	@Test
	void testmostrarCaracteresTotal() {
		Imprimir i = new Imprimir();
		int n = 5;
	    String texto = "Se han introducido un total de "+n+" caracteres(sin contar los blancos).";
		assertEquals(i.mostrarCaracteresTotal(5), texto);
		assertFalse(i.mostrarCaracteresTotal(4).equals(texto));
		
	}
	/**
	 * Test para probar el metodo mostrarNumPalabras de la clase Imprimir
	 */
	@Test
	void testmostrarNumPalabras() {
		Imprimir i = new Imprimir();
		int n = 2;
	    String texto = "Se han ingresado "+n+" palabras.";
		assertEquals(i.mostrarNumPalabras(2), texto);
		assertFalse(i.mostrarNumPalabras(3).equals(texto));
	}
	/**
	 * Test para probar el metodo mostrarCaracteres de la clase Imprimir
	 */
	@Test
	void testmostrarCaracteres() {
		Imprimir i = new Imprimir();
		int[] contador = new int[3];
		assertTrue(i.mostrarCaracteres(contador)=="");
	}
}
