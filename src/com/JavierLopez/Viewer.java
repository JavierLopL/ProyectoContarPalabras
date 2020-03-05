package com.JavierLopez;

import java.util.HashMap;

public class Viewer {
	
	public void showMenu () {
		System.out.println("Selecciona una opción: ");
		System.out.println("[1] Contar el número de caracteres");
		System.out.println("[2] Contar el número de palabras");
		System.out.println("[3] Contar cuantas veces se repite cada carácter");
		System.out.println("[4] Análisis completo");
		System.out.println("[5] Salir del programa");
	}
	
	public static String textoCaracteresTotal(int total) {
		String cadenaTotal = String.valueOf(total);
		return cadenaTotal;
	}

	public static String textoNumeroPalabras(int total) {
		String numPalabras = String.valueOf(total);
		return numPalabras;
	}

	public static String textoTodosCaracteres(HashMap<Character, Integer> map) {
		String resultado = "";
		for (Character key : map.keySet()) {
			resultado = resultado + key + ": " + map.get(key) + "\n";
		}
		return resultado;
	}

	public void start() {
		System.out.println("Bienvenido a String Analyzer 0.3");
	}
	
	public void askForString() {
		System.out.println("Introduce una cadena para analizar:");
		System.out.print(">");
	}

	public void showErrorMessage() {
		System.out.println("Lo siento, no he podido entenderte.");		
	}
}
