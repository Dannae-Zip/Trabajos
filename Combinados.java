package Trabajos;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

public class Combinados {

	public  JFrame frmColores2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Combinados window = new Combinados();
					window.frmColores2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Combinados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmColores2 = new JFrame();
		frmColores2.setTitle("Colores 2.0");
		frmColores2.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmColores2.setBounds(100, 100, 450, 300);
		frmColores2.setLocationRelativeTo(null);
		frmColores2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmColores2.getContentPane().setLayout(null);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiResultado.setBorder(
				javax.swing.BorderFactory.createLineBorder(java.awt.Color.PINK)
				);
		etiResultado.setBounds(36, 115, 280, 22);
		frmColores2.getContentPane().add(etiResultado);
		
		JComboBox cboColores = new JComboBox();
		cboColores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String mensaje= "El color elegido es ";
				mensaje = mensaje+cboColores.getSelectedItem().toString();
				etiResultado.setText(mensaje);
			}
		});
		cboColores.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		cboColores.setForeground(new Color(255, 128, 192));
		cboColores.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "Verde", "Azul"}));
		cboColores.setBounds(36, 40, 152, 45);
		frmColores2.getContentPane().add(cboColores);
		
	}
}