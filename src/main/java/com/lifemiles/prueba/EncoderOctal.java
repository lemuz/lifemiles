package com.lifemiles.prueba;

public class EncoderOctal extends Encoder{
	

	public String hola(String mensaje) {
		String[] chars = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
				"m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
				"y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
				",", ".", "?" };
		String mensajeCodificado="";
		for(int index =0; index<chars.length; index++) {
			int decimal = (char)chars[index];
			chars[index] = Integer.toOctalString(decimal);
		}
		return mensajeCodificado;
	}

}
