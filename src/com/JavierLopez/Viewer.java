package com.JavierLopez;

import java.util.HashMap;

/**
 * @author Javier Lopez Lumbreras
 * @version 0.3
 * 
 *          Clase que muestra al usuario los menús y mensaje en pantalla, junto
 *          con los resultados de los diferentes análisis de la cadena de texto.
 *
 */
public class Viewer {

	/**
	 * Muestra al usuario un menú de opciones.
	 */
	public void showMenu() {
		System.out.println("Introduce un número para seleccionar una opción: ");
		System.out.println("[1] Contar el número total de caracteres");
		System.out.println("[2] Contar el número de palabras");
		System.out.println("[3] Contar cuantas veces se repite cada carácter");
		System.out.println("[4] Análisis completo");
		System.out.println("[5] Introducir una nueva frase");
		System.out.println("[6] Salir del programa");
	}

	/**
	 * Muestra el número total de caracteres de la cadena de texto.
	 * 
	 * @param cadena Cadena de texto original introducida por el usuario.
	 * @param total  El número total de caracteres de la cadena.
	 */
	public void textoCaracteresTotal(String cadena, int total) {
		System.out.println("El número de caracteres en el texto '" + cadena + "' es: " + total + "\n");
	}

	/**
	 * Muetsra el número de palabras de la cadena de texto.
	 * 
	 * @param cadena Cadena de texto original introducida por el usuario.
	 * @param total  El número total de palabras de la cadena.
	 */
	public void textoNumeroPalabras(String cadena, int total) {
		System.out.println("El número de palabras en el texto '" + cadena + "' es: " + total + "\n");
	}

	/**
	 * @param cadena Cadena de texto original introducida por el usuario.
	 * @param map    HashMap <Character, Integer> que como clave contiene los
	 *               caracteres de la cadena y como valor el número de veces que se
	 *               repite ese carácter.
	 */
	public void textoTodosCaracteres(String cadena, HashMap<Character, Integer> map) {
		String resultado = "";
		for (Character key : map.keySet()) {
			resultado = resultado + key + ": " + map.get(key) + "\n";
		}
		System.out.println("La recurrencia de caracteres en el texto '" + cadena + "' es: \n" + resultado);
	}

	/**
	 * Muestra un mensaje de bienevenida al iniciar el programa.
	 */
	public void start() {
		System.out.println("¡Bienvenido a String Analyzer 0.3! \n");
	}

	/**
	 * Muestra un mensaje indicando al usuario que debe introducir una cadena de texto.
	 */
	public void askForString() {
		System.out.println("Introduce una cadena de texto para analizar:");
		System.out.print(">");
	}

	/**
	 * Muestra un mensaje de error cuando el usuario no introduce una opción válida en el menú del programa.
	 */
	public void showErrorMessage() {
		System.out.println("Lo siento, no he podido entenderte.");
	}

	/**
	 * Muestra un mensaje de despedida al cerrar el programa.
	 */
	public void showExitMessage() {
		System.out.println("¡Adiós!");
	}
}
