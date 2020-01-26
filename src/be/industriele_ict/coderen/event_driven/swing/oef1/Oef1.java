package be.industriele_ict.coderen.event_driven.swing.oef1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Oef1 {

	protected static final String JFrame = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Oef1 window = new Oef1();
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
	public Oef1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelProgressBar = new JLabel("30");
		labelProgressBar.setBounds(93, 102, 200, 50);
		frame.getContentPane().add(labelProgressBar);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(147, 121, 146, 14);
		frame.getContentPane().add(progressBar);
		
		JLabel labelSlider = new JLabel("30");
		labelSlider.setBounds(93, 176, 56, 16);
		frame.getContentPane().add(labelSlider);
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				int waarde = 0;
				String waardeStr = "";
				
				waarde = slider.getValue();
				waardeStr = Integer.toString(waarde);
				labelSlider.setText(waardeStr);
				labelProgressBar.setText(waardeStr);
				progressBar.setValue(waarde);
				
				
				
				
			}
		});
		slider.setBounds(133, 176, 200, 26);
		frame.getContentPane().add(slider);
	
	
	}
}
