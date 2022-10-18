package service;

import entity.UsuarioEntity;
import model.UsuarioModel;

public class UsuarioService {

	private UsuarioModel usuarioModel;
		
	public UsuarioService() {

		this.usuarioModel = new UsuarioModel();
	}

	public boolean inserirUsuario(UsuarioEntity usuarioEntity) {

		if (usuarioEntity.getIdade() >= 18) {

			String sql = "insert into Usuario (nome, idade) values ('" + usuarioEntity.getNome() + "', '"
					+ usuarioEntity.getIdade() + "');";
			return this.usuarioModel.inserirUsuario(sql);

		} else {

			return false;
		}
	}

	public UsuarioEntity realizarLogin(String username, String password) {

		// busca em um vetor de usuários para obtero login e senha
		String nome = "João da Silva";
		int idade = 30;
		String nomeUsuario = "joaosilva";
		String senhaUsuario = "abc123";

		if (username.equals(nomeUsuario) && password.equals(senhaUsuario)) {

			return new UsuarioEntity(nome, username, password, idade);

		} else {

			return null;
		}
	}
}
