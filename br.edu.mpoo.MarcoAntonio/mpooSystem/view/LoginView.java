package view;

import javax.swing.JButton;
import javax.swing.SpringLayout;

import model.SpringUtilities;

public class LoginView extends AbstractView{

	
	public LoginView() {
		setTitle("Login");
		setLayout(new SpringLayout());
		setSize(210, 150);
		setLocationRelativeTo(null);
		
		setAddButton(new JButton("Entrar"));
		
		add(getLoginLabel());
		add(getLoginField());
		add(getSenhaLabel());
		add(getSenhaField());
		add(getSairButton());
		add(getAddButton());
		SpringUtilities.makeGrid(getContentPane(), 3, 2, 5,5, 5, 5);
		setVisible(false);
	}
}
