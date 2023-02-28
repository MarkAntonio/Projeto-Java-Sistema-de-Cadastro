package model;

public abstract class Pessoa {
	public String nome;
	private String cpf;
	protected String sexo;

	public Pessoa(String nome, String cpf, String sexo) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.sexo = sexo;
	}

	public Pessoa(String nome, String cpf) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + "[cpf=" + cpf + ", nome=" + nome + ", sexo=" + sexo;
	}

}
