package userinterface;

import java.util.Scanner;

import entity.UsuarioEntity;
import service.UsuarioService;

public class UsuarioUI {

	private Scanner input;
	private UsuarioService usuarioService;
	
	public UsuarioUI() {
		
		this.input = new Scanner(System.in);
		this.usuarioService = new UsuarioService();
	}
	
	public void realizarLogin() {
		
		this.input.nextLine();
		
		System.out.print("Informe o username: ");
		String username = input.nextLine();
		
		System.out.print("Informe o password: ");
		String password = input.nextLine();
		
		UsuarioEntity usuarioEntity = usuarioService.realizarLogin(username, password);
		
		if(usuarioEntity != null) {
			
			System.out.println("Login realizado com sucesso.");
		
		} else {
			
			System.out.println("N�o foi poss�vel realizar Login.");
		}
	}
	
	public void inserirUsuario() {
		
		this.input.nextLine();
		
		System.out.print("Informe o nome do usu�rio: ");
		String nome = input.nextLine();
		
		System.out.print("Informe o username: ");
		String username = input.nextLine();
		
		System.out.print("Informe o password: ");
		String password = input.nextLine();
		
		System.out.print("Informe a idade do usu�rio: ");
		int idade = input.nextInt();
		
		UsuarioEntity usuarioEntity = new UsuarioEntity(nome, username, password, idade);
		
		if(this.usuarioService.inserirUsuario(usuarioEntity)) {
			
			System.out.println("Usu�rio cadastrado com sucesso.");
	
		} else {
			
			System.out.println("Erro ao cadastrar um usu�rio.");
		}
	}
	
	public static void main(String[] args) {
		
		UsuarioUI usuarioUI = new UsuarioUI();
		
		System.out.println("1 - Login");
		System.out.println("2 - Inserir Novo Usu�rio");
		System.out.print("Op��o: ");
		int opcao = usuarioUI.input.nextInt();
		
		switch (opcao) {
		case 1: {
			
			usuarioUI.realizarLogin();
			break;
		}
		case 2: {
			
			usuarioUI.inserirUsuario();
			break;
		}
		default:
			System.out.println("Op��o inv�lida.");
		}
	}
}








