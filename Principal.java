package.mycompany.universidade;

import javax.sql.SQLException;
import javax.swing.J0ptionPane;

public class Principal {

	public static void main(String[] args) throws SQLException {
		String menu = "1-Cadastro \n 2-Atualizar \n 3-Apagar \n 4-Listar \n 0-Sair";
		int opcao;
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (opcao) {
				case 1:
					int ra_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite seu RA"));
					int telefone_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone));
					String nome_aluno = JOptionPane.showInputDialog("Digite seu nome");
					Aluno aluno = new Aluno();
					aluno.setRa_aluno(ra_aluno);
					aluno.setTelefone_aluno(telefone_aluno);
					aluno.setNome_aluno(nome_aluno);
					aluno.inserir();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção Inválida");
			}
		}while(opcao !=0);
	}
}
