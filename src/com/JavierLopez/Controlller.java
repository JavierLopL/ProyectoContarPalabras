package com.JavierLopez;

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
		while(!end) {
			getString();
			selectOption();
		}	
		sc.close();
	}
	
	public static void getString() {
		while(cadenaOriginal.length()==0) {
			viewer.askForString();
			cadenaOriginal = sc.nextLine();
		}
	}
	
	public static void selectOption() {
		viewer.showMenu();
		String option ="";
		option = sc.nextLine();
		switch (option) {
		case "1":
			break;
		case "2":
			break;
		case "3":
			break;
		case "4":
			break;
		case "5":
			break;
		default:
			viewer.showErrorMessage();
		}
		
	}

}
