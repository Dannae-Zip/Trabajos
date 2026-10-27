package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Togglebuttons {

	public  JFrame frmArregloDeTelefonos;
	public  JTextField txtPrecioBase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Togglebuttons window = new Togglebuttons();
					window.frmArregloDeTelefonos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Togglebuttons() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmArregloDeTelefonos = new JFrame();
		frmArregloDeTelefonos.setTitle("Arreglo de telefonos");
		frmArregloDeTelefonos.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmArregloDeTelefonos.setBounds(100, 100, 450, 300);
		frmArregloDeTelefonos.setLocationRelativeTo(null);
		frmArregloDeTelefonos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmArregloDeTelefonos.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Precio Base: ");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Starborn", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 11, 123, 14);
		frmArregloDeTelefonos.getContentPane().add(lblNewLabel);
		
		txtPrecioBase = new JTextField();
		txtPrecioBase.setForeground(new Color(64, 0, 0));
		txtPrecioBase.setFont(new Font("Starborn", Font.PLAIN, 12));
		txtPrecioBase.setBounds(20, 36, 158, 20);
		frmArregloDeTelefonos.getContentPane().add(txtPrecioBase);
		txtPrecioBase.setColumns(10);
		
		JLabel etiTotal = new JLabel("");
		etiTotal.setBorder(
				new LineBorder(new Color(221, 0, 0), 2, true)
				);
		etiTotal.setForeground(new Color(64, 0, 0));
		etiTotal.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiTotal.setBounds(64, 208, 252, 31);
		frmArregloDeTelefonos.getContentPane().add(etiTotal);
		
		JToggleButton tbtnInstalacion = new JToggleButton("Instalacion");
		tbtnInstalacion.setForeground(new Color(221, 0, 0));
		tbtnInstalacion.setFont(new Font("Starborn", Font.PLAIN, 12));
		tbtnInstalacion.setBounds(30, 67, 121, 23);
		frmArregloDeTelefonos.getContentPane().add(tbtnInstalacion);
		
		JToggleButton tbtnFormacion = new JToggleButton("Formacion");
		tbtnFormacion.setForeground(new Color(221, 0, 0));
		tbtnFormacion.setFont(new Font("Starborn", Font.PLAIN, 12));
		tbtnFormacion.setBounds(28, 101, 121, 23);
		frmArregloDeTelefonos.getContentPane().add(tbtnFormacion);
		
		JToggleButton tbtnAlimentacionBD = new JToggleButton("Alimentacion BD");
		tbtnAlimentacionBD.setForeground(new Color(221, 0, 0));
		tbtnAlimentacionBD.setFont(new Font("Starborn", Font.PLAIN, 12));
		tbtnAlimentacionBD.setBounds(28, 135, 121, 23);
		frmArregloDeTelefonos.getContentPane().add(tbtnAlimentacionBD);
		
		JLabel etiPrecioInstalacion = new JLabel("40");
		etiPrecioInstalacion.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiPrecioInstalacion.setBounds(161, 67, 46, 14);
		frmArregloDeTelefonos.getContentPane().add(etiPrecioInstalacion);
		
		JLabel etiPrecioFormacion = new JLabel("200");
		etiPrecioFormacion.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiPrecioFormacion.setBounds(161, 103, 46, 14);
		frmArregloDeTelefonos.getContentPane().add(etiPrecioFormacion);
		
		JLabel etiPrecioAlimentacionBD = new JLabel("200");
		etiPrecioAlimentacionBD.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiPrecioAlimentacionBD.setBounds(161, 137, 46, 14);
		frmArregloDeTelefonos.getContentPane().add(etiPrecioAlimentacionBD);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Starborn", Font.PLAIN, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double precio_base;
				double precio_instal;
				double precio_for;
				double precio_ali;
				precio_base=Double.parseDouble(txtPrecioBase.getText());
				precio_instal=Double.parseDouble(etiPrecioInstalacion.getText());
				precio_for=Double.parseDouble(etiPrecioFormacion.getText());
				precio_ali=Double.parseDouble(etiPrecioAlimentacionBD.getText());
				double precio_total;
				precio_total=precio_base;
				if(tbtnInstalacion.isSelected()) {
					precio_total=precio_total+precio_instal;
				}
				if(tbtnFormacion.isSelected()) {
					precio_total=precio_total+precio_for;
				}
				if(tbtnAlimentacionBD.isSelected()) {
					precio_total=precio_total+precio_ali;
				}
				etiTotal.setText(precio_total+" $");
			}
		});
		btnCalcular.setForeground(new Color(128, 0, 0));
		btnCalcular.setFont(new Font("Starborn", Font.PLAIN, 12));
		btnCalcular.setBounds(30, 174, 113, 23);
		frmArregloDeTelefonos.getContentPane().add(btnCalcular);
	}
}