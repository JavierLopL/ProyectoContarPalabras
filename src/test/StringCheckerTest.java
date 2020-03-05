package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.JavierLopez.StringChecker;

/**
 * Tests unitarios de la clase StringChecker.java
 * 
 * @author Javier Lopez Lumbreras
 * @version 0.3
 *
 */
class StringCheckerTest {

	/**
	 * Test que prueba el número de caracteres en una cadena de texto vacía.
	 */
	@Test
	void testContarCaracteresTotal_Cero() {
		StringChecker checker = new StringChecker();
		String cadena = "";
		assertTrue(checker.contarNumeroCaracteres(cadena) == 0);
	}

	/**
	 * Test que prueba el número de caracteres en una cadena de texto de diez
	 * caracteres de longitud.
	 */
	@Test
	void testContarCaracteresTotal_Diez() {
		StringChecker checker = new StringChecker();
		String cadena = "1234567890";
		assertTrue(checker.contarNumeroCaracteres(cadena) == 10);
	}

	/**
	 * Test que prueba el número de caracteres en una cadena de texto compuesta solo
	 * de espacios en blanco.
	 */
	@Test
	void testContarCaracteresTotal_Espacios() {
		StringChecker checker = new StringChecker();
		String cadena = "           ";
		assertTrue(checker.contarNumeroCaracteres(cadena) == 0);
	}

	/**
	 * Test que prueba el número de palabras en una cadena de texto vacía.
	 */
	@Test
	void testContarNumeroPalabras_Cero() {
		StringChecker checker = new StringChecker();
		String cadena = "";
		assertTrue(checker.contarNumeroPalabras(cadena) == 0);
	}

	/**
	 * Test que prueba el número de palabras en una cadena de texto compuesta de
	 * diez palabras.
	 */
	@Test
	void testContarNumeroPalabras_Diez() {
		StringChecker checker = new StringChecker();
		String cadena = "1 2 3 4 5 6 7 8 9 0";
		assertTrue(checker.contarNumeroPalabras(cadena) == 0);
	}

	/**
	 * Test que prueba el número de palabras en una cadena de texto compuesta por
	 * espacios en blanco.
	 */
	@Test
	void testContarNumeroPalabras_Espacios() {
		StringChecker checker = new StringChecker();
		String cadena = "            ";
		assertTrue(checker.contarNumeroPalabras(cadena) == 0);
	}

	/**
	 * Test que prueba la reptición de caracteres en una cadena de texto vacía.
	 */
	@Test
	void testContarTodosCaracteres_Null() {
		StringChecker checker = new StringChecker();
		String cadena = "";
		assertTrue(checker.contarTodosCaracteres(cadena) == null);
	}

	/**
	 * Test que prueba la repetición de caracteres en una cadena de texto que no
	 * está vacía
	 */
	@Test
	void testContarTodosCaracteres_NotNull() {
		StringChecker checker = new StringChecker();
		String cadena = "abcdef ere ¿?";
		assertTrue(checker.contarTodosCaracteres(cadena) != null);
	}

}
