package model;

public class UsuarioModel {

	private Conexao conexao;

	public UsuarioModel() {

		this.conexao = new Conexao();
	}

	public boolean inserirUsuario(String sql) {

		try {
			
			this.conexao.conectar();
			System.out.println("Executando a sql: " + sql);
			this.conexao.desconectar();
			
			return true;
			
		} catch(Exception e) {
			
			return false;
		}
	}
}
