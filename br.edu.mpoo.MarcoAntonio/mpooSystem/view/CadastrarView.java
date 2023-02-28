package view;

import java.awt.FlowLayout;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.text.MaskFormatter;

import model.SpringUtilities;

public class CadastrarView extends AbstractView {
	private JLabel nomeLabel, cpfLabel;
	private JFormattedTextField cpfField;
	private MaskFormatter mask;
	private JTextField nomeField;
	private JButton addButton, sairButton;
	private JRadioButton masculinoButton, femininoButton;
	private ButtonGroup group;

	
	public CadastrarView() {
		setTitle("Cadastrar");
		setLayout(new SpringLayout());
		setSize(200, 240);
		setLocationRelativeTo(null);

		nomeLabel = new JLabel("Nome:");
		nomeField = new JTextField(10);
		cpfLabel = new JLabel("CPF:");
		
		mask = new MaskFormatter();
		try {
			mask.setMask("###.###.###-##");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cpfField = new JFormattedTextField(mask);

		masculinoButton = new JRadioButton("Masculino", true);
		femininoButton = new JRadioButton("Feminino");
		group = new ButtonGroup();
		group.add(masculinoButton);
		group.add(femininoButton);

		add(nomeLabel);
		add(nomeField);
		add(getLoginLabel());
		add(getLoginField());
		add(cpfLabel);
		add(cpfField);
		add(getSenhaLabel());
		add(getSenhaField());
		add(masculinoButton);
		add(femininoButton);
		add(getSairButton());
		add(getAddButton());
		SpringUtilities.makeGrid(getContentPane(), 6, 2, 5, 5, 5, 5);

	}

	public JTextField getNomeField() {
		return nomeField;
	}

	public JTextField getCpfField() {
		return cpfField;
	}


	public JRadioButton getMasculinoButton() {
		return masculinoButton;
	}

	public JRadioButton getFemininoButton() {
		return femininoButton;
	}
}
