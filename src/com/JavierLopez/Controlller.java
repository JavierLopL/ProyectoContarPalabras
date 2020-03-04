package com.JavierLopez;

import java.util.Scanner;

public class Controlller {
	
	private static String cadenaOriginal;
	
	private static StringChecker checker;

	public static void main(String[] args) {
		cadenaOriginal = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena:");
		cadenaOriginal = sc.nextLine();
		//System.out.println("Elige que quieres hacer:");
		System.out.println("Cadena Original: " + cadenaOriginal);
		checker = new StringChecker();
		
		
		sc.close();
	}

}
