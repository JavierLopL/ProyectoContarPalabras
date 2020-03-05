package com.JavierLopez;

import java.util.HashMap;
import java.util.Scanner;

public class Controlller {

	private static String cadenaOriginal;

	private static StringChecker checker;

	private static Viewer viewer;

	private static boolean end = false;

	private static Scanner sc;

	public static void main(String[] args) {
		checker = new StringChecker();
		viewer = new Viewer();
		sc = new Scanner(System.in);
		cadenaOriginal = "";
		viewer.start();
		while (!end) {
			getString();
			selectOption();
		}
		sc.close();
	}

	public static void getString() {
		while (cadenaOriginal.length() == 0) {
			viewer.askForString();
			cadenaOriginal = sc.nextLine();
		}
	}

	public static void selectOption() {
		viewer.showMenu();
		String option = "";
		option = sc.nextLine();
		switch (option) {
		case "1":
			countChars(cadenaOriginal);
			break;
		case "2":
			countWords(cadenaOriginal);
			break;
		case "3":
			countCharRepetition(cadenaOriginal);
			break;
		case "4":
			countChars(cadenaOriginal);
			countWords(cadenaOriginal);
			countCharRepetition(cadenaOriginal);
			break;
		case "5":
			break;
		default:
			viewer.showErrorMessage();
		}

	}

	private static void countCharRepetition(String cadena) {
		HashMap<Character, Integer> map = checker.contarTodosCaracteres(cadena);
		viewer.textoTodosCaracteres(cadena, map);
	}

	private static void countWords(String cadena) {
		int palabras = checker.contarNumeroPalabras(cadena);
		viewer.textoNumeroPalabras(cadena, palabras);
	}

	private static void countChars(String cadena) {
		int total = checker.contarCaracteresTotal(cadena);
		viewer.textoCaracteresTotal(cadena, total);
	}

}
