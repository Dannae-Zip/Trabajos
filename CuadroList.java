package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class CuadroList {

	public JFrame frmCursos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CuadroList window = new CuadroList();
					window.frmCursos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CuadroList() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCursos = new JFrame();
		frmCursos.setTitle("Cursos");
		frmCursos.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmCursos.setBounds(100, 100, 450, 300);
		frmCursos.setLocationRelativeTo(null);
		frmCursos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmCursos.getContentPane().setLayout(null);
		
		JLabel etiResultado = new JLabel("");
		etiResultado.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiResultado.setBounds(170, 23, 228, 28);
		frmCursos.getContentPane().add(etiResultado);
		etiResultado.setBorder(
				new LineBorder(new Color(255, 0, 0), 2, true)
				);
		
		JList lstNombres = new JList();
		lstNombres.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (lstNombres.getSelectedValue() != null) {
		            etiResultado.setText(lstNombres.getSelectedValue().toString());
				}
			}
		});
		lstNombres.setBorder(new LineBorder(new Color(255, 128, 128), 3, true));
		lstNombres.setBounds(10, 11, 132, 157);
		frmCursos.getContentPane().add(lstNombres);
		
	
		JButton btnCurso1 = new JButton("Curso 1");
		btnCurso1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel Modelo = new DefaultListModel();
				Modelo.addElement("Juan");
				Modelo.addElement("Maria");
				Modelo.addElement("Luis");
				lstNombres.setModel(Modelo);
				
			}
			
		});
		btnCurso1.setFont(new Font("Starborn", Font.PLAIN, 12));
		btnCurso1.setForeground(new Color(128, 64, 64));
		btnCurso1.setBounds(172, 79, 111, 23);
		frmCursos.getContentPane().add(btnCurso1);
		
		JButton btnCurso2 = new JButton("Curso 2");
		btnCurso2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel Modelo = new DefaultListModel();
				Modelo.addElement("Ana");
				Modelo.addElement("Marta");
				Modelo.addElement("Jose");
				lstNombres.setModel(Modelo);
				
			}
		});
		btnCurso2.setForeground(new Color(128, 64, 64));
		btnCurso2.setFont(new Font("Starborn", Font.PLAIN, 12));
		btnCurso2.setBounds(172, 113, 111, 23);
		frmCursos.getContentPane().add(btnCurso2);
	}

}