import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import TravellingTicket.Travelling;

import java.awt.Font;
import java.awt.Color;

public class LonginSystem {

	private JFrame frmLoginSystem;
	private JTextField txtUsername;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LonginSystem window = new LonginSystem();
					window.frmLoginSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LonginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginSystem = new JFrame();
		frmLoginSystem.getContentPane().setBackground(new Color(240, 248, 255));
		frmLoginSystem.setBounds(200,200, 809, 431);
		frmLoginSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginSystem.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login Systems");
		lblNewLabel.setFont(new Font("Traditional Arabic", Font.BOLD, 35));
		lblNewLabel.setBounds(248, 13, 282, 41);
		frmLoginSystem.getContentPane().add(lblNewLabel);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblUsername.setBounds(33, 77, 215, 41);
		frmLoginSystem.getContentPane().add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassword.setBounds(33, 138, 215, 48);
		frmLoginSystem.getContentPane().add(lblPassword);
		
		txtUsername = new JTextField();
		txtUsername.setBounds(315, 77, 282, 41);
		frmLoginSystem.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(315, 142, 282, 41);
		frmLoginSystem.getContentPane().add(txtPassword);
		txtPassword.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String password =txtPassword.getText();
				String username =txtUsername.getText();
				if (password.contains("Star")&& username.contains("Noura"))
						txtPassword.setText(null);
						txtUsername.setText(null);
						Travelling info =new Travelling();
						Travelling.main(null);
						
			}
			
			
			 {JOptionPane.showMessageDialog(null, "Invalid login Details","Login Error",JOptionPane.ERROR_MESSAGE);
	txtPassword.setText(null);
	txtUsername.setText(null);}
		
				
		});
		btnLogin.setBounds(33, 272, 160, 41);
		frmLoginSystem.getContentPane().add(btnLogin);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsername.setText(null);
				txtPassword.setText(null);
			}
		});
		btnReset.setBounds(284, 272, 160, 41);
		frmLoginSystem.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmLoginSystem = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frmLoginSystem,"Confirm if you want to exit","Login System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
					}});
		btnExit.setBounds(541, 272, 160, 41);
		frmLoginSystem.getContentPane().add(btnExit);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(33, 240, 704, 2);
		frmLoginSystem.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(47, 56, 678, 2);
		frmLoginSystem.getContentPane().add(separator_1);
	}
}
