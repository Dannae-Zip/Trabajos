package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class DezPanel {

	public JFrame frmImagen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DezPanel window = new DezPanel();
					window.frmImagen.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DezPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmImagen = new JFrame();
		frmImagen.setTitle("Imagen");
		frmImagen.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmImagen.setBounds(100, 100, 745, 480);
		frmImagen.setLocationRelativeTo(null);
		frmImagen.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmImagen.getContentPane().setLayout(null);
		
		JLabel etiImagen= new JLabel("");
		etiImagen.setIcon(new ImageIcon("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		etiImagen.setFont(new Font("Starborn", Font.PLAIN, 12));
		JScrollPane scpImagen= new JScrollPane(etiImagen);
		scpImagen.setBounds(0, 0, 719, 441);
		frmImagen.getContentPane().add(scpImagen);
		
	}
}