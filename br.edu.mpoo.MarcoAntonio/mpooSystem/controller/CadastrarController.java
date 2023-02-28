package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.BaseDados;
import model.Mensagem;
import model.Usuario;
import view.CadastrarView;
import view.MensagemView;

public class CadastrarController {
	private ButtonHandler buttonHandler;
	private CadastrarView cadastrarView;

	public CadastrarController(CadastrarView cadastrarView) {
		this.cadastrarView = cadastrarView;
		buttonHandler = new ButtonHandler();
		control();
	}

	public void control() {
		cadastrarView.getAddButton().addActionListener(buttonHandler);
		cadastrarView.getSairButton().addActionListener(buttonHandler);
		cadastrarView.getMasculinoButton().addActionListener(buttonHandler);
		cadastrarView.getFemininoButton().addActionListener(buttonHandler);
	}

	private class ButtonHandler implements ActionListener {
		String sexo;

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == cadastrarView.getMasculinoButton())
				sexo = "Masculino";
			if (e.getSource() == cadastrarView.getFemininoButton())
				sexo = "Feminino";
			if (e.getSource() == cadastrarView.getAddButton()) {
				addButtonContext();
			}

			else if (e.getSource() == cadastrarView.getSairButton()) {
				cadastrarView.setVisible(false);
			}

		}

		private void addButtonContext() {
			String nome, login, cpf, senha;
			nome = cadastrarView.getNomeField().getText();
			login = cadastrarView.getLoginField().getText();
			cpf = cadastrarView.getCpfField().getText();
			senha = cadastrarView.getSenhaField().getText();

			if (!nome.equalsIgnoreCase("") && !cpf.equalsIgnoreCase("") && !login.equalsIgnoreCase("")
					&& !senha.equalsIgnoreCase("")
							&& BaseDados.adicionarPessoa(new Usuario(nome, cpf, sexo, login, senha)))
				MensagemView.exibirMensagem(Mensagem.USUARIO_SUCESS);
			else
				MensagemView.exibirMensagem(Mensagem.USUARIO_ERROR);
		}

	}
}
