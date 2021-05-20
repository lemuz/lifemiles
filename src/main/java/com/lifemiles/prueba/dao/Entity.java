package com.lifemiles.prueba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

public abstract class Entity<CLASS, ID> {
	protected Connection conexion = null;
	protected ResultSet resultSet = null;
	protected ResultSetMetaData metaData = null;
	protected PreparedStatement preparedStatement= null;
	
	public abstract boolean create(CLASS entidad) throws SQLException;
	
	public abstract CLASS get(ID id)throws SQLException;
	
	public abstract CLASS update(CLASS entidad)throws SQLException;
	
	public abstract boolean delete(ID id)throws SQLException;
	
	public abstract List<CLASS> list() throws SQLException;
	
	public String[] leerResultSet() throws SQLException{
		int cantidad = metaData.getColumnCount();
		String[] columnas = new String[cantidad];
		for(int indice =1; indice<=cantidad; indice++) {
			columnas[indice-1] = metaData.getColumnLabel(indice);
		}
		String[] resultados = new String[cantidad];
		for(int index =0; index < columnas.length; index++) {
			try {
				String valor = resultSet.getString(columnas[index]);
				resultados[index] = valor;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultados;
	}
}