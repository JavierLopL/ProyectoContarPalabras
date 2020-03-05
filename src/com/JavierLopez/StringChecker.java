package com.JavierLopez;

import java.util.HashMap;

public class StringChecker {

	public int contarNumeroCaracteres(String cadena) {
		String palabrasJuntas = cadena.replaceAll("\\s+", "");
		return palabrasJuntas.length();
	}

	public int contarNumeroPalabras(String cadena) {
		String[] palabras = cadena.split("\\s+");
		return palabras.length;
	}

	public HashMap<Character, Integer> contarTodosCaracteres(String cadena) {
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

}
