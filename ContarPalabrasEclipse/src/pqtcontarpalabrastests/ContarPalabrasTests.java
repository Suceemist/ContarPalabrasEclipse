package pqtcontarpalabrastests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pqtcontarpalabras.ContarPalabras;

class ContarPalabrasTests {
	/**
	 * Test para probar el metodo contarNumCaracteres de la clase ContarPalabras
	 */
	@Test
	void testcontarNumCaracteres() {
		ContarPalabras c = new ContarPalabras();
		assertTrue(c.contarNumCaracteres("abc")==3);
		assertFalse(c.contarNumCaracteres("abcd")==3);
		
	}
	/**
	 * Test para probar el metodo contarNumPalabras de la clase ContarPalabras
	 */
	@Test
	void testcontarNumPalabras() {
		ContarPalabras c = new ContarPalabras();
		assertTrue(c.contarNumPalabras("Hola mundo")==2);
		assertFalse(c.contarNumPalabras("Hola")==2);
	}
	/**
	 * Test para probar el metodo contarCaracteresRepetidos de la clase ContarPalabras
	 */
	@Test
	void testcontarCaracteresRepetidos() {
		ContarPalabras c = new ContarPalabras();
		int[] array = new int[2];
		assertFalse(c.contarCaracteresRepetidos("Hola")==array);
	}
}
