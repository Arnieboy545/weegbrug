package be.industriele_ict.coderen.event_driven.swing.oef1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class oefKopi1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					oefKopi1 window = new oefKopi1();
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
	public oefKopi1() {
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
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
			}
		});
		scrollBar.setBounds(97, 125, 21, 48);
		frame.getContentPane().add(scrollBar);
	}
}
