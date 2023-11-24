package com.mycompany.universidade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Aluno {
	private int id_aluno;
	private String nome_aluno;
	private int ra_aluno;
	private int telefone_aluno;

	public void inserir() throws SQLException{
		// comando sql a ser executado

		String sql = "INSERT INTO aluno(ra_aluno, telefone_aluno, nome_aluno) values (?, ?, ?)";
		// Abrir uma conexão
		ConnectionFactory factory = new ConnectionFactory();
		try(Connection con = factory.obtemConexao()) {

			// Preparar = comando SQL
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, getRa_aluno());
			ps.setInt(2, getTelefone_aluno());
			ps.setInt(3, getNome_aluno());
			ps.execute();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
}
