package Trabajos;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmergentMenu {

    public JFrame frmMenuEmergente;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EmergentMenu window = new EmergentMenu();
                    window.frmMenuEmergente.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public EmergentMenu() {
        initialize();
    }

    private void initialize() {
        frmMenuEmergente = new JFrame();
        frmMenuEmergente.setTitle("Menu Emergente");
        frmMenuEmergente.setLocationRelativeTo(null);
      
        frmMenuEmergente.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno.DESKTOP-U0TTECG.002\\Downloads\\7b049a4bfa1a9e78b9e772e8026e8bee.jpg"));
        
        frmMenuEmergente.setBounds(100, 100, 450, 300);
        frmMenuEmergente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmMenuEmergente.getContentPane().setLayout(null);

        
        JPopupMenu menuEmergente = new JPopupMenu();
        menuEmergente.setFont(new Font("Starborn", Font.PLAIN, 12));
        menuEmergente.setBackground(new Color(255, 128, 192));

        
        JMenuItem menuAzul = new JMenuItem("Azul");
        menuAzul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                frmMenuEmergente.getContentPane().setBackground(Color.BLUE);
            }
        });
        menuAzul.setForeground(new Color(0, 128, 255));
        menuAzul.setFont(new Font("Starborn", Font.PLAIN, 12));
        menuEmergente.add(menuAzul);

       
        JMenuItem menuVerde = new JMenuItem("Verde");
        menuVerde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmMenuEmergente.getContentPane().setBackground(Color.GREEN);
            }
        });
        menuVerde.setForeground(new Color(0, 128, 64));
        menuVerde.setFont(new Font("Starborn", Font.PLAIN, 12));
        menuEmergente.add(menuVerde);

       
        JMenuItem menuRojo = new JMenuItem("Rojo");
        menuRojo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frmMenuEmergente.getContentPane().setBackground(Color.RED);
            }
        });
        menuRojo.setForeground(new Color(255, 0, 0));
        menuRojo.setFont(new Font("Starborn", Font.PLAIN, 12));
        menuEmergente.add(menuRojo);

       
        addPopup(frmMenuEmergente.getContentPane(), menuEmergente);
    }

    private static void addPopup(Component component, final JPopupMenu popup) {
        component.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            public void mouseReleased(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    showMenu(e);
                }
            }
            private void showMenu(MouseEvent e) {
                popup.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }
}
