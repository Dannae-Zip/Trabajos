package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Font;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Filrchooser {
	

	public  JFrame frmMenus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Filrchooser window = new Filrchooser();
					window.frmMenus.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	javax.swing.JFileChooser elegirFichero= new javax.swing.JFileChooser();
	

	/**
	 * Create the application.
	 */
	public Filrchooser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenus = new JFrame();
		frmMenus.setTitle("Menus");
		frmMenus.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmMenus.setBounds(100, 100, 450, 300);
		frmMenus.setLocationRelativeTo(null);
		frmMenus.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmMenus.getContentPane().setLayout(null);
		
		JMenuBar barraMenus = new JMenuBar();
		barraMenus.setBounds(10, 11, 101, 22);
		frmMenus.getContentPane().add(barraMenus);
		
		JMenu menuArchivo = new JMenu("Archivo");
		barraMenus.add(menuArchivo);
		menuArchivo.setFont(new Font("Starborn", Font.PLAIN, 12));
		
		JMenuItem menuAbrir = new JMenuItem("Abrir");
		menuAbrir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resp = elegirFichero.showOpenDialog(null);
				if(resp== JFileChooser.APPROVE_OPTION) {
					JOptionPane.showMessageDialog(null, "Seleccionaste: "+elegirFichero.getSelectedFile().getAbsolutePath());
				}else if(resp==JFileChooser.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "Cancelaste la seleccion");
				}
				
			}
		});
		menuAbrir.setFont(new Font("Starborn", Font.PLAIN, 12));
		menuArchivo.add(menuAbrir);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 128, 192));
		menuArchivo.add(separator);
		
		JMenuItem menuSalir = new JMenuItem("Salir");
		menuSalir.setBackground(new Color(255, 128, 192));
		menuSalir.setFont(new Font("Starborn", Font.PLAIN, 12));
		menuArchivo.add(menuSalir);
	}
}