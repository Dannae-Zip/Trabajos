package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.border.LineBorder;

import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import java.awt.Toolkit;

public class Silders {

	public  JFrame frmSilders;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Silders window = new Silders();
					window.frmSilders.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Silders() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSilders = new JFrame();
		frmSilders.setTitle("Silders");
		frmSilders.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmSilders.setBounds(100, 100, 531, 300);
		frmSilders.setLocationRelativeTo(null);
		frmSilders.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmSilders.getContentPane().setLayout(null);
		
		JLabel etiValor = new JLabel("");
		etiValor.setBorder(
				new LineBorder(new Color(171, 126, 245), 2, true)
				);
		etiValor.setForeground(new Color(141, 84, 237));
		etiValor.setFont(new Font("Starborn", Font.PLAIN, 11));
		etiValor.setBounds(88, 156, 347, 26);
		frmSilders.getContentPane().add(etiValor);
		
		JSlider slDeslizador = new JSlider();
		slDeslizador.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				etiValor.setText("El valor es: "+slDeslizador.getValue());
			}
		});
		slDeslizador.setValue(400);
		slDeslizador.setPaintTicks(true);
		slDeslizador.setPaintLabels(true);
		slDeslizador.setMinimum(100);
		slDeslizador.setMaximum(500);
		slDeslizador.setMajorTickSpacing(50);
		slDeslizador.setFont(new Font("Starborn", Font.PLAIN, 12));
		slDeslizador.setBounds(46, 36, 414, 59);
		frmSilders.getContentPane().add(slDeslizador);
	}
}