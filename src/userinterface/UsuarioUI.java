package userinterface;

import java.util.Scanner;

import entity.UsuarioEntity;
import service.UsuarioService;

public class UsuarioUI {

	private Scanner input = new Scanner(System.in);
	private UsuarioService usuarioService = new UsuarioService();
	
	public void inserirUsuario() {
		
		System.out.print("Informe o nome do usuário: ");
		String nome = input.nextLine();
		
		System.out.print("Informe a idade do usuário: ");
		int idade = input.nextInt();
		
		UsuarioEntity usuarioEntity = new UsuarioEntity(nome, idade);
		
		if(this.usuarioService.inserirUsuario(usuarioEntity)) {
			
			System.out.println("Usuário cadastrado com sucesso.");
	
		} else {
			
			System.out.println("erro ao cadastrar um usuário.");
		}
	}
	
	public static void main(String[] args) {
		
		new UsuarioUI().inserirUsuario();
	}
}








