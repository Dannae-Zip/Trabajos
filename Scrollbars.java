package Trabajos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;
import java.awt.Toolkit;

public class Scrollbars {

	public  JFrame frmValores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scrollbars window = new Scrollbars();
					window.frmValores.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Scrollbars() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmValores = new JFrame();
		frmValores.setTitle("Valores");
		frmValores.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
		frmValores.setBounds(100, 100, 551, 300);
		frmValores.setLocationRelativeTo(null);
		frmValores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmValores.getContentPane().setLayout(null);
		
		JLabel etiValor = new JLabel("");
		etiValor.setBorder(
				new LineBorder(new Color(171, 126, 245), 2, true)
				);
		etiValor.setForeground(new Color(141, 84, 237));
		etiValor.setFont(new Font("Starborn", Font.PLAIN, 12));
		etiValor.setBounds(92, 131, 349, 30);
		frmValores.getContentPane().add(etiValor);
		
		JScrollBar desValor = new JScrollBar();
		desValor.setUnitIncrement(2);
		desValor.setBackground(new Color(255, 128, 192));
		desValor.setBlockIncrement(20);
		desValor.setMinimum(50);
		desValor.setMaximum(150);
		desValor.setVisibleAmount(5);
		desValor.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent e) {
				etiValor.setText("El valor es: "+desValor.getValue());
			}
		});
		desValor.setOrientation(JScrollBar.HORIZONTAL);
		desValor.setBounds(41, 52, 441, 30);
		frmValores.getContentPane().add(desValor);
	}
}