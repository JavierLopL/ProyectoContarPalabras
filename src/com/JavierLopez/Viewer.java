package com.JavierLopez;

import java.util.HashMap;

public class Viewer {

	public void showMenu() {
		System.out.println("Selecciona una opción: ");
		System.out.println("[1] Contar el número total de caracteres");
		System.out.println("[2] Contar el número de palabras");
		System.out.println("[3] Contar cuantas veces se repite cada carácter");
		System.out.println("[4] Análisis completo");
		System.out.println("[5] Salir del programa");
	}

	public void textoCaracteresTotal(String cadena, int total) {
		System.out.println("El número de caracteres en el texto '" + cadena + "' es: " + total + "\n");
	}

	public void textoNumeroPalabras(String cadena, int total) {
		System.out.println("El número de palabras en el texto '" + cadena + "' es: " + total + "\n");
	}

	public void textoTodosCaracteres(String cadena, HashMap<Character, Integer> map) {
		String resultado = "";
		for (Character key : map.keySet()) {
			resultado = resultado + key + ": " + map.get(key) + "\n";
		}
		System.out.println("La recurrencia de caracteres en el texto '" + cadena + "' es: \n" + resultado + "\n");
	}

	public void start() {
		System.out.println("Bienvenido a String Analyzer 0.3");
	}

	public void askForString() {
		System.out.println("Introduce una cadena de texto para analizar:");
		System.out.print(">");
	}

	public void showErrorMessage() {
		System.out.println("Lo siento, no he podido entenderte.");
	}
}
