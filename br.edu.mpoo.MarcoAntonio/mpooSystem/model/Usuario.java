package model;

public class Usuario extends Pessoa {
	public String login;
	private String senha;

	public Usuario(String nome, String cpf, String sexo, String login, String senha) {
		super(nome, cpf, sexo);
		this.login = login;
		this.senha = senha;
	}

	public Usuario(String nome,String cpf,  String login, String senha) {
		super(nome, cpf);
		this.login = login;
		this.senha = senha;
	}

	public String getSenha() {
		return senha;
	}

	@Override
	public String toString() {
		return super.toString() + ", login=" + login + "]";
	}

}
