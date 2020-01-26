package be.industriele_ict.coderen.event_driven.swing.demo;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SwingConstants;
import java.awt.Color;

/**
 * A N A L Y S E
 * =============
 * ABSTRACTE PROBLEEMSTELLING (= vraag van de klant)
 * Abstracte omschrijving van de probleemstelling.
 * 
 * CONCRETE PROBLEEMSTELLING (= ondubbelzinnige omschrijving van de vraag van de klant ==> algoritme)
 * Concrete omschrijving van de probleemstelling.
 *
 * CHECKLIST VOOR TEST-INGENIEUR (= wat moet het programma kunnen = functionaliteit)
 * 01 Omschrijving functionaliteit 1
 * 02 Omschrijving functionaliteit 2
 * 03 ...
 *  
 * PARAMETERS SENSOREN
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------
 * |---------------------------------------------------|-------------------|-------------
 * 							| 													| 					|
 * 
 * PARAMETERS ACTUATOREN
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|-------------
 * 							| 													| 					|
 * 
 * PARAMETERS VERWERKING
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|-------------
 * 							| 													| 					|
 * 
 * PARAMETERS COMMUNICATIE
 * Naam                     | Omschrijving                                      | Bereik            | Gegevenstype
 * -------------------------|---------------------------------------------------|-------------------|-------------
 * 							| 													| 					|
 * 
 * 
 * OPDRACHT
 * 
 * STAP 1: A N A L Y S E
 * Lees de abstracte probleemstelling
 * 017.1B3: Schrijf de concrete probleemstelling uit, op basis van de communicatie met de opdrachtgever
 * 017.1B3: Maak een checklist van alle functionaliteiten, voor de testingenieur.
 * 026.2B3: Vervolledig de tabel van de parameters
 * 017.1B3: Teken een functioneel schema van het systeem (sensoren, actuatoren, processoren, opslagmedia, communicatie, interfaces)
 * 
 * STAP 2: A L G O R I T M E
 * 017.2B3: Bedenk een algoritme voor het probleem en documenteer het in een stroomdiagram (m.b.v. draw.io)
 * 
 * STAP 3: C O D E R E N
 * 026.4B3: Vertaal het algoritme (stroomdiagram) naar de juiste controlestructuren.
 * 026.1B3: Schrijf de broncode in de Java syntaxis.
 * 027.5B3: Ontwerp de grafische interface.
 * 020.3B3: Schrijf Javadoc commentaar voor de broncode.
 * 
 * STAP 4: T E S T E N
 * 020.2B3: Controleer de gevraagde functionaliteit (checklist test-ingenieur) en gebruik de debugger, waar nodig
 * 
 * STAP 5: I N D I E N S T N A M E
 * Controleer de goede werking van elke sensor, stapsgewijs
 * Controleer de goede werking van elke actuator, stapsgewijs
 * Controleer elk communicatiekanaal, stapsgewijs
 * Doorloop het algoritme, stapsgewijs
 * Start de toepassing
 */

/**
 * Deze klasse is een voorbeeld van een hoofdalgoritme, voor gebeurtenisgestuurd coderen 
 * 
 * @author Gunter Schillebeeckx
 * @version	2019-11-05 Creation 
 *
 */
public class TemplateEventDrivenWithSwing
{

	private JFrame frmOpdrachtDemonstratie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemplateEventDrivenWithSwing window = new TemplateEventDrivenWithSwing();
					window.frmOpdrachtDemonstratie.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TemplateEventDrivenWithSwing()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOpdrachtDemonstratie = new JFrame();
		frmOpdrachtDemonstratie.setTitle("opdracht: demonstratie");
		frmOpdrachtDemonstratie.setBounds(100, 100, 404, 234);
		frmOpdrachtDemonstratie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOpdrachtDemonstratie.getContentPane().setLayout(null);
		
		JLabel lblDigitaleSensor = new JLabel("DIGITALE SENSOR");
		lblDigitaleSensor.setForeground(Color.RED);
		lblDigitaleSensor.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigitaleSensor.setBounds(26, 43, 167, 15);
		frmOpdrachtDemonstratie.getContentPane().add(lblDigitaleSensor);
		
		JLabel lblAnalogeSensor = new JLabel("ANALOGE SENSOR");
		lblAnalogeSensor.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnalogeSensor.setBounds(26, 124, 167, 15);
		frmOpdrachtDemonstratie.getContentPane().add(lblAnalogeSensor);
		
		JLabel lblDigitaleActuator = new JLabel("DIGITALE ACTUATOR");
		lblDigitaleActuator.setHorizontalAlignment(SwingConstants.CENTER);
		lblDigitaleActuator.setBounds(205, 43, 167, 15);
		frmOpdrachtDemonstratie.getContentPane().add(lblDigitaleActuator);
		
		JLabel lblAnalogeActuator = new JLabel("ANALOGE ACTUATOR");
		lblAnalogeActuator.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnalogeActuator.setBounds(205, 124, 167, 15);
		frmOpdrachtDemonstratie.getContentPane().add(lblAnalogeActuator);
		
		JLabel digitalSensorState = new JLabel("");
		digitalSensorState.setForeground(Color.BLUE);
		digitalSensorState.setOpaque(true);
		digitalSensorState.setBackground(Color.RED);
		digitalSensorState.setHorizontalAlignment(SwingConstants.CENTER);
		digitalSensorState.setBounds(215, 78, 145, 25);
		frmOpdrachtDemonstratie.getContentPane().add(digitalSensorState);
		
				JToggleButton tglbtnDigitalSensor = new JToggleButton("toggle button");
				tglbtnDigitalSensor.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(tglbtnDigitalSensor.isSelected() == true)
						{
							System.out.println("digitale sensor: AAN");
							digitalSensorState.setText("AAN");
							digitalSensorState.setForeground(Color.BLACK);
							digitalSensorState.setBackground(Color.GREEN);
						}
						else
						{
							System.out.println("digitale sensor: UIT");
							digitalSensorState.setText("UIT");
							digitalSensorState.setForeground(Color.WHITE);
							digitalSensorState.setBackground(Color.RED);
						}

					}
				});
				
				JLabel analogSensorState = new JLabel("");
				analogSensorState.setForeground(Color.BLUE);
				analogSensorState.setOpaque(true);
				analogSensorState.setBackground(Color.YELLOW);
				analogSensorState.setHorizontalAlignment(SwingConstants.CENTER);
				analogSensorState.setBounds(215, 151, 145, 25);
				frmOpdrachtDemonstratie.getContentPane().add(analogSensorState);
				tglbtnDigitalSensor.setBounds(26, 78, 167, 25);
				frmOpdrachtDemonstratie.getContentPane().add(tglbtnDigitalSensor);
				
				JSlider sliderAnalogSensor = new JSlider();
				sliderAnalogSensor.setBackground(Color.YELLOW);
				sliderAnalogSensor.addChangeListener(new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						int meetwaarde = 0;
						
						meetwaarde = sliderAnalogSensor.getValue();
						analogSensorState.setText(Integer.toString(meetwaarde));
						System.out.println("meetwaarde = "+meetwaarde);
					}
				});
				sliderAnalogSensor.setBounds(26, 152, 167, 25);
				frmOpdrachtDemonstratie.getContentPane().add(sliderAnalogSensor);
	}
}
