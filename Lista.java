package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.AbstractListModel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;

public class Lista {

	public  JFrame frmLista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista window = new Lista();
					window.frmLista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLista = new JFrame();
		frmLista.setTitle("Lista");
		frmLista.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmLista.setBounds(100, 100, 450, 300);
		frmLista.setLocationRelativeTo(null);
		frmLista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmLista.getContentPane().setLayout(null);
		
		JList lstColores = new JList();
		lstColores.setFont(new Font("Starborn", Font.PLAIN, 12));
		lstColores.setForeground(new Color(64, 0, 128));
		lstColores.setModel(new AbstractListModel() {
			String[] values = new String[] {"Rojo", "Azul", "Verde"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		lstColores.setBorder(new LineBorder(new Color(206, 160, 243), 4, true));
		lstColores.setBounds(10, 11, 226, 160);
		frmLista.getContentPane().add(lstColores);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setBounds(103, 216, 285, 34);
		frmLista.getContentPane().add(etiResultado);
		etiResultado.setBorder(
				javax.swing.BorderFactory.createLineBorder(java.awt.Color.CYAN)
				);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Starborn", Font.PLAIN, 12));
		btnAceptar.setForeground(new Color(206, 160, 243));
		btnAceptar.setBounds(20, 182, 131, 23);
		frmLista.getContentPane().add(btnAceptar);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
		String mensaje="El color seleccionado es : "+lstColores.getSelectedValue().toString();
		etiResultado.setText(mensaje);
			}
		});
	}
}