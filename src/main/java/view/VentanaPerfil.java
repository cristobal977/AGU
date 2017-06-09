package view;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaPerfil extends JFrame {

    private JPanel panelPerfil;

    private JLabel lblUsuarioP;
    private JLabel lblEdadP;
    private JLabel lblOcupacionP;
    private JLabel lblCiudadP;
    private JLabel lblCorreoP;

    private JTextField campoUsuarioP;
    private JTextField campoEdadP;
    private JTextField campoOcupacionP;
    private JTextField campoCiudadP;
    private JTextField campoCorreoP;

    private JButton btnVolver;
    private JButton btnEditar;

    public VentanaPerfil() {
        initComponents();
    }

    private void initComponents() {
        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Perfil");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        this.panelPerfil = new JPanel();
        this.panelPerfil.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(this.panelPerfil);
        this.panelPerfil.setLayout(null);

        this.lblUsuarioP = new JLabel("Usuario:");
        this.lblUsuarioP.setFont(new Font("Tahoma", Font.BOLD, 24));
        this.lblUsuarioP.setBounds(43, 65, 100, 20);
        this.panelPerfil.add(lblUsuarioP);

        this.lblEdadP = new JLabel("Edad:");
        this.lblEdadP.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblEdadP.setBounds(43, 120, 90, 20);
        this.panelPerfil.add(lblEdadP);

        this.lblOcupacionP = new JLabel("Ocupacion:");
        this.lblOcupacionP.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblOcupacionP.setBounds(313, 120, 90, 20);
        this.panelPerfil.add(lblOcupacionP);

        this.lblCiudadP = new JLabel("Ciudad:");
        this.lblCiudadP.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblCiudadP.setBounds(43, 150, 90, 20);
        this.panelPerfil.add(lblCiudadP);

        this.lblCorreoP = new JLabel("Correo:");
        this.lblCorreoP.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblCorreoP.setBounds(313, 150, 90, 20);
        this.panelPerfil.add(lblCorreoP);

        this.campoUsuarioP = new JTextField();
        this.campoUsuarioP.setText("Admin");
        this.campoUsuarioP.setToolTipText("usuario");
        this.campoUsuarioP.setBounds(180, 30, 300, 80);
        this.campoUsuarioP.setEditable(false);
        this.campoUsuarioP.setFont(new java.awt.Font("Tahoma", 0, 40));
        this.panelPerfil.add(this.campoUsuarioP);

        this.campoEdadP = new JTextField();
        this.campoEdadP.setText("0");
        this.campoEdadP.setToolTipText("edad");
        this.campoEdadP.setBounds(100, 120, 134, 20);
        this.campoEdadP.setEditable(false);
        this.campoEdadP.setFont(new java.awt.Font("Tahoma", 0, 12));
        this.panelPerfil.add(this.campoEdadP);

        this.campoOcupacionP = new JTextField();
        this.campoOcupacionP.setText("Ocupacion");
        this.campoOcupacionP.setToolTipText("ocupacion");
        this.campoOcupacionP.setBounds(400, 120, 134, 20);
        this.campoOcupacionP.setEditable(false);
        this.campoOcupacionP.setFont(new java.awt.Font("Tahoma", 0, 12));
        this.panelPerfil.add(this.campoOcupacionP);

        this.campoCiudadP = new JTextField();
        this.campoCiudadP.setText("Ciudad");
        this.campoCiudadP.setToolTipText("ciudad");
        this.campoCiudadP.setBounds(100, 150, 134, 20);
        this.campoCiudadP.setEditable(false);
        this.campoCiudadP.setFont(new java.awt.Font("Tahoma", 0, 12));
        this.panelPerfil.add(this.campoCiudadP);

        this.campoCorreoP = new JTextField();
        this.campoCorreoP.setText("Correo");
        this.campoCorreoP.setToolTipText("correo");
        this.campoCorreoP.setBounds(400, 150, 134, 20);
        this.campoCorreoP.setEditable(false);
        this.campoCorreoP.setFont(new java.awt.Font("Tahoma", 0, 12));
        this.panelPerfil.add(this.campoCorreoP);

        this.btnVolver = new JButton("Volver");
        this.btnVolver.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                volverVentanaPrincipal();
            }
        });
        this.btnVolver.setBounds(140, 188, 89, 23);
        this.panelPerfil.add(btnVolver);

        this.btnEditar = new JButton("Editar");
        this.btnEditar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                editarPerfil();
            }
        });
        this.btnEditar.setBounds(340, 188, 89, 23);
        this.panelPerfil.add(btnEditar);

        this.setSize(600, 300);
        this.setLocation(350, 20);
        this.setVisible(true);

    }

    public void volverVentanaPrincipal() {
        dispose();
        VentanaPrincipal vp = new VentanaPrincipal();
    }

    public void editarPerfil() {
        dispose();
        VentanaEditar ve = new VentanaEditar();
    }

}
