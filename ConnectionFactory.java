package com.mycompany.universidade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SOLException;

public class ConnectionFactory (
	public String usuario = "root";
	public String URL = "'jdbo:mysql://localhost:3306/Universidade?useTimezone=true&serverTimezone-UTC";
	public String senha = "usjt";

	public Connection obtemConexao () {
		try {
			Connection con = DriverManager.getConnection(URL, usuario, senha);
			System.out.println(con)
			return con;

		} catch (SQLException ex) {
				ex.printStackTrace();
				return null;
		}
	}
}
