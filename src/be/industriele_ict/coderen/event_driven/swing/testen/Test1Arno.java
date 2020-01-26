package be.industriele_ict.coderen.event_driven.swing.testen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test1Arno {

	private JFrame frmTestguiarno;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1Arno window = new Test1Arno();
					window.frmTestguiarno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Test1Arno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTestguiarno = new JFrame();
		frmTestguiarno.setTitle("TEST 1-GUI (Arno)");
		frmTestguiarno.setBounds(100, 100, 450, 300);
		frmTestguiarno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTestguiarno.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(245, 13, 116, 22);
		frmTestguiarno.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(245, 48, 116, 22);
		frmTestguiarno.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("getal 1:");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setBounds(177, 16, 56, 16);
		frmTestguiarno.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("getal 2:");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setBounds(177, 45, 56, 16);
		frmTestguiarno.getContentPane().add(lblNewLabel_1);
		
		JLabel lblSom = new JLabel("som:");
		lblSom.setBounds(177, 143, 56, 16);
		frmTestguiarno.getContentPane().add(lblSom);
		
		JLabel lblVerschil = new JLabel("verschil:");
		lblVerschil.setBounds(154, 172, 56, 16);
		frmTestguiarno.getContentPane().add(lblVerschil);
		
		JLabel lblNewLabel_2 = new JLabel("product:");
		lblNewLabel_2.setBounds(154, 201, 56, 16);
		frmTestguiarno.getContentPane().add(lblNewLabel_2);
		
		JLabel lblQuotint = new JLabel("quoti\u00EBnt:");
		lblQuotint.setBounds(154, 230, 56, 16);
		frmTestguiarno.getContentPane().add(lblQuotint);
		
		JLabel lblResultaat = new JLabel("resultaat1");
		lblResultaat.setForeground(Color.BLUE);
		lblResultaat.setBounds(305, 143, 77, 16);
		frmTestguiarno.getContentPane().add(lblResultaat);
		
		JLabel lblResultaat_1 = new JLabel("resultaat2");
		lblResultaat_1.setForeground(Color.BLUE);
		lblResultaat_1.setBounds(305, 172, 77, 16);
		frmTestguiarno.getContentPane().add(lblResultaat_1);
		
		JLabel lblResultaat_2 = new JLabel("resultaat3");
		lblResultaat_2.setForeground(Color.BLUE);
		lblResultaat_2.setBounds(305, 201, 77, 16);
		frmTestguiarno.getContentPane().add(lblResultaat_2);
		
		JLabel lblResultaat_3 = new JLabel("resultaat4");
		lblResultaat_3.setForeground(Color.BLUE);
		lblResultaat_3.setBounds(305, 230, 71, 16);
		frmTestguiarno.getContentPane().add(lblResultaat_3);
		
		JButton btnBerekenDeResultaten = new JButton("BEREKEN DE RESULTATEN");
		btnBerekenDeResultaten.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String getal1str="";
			String getal2str="";
			String somstr="";
			String verschilstr="";
			String productstr="";
			String quotiëntstr="";
			float getal1=0.0f;
			float getal2=0.0f;
			float som=0.0f;
			float verschil=0.0f;
			float product=0.0f;
			float quotiënt=0.0f;
			
			getal1str=textField.getText();
			getal2str=textField_1.getText();
			getal1= Float.parseFloat(getal1str);
			getal2= Float.parseFloat(getal2str);
			
			som=getal1+getal2;
			somstr=Float.toString(som);
			lblResultaat.setText(somstr);
			
			verschil=getal1-getal2;
			verschilstr=Float.toString(verschil);
			lblResultaat_1.setText(verschilstr);
			
			product= getal1*getal2;
			productstr=Float.toString(product);
			lblResultaat_2.setText(productstr);
			
			quotiënt=getal1/getal2;
			quotiëntstr=Float.toString(quotiënt);
			lblResultaat_3.setText(quotiëntstr);
			
			
			}
		});
		btnBerekenDeResultaten.setBounds(154, 83, 207, 43);
		frmTestguiarno.getContentPane().add(btnBerekenDeResultaten);
	}
}
