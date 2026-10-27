package Trabajos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Toolkit;

public class CentrCodigo extends JFrame {

	public static final long serialVersionUID = 1L;
	public  JPanel contentPane;
	public  JTextField txtNumero1;
	public JTextField txtNumero2;
	public  JLabel etiResultado;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CentrCodigo frame = new CentrCodigo();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public CentrCodigo() {
    	setBackground(new Color(249, 206, 253));
    	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
        setTitle("Calculadora");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 300, 350);
        setLocationRelativeTo(null);
        

        JMenuBar menuBarra = new JMenuBar();
        setJMenuBar(menuBarra);

        JMenu menuCalcular = new JMenu("Calcular");
        menuCalcular.setBackground(new Color(255, 128, 192));
        menuBarra.add(menuCalcular);

        JMenuItem menuSumar = new JMenuItem("Sumar");
        menuCalcular.add(menuSumar);
        menuSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sumar();
            }
        });

        JMenuItem menuRestar = new JMenuItem("Restar");
        menuCalcular.add(menuRestar);
        menuRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Restar();
            }
        });

        JMenuItem menuBorrar = new JMenuItem("Borrar");
        menuCalcular.add(menuBorrar);
        menuBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Borrar();
            }
        });

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNum1 = new JLabel("Número 1:");
        lblNum1.setFont(new Font("Love", Font.PLAIN, 13));
        lblNum1.setBackground(new Color(238, 182, 252));
        lblNum1.setBounds(25, 25, 80, 20);
        contentPane.add(lblNum1);

        txtNumero1 = new JTextField("0");
        txtNumero1.setBounds(110, 25, 120, 20);
        contentPane.add(txtNumero1);

        JLabel lblNum2 = new JLabel("Número 2:");
        lblNum2.setFont(new Font("Love", Font.PLAIN, 13));
        lblNum2.setBounds(25, 60, 80, 20);
        contentPane.add(lblNum2);

        txtNumero2 = new JTextField("0");
        txtNumero2.setBounds(110, 60, 120, 20);
        contentPane.add(txtNumero2);

        etiResultado = new JLabel("");
        etiResultado.setHorizontalAlignment(SwingConstants.CENTER);
        etiResultado.setBorder(new LineBorder(new Color(255, 128, 192), 2, true));
        etiResultado.setBounds(25, 95, 205, 30);
        contentPane.add(etiResultado);

        JButton btnSumar = new JButton("Sumar");
        btnSumar.setFont(new Font("Love", Font.PLAIN, 11));
        btnSumar.setBounds(25, 140, 205, 25);
        contentPane.add(btnSumar);
        btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sumar();
            }
        });

        JButton btnRestar = new JButton("Restar");
        btnRestar.setFont(new Font("Love", Font.PLAIN, 11));
        btnRestar.setBounds(25, 175, 205, 25);
        contentPane.add(btnRestar);
        btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Restar();
            }
        });

        JButton btnBorrar = new JButton("Borrar");
        btnBorrar.setFont(new Font("Love", Font.PLAIN, 11));
        btnBorrar.setBounds(25, 210, 205, 25);
        contentPane.add(btnBorrar);
        btnBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Borrar();
            }
        });
    }

    void Sumar() {
        try {
            int a = Integer.parseInt(txtNumero1.getText());
            int b = Integer.parseInt(txtNumero2.getText());

            etiResultado.setText(String.valueOf(a + b));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Introduce números enteros válidos.");
        }
    }

    void Restar() {
        try {
            int a = Integer.parseInt(txtNumero1.getText());
            int b = Integer.parseInt(txtNumero2.getText());

            etiResultado.setText(String.valueOf(a - b));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Introduce números enteros válidos.");
        }
    }

    void Borrar() {
        txtNumero1.setText("");
        txtNumero2.setText("");
        etiResultado.setText("");
    }
}