package com.JavierLopez;

import java.util.HashMap;

public class Viewer {
	
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
}
