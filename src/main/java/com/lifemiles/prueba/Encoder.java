package com.lifemiles.prueba;

public abstract class Encoder {
	
	public String metodo;
	
//	public Encoder(char[] diccionario) {
//		this.diccionario=diccionario;
//	}
	
	protected char[] diccionario;
	
	protected char[] diccionarioNormal = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
			'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
			'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
			',', '.', '?' };
	
	public String encode(String mensaje) {
		mensaje = mensaje.toLowerCase();
		String mensajeCodificado = "";
		System.out.println(mensaje);
		char[] chars = mensaje.toCharArray();
		for (int index = 0; index < mensaje.length(); index++) {
			for (int i = 0; i < diccionarioNormal.length; i++) {
				if (chars[index] == diccionarioNormal[i]) {
					mensajeCodificado = mensajeCodificado + diccionario[i];
				}
			}
		}
		return mensajeCodificado;
	}

}
