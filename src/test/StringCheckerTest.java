package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.JavierLopez.StringChecker;

class StringCheckerTest {

	@Test
	void testContarCaracteresTotal_Cero() {
		StringChecker checker = new StringChecker();
		String cadena = "";
		assertTrue(checker.contarNumeroCaracteres(cadena) == 0);
	}

	@Test
	void testContarCaracteresTotal_Diez() {
		StringChecker checker = new StringChecker();
		String cadena = "1234567890";
		assertTrue(checker.contarNumeroCaracteres(cadena) == 10);
	}

	@Test
	void testContarCaracteresTotal_Espacios() {
		StringChecker checker = new StringChecker();
		String cadena = "           ";
		assertTrue(checker.contarNumeroCaracteres(cadena) == 0);
	}

	@Test
	void testContarNumeroPalabras_Cero() {
		StringChecker checker = new StringChecker();
		String cadena = "";
		assertTrue(checker.contarNumeroPalabras(cadena) == 0);
	}
	
	@Test
	void testContarNumeroPalabras_Diez() {
		StringChecker checker = new StringChecker();
		String cadena = "1 2 3 4 5 6 7 8 9 0";
		assertTrue(checker.contarNumeroPalabras(cadena) == 0);
	}
	
	@Test
	void testContarNumeroPalabras_Espacios() {
		StringChecker checker = new StringChecker();
		String cadena = "            ";
		assertTrue(checker.contarNumeroPalabras(cadena) == 0);
	}

	@Test
	void testContarTodosCaracteres_Null() {
		StringChecker checker = new StringChecker();
		String cadena = "";
		assertTrue(checker.contarTodosCaracteres(cadena) == null);
	}
	
	@Test
	void testContarTodosCaracteres_NotNull() {
		StringChecker checker = new StringChecker();
		String cadena = "abcdef ere ¿?";
		assertTrue(checker.contarTodosCaracteres(cadena) != null);
	}

}
