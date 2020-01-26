package be.industriele_ict.coderen.event_driven.swing.oef2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;

public class Oef2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Oef2 window = new Oef2();
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
	public Oef2() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Oef2.class.getResource("/images/circle50x50Green.png")));
		lblNewLabel.setBounds(272, 115, 51, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel labelBoven = new JLabel("");
		labelBoven.setIcon(new ImageIcon(Oef2.class.getResource("/images/circle50x50Red.png")));
		labelBoven.setBounds(272, 35, 51, 50);
		frame.getContentPane().add(labelBoven);
		
		JLabel labelOnder = new JLabel("");
		labelOnder.setIcon(new ImageIcon(Oef2.class.getResource("/images/circle50x50Red.png")));
		labelOnder.setBounds(272, 190, 51, 50);
		frame.getContentPane().add(labelOnder);
		
		JLabel label_5 = new JLabel("0");
		label_5.setBounds(174, 211, 56, 16);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("1023");
		label_6.setBounds(153, 50, 56, 16);
		frame.getContentPane().add(label_6);
		
		JLabel labelSlider = new JLabel("634");
		labelSlider.setBounds(112, 112, 56, 16);
		frame.getContentPane().add(labelSlider);
		
		JLabel percentageGetal = new JLabel("10");
		percentageGetal.setBounds(85, 141, 56, 16);
		frame.getContentPane().add(percentageGetal);
		
		JLabel percentageSymbool = new JLabel("%");
		percentageSymbool.setBounds(153, 141, 56, 16);
		frame.getContentPane().add(percentageSymbool);
		
		JSlider Slider = new JSlider();
		Slider.setMaximum(1023);
		Slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int waarde = 0;
				String waardeStr = "";
				
				//lees waarde vanuit slider
				waarde = Slider.getValue();
				// bereken waarde str procent (waarde/1023)*100 en maak string
				String waardeStrProcent = Float.toString(((float)waarde/1023)*100);
				waardeStr = Integer.toString(waarde);
				//Settext of labalslider
				labelSlider.setText(waardeStr);
				//Settext percentagegetal
				percentageGetal.setText(waardeStrProcent);
				
				//labelOnder.setIcon(new ImageIcon(Oef2.class.getResource("/images/circle50x50Red.png")));
				//als waarde <=250 => red
				if(waarde<=250)
				{
					labelOnder.setIcon(new ImageIcon(Oef2.class.getResource("/images/circle50x50Red.png")));
				}
				else{
					labelOnder.setIcon(new ImageIcon(Oef2.class.getResource("/images/circle50x50Orange.png")));
				}
				if(waarde >= 750)
				{
					labelBoven.setIcon(new ImageIcon(Oef2.class.getResource("/images/circle50x50Red.png")));
					
				}
				else{
						labelBoven.setIcon(new ImageIcon(Oef2.class.getResource("/images/circle50x50Orange.png")));
					}
				if(waarde>=250 && waarde <=750)
				{
					lblNewLabel.setIcon(new ImageIcon(Oef2.class.getResource("/images/circle50x50Green.png")));
				}
				else{
					lblNewLabel.setIcon(new ImageIcon(Oef2.class.getResource("/images/circle50x50Orange.png")));
				}
				
				//waarde>=750=> red
				
				//waarde>=250 && waarde<=750=>green
				


			}
				
			
		});
		
		Slider.setOrientation(SwingConstants.VERTICAL);
		Slider.setBounds(193, 40, 50, 200);
		frame.getContentPane().add(Slider);
		
		textField = new JTextField();
		textField.setText("250");
		textField.setBounds(255, 166, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("750");
		textField_1.setBounds(255, 91, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
	}
}
