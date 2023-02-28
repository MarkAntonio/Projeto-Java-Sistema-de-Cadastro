package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Pessoa> pessoas;

	public static void createBase() {
		inicializarBase();
	}

	private static void inicializarBase() {
		pessoas = new ArrayList<Pessoa>();
		adicionarPessoa(
				new Administrador("Godofredo Silva", "358.251.830-27", "Masculino", "admin", "admin", "ADMIN001"));
		adicionarPessoa(new Usuario("Maria Silva", "833.533.163-34", "Feminino", "mariasilva", "mAriA"));
		adicionarPessoa(new Usuario("Jo�o Silva", "833.533.163-34", "Masculino", "joaoSilva", "joaoSilva"));
		adicionarPessoa(new Usuario("Jos� Santos", "123.456.789-00", "Masculino", "joseSanto", "joseSanto"));
	}

	private static Pessoa buscarPessoa(String cpf) {
		if (cpf == null)
			return null;
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getCpf().equals(cpf))
				return pessoa;
		}
		return null;
	}

	public static boolean isPessoa(Pessoa pessoa) {
		return pessoas.contains(buscarPessoa(pessoa.getCpf()));
	}

	public static boolean isUsuario(String login, String senha) {
		if (login == null || senha == null)
			return false;
		for (Pessoa pessoa : pessoas) {
			if (pessoa instanceof Usuario)
				if (((Usuario) pessoa).login.equalsIgnoreCase(login) && ((Usuario) pessoa).getSenha().equals(senha))
					return true;
		}
		return false;
	}

	public static boolean isUsuario(Usuario usuario) {
		if (usuario instanceof Usuario)
			return isUsuario(usuario.login, usuario.getSenha());
		return false;
	}

	public static boolean isAdmin(String chaveAcesso) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa instanceof Administrador)
				if (((Administrador) pessoa).getChaveAcesso().equals(chaveAcesso));
					return true;
		}
		return false;
	}

	public static boolean adicionarPessoa(Pessoa pessoa) {
		if (pessoa == null)
			return false;
		if (ValidadorCPF.validarCPF(pessoa.getCpf()))
			if (!isPessoa(pessoa))
				return pessoas.add(pessoa);

		return false;
	}

	public static boolean removerPessoa(Pessoa pessoa) {
		return pessoas.remove(buscarPessoa(pessoa.getCpf()));
	}

	public static ArrayList<String> listPessoas() {
		ArrayList<String> usuarios = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			usuarios.add(pessoa.toString());
		}
		return usuarios;
	}

	public static ArrayList<String> listUsuarios() {
		ArrayList<String> usuarios = new ArrayList<>();
		for (Pessoa pessoa : pessoas) {
			if (pessoa instanceof Usuario)
				usuarios.add(pessoa.toString());
		}
		return usuarios;
	}

}
