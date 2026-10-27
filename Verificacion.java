package Trabajos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.Font;

public class Verificacion {

	public JFrame frmAnimales;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Verificacion window = new Verificacion();
					window.frmAnimales.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Verificacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAnimales = new JFrame();
		frmAnimales.getContentPane().setBackground(new Color(255, 255, 255));
		frmAnimales.setTitle("Animales");
		frmAnimales.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmAnimales.setBounds(100, 100, 450, 300);
		frmAnimales.setLocationRelativeTo(null);
		frmAnimales.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAnimales.getContentPane().setLayout(null);
		
		JCheckBox chkPerro = new JCheckBox("Perro");
		chkPerro.setFont(new Font("Starborn", Font.PLAIN, 12));
		chkPerro.setForeground(new Color(255, 128, 192));
		chkPerro.setBounds(18, 32, 106, 23);
		frmAnimales.getContentPane().add(chkPerro);
		
		JCheckBox chkGato = new JCheckBox("Gato");
		chkGato.setFont(new Font("Starborn", Font.PLAIN, 12));
		chkGato.setForeground(new Color(255, 128, 192));
		chkGato.setBounds(18, 58, 97, 23);
		frmAnimales.getContentPane().add(chkGato);
		
		JCheckBox chkRaton = new JCheckBox("Raton");
		chkRaton.setFont(new Font("Starborn", Font.PLAIN, 12));
		chkRaton.setForeground(new Color(255, 128, 192));
		chkRaton.setBounds(18, 84, 97, 23);
		frmAnimales.getContentPane().add(chkRaton);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiResultado.setBorder(
				javax.swing.BorderFactory.createLineBorder(java.awt.Color.PINK)
				);
		etiResultado.setBounds(78, 187, 254, 14);
		frmAnimales.getContentPane().add(etiResultado);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Starborn", Font.PLAIN, 12));
		btnAceptar.setForeground(new Color(255, 128, 192));
		btnAceptar.setBounds(26, 137, 134, 23);
		frmAnimales.getContentPane().add(btnAceptar);
		btnAceptar.addActionListener(new ActionListener() {
	
				@Override
				public void actionPerformed(ActionEvent e){
			String mensaje="Animales seleccionados: ";
			if(chkPerro.isSelected()) {
				mensaje += "Perro ";
			}
			if(chkGato.isSelected()) {
				mensaje += "Gato ";
			}
			if(chkRaton.isSelected()) {
				mensaje += "Raton ";
			}
			etiResultado.setText(mensaje);
		}

				 {
					// TODO Auto-generated method stub
					
				}
		});
	}
}