package be.industriele_ict.coderen.event_driven.swing.oef3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class oef3 {

	private JFrame frame;
	private JTextField textFieldGetal1;
	private JTextField textFieldGetal2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oef3 window = new oef3();
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
	public oef3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textFieldGetal1 = new JTextField();
		textFieldGetal1.setBounds(227, 56, 116, 22);
		frame.getContentPane().add(textFieldGetal1);
		textFieldGetal1.setColumns(10);
		
		textFieldGetal2 = new JTextField();
		textFieldGetal2.setBounds(227, 91, 116, 22);
		frame.getContentPane().add(textFieldGetal2);
		textFieldGetal2.setColumns(10);
		
		JLabel lblResultaat = new JLabel("resultaat");
		lblResultaat.setForeground(Color.BLUE);
		lblResultaat.setBounds(261, 172, 73, 34);
		frame.getContentPane().add(lblResultaat);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String getal1str ="";
				String getal2str = "";
				float som = 0.0f;
				float getal1 = 0.0f;
				float getal2 = 0.0f;
				String somstr="";
				
				
				//eerste getal opvragen
				getal1str = textFieldGetal1.getText();
				
				//tweede getal opvragen
				getal2str = textFieldGetal2.getText();
				
				//omzetten naar getallen
				getal1= Float.parseFloat(getal1str);
				getal2 = Float.parseFloat(getal2str);
				
				//som berkenen
				som = getal1 + getal2;
				
				//resultaat omzetten naar tekst
				somstr = Float.toString(som);
				
				//tekst tonen in GUI
				lblResultaat.setText(somstr);
				
				
			}
		});
		button.setBounds(237, 134, 97, 25);
		frame.getContentPane().add(button);
	}
}
