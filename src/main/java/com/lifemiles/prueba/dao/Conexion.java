package com.lifemiles.prueba.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

import com.lifemiles.prueba.hook.MyHook;

public class Conexion {

	public static Connection conexion = null;

	public static Connection getConexion() {
		try {
			if (conexion == null) {
				Runtime.getRuntime().addShutdownHook(new MyHook());
				ResourceBundle rb = ResourceBundle.getBundle("application");
				String driver = rb.getString("driver");
				String url = rb.getString("url");
				String user = rb.getString("user");
				String password = rb.getString("password");

				Class.forName(driver);
				conexion = DriverManager.getConnection(url, user, password);
				//se debera verificar si se realiza la consulta si es asi llamar al metodo commit en la clase cliente sino el metodo rollback
				conexion.setAutoCommit(false);
			}
			return conexion;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error al crear conexion!", e);
		}
	}
}
