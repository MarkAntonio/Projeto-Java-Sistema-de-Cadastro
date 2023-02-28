package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CadastrarView;
import view.ChaveAcessoView;
import view.LoginView;
import view.MenuView;

public class MenuController implements ActionListener{
	private MenuView menuView;
	private CadastrarView cadastrarView;
	private LoginView loginView;
	private ChaveAcessoView chaveAcessoView;
	private boolean isAdminOn = false;
	private boolean isChaveOk = false;


	
	public MenuController(MenuView menuView, CadastrarView cadastrarView, LoginView loginView, ChaveAcessoView chaveAcessoView) {
		super();
		this.menuView = menuView;
		this.cadastrarView = cadastrarView;
		this.loginView = loginView;
		this.chaveAcessoView = chaveAcessoView;	
		control();
	}

	public void control() {
		menuView.getLogarButton().addActionListener(this);
		menuView.getCadastrarButton().addActionListener(this);
		menuView.getSairButton().addActionListener(this);
	}

	public boolean isAdminOn() {
		return isAdminOn;
	}

	public void setAdminOn(boolean isAdminOn) {
		this.isAdminOn = isAdminOn;
	}

	public boolean isChaveOk() {
		return isChaveOk;
	}

	public void setChaveOk(boolean isChaveOk) {
		this.isChaveOk = isChaveOk;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuView.getLogarButton()) {
			loginView.setVisible(true);
		}
		else if(e.getSource() == menuView.getCadastrarButton()) {
			if(isAdminOn)
				if(isChaveOk)
					cadastrarView.setVisible(true);
				else
					chaveAcessoView.setVisible(true);
			else
				loginView.setVisible(true);
		}
		else if(e.getSource() == menuView.getSairButton()) {
			System.exit(0);
		}
		
	}
	
}
