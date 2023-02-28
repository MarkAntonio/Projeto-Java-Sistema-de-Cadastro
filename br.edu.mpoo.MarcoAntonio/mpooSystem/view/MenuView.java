package view;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MenuView extends JFrame{
	private JButton cadastrarButton, sairButton, logarButton;
	private JLabel imageLabel;
	
	public MenuView() {
		setLayout(new FlowLayout());
		setSize(210, 140);
		setLocationRelativeTo(null);
		setUndecorated(true);
		imageLabel = new JLabel(new ImageIcon("image/logo.png"));
		logarButton = new JButton("Logar");
		cadastrarButton = new JButton("Cadastrar");
		sairButton = new JButton("Sair");
		
		add(imageLabel);
		add(logarButton);
		add(cadastrarButton);
		add(sairButton);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public JButton getCadastrarButton() {
		return cadastrarButton;
	}

	public JButton getSairButton() {
		return sairButton;
	}

	public JButton getLogarButton() {
		return logarButton;
	}
}
