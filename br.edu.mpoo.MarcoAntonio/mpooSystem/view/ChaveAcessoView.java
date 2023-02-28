package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ChaveAcessoView extends JFrame{
	private JLabel chaveAcessoLabel;
	private JPasswordField chaveAcessoField;
	private JButton validarButton;
	
	public ChaveAcessoView() {
		super("Chave");
		setLayout(new FlowLayout());
		setSize(200, 140);
		setLocationRelativeTo(null);
		
		chaveAcessoLabel = new JLabel("ChaveAcesso");
		chaveAcessoField = new JPasswordField(10);
		validarButton = new JButton("Validar");
		
		add(chaveAcessoLabel);
		add(chaveAcessoField);
		add(validarButton);
		
	}

	public JTextField getChaveAcessoField() {
		return chaveAcessoField;
	}

	public JButton getValidarButton() {
		return validarButton;
	}
}
