package PassengerBilling;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;


public class PassengerBilling extends JFrame {

	protected static final String Total = null;
	private JPanel contentPane;
	private JTextField txtSurname;
	private JTextField txtTelephone;
	private JTextField txtFristName;
	private JTextField txtAddress;
	private JTextField txtEmail;
	private JTextField txtIDNumber;
	private JTextField txtPassengerRef;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtTax;
	private JFrame frame;
String iTax,iSubTotal,iTotal;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerBilling frame = new PassengerBilling();
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
	public PassengerBilling() {
		addWindowListener(new WindowAdapter() {
			
			public void windowActived(WindowEvent arg0) {
				txtPassengerRef.setText(null);
				txtPassengerRef.setEnabled(false);
				int refs=5015 + (int) (Math.random()*17238);
				String cRef = "";
				cRef += refs + 1560;
				txtPassengerRef.setText(cRef);
				
			}
		});
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 255, 240));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel.setBounds(10, 11, 1360, 700);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(53, 55, 367, 394);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1.setBackground(new Color(240, 255, 240));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblFristName = new JLabel("Frist Name");
		lblFristName.setBounds(37, 69, 93, 24);
		lblFristName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(lblFristName);
		
		txtSurname = new JTextField();
		txtSurname.setBounds(176, 109, 141, 22);
		txtSurname.setColumns(10);
		panel_1.add(txtSurname);
		
		JLabel lblSurname = new JLabel("Surname");
		lblSurname.setBounds(37, 106, 74, 24);
		lblSurname.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(lblSurname);
		
		txtTelephone = new JTextField();
		txtTelephone.setBounds(176, 216, 141, 22);
		txtTelephone.setColumns(10);
		panel_1.add(txtTelephone);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(37, 143, 68, 24);
		lblAddress.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(lblAddress);
		
		txtFristName = new JTextField();
		txtFristName.setBounds(176, 72, 141, 22);
		txtFristName.setColumns(10);
		panel_1.add(txtFristName);
		
		JLabel lblIDNumber = new JLabel("ID Number");
		lblIDNumber.setBounds(37, 176, 93, 24);
		lblIDNumber.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(lblIDNumber);
		
		txtAddress = new JTextField();
		txtAddress.setBounds(176, 144, 141, 22);
		txtAddress.setColumns(10);
		panel_1.add(txtAddress);
		
		JLabel lblTelephone = new JLabel("Telephone");
		lblTelephone.setBounds(37, 213, 88, 24);
		lblTelephone.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(lblTelephone);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(176, 251, 141, 22);
		txtEmail.setColumns(10);
		panel_1.add(txtEmail);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(37, 252, 93, 24);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1.add(lblEmail);
		
		txtIDNumber = new JTextField();
		txtIDNumber.setBounds(176, 179, 141, 22);
		txtIDNumber.setColumns(10);
		panel_1.add(txtIDNumber);
		
		JLabel lblPassengerRef = new JLabel("Passenger Ref");
		lblPassengerRef.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPassengerRef.setBounds(37, 30, 127, 24);
		panel_1.add(lblPassengerRef);
		
		txtPassengerRef = new JTextField();
		txtPassengerRef.setColumns(10);
		txtPassengerRef.setBounds(176, 37, 141, 22);
		panel_1.add(txtPassengerRef);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_1.setBackground(new Color(240, 255, 240));
		panel_1_1.setBounds(496, 95, 367, 223);
		panel.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblTicketNo = new JLabel("Ticket No");
		lblTicketNo.setBounds(43, 72, 84, 24);
		lblTicketNo.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1_1.add(lblTicketNo);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setBounds(162, 75, 133, 22);
		txtTicketNo.setColumns(10);
		panel_1_1.add(txtTicketNo);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(61, 130, 44, 24);
		lblPrice.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1_1.add(lblPrice);
		
		txtPrice = new JTextField();
		txtPrice.setBounds(162, 133, 133, 22);
		txtPrice.setColumns(10);
		panel_1_1.add(txtPrice);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_1_1.setBackground(new Color(240, 255, 240));
		panel_1_1_1.setBounds(951, 55, 367, 394);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		
		JTextArea jtxtReceipt = new JTextArea();
		jtxtReceipt.setBounds(29, 28, 311, 340);
		panel_1_1_1.add(jtxtReceipt);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_1_1_1.setBackground(new Color(240, 255, 240));
		panel_1_1_1_1.setBounds(951, 481, 367, 172);
		panel.add(panel_1_1_1_1);
		panel_1_1_1_1.setLayout(null);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPassengerRef.setText(null);
				txtFristName.setText(null);
				txtSurname.setText(null);
				txtAddress.setText(null);
				txtIDNumber.setText(null);
				txtTelephone.setText(null);
				txtEmail.setText(null);
				
				txtTicketNo.setText(null);
				txtPrice.setText(null);
				
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
			
				
				
				
				
			}
		});
		btnReset.setBounds(40, 68, 129, 45);
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_1_1_1_1.add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit","Customer billing System",
						JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
			}}});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnExit.setBounds(203, 68, 129, 45);
		panel_1_1_1_1.add(btnExit);
		
		JPanel panel_1_1_1_1_1 = new JPanel();
		panel_1_1_1_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_1_1_1_1.setBackground(new Color(240, 255, 240));
		panel_1_1_1_1_1.setBounds(53, 481, 367, 172);
		panel.add(panel_1_1_1_1_1);
		panel_1_1_1_1_1.setLayout(null);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					jtxtReceipt.print(); }
				catch (java.awt.print.PrinterException e ) {
					System.err.format("No print found",e.getMessage());
				}
			}
		});
		btnPrint.setBounds(36, 65, 121, 48);
		panel_1_1_1_1_1.add(btnPrint);
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1;
				String q1="";
				num1 =1325 + (int)(Math.random()*4238);
				q1 += num1 + 1325;
				txtTicketNo.setText(q1);
				
					
			}
		});
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnTotal.setBounds(198, 65, 121, 48);
		panel_1_1_1_1_1.add(btnTotal);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setLayout(null);
		panel_1_1_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(95, 158, 160)));
		panel_1_1_2.setBackground(new Color(240, 255, 240));
		panel_1_1_2.setBounds(496, 345, 367, 223);
		panel.add(panel_1_1_2);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setColumns(10);
		txtSubTotal.setBounds(158, 99, 150, 22);
		panel_1_1_2.add(txtSubTotal);
		
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(158, 154, 150, 22);
		panel_1_1_2.add(txtTotal);
		
		txtTax = new JTextField();
		txtTax.setColumns(10);
		txtTax.setBounds(158, 50, 150, 22);
		panel_1_1_2.add(txtTax);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTotal.setBounds(56, 151, 42, 24);
		panel_1_1_2.add(lblTotal);
		
		JLabel lblSubTotal = new JLabel("Sub Total");
		lblSubTotal.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblSubTotal.setBounds(56, 96, 77, 24);
		panel_1_1_2.add(lblSubTotal);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblTax.setBounds(56, 54, 29, 23);
		panel_1_1_2.add(lblTax);
	}
}
