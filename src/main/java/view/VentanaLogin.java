package view;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaLogin extends JFrame {

    private JPanel panelLogin;

    private JTextField campoUsuario;
    private JPasswordField campoContrasena;

    private JButton btnEntrarLogin;
    private JButton btnSalirLogin;

    public VentanaLogin() {

        initComponents();

    }

    private void initComponents() {

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        this.panelLogin = new JPanel();
        this.panelLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(this.panelLogin);
        this.panelLogin.setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUsuario.setBounds(43, 30, 90, 20);
        this.panelLogin.add(lblUsuario);

        JLabel lblPassword = new JLabel("Contraseña:");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPassword.setBounds(43, 61, 90, 20);
        this.panelLogin.add(lblPassword);

        this.campoUsuario = new JTextField();
        this.campoUsuario.setName("");
        this.campoUsuario.setToolTipText("Ingrese Usuario");
        this.campoUsuario.setBounds(167, 30, 134, 20);
        this.panelLogin.add(this.campoUsuario);

        this.campoContrasena = new JPasswordField();
        this.campoContrasena.setName("");
        this.campoContrasena.setToolTipText("Ingrese Contraseña");
        this.campoContrasena.setBounds(167, 61, 134, 20);
        this.panelLogin.add(this.campoContrasena);

        this.btnEntrarLogin = new JButton("Entrar");
        this.btnEntrarLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                entrarLogin();
            }
        });
        this.btnEntrarLogin.setBounds(73, 109, 89, 23);
        this.panelLogin.add(this.btnEntrarLogin);

        this.btnSalirLogin = new JButton("Salir");
        this.btnSalirLogin.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
        this.btnSalirLogin.setBounds(180, 109, 89, 23);
        panelLogin.add(this.btnSalirLogin);

        this.setSize(350, 200);
        this.setLocation(500, 250);
        this.setVisible(true);
    }

    private void entrarLogin() {
        String Usuario = "admin";
        String Contraseña = "admin";
        String Pass = new String(campoContrasena.getPassword());

        if (campoUsuario.getText().equalsIgnoreCase(Usuario) && Pass.equals(Contraseña)) {
            dispose();
            VentanaPrincipal p = new VentanaPrincipal();
        } else {
            JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña incorrecta");
        }
    }
}
