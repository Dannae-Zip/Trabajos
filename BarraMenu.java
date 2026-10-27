package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class BarraMenu {

	public  JFrame frmBarrasDeMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarraMenu window = new BarraMenu();
					window.frmBarrasDeMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BarraMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBarrasDeMenu = new JFrame();
		frmBarrasDeMenu.setBackground(new Color(255, 128, 192));
		frmBarrasDeMenu.setTitle("Barras de Menu");
		frmBarrasDeMenu.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmBarrasDeMenu.setBounds(100, 100, 450, 300);
		frmBarrasDeMenu.setLocationRelativeTo(null);
		frmBarrasDeMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JMenuBar barrasMenus = new JMenuBar();
		barrasMenus.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		barrasMenus.setForeground(new Color(255, 128, 192));
		frmBarrasDeMenu.setJMenuBar(barrasMenus);
		
		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.setForeground(new Color(255, 128, 192));
		menuArchivo.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		barrasMenus.add(menuArchivo);
		
		JMenuItem menuItemAbrir = new JMenuItem("Abrir");
		menuItemAbrir.setForeground(new Color(128, 128, 192));
		menuItemAbrir.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		menuArchivo.add(menuItemAbrir);
		
		JMenuItem menuItemGuardar = new JMenuItem("Guardar");
		menuItemGuardar.setForeground(new Color(128, 128, 192));
		menuItemGuardar.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		menuArchivo.add(menuItemGuardar);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(255, 128, 192));
		menuArchivo.add(separator_1);
		
		JMenuItem menuSalir = new JMenuItem("Salir");
		menuSalir.setForeground(new Color(128, 128, 192));
		menuSalir.setFont(new Font("Sitka Text", Font.PLAIN, 12));
		menuArchivo.add(menuSalir);
		
		JMenu menuEdicion = new JMenu("Edicion");
		menuEdicion.setForeground(new Color(255, 128, 192));
		menuEdicion.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		barrasMenus.add(menuEdicion);
		
		JMenu menuColores = new JMenu("Colores");
		menuColores.setForeground(new Color(128, 128, 255));
		menuColores.setFont(new Font("Sitka Text", Font.PLAIN, 13));
		menuEdicion.add(menuColores);
		
		JMenuItem menuItemRojo = new JMenuItem("Rojo");
		menuItemRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			frmBarrasDeMenu.getContentPane().setBackground(Color.RED);
			}
		});
		menuItemRojo.setForeground(new Color(255, 0, 0));
		menuItemRojo.setFont(new Font("Love", Font.PLAIN, 12));
		menuColores.add(menuItemRojo);
		
		JMenuItem menuItemAzul = new JMenuItem("Azul");
		menuItemAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBarrasDeMenu.getContentPane().setBackground(Color.BLUE);
			}
		});
		menuItemAzul.setForeground(new Color(0, 128, 192));
		menuItemAzul.setFont(new Font("Love", Font.PLAIN, 12));
		menuColores.add(menuItemAzul);
		
		JMenuItem menuItemVerde = new JMenuItem("Verde");
		menuItemVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmBarrasDeMenu.getContentPane().setBackground(Color.GREEN);
			}
		});
		menuItemVerde.setForeground(new Color(103, 147, 21));
		menuItemVerde.setFont(new Font("Love", Font.PLAIN, 12));
		menuColores.add(menuItemVerde);
		
		JMenu menuInsertar = new JMenu("Insertar");
		menuInsertar.setForeground(new Color(255, 128, 192));
		menuInsertar.setFont(new Font("Love", Font.PLAIN, 13));
		barrasMenus.add(menuInsertar);
		
		JSeparator separator = new JSeparator();
		frmBarrasDeMenu.getContentPane().add(separator, BorderLayout.CENTER);
	}

}