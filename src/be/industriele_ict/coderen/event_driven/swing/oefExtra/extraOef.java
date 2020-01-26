package be.industriele_ict.coderen.event_driven.swing.oefExtra;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class extraOef {

	private JFrame frame;
	private JTextField textFieldAankoop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					extraOef window = new extraOef();
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
	public extraOef() {
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
		
		textFieldAankoop = new JTextField();
		textFieldAankoop.setBounds(194, 56, 116, 22);
		frame.getContentPane().add(textFieldAankoop);
		textFieldAankoop.setColumns(10);
		
		JLabel lblNewLabelTotaal = new JLabel("New label");
		lblNewLabelTotaal.setBounds(246, 137, 56, 16);
		frame.getContentPane().add(lblNewLabelTotaal);
		
		JButton button = new JButton("6%");
		button.setBounds(213, 99, 97, 25);
		frame.getContentPane().add(button);
	}

}
