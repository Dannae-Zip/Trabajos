package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class BarraHer {

	public  JFrame frmHerramientas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarraHer window = new BarraHer();
					window.frmHerramientas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BarraHer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHerramientas = new JFrame();
		frmHerramientas.setTitle("Herramientas");
		frmHerramientas.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmHerramientas.setBounds(100, 100, 760, 490);
		frmHerramientas.setLocationRelativeTo(null);
		frmHerramientas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmHerramientas.getContentPane().setLayout(null);
		
		JMenuBar menuHerramientas = new JMenuBar();
		menuHerramientas.setToolTipText("Menu");
		menuHerramientas.setBackground(new Color(255, 128, 192));
		menuHerramientas.setForeground(new Color(255, 128, 192));
		menuHerramientas.setFont(new Font("Love", Font.PLAIN, 12));
		menuHerramientas.setBounds(10, 11, 101, 22);
		frmHerramientas.getContentPane().add(menuHerramientas);
		
		JToolBar barraHerramientas = new JToolBar();
		barraHerramientas.setForeground(new Color(255, 128, 192));
		barraHerramientas.setFont(new Font("Love", Font.PLAIN, 12));
		barraHerramientas.setBounds(10, 40, 414, 16);
		frmHerramientas.getContentPane().add(barraHerramientas);
		
		JButton btnUno = new JButton("Uno");
		barraHerramientas.add(btnUno);
		btnUno.setIcon(null);
		btnUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Activaste el boton uno");
			}
		});
		btnUno.setForeground(new Color(227, 128, 249));
		btnUno.setFont(new Font("Love", Font.PLAIN, 12));
		
		JButton btnDos = new JButton("Dos");
		btnDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Activaste el boton dos");
				
			}
		});
		btnDos.setForeground(new Color(227, 128, 249));
		btnDos.setFont(new Font("Love", Font.PLAIN, 12));
		barraHerramientas.add(btnDos);
		
		JButton btnTres = new JButton("Tres");
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Activaste el boton tres");
				
			}
		});
		btnTres.setForeground(new Color(227, 128, 249));
		btnTres.setFont(new Font("Love", Font.PLAIN, 12));
		barraHerramientas.add(btnTres);
		
		JButton btnCuatro = new JButton("Cuatro");
		btnCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Activaste el boton cuatro");
				
			}
		});
		btnCuatro.setForeground(new Color(227, 128, 249));
		btnCuatro.setFont(new Font("Love", Font.PLAIN, 12));
		barraHerramientas.add(btnCuatro);
	}
}