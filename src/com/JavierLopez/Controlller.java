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

	private static void endProgram() {
		viewer.showExitMessage();
		end = true;
	}

	private static void setStringToEmpty() {
		cadenaOriginal = "";
	}

	private static void countCharRepetition() {
		HashMap<Character, Integer> map = checker.contarTodosCaracteres(cadenaOriginal);
		viewer.textoTodosCaracteres(cadenaOriginal, map);
	}

	private static void countWords() {
		int palabras = checker.contarNumeroPalabras(cadenaOriginal);
		viewer.textoNumeroPalabras(cadenaOriginal, palabras);
	}

	private static void countChars() {
		int total = checker.contarCaracteresTotal(cadenaOriginal);
		viewer.textoCaracteresTotal(cadenaOriginal, total);
	}

}
