package Passenger;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import PassengerBilling.PassengerBilling;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Passengerinformation {

	private JFrame frame;
	private JTextField txtFristName;
	private JTextField txtSurname;
	private JTextField txtAddress;
	private JTextField txtIDNumber;
	private JTextField txtTelephone;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Passengerinformation window = new Passengerinformation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Passengerinformation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(100, 100, 854, 512);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtFristName = new JTextField();
		txtFristName.setBounds(168, 77, 272, 38);
		frame.getContentPane().add(txtFristName);
		txtFristName.setColumns(10);
		
		JLabel lblFristName = new JLabel("Frist Name");
		lblFristName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFristName.setBounds(33, 75, 164, 38);
		frame.getContentPane().add(lblFristName);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSurname.setBounds(33, 122, 164, 38);
		frame.getContentPane().add(lblSurname);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddress.setBounds(33, 173, 164, 38);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblIDNumber = new JLabel("ID Number");
		lblIDNumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblIDNumber.setBounds(33, 224, 164, 38);
		frame.getContentPane().add(lblIDNumber);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTelephone.setBounds(33, 275, 164, 38);
		frame.getContentPane().add(lblTelephone);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEmail.setBounds(33, 326, 164, 38);
		frame.getContentPane().add(lblEmail);
		
		txtSurname = new JTextField();
		txtSurname.setColumns(10);
		txtSurname.setBounds(168, 128, 272, 38);
		frame.getContentPane().add(txtSurname);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(168, 173, 272, 38);
		frame.getContentPane().add(txtAddress);
		
		txtIDNumber = new JTextField();
		txtIDNumber.setColumns(10);
		txtIDNumber.setBounds(168, 224, 272, 38);
		frame.getContentPane().add(txtIDNumber);
		
		txtTelephone = new JTextField();
		txtTelephone.setColumns(10);
		txtTelephone.setBounds(168, 275, 272, 38);
		frame.getContentPane().add(txtTelephone);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(168, 326, 272, 38);
		frame.getContentPane().add(txtEmail);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(12, 13, 812, 51);
		frame.getContentPane().add(panel);
		
		JLabel lblPassengerInformation = new JLabel("Passenger Information");
		lblPassengerInformation.setFont(new Font("Times New Roman", Font.BOLD, 40));
		panel.add(lblPassengerInformation);
		
		JButton btncontinuation = new JButton("continuation");
		btncontinuation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PassengerBilling info =new PassengerBilling();
				PassengerBilling.main(null);
			}
		});
		btncontinuation.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btncontinuation.setBounds(486, 397, 174, 38);
		frame.getContentPane().add(btncontinuation);
		
		JButton btnSave = new JButton("Save");
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 22));
		btnSave.setBounds(186, 397, 174, 38);
		frame.getContentPane().add(btnSave);
	}

}
