package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ModCuadros {

	public  JFrame frmNumeros;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ModCuadros window = new ModCuadros();
					window.frmNumeros.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ModCuadros() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNumeros = new JFrame();
		frmNumeros.setTitle("Numeros");
		frmNumeros.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmNumeros.setBounds(100, 100, 450, 300);
		frmNumeros.setLocationRelativeTo(null);
		frmNumeros.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmNumeros.getContentPane().setLayout(null);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiResultado.setBorder(
				new LineBorder(new Color(255, 128, 64), 2, true)
				);
		etiResultado.setBounds(48, 143, 265, 27);
		frmNumeros.getContentPane().add(etiResultado);
		
		JComboBox cboNumeros = new JComboBox();
		cboNumeros.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etiResultado.setText(cboNumeros.getSelectedItem().toString());
			}
		});
		cboNumeros.setForeground(new Color(128, 0, 0));
		cboNumeros.setFont(new Font("Starborn", Font.PLAIN, 12));
		cboNumeros.setBounds(48, 37, 162, 45);
		frmNumeros.getContentPane().add(cboNumeros);
		
		JButton btnPares = new JButton("Pares");
		btnPares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo= new DefaultComboBoxModel();
				for(i=0;i<10;i+=2) {
					modelo.addElement("N° "+i);
				}
				cboNumeros.setModel(modelo);
		
			}
		});
		btnPares.setForeground(new Color(255, 128, 64));
		btnPares.setFont(new Font("Starborn", Font.PLAIN, 12));
		btnPares.setBounds(220, 24, 131, 36);
		frmNumeros.getContentPane().add(btnPares);
		
		JButton btnImpares = new JButton("Impares");
		btnImpares.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i;
				DefaultComboBoxModel modelo= new DefaultComboBoxModel();
				for(i=1;i<10;i+=2) {
					modelo.addElement("N° "+i);
				}
				cboNumeros.setModel(modelo);
		
			}
		});
		btnImpares.setForeground(new Color(255, 128, 64));
		btnImpares.setFont(new Font("Starborn", Font.PLAIN, 12));
		btnImpares.setBounds(220, 67, 131, 36);
		frmNumeros.getContentPane().add(btnImpares);
		
		JButton bntVaciar = new JButton("Vaciar");
		bntVaciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultComboBoxModel modelo= new DefaultComboBoxModel();
				cboNumeros.setModel(modelo);
				etiResultado.setText(" ");
			}
		});
		bntVaciar.setForeground(new Color(255, 128, 64));
		bntVaciar.setFont(new Font("Starborn", Font.PLAIN, 12));
		bntVaciar.setBounds(58, 191, 131, 36);
		frmNumeros.getContentPane().add(bntVaciar);
	}
}