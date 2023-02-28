package view;

import javax.swing.JOptionPane;

public class MensagemView extends JOptionPane{
	public static void exibirMensagem(String mensagem) {
		showMessageDialog(null, mensagem, "Status", INFORMATION_MESSAGE);
	}
}
