package com.JavierLopez;

import java.util.Scanner;

public class Controlller {
	
	private static String cadenaOriginal;

	public static void main(String[] args) {
		cadenaOriginal = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una cadena:");
		cadenaOriginal = sc.nextLine();
		System.out.println("Cadena Original: " + cadenaOriginal);

	}

}
