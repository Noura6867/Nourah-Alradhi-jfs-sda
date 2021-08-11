package TravellingTicket;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import Passenger.Passengerinformation;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Travelling {

	protected static final Passengerinformation PassengerInformatin = null;
	private JFrame frame;
	private JTextField txtTax;
	private JTextField txtSubTotal;
	private JTextField txtTotal;
	private JTextField txtClass;
	private JTextField txtTicket;
	private JTextField txtAdult;
	private JTextField txtChild;
	private JTextField txtFrom;
	private JTextField txtTo;
	private JTextField txtDate;
	private JTextField txtTime;
	private JTextField txtTicketNo;
	private JTextField txtPrice;
	private JTextField txtRoute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Travelling window = new Travelling();
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
	public Travelling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(240, 248, 255));
		frame.setBounds(0, 0, 1370, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(38, 13, 1258, 76);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Travelling Ticketing Systems");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 40));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ticket Type");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(38, 115, 211, 32);
		frame.getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 145, 477, 2);
		frame.getContentPane().add(separator);
		
		JRadioButton rdbtnStandard = new JRadioButton("Standard");
		rdbtnStandard.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnStandard.setBounds(8, 171, 127, 25);
		frame.getContentPane().add(rdbtnStandard);
		
		JRadioButton rdbtnEconomy = new JRadioButton("Economy");
		rdbtnEconomy.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnEconomy.setBounds(8, 218, 127, 25);
		frame.getContentPane().add(rdbtnEconomy);
		
		JRadioButton rdbtnSingleTicket = new JRadioButton("Single Ticket");
		rdbtnSingleTicket.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnSingleTicket.setBounds(182, 171, 142, 25);
		frame.getContentPane().add(rdbtnSingleTicket);
		
		JRadioButton rdbtnReturnTicket = new JRadioButton("Return Ticket");
		rdbtnReturnTicket.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnReturnTicket.setBounds(182, 220, 142, 25);
		frame.getContentPane().add(rdbtnReturnTicket);
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnAdult.setBounds(375, 171, 127, 25);
		frame.getContentPane().add(rdbtnAdult);
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnChild.setBounds(375, 218, 127, 25);
		frame.getContentPane().add(rdbtnChild);
		
		JComboBox cmbDestination = new JComboBox();
		cmbDestination.setFont(new Font("Times New Roman", Font.BOLD, 20));
		cmbDestination.setModel(new DefaultComboBoxModel(new String[] {"Destination", "Riyadh", "", "Dammam", "", "Jeddah"}));
		cmbDestination.setBounds(182, 271, 204, 22);
		frame.getContentPane().add(cmbDestination);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(25, 375, 477, -4);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(25, 369, 484, -11);
		frame.getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(0, 369, 502, -7);
		frame.getContentPane().add(separator_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sub Total");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(25, 401, 86, 21);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Tax");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblNewLabel_4_1.setBounds(25, 346, 86, 16);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Total");
		lblNewLabel_4_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_4_2.setBounds(25, 454, 86, 35);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		txtTax = new JTextField();
		txtTax.setBounds(196, 340, 186, 31);
		frame.getContentPane().add(txtTax);
		txtTax.setColumns(10);
		
		txtSubTotal = new JTextField();
		txtSubTotal.setBounds(196, 402, 186, 32);
		frame.getContentPane().add(txtSubTotal);
		txtSubTotal.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setBounds(196, 462, 186, 27);
		frame.getContentPane().add(txtTotal);
		txtTotal.setColumns(10);
		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				double tax = 19.50;
				double MilesK8 = 25.78;
				double MilesK12 = 25.10;
				double MilesK20 = 45.23;
				double MilesK30 = 55.98;
				double totalCost , eco = 3.85 ,fclass =5.60;
				if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
						{
					totalCost=(tax* MilesK8) / 100;
					String sTax =String.format("£%.2f",totalCost);
					txtTax.setText(sTax);
					String subTotal=String.format("£%.2f",MilesK8);
					txtSubTotal.setText(subTotal);
					String Total=String.format("£%.2f",MilesK8 + totalCost);
					txtTotal.setText(Total);
					txtPrice.setText(Total);
					txtClass.setText("STD");
					txtTicket.setText("ONE WAY");
					txtAdult.setText("ONE");
					txtChild.setText("NIL");
						}
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
					{
				totalCost=(tax* MilesK8 *2) / 100;
				String sTax =String.format("£%.2f",totalCost -18);
				txtTax.setText(sTax);
				String subTotal=String.format("£%.2f",MilesK8 *2);
				txtSubTotal.setText(subTotal);
				String Total=String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
				txtTotal.setText(Total);
				txtPrice.setText(Total);
				txtClass.setText("STD");
				txtTicket.setText("ONE WAY");
				txtAdult.setText("ONE");//Adult
				txtChild.setText("NIL");//Child
				}
				else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
				{
			totalCost=(tax* MilesK8) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK8 );
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",MilesK8 + totalCost);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
				{
			totalCost=(tax* MilesK8 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK8 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}
			
				else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK8) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK8);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",MilesK8 + totalCost);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("ONE");//Adult
			txtChild.setText("NIL");//Child	
			}
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK8 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK8 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("ONE");//Adult
			txtChild.setText("NIL");//Child	
			}
				
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK8 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK8 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}	
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK8 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK8 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
				{
			totalCost=(tax* MilesK12 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK12 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK12 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("ONE");//Adult
			txtChild.setText("NIL");//Child
			}
				else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
				{
			totalCost=(tax* MilesK12) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK12 );
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",MilesK12 + totalCost);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
				{
			totalCost=(tax* MilesK12 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK12 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK12 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}
			
				else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK12) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK12);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",MilesK12 + totalCost);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("ONE");//Adult
			txtChild.setText("NIL");//Child	
			}
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK12 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK12 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK12 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("ONE");//Adult
			txtChild.setText("NIL");//Child	
			}
				
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK12 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK12 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK12 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}	
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK12 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK12 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK12 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
				{
			totalCost=(tax* MilesK20 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK20 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK20 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("ONE");//Adult
			txtChild.setText("NIL");//Child
			}
				else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
				{
			totalCost=(tax* MilesK20) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK20 );
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",MilesK20 + totalCost);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
				{
			totalCost=(tax* MilesK20 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK20 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK20 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}
			
				else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK20) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK20);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",MilesK20 + totalCost);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("ONE");//Adult
			txtChild.setText("NIL");//Child	
			}
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK20 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK20 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK20 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("ONE");//Adult
			txtChild.setText("NIL");//Child	
			}
				
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK20 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK20 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK20 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}	
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
				{
			totalCost=(tax* MilesK20 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK20 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK20 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("NIL");//Adult
			txtChild.setText("ONE");//Child	
			}
				if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
				{
			totalCost=(tax* MilesK30) / 100;
			String sTax =String.format("£%.2f",totalCost);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK30);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",MilesK30 + totalCost);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("ONE");
			txtChild.setText("NIL");
				}
				else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
				{
			totalCost=(tax* MilesK30 *2) / 100;
			String sTax =String.format("£%.2f",totalCost -18);
			txtTax.setText(sTax);
			String subTotal=String.format("£%.2f",MilesK30 *2);
			txtSubTotal.setText(subTotal);
			String Total=String.format("£%.2f",((MilesK30 + totalCost)*2)-18);
			txtTotal.setText(Total);
			txtPrice.setText(Total);
			txtClass.setText("STD");
			txtTicket.setText("ONE WAY");
			txtAdult.setText("ONE");//Adult
			txtChild.setText("NIL");//Child
			}
			else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
			{
		totalCost=(tax* MilesK30) / 100;
		String sTax =String.format("£%.2f",totalCost -18);
		txtTax.setText(sTax);
		String subTotal=String.format("£%.2f",MilesK8 );
		txtSubTotal.setText(subTotal);
		String Total=String.format("£%.2f",MilesK8 + totalCost);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("ONE WAY");
		txtAdult.setText("NIL");//Adult
		txtChild.setText("ONE");//Child	
		}
			else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Dammam")))
			{
		totalCost=(tax* MilesK30 *2) / 100;
		String sTax =String.format("£%.2f",totalCost -18);
		txtTax.setText(sTax);
		String subTotal=String.format("£%.2f",MilesK8 *2);
		txtSubTotal.setText(subTotal);
		String Total=String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("ONE WAY");
		txtAdult.setText("NIL");//Adult
		txtChild.setText("ONE");//Child	
		}
		
			else if((rdbtnStandard.isSelected())&&(rdbtnSingleTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
			{
		totalCost=(tax* MilesK30) / 100;
		String sTax =String.format("£%.2f",totalCost -18);
		txtTax.setText(sTax);
		String subTotal=String.format("£%.2f",MilesK8);
		txtSubTotal.setText(subTotal);
		String Total=String.format("£%.2f",MilesK8 + totalCost);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("ONE WAY");
		txtAdult.setText("ONE");//Adult
		txtChild.setText("NIL");//Child	
		}
			else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
			{
		totalCost=(tax* MilesK30 *2) / 100;
		String sTax =String.format("£%.2f",totalCost -18);
		txtTax.setText(sTax);
		String subTotal=String.format("£%.2f",MilesK8 *2);
		txtSubTotal.setText(subTotal);
		String Total=String.format("£%.2f",((MilesK8 + totalCost)*2)-18);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("ONE WAY");
		txtAdult.setText("ONE");//Adult
		txtChild.setText("NIL");//Child	
		}
			
			else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnChild.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
			{
		totalCost=(tax* MilesK30 *2) / 100;
		String sTax =String.format("£%.2f",totalCost -18);
		txtTax.setText(sTax);
		String subTotal=String.format("£%.2f",MilesK30 *2);
		txtSubTotal.setText(subTotal);
		String Total=String.format("£%.2f",((MilesK30 + totalCost)*2)-18);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("ONE WAY");
		txtAdult.setText("NIL");//Adult
		txtChild.setText("ONE");//Child	
		}	
			else if((rdbtnStandard.isSelected())&&(rdbtnReturnTicket.isSelected())&&(rdbtnAdult.isSelected())&&(cmbDestination.getSelectedItem().equals("Jeddah")))
			{
		totalCost=(tax* MilesK30 *2) / 100;
		String sTax =String.format("£%.2f",totalCost -18);
		txtTax.setText(sTax);
		String subTotal=String.format("£%.2f",MilesK30 *2);
		txtSubTotal.setText(subTotal);
		String Total=String.format("£%.2f",((MilesK30 + totalCost)*2)-18);
		txtTotal.setText(Total);
		txtPrice.setText(Total);
		txtClass.setText("STD");
		txtTicket.setText("ONE WAY");
		txtAdult.setText("NIL");//Adult
		txtChild.setText("ONE");//Child	
		}
		}});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//======================Time==========================================
				
				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime=new SimpleDateFormat ("hh:mm:ss");
				Date Time;
				txtTime.setText(tTime.format(Time.getTime()));
				
				//======================Date==========================================
				
				SimpleDateFormat tDate=new SimpleDateFormat ("dd:mm:yy");
				txtDate.setText(tDate.format(Time.getTime()));
				txtFrom.setText("Riyadh *");
				
				txtTo.setText((String).cmbDestination.getSelectedItem()+ " *" );
				
				
				//======================Random Number Generator======================
				
				int num1;
				String q1="";
				num1 =1325 + (int)(Math.random()*4238);
				q1 += num1 + 1325;
				txtTicketNo.setText(q1);
				
				//======================================================================
				
				txtRoute.setText("ANY");
			}
		});
		btnNewButton.setToolTipText("Total Cost of Ticket");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(25, 562, 97, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setToolTipText("Reset System");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtTax.setText(null);
				txtSubTotal.setText(null);
				txtTotal.setText(null);
				rdbtnAdult.setSelected(false);
				rdbtnChild.setSelected(false);
				rdbtnStandard.setSelected(false);
				rdbtnEconomy.setSelected(false);
				cmbDestination.setSelectedItem("Destination");
				rdbtnSingleTicket.setSelected(false);
				rdbtnReturnTicket.setSelected(false);
				txtFrom.setText(null);
				txtTo.setText(null);
				txtDate.setText(null);
				txtTime.setText(null);
				txtTicketNo.setText(null);
				txtPrice.setText(null);
				txtRoute.setText(null);
				txtChild.setText(null);
				txtClass.setText(null);
				txtAdult.setText(null);
				txtTicket.setText(null);
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(170, 562, 97, 34);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setToolTipText("Exit System");
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame = new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame ,"Confirm if you want to exit","Ticketing System",
				JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);}
			}
		});
		btnNewButton_2.setBounds(304, 562, 97, 32);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(8, 530, 494, -4);
		frame.getContentPane().add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(8, 369, 494, -4);
		frame.getContentPane().add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(8, 321, 492, 8);
		frame.getContentPane().add(separator_6);
		
		JSeparator separator_7 = new JSeparator();
		separator_7.setBounds(12, 524, 497, 2);
		frame.getContentPane().add(separator_7);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setOrientation(SwingConstants.VERTICAL);
		separator_8.setBounds(572, 145, 8, 457);
		frame.getContentPane().add(separator_8);
		
		JLabel lblNewLabel_4_3 = new JLabel("Child");
		lblNewLabel_4_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4_3.setBounds(1184, 121, 86, 21);
		frame.getContentPane().add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("Ticket");
		lblNewLabel_4_3_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4_3_1.setBounds(837, 121, 86, 21);
		frame.getContentPane().add(lblNewLabel_4_3_1);
		
		JLabel lblNewLabel_4_3_1_1 = new JLabel("Adult");
		lblNewLabel_4_3_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4_3_1_1.setBounds(1014, 121, 86, 21);
		frame.getContentPane().add(lblNewLabel_4_3_1_1);
		
		JLabel lblNewLabel_4_3_1_2 = new JLabel("Class");
		lblNewLabel_4_3_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_4_3_1_2.setBounds(639, 125, 86, 21);
		frame.getContentPane().add(lblNewLabel_4_3_1_2);
		
		JSeparator separator_9 = new JSeparator();
		separator_9.setBounds(605, 145, 712, 8);
		frame.getContentPane().add(separator_9);
		
		JLabel lblNewLabel_2_1 = new JLabel("To");
		lblNewLabel_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(592, 327, 186, 31);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("From");
		lblNewLabel_2_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1_1.setBounds(592, 262, 186, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Date");
		lblNewLabel_2_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1_2.setBounds(592, 396, 186, 31);
		frame.getContentPane().add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Time");
		lblNewLabel_2_1_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1_3.setBounds(592, 456, 186, 31);
		frame.getContentPane().add(lblNewLabel_2_1_3);
		
		txtClass = new JTextField();
		txtClass.setColumns(10);
		txtClass.setBounds(592, 171, 155, 32);
		frame.getContentPane().add(txtClass);
		
		txtTicket = new JTextField();
		txtTicket.setColumns(10);
		txtTicket.setBounds(793, 174, 133, 29);
		frame.getContentPane().add(txtTicket);
		
		txtAdult = new JTextField();
		txtAdult.setColumns(10);
		txtAdult.setBounds(971, 174, 133, 29);
		frame.getContentPane().add(txtAdult);
		
		txtChild = new JTextField();
		txtChild.setColumns(10);
		txtChild.setBounds(1139, 174, 133, 29);
		frame.getContentPane().add(txtChild);
		
		txtFrom = new JTextField();
		txtFrom.setColumns(10);
		txtFrom.setBounds(775, 263, 177, 32);
		frame.getContentPane().add(txtFrom);
		
		txtTo = new JTextField();
		txtTo.setColumns(10);
		txtTo.setBounds(775, 321, 177, 37);
		frame.getContentPane().add(txtTo);
		
		txtDate = new JTextField();
		txtDate.setColumns(10);
		txtDate.setBounds(775, 394, 177, 35);
		frame.getContentPane().add(txtDate);
		
		txtTime = new JTextField();
		txtTime.setColumns(10);
		txtTime.setBounds(775, 462, 177, 35);
		frame.getContentPane().add(txtTime);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Ticket No");
		lblNewLabel_2_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1_1_1.setBounds(1073, 265, 186, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Price");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_1.setBounds(1073, 340, 186, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Route");
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2_1_1_1_1_1.setBounds(1073, 423, 186, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1_1_1_1);
		
		txtTicketNo = new JTextField();
		txtTicketNo.setColumns(10);
		txtTicketNo.setBounds(1037, 296, 177, 33);
		frame.getContentPane().add(txtTicketNo);
		
		txtPrice = new JTextField();
		txtPrice.setColumns(10);
		txtPrice.setBounds(1037, 375, 177, 38);
		frame.getContentPane().add(txtPrice);
		
		txtRoute = new JTextField();
		txtRoute.setColumns(10);
		txtRoute.setBounds(1037, 467, 177, 30);
		frame.getContentPane().add(txtRoute);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBounds(592, 218, 734, 16);
		frame.getContentPane().add(separator_10);
		
		JSeparator separator_11 = new JSeparator();
		separator_11.setOrientation(SwingConstants.VERTICAL);
		separator_11.setBounds(991, 241, 22, 371);
		frame.getContentPane().add(separator_11);
		
		JRadioButton rdbtnFristClass = new JRadioButton("Frist Class");
		rdbtnFristClass.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		rdbtnFristClass.setBounds(8, 267, 127, 25);
		frame.getContentPane().add(rdbtnFristClass);
		
		JButton btncontinuation = new JButton("continuation");
		btncontinuation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Passengerinformation info =new Passengerinformation();
				PassengerInformatin.main(null);
			}
		});
		btncontinuation.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btncontinuation.setBounds(1148, 591, 137, 32);
		frame.getContentPane().add(btncontinuation);
	}

}
