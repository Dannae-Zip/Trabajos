package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JLabel;

public class SignosZodiacales {

	private JFrame frmSignosZodiacales;

	public static void main(String[] args) {

		SignosZodiacales window = new SignosZodiacales();
		window.frmSignosZodiacales.setVisible(true);
	}

	public SignosZodiacales() {

		frmSignosZodiacales = new JFrame();
		frmSignosZodiacales.setResizable(false);
		frmSignosZodiacales.setBackground(new Color(240, 240, 240));
		frmSignosZodiacales.setTitle("Signos Zodiacales");
		frmSignosZodiacales.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmSignosZodiacales.setBounds(100, 100, 576, 358);
		frmSignosZodiacales.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignosZodiacales.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(316, 30, 207, 231);
		frmSignosZodiacales.getContentPane().add(lblNewLabel);
	}
}
