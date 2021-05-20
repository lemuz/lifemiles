package com.lifemiles.prueba;

import java.util.Scanner;

public class MainClass {
	
	private char[] diccionarioEncoderBacedifogu = { '1', '0', '2', '4', '3', '6', '8', 'h', 'i', 'j', 'k', 'l',
			'm', 'n', '7', 'p', 'q', 'r', 's', 't', '9', 'v', 'w', 'x',
			'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
			',', '.', '?' };
	
	private String[] diccionarioEncodeMorse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
			".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
			"...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
			"..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
			"-----", "--..--", ".-.-.-", "..--.." };
	 
	Encoder encoder;

	public void main(String[] args) {
		System.out.println("Ingrese la unidad a la que pertenece: ");
		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion = sn.nextInt();
		

	}
}
