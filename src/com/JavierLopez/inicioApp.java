package com.JavierLopez;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class inicioApp {

	private static int totalCaracteres;
	private static int numeroPalabras;

	

	public static void main(String[] args) {
		
		// mostrarResultado();

		totalCaracteres = contarCaracteresTotal(cadenaOriginal);
		System.out.println("Caracteres Totales: " + textoCaracteresTotal(totalCaracteres));

		numeroPalabras = contarNumeroPalabras(cadenaOriginal);
		System.out.println("Número de Palabras: " + textoNumeroPalabras(numeroPalabras));

		HashMap<Character, Integer> map = contarTodosCaracteres(cadenaOriginal);
		System.out.println(textoTodosCaracteres(map));

		
	}

	

	

	

	static String textoCaracteresTotal(int total) {
		String cadenaTotal = String.valueOf(total);
		return cadenaTotal;
	}

	static String textoNumeroPalabras(int total) {
		String numPalabras = String.valueOf(total);
		return numPalabras;
	}

	static String textoTodosCaracteres(HashMap<Character, Integer> map) {
		String resultado = "";
		for (Character key : map.keySet()) {
			resultado = resultado + key + ": " + map.get(key) + "\n";
		}
		return resultado;
	}

}
