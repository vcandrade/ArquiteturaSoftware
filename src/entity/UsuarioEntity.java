package entity;

public class UsuarioEntity {
	
	private String nome;
	private String username;
	private String password;
	private int idade;
	
	public UsuarioEntity(String nome, String username, String password, int idade) {
		
		this.nome = nome;
		this.username = username;
		this.password = password;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
}
