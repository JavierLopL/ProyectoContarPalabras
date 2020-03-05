package com.JavierLopez;

import java.util.HashMap;

/**
 * Clase que analiza la cadena de texto introducida por el usuario.
 * 
 * @author Javier Lopez Lumbreras
 * @version 0.3
 *
 */
public class StringChecker {

	/**
	 * Método que cuenta el número de caracteres en una cadena de texto introducida
	 * por el usuario. El método eliminará todos los espacios en blanco (es decir,
	 * un espacio en blanco no cuenta como carácter). El método contará también los
	 * caracteres que se repitan.
	 * 
	 * @param cadena Cadena de texto (String) introducida por el usuario.
	 * @return Cantidad total de caracteres en la cadena de texto.
	 */
	public int contarNumeroCaracteres(String cadena) {
		String palabrasJuntas = cadena.replaceAll("\\s+", "");
		return palabrasJuntas.length();
	}

	/**
	 * Método que cuenta el número de palabras en una cadena de texto introducida
	 * por el usuario. Como palabra se entiende cualquier caracter o grupo de
	 * caracteres que esté separado por espacios en blanco.
	 * 
	 * @param cadena Cadena de texto (String) introducida por el usuario.
	 * @return Cantidad total de palabras en la cadena de texto.
	 */
	public int contarNumeroPalabras(String cadena) {
		String[] palabras = cadena.split("\\s+");
		return palabras.length;
	}

	/**
	 * Método que cuenta el número de repeticiones de cada carácter diferente en la
	 * cadena de texto introducida por el usuario. Retorna un HashMap donde la clave
	 * es el carácter y el valor el número de veces que se repite ese carácter
	 * 
	 * @param cadena Cadena de texto (String) introducida por el usuario.
	 * @return HasMap con los caracteres de la cadena de texto y el número de veces
	 *         que se repite cada uno.
	 */
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
