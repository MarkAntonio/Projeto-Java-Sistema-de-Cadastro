package app;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import controller.CadastrarController;
import controller.ChaveAcessoController;
import controller.LoginController;
import controller.MenuController;
import model.BaseDados;
import view.CadastrarView;
import view.ChaveAcessoView;
import view.LoginView;
import view.MenuView;

public class App {

	public static void main(String[] args) {
	try {
		UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
			| UnsupportedLookAndFeelException e) {
		e.printStackTrace();
	}
	
	BaseDados.createBase();

	MenuView menuView = new MenuView();
	LoginView loginView = new LoginView();
	CadastrarView cadastrarView = new CadastrarView();
	ChaveAcessoView chaveAcessoView = new ChaveAcessoView();
	
	MenuController menuController = new MenuController(menuView, cadastrarView, loginView, chaveAcessoView);
	LoginController loginController = new LoginController(loginView, menuController);
	CadastrarController cadastrarController = new CadastrarController(cadastrarView);
	ChaveAcessoController chaveAcessoController = new ChaveAcessoController(menuController, chaveAcessoView);
	}

}
