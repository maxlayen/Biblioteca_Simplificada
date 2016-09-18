package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class UILogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UILogin frame = new UILogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UILogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(1, 1, 1, 1));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel offlane = new JPanel();
		contentPane.add(offlane);
		
		JPanel mid = new JPanel();
		contentPane.add(mid);
		mid.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		mid.add(panel_1);
		
		JLabel lblEmail = new JLabel("E-mail:");
		panel_1.add(lblEmail);
		
		textField = new JTextField();
		panel_1.add(textField);
		textField.setColumns(8);
		
		JPanel panel_2 = new JPanel();
		mid.add(panel_2);
		
		JLabel lblSenha = new JLabel("Senha:");
		panel_2.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(8);
		panel_2.add(passwordField);
		
		JPanel panel = new JPanel();
		mid.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JButton btnEntrar = new JButton("Entrar");
		panel.add(btnEntrar);
	}

}
