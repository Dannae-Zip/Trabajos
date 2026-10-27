package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Panel2 {

	public JFrame frmPanel;
	public JTextField textField;
	public  JTextField textField_1;
	public JTextField textField_2;
	public  JTextField textField_3;
	public JTextField textField_4;
	public  JTextField textField_5;
	public  JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel2 window = new Panel2();
					window.frmPanel.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Panel2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPanel = new JFrame();
		frmPanel.setTitle("Panel 2");
		frmPanel.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmPanel.setBounds(100, 100, 619, 475);
		frmPanel.setLocationRelativeTo(null);
		frmPanel.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmPanel.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(42, 11, 534, 401);
		frmPanel.getContentPane().add(scrollPane);
		
		JPanel panelDatos = new JPanel();
		panelDatos.setLayout(null);
		panelDatos.setBackground(new Color(255, 128, 192));
		panelDatos.setPreferredSize(new Dimension(1000, 1000));
		scrollPane.setViewportView(panelDatos);
		panelDatos.setLayout(null);
		
		JLabel etiDatos = new JLabel("Panel de datos");
		etiDatos.setVerticalAlignment(SwingConstants.BOTTOM);
		etiDatos.setFont(new Font("Starborn", Font.PLAIN, 18));
		etiDatos.setBackground(Color.WHITE);
		etiDatos.setBounds(296, 5, 159, 46);
		panelDatos.add(etiDatos);
		
		JLabel etiLunes = new JLabel("Lunes :");
		etiLunes.setVerticalAlignment(SwingConstants.BOTTOM);
		etiLunes.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiLunes.setBackground(Color.WHITE);
		etiLunes.setBounds(10, 62, 200, 44);
		panelDatos.add(etiLunes);
		
		JLabel etiMartes = new JLabel("Martes :");
		etiMartes.setVerticalAlignment(SwingConstants.BOTTOM);
		etiMartes.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiMartes.setBackground(Color.WHITE);
		etiMartes.setBounds(10, 117, 200, 44);
		panelDatos.add(etiMartes);
		
		JLabel etiMiercoles = new JLabel("Miercoles :");
		etiMiercoles.setVerticalAlignment(SwingConstants.BOTTOM);
		etiMiercoles.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiMiercoles.setBackground(Color.WHITE);
		etiMiercoles.setBounds(10, 162, 200, 44);
		panelDatos.add(etiMiercoles);
		
		JLabel etiJueves = new JLabel("Jueves :");
		etiJueves.setVerticalAlignment(SwingConstants.BOTTOM);
		etiJueves.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiJueves.setBackground(Color.WHITE);
		etiJueves.setBounds(10, 209, 200, 44);
		panelDatos.add(etiJueves);
		
		JLabel etiViernes = new JLabel("Viernes :");
		etiViernes.setVerticalAlignment(SwingConstants.BOTTOM);
		etiViernes.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiViernes.setBackground(Color.WHITE);
		etiViernes.setBounds(10, 256, 200, 44);
		panelDatos.add(etiViernes);
		
		JLabel etiSabado = new JLabel("Sabado :");
		etiSabado.setVerticalAlignment(SwingConstants.BOTTOM);
		etiSabado.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiSabado.setBackground(Color.WHITE);
		etiSabado.setBounds(10, 299, 200, 44);
		panelDatos.add(etiSabado);
		
		JLabel etiDomingo = new JLabel("Domingo :");
		etiDomingo.setVerticalAlignment(SwingConstants.BOTTOM);
		etiDomingo.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiDomingo.setBackground(Color.WHITE);
		etiDomingo.setBounds(10, 344, 200, 44);
		panelDatos.add(etiDomingo);
		
		textField = new JTextField();
		textField.setBounds(220, 87, 237, 20);
		panelDatos.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(220, 142, 237, 20);
		panelDatos.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(220, 187, 224, 20);
		panelDatos.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(220, 234, 237, 20);
		panelDatos.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(220, 281, 237, 20);
		panelDatos.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(220, 324, 237, 20);
		panelDatos.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(220, 369, 224, 20);
		panelDatos.add(textField_6);
		textField_6.setColumns(10);
	}
}
