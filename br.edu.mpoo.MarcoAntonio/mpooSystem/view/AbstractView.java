package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public abstract class AbstractView extends JFrame{
	private JLabel loginLabel, senhaLabel;
	private JPasswordField senhaField;
	private JTextField loginField;
	private JButton addButton, sairButton;
	
	public AbstractView() {
		loginLabel = new JLabel("Login:");
		senhaLabel = new JLabel("Senha:");
		loginField = new JTextField(10);
		senhaField = new JPasswordField(10);
		addButton = new JButton("Add");
		sairButton = new JButton("Sair");
	}

	public JLabel getLoginLabel() {
		return loginLabel;
	}

	public JLabel getSenhaLabel() {
		return senhaLabel;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}

	public JPasswordField getSenhaField() {
		return senhaField;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}
	
}
