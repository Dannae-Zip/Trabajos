package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MenuTotal {

	private JFrame frmMenuDeOpciones;
	Verificacion e1= new Verificacion();
	Colorsss e2=new Colorsss();
	Lista e3=new Lista();
	Combinados e4= new Combinados();
	CuadroList e5=new CuadroList();
	ModCuadros e6=new ModCuadros();
	Togglebuttons e7= new Togglebuttons();
	Silders e8=new Silders();
	Spinner e9=new Spinner();
	Scrollbars e10=new Scrollbars();
	BarraMenu e11=new BarraMenu();
	BarraHer e12= new BarraHer();
	EmergentMenu e13=new EmergentMenu();
	Filrchooser e14=new Filrchooser();
	DezPanel e15=new DezPanel();
	Panel2 e15_2=new Panel2();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuTotal window = new MenuTotal();
					window.frmMenuDeOpciones.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuTotal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenuDeOpciones = new JFrame();
		frmMenuDeOpciones.setFont(new Font("Starborn", Font.PLAIN, 12));
		frmMenuDeOpciones.setTitle("Menu de Opciones");
		frmMenuDeOpciones.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmMenuDeOpciones.setBounds(100, 100, 644, 533);
		frmMenuDeOpciones.setLocationRelativeTo(null);
		frmMenuDeOpciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenuDeOpciones.getContentPane().setLayout(null);
		
		JButton btnPractica1 = new JButton(" Practica 1");
		btnPractica1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Verificacion e1= new Verificacion();
				e1.frmAnimales.setVisible(true);
			}
		});
		btnPractica1.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica1.setBackground(new Color(249, 206, 253));
		btnPractica1.setBounds(45, 33, 125, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica1);
		
		JButton btnPractica2 = new JButton(" Practica 2");
		btnPractica2.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Colorsss e2=new Colorsss();
				e2.frmColores.setVisible(true);
			}
		});
		btnPractica2.setBackground(new Color(249, 206, 253));
		btnPractica2.setBounds(45, 89, 125, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica2);
		
		JButton btnPractica3 = new JButton(" Practica 3");
		btnPractica3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lista e3=new Lista();
				e3.frmLista.setVisible(true);
			}
		});
		btnPractica3.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica3.setBackground(new Color(249, 206, 253));
		btnPractica3.setBounds(45, 133, 125, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica3);
		
		JButton btnPractica4 = new JButton(" Practica 4");
		btnPractica4.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Combinados e4= new Combinados();
				e4.frmColores2.setVisible(true);
			}
		});
		btnPractica4.setBackground(new Color(249, 206, 253));
		btnPractica4.setBounds(45, 177, 125, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica4);
		
		JButton btnPractica5 = new JButton(" Practica 5");
		btnPractica5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CuadroList e5=new CuadroList();
				e5.frmCursos.setVisible(true);
			}
		});
		btnPractica5.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica5.setBackground(new Color(249, 206, 253));
		btnPractica5.setBounds(45, 221, 125, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica5);
		
		JButton btnPractica6 = new JButton(" Practica 6");
		btnPractica6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModCuadros e6=new ModCuadros();
				e6.frmNumeros.setVisible(true);
			}
		});
		btnPractica6.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica6.setBackground(new Color(249, 206, 253));
		btnPractica6.setBounds(45, 278, 125, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica6);
		
		JButton btnPractica7 = new JButton(" Practica 7");
		btnPractica7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Togglebuttons e7= new Togglebuttons();
				e7.frmArregloDeTelefonos.setVisible(true);
			}
		});
		btnPractica7.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica7.setBackground(new Color(249, 206, 253));
		btnPractica7.setBounds(45, 329, 125, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica7);
		
		JButton btnPractica8 = new JButton(" Practica 8");
		btnPractica8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Silders e8=new Silders();
				e8.frmSilders.setVisible(true);
			}
		});
		btnPractica8.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica8.setBackground(new Color(249, 206, 253));
		btnPractica8.setBounds(45, 386, 125, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica8);
		
		JButton btnPractica9 = new JButton(" Practica 9");
		btnPractica9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Spinner e9=new Spinner();
				e9.frmSpinner.setVisible(true);
			}
		});
		btnPractica9.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica9.setBackground(new Color(249, 206, 253));
		btnPractica9.setBounds(45, 438, 125, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica9);
		
		JButton btnPractica10 = new JButton(" Practica 10");
		btnPractica10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Scrollbars e10=new Scrollbars();
				e10.frmValores.setVisible(true);
			}
		});
		btnPractica10.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica10.setBackground(new Color(249, 206, 253));
		btnPractica10.setBounds(213, 38, 146, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica10);
		
		JButton btnPractica11 = new JButton(" Practica 11");
		btnPractica11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BarraMenu e11=new BarraMenu();
				e11.frmBarrasDeMenu.setVisible(true);
			}
		});
		btnPractica11.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica11.setBackground(new Color(249, 206, 253));
		btnPractica11.setBounds(213, 89, 146, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica11);
		
		JButton btnPractica12 = new JButton(" Practica 12");
		btnPractica12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BarraHer e12= new BarraHer();
				e12.frmHerramientas.setVisible(true);
			}
		});
		btnPractica12.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica12.setBackground(new Color(249, 206, 253));
		btnPractica12.setBounds(213, 133, 146, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica12);
		
		JButton btnPractica13 = new JButton(" Practica 13");
		btnPractica13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EmergentMenu e13=new EmergentMenu();
				e13.frmMenuEmergente.setVisible(true);
			}
		});
		btnPractica13.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica13.setBackground(new Color(249, 206, 253));
		btnPractica13.setBounds(213, 177, 146, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica13);
		
		JButton btnPractica14 = new JButton(" Practica 14");
		btnPractica14.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Filrchooser e14=new Filrchooser();
				e14.frmMenus.setVisible(true);
			}
		});
		btnPractica14.setBackground(new Color(249, 206, 253));
		btnPractica14.setBounds(213, 221, 146, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica14);
		
		JButton btnPractica15 = new JButton(" Practica 15");
		btnPractica15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DezPanel e15=new DezPanel();
				e15.frmImagen.setVisible(true);
			}
		});
		btnPractica15.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica15.setBackground(new Color(249, 206, 253));
		btnPractica15.setBounds(213, 278, 146, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica15);
		
		JButton btnPractica16 = new JButton(" Practica 16");
		btnPractica16.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica16.setBackground(new Color(249, 206, 253));
		btnPractica16.setBounds(213, 386, 146, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica16);
		
		JButton btnPractica17 = new JButton(" Practica 17");
		btnPractica17.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica17.setBackground(new Color(249, 206, 253));
		btnPractica17.setBounds(213, 438, 146, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica17);
		
		JButton btnPractica18 = new JButton(" Practica 18");
		btnPractica18.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica18.setBackground(new Color(249, 206, 253));
		btnPractica18.setBounds(381, 33, 146, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica18);
		
		JButton btnPractica19 = new JButton(" Practica 19");
		btnPractica19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPractica19.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica19.setBackground(new Color(249, 206, 253));
		btnPractica19.setBounds(388, 89, 139, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica19);
		
		JButton btnPractica20 = new JButton(" Practica 20");
		btnPractica20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPractica20.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica20.setBackground(new Color(249, 206, 253));
		btnPractica20.setBounds(388, 133, 139, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica20);
		
		JButton btnPractica21 = new JButton(" Practica 21");
		btnPractica21.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica21.setBackground(new Color(249, 206, 253));
		btnPractica21.setBounds(388, 177, 139, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica21);
		
		JButton btnPractica22 = new JButton(" Practica 22");
		btnPractica22.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica22.setBackground(new Color(249, 206, 253));
		btnPractica22.setBounds(388, 221, 139, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica22);
		
		JButton btnPractica23 = new JButton(" Practica 23");
		btnPractica23.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica23.setBackground(new Color(249, 206, 253));
		btnPractica23.setBounds(388, 278, 139, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica23);
		
		JButton btnPractica24 = new JButton(" Practica 24");
		btnPractica24.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica24.setBackground(new Color(249, 206, 253));
		btnPractica24.setBounds(388, 329, 139, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica24);
		
		JButton btnPractica25 = new JButton(" Practica 25");
		btnPractica25.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica25.setBackground(new Color(249, 206, 253));
		btnPractica25.setBounds(388, 386, 139, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica25);
		
		JButton btnPractica26 = new JButton(" Practica 26");
		btnPractica26.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica26.setBackground(new Color(249, 206, 253));
		btnPractica26.setBounds(388, 438, 139, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica26);
		
		JButton btnPractica15_1 = new JButton(" Practica 15.2");
		btnPractica15_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel2 e15_2=new Panel2();
				e15_2.frmPanel.setVisible(true);
			}
		});
		btnPractica15_1.setFont(new Font("Starborn", Font.PLAIN, 11));
		btnPractica15_1.setBackground(new Color(249, 206, 253));
		btnPractica15_1.setBounds(213, 329, 146, 33);
		frmMenuDeOpciones.getContentPane().add(btnPractica15_1);
	}
}
