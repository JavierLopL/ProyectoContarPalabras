package com.JavierLopez;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class inicioApp {

	private static int totalCaracteres;
	private static int numeroPalabras;

	private static String cadenaOriginal;

	public static void main(String[] args) {
		cadenaOriginal = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena:");
		cadenaOriginal = sc.nextLine();
		System.out.println("Cadena Original: " + cadenaOriginal);
		// mostrarResultado();

		totalCaracteres = contarCaracteresTotal(cadenaOriginal);
		System.out.println("Caracteres Totales: " + textoCaracteresTotal(totalCaracteres));

		numeroPalabras = contarNumeroPalabras(cadenaOriginal);
		System.out.println("Número de Palabras: " + textoNumeroPalabras(numeroPalabras));

		HashMap<Character, Integer> map = contarTodosCaracteres(cadenaOriginal);
		System.out.println(textoTodosCaracteres(map));

		sc.close();
	}

	private static int contarCaracteresTotal(String cadena) {
		String palabrasJuntas = cadena.replaceAll("\\s+", "");
		return palabrasJuntas.length();
	}

	private static int contarNumeroPalabras(String cadena) {
		String[] palabras = cadena.split("\\s+");
		return palabras.length;
	}

	private static HashMap<Character, Integer> contarTodosCaracteres(String cadena) {
		HashMap<Character, Integer> map = new HashMap<>();
		String palabrasJuntas = cadena.replaceAll("\\s+", "");
		for (int i = 0; i < palabrasJuntas.length(); i++) {
			Character key = palabrasJuntas.charAt(i);
			if (!map.containsKey(key))
				map.put(key, 1);
			else
				map.put(key, map.get(key) + 1);
		}
		return map;
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
