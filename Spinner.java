package Trabajos;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.LineBorder;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class Spinner {

	public  JFrame frmSpinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Spinner window = new Spinner();
					window.frmSpinner.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Spinner() {
		initialize();
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSpinner = new JFrame();
		frmSpinner.setTitle("Spinner");
		frmSpinner.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmSpinner.setBounds(100, 100, 450, 300);
		frmSpinner.setLocationRelativeTo(null);
		frmSpinner.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSpinner.getContentPane().setLayout(null);
		
		JLabel etiValor = new JLabel("");
		etiValor.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiValor.setBorder(
				new LineBorder(new Color(171, 126, 245), 2, true)
				);
		etiValor.setBounds(68, 101, 201, 24);
		frmSpinner.getContentPane().add(etiValor);
		
		JSpinner spiValor = new JSpinner();
		spiValor.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				etiValor.setText("El valor es: "+spiValor.getValue().toString());
			}
		});
		spiValor.setFont(new Font("Starborn", Font.PLAIN, 12));
		spiValor.setBounds(50, 40, 130, 32);
		frmSpinner.getContentPane().add(spiValor);
		
		SpinnerNumberModel nm= new SpinnerNumberModel();
		nm.setMaximum(10);
		nm.setMinimum(0);
		nm.setStepSize(2);
		spiValor.setModel(nm);
	
	}
}