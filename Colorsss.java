package Trabajos;
import javax.swing.ButtonGroup;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import java.awt.Toolkit;

public class Colorsss {

	public  JFrame frmColores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colorsss window = new Colorsss();
					window.frmColores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Colorsss() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmColores = new JFrame();
		frmColores.setTitle("Colores");
		frmColores.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmColores.setBounds(100, 100, 464, 342);
		frmColores.setLocationRelativeTo(null);
		frmColores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmColores.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Colores", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(255, 128, 192)));
		panel.setBounds(23, 11, 201, 152);
		frmColores.getContentPane().add(panel);
		
		JRadioButton optRojo = new JRadioButton("Rojo");
		optRojo.setFont(new Font("Starborn", Font.PLAIN, 12));
		optRojo.setSelected(true);
		optRojo.setForeground(new Color(255, 0, 0));
		panel.add(optRojo);
		
		JRadioButton optAzul = new JRadioButton("Azul");
		optAzul.setFont(new Font("Starborn", Font.PLAIN, 12));
		optAzul.setForeground(new Color(0, 128, 255));
		panel.add(optAzul);
		
		JRadioButton optVerde = new JRadioButton("Verde");
		optVerde.setFont(new Font("Starborn", Font.PLAIN, 12));
		optVerde.setForeground(new Color(0, 128, 64));
		panel.add(optVerde);
		
		ButtonGroup grupoColores= new ButtonGroup();
		grupoColores.add(optRojo);
		grupoColores.add(optAzul);
		grupoColores.add(optVerde);
		
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiResultado.setBorder(
				javax.swing.BorderFactory.createLineBorder(java.awt.Color.MAGENTA)
				);
		etiResultado.setBounds(188, 189, 236, 29);
		frmColores.getContentPane().add(etiResultado);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Starborn", Font.PLAIN, 12));
		btnAceptar.setForeground(new Color(128, 128, 192));
		btnAceptar.setBounds(34, 174, 116, 38);
		frmColores.getContentPane().add(btnAceptar);
		frmColores.getContentPane().add(btnAceptar);
		btnAceptar.addActionListener(new ActionListener() {
	
				@Override
				public void actionPerformed(ActionEvent e){
			String mensaje="Color elegido: ";
			if(optRojo.isSelected()) {
				mensaje += "Rojo ";
			}
			else if(optAzul.isSelected()) {
				mensaje += "Azul ";
			}
			else if(optVerde.isSelected()) {
				mensaje += "Verde ";
			}
			etiResultado.setText(mensaje);
				}
		});
		
	}
}