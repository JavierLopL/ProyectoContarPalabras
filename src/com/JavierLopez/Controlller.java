package com.JavierLopez;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 
 * @author Javier Lopez Lumbreras
 * @version 0.3
 * 
 *          Clase desde donde se inicia el programa y se controla el flujo y
 *          ejecución del mismo.
 */
public class Controlller {
	/**
	 * Valor de la cadena de texto introducida por el usuario. Por defecto está
	 * vacía ("").
	 */
	private static String cadenaOriginal;

	/**
	 * Objeto de la clase StringChecker que analiza la cadena de texto introducida
	 * por el ususario.
	 */
	private static StringChecker checker;

	/**
	 * Objeto de la clase Viewer que muestra al usuario los menús y los resultados
	 * en pantalla
	 */
	private static Viewer viewer;

	/**
	 * Valor booleano que indica cuando el programa ha terminado.
	 */
	private static boolean end = false;

	/**
	 * Objeto de la clase Scanner utilizado para capturar la entrada por teclado del
	 * usuario.
	 */
	private static Scanner sc;

	/**
	 * Método main desde donde se inicia el programa. No utiliza ningún argumento
	 * introducido.
	 * 
	 * @param args Parámetro del método main. No es utilizado.
	 */
	public static void main(String[] args) {
		checker = new StringChecker();
		viewer = new Viewer();
		sc = new Scanner(System.in);
		cadenaOriginal = "";
		viewer.start();
		while (!end) {
			getStringToAnalyze();
			selectOption();
		}
		sc.close();
	}

	/**
	 * Indica al usuario que introduzca una cadena de texto y la captura dentro una
	 * String.
	 */
	public static void getStringToAnalyze() {
		while (cadenaOriginal.length() == 0) {
			viewer.askForString();
			cadenaOriginal = sc.nextLine();
		}
	}

	/**
	 * Muestra al usuario el menú de opciones y recoge la opción elegida por el
	 * usuario.
	 */
	public static void selectOption() {
		viewer.showMenu();
		String option = "";
		option = sc.nextLine();
		switch (option) {
		case "1":
			countChars();
			break;
		case "2":
			countWords();
			break;
		case "3":
			countCharRepetition();
			break;
		case "4":
			countChars();
			countWords();
			countCharRepetition();
			break;
		case "5":
			setStringToEmpty();
			break;
		case "6":
			endProgram();
			break;
		default:
			viewer.showErrorMessage();
		}

	}

	/**
	 * Muestra el mensaje de cierre del programa y cambia el valor del booleano end
	 * a true;
	 */
	private static void endProgram() {
		viewer.showExitMessage();
		end = true;
	}

	/**
	 * Resetea el valor de la variable cadenaOriginal a vacía. Utilizado cuando el
	 * usuario elige introducir una nueva cadena de texto.
	 */
	private static void setStringToEmpty() {
		cadenaOriginal = "";
	}

	/**
	 * Método que analiza cuantas veces se repite cada carácter en la cadena de
	 * texto y lo muestra en pantalla.
	 */
	private static void countCharRepetition() {
		HashMap<Character, Integer> map = checker.contarTodosCaracteres(cadenaOriginal);
		viewer.textoTodosCaracteres(cadenaOriginal, map);
	}

	/**
	 * Método que cuenta cuantas palabras tiene la cadena de texto y lo muetsra en
	 * pantalla. Por palabra se entiende cualquier carácter o grupo de caracteres
	 * separado por espacios en blanco.
	 */
	private static void countWords() {
		int palabras = checker.contarNumeroPalabras(cadenaOriginal);
		viewer.textoNumeroPalabras(cadenaOriginal, palabras);
	}

	/**
	 * Cuenta el número total de caracteres que tiene la cadena de texto.
	 */
	private static void countChars() {
		int total = checker.contarNumeroCaracteres(cadenaOriginal);
		viewer.textoCaracteresTotal(cadenaOriginal, total);
	}

}
