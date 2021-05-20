package com.lifemiles.prueba.hook;

import java.sql.Connection;

import com.lifemiles.prueba.dao.Conexion;
//clase gancho cierra la conexion cuando 
//se termina el hilo del programa
public class MyHook extends Thread{
	public void run() {
		try {
			Connection con = Conexion.getConexion();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}