package be.industriele_ict.coderen.event_driven.swing.testen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Canvas;
import java.awt.Panel;

public class test2Arno {

	private JFrame TestGUIArno;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test2Arno window = new test2Arno();
					window.TestGUIArno.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test2Arno() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		TestGUIArno = new JFrame();
		TestGUIArno.setTitle("TestGUI by Arno");
		TestGUIArno.setBounds(100, 100, 450, 300);
		TestGUIArno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TestGUIArno.getContentPane().setLayout(null);

		JLabel labelKleur3 = new JLabel("0");
		labelKleur3.setBounds(366, 114, 27, 16);
		TestGUIArno.getContentPane().add(labelKleur3);

		JLabel labelKleur2 = new JLabel("0");
		labelKleur2.setBounds(330, 114, 27, 16);
		TestGUIArno.getContentPane().add(labelKleur2);

		JLabel labelKleur1 = new JLabel("0");
		labelKleur1.setBounds(296, 114, 34, 16);
		TestGUIArno.getContentPane().add(labelKleur1);

		JLabel labelSlider1 = new JLabel("0");
		labelSlider1.setBounds(250, 55, 56, 16);
		TestGUIArno.getContentPane().add(labelSlider1);

		JLabel labelSlider2 = new JLabel("0");
		labelSlider2.setBounds(250, 114, 56, 16);
		TestGUIArno.getContentPane().add(labelSlider2);

		JLabel labelSlider3 = new JLabel("0");
		labelSlider3.setBounds(250, 185, 56, 16);
		TestGUIArno.getContentPane().add(labelSlider3);

		JSlider slider_2 = new JSlider();
		slider_2.setMaximum(255);
		slider_2.setBackground(Color.BLUE);
		slider_2.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int waarde3 = 0;
				String waardeStr3 = "";

				waarde3 = slider_2.getValue();
				waardeStr3 = Integer.toString(waarde3);
				labelSlider3.setText(waardeStr3);
				labelKleur3.setText(waardeStr3);
			}
		});

		JSlider slider_1 = new JSlider();
		slider_1.setMaximum(255);
		slider_1.setBackground(Color.GREEN);
		slider_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int waarde2 = 0;
				String waardeStr2 = "";

				waarde2 = slider_1.getValue();
				waardeStr2 = Integer.toString(waarde2);
				labelSlider2.setText(waardeStr2);
				labelKleur2.setText(waardeStr2);

			}
		});

		JSlider slider = new JSlider();
		slider.setMaximum(255);
		slider.setBackground(Color.RED);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int waarde1 = 0;
				String waardeStr = "";

				waarde1 = slider.getValue();
				waardeStr = Integer.toString(waarde1);
				labelSlider1.setText(waardeStr);
				labelKleur1.setText(waardeStr);


			}
		});
		slider.setForeground(Color.WHITE);
		slider.setBounds(12, 55, 200, 26);
		TestGUIArno.getContentPane().add(slider);
		slider_1.setForeground(Color.WHITE);
		slider_1.setBounds(12, 114, 200, 26);
		TestGUIArno.getContentPane().add(slider_1);
		slider_2.setForeground(Color.WHITE);
		slider_2.setBounds(12, 175, 200, 26);
		TestGUIArno.getContentPane().add(slider_2);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setBounds(279, 42, 141, 166);
		TestGUIArno.getContentPane().add(lblNewLabel);
	}
}
