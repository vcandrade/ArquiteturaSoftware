package service;

import entity.UsuarioEntity;
import model.UsuarioModel;

public class UsuarioService {
	
	private UsuarioModel usuarioModel;
	
	public UsuarioService() {

		this.usuarioModel = new UsuarioModel();
	}

	public boolean inserirUsuario(UsuarioEntity usuarioEntity) {
		
		if(usuarioEntity.getIdade() >= 18) {
			
			String sql = "insert into Usuario (nome, idade) values ('" + usuarioEntity.getNome() + "', '" + usuarioEntity.getIdade() + "');";
			return this.usuarioModel.inserirUsuario(sql);
		
		} else {
			
			return false;
		}
	}
}
