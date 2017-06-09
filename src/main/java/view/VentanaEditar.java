package view;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaEditar extends JFrame {

    private JPanel panelEditar;

    private JLabel lblContrasenaE;
    private JLabel lblEdad;
    private JLabel lblOcupacionE;
    private JLabel lblCiudadE;
    private JLabel lblCorreoE;

    private JTextField campoEdadE;
    private JComboBox<String> ocupacionE;
    private JTextField campoCiudadE;
    private JTextField campoCorreoE;
    private JPasswordField campoContrasenaE;

    private JButton btnCambiarE;
    private JButton btnVolverE;

    public VentanaEditar() {

        initComponents();
    }

    private void initComponents() {

        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Editar Perfil");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        this.panelEditar = new JPanel();
        this.panelEditar.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(this.panelEditar);
        this.panelEditar.setLayout(null);

        this.lblContrasenaE = new JLabel("Contrasena:");
        this.lblContrasenaE.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblContrasenaE.setBounds(50, 50, 90, 20);
        this.panelEditar.add(lblContrasenaE);

        this.lblEdad = new JLabel("Edad:");
        this.lblEdad.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblEdad.setBounds(50, 80, 90, 20);
        this.panelEditar.add(lblEdad);

        this.lblOcupacionE = new JLabel("Ocupacion:");
        this.lblOcupacionE.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblOcupacionE.setBounds(50, 110, 90, 20);
        this.panelEditar.add(lblOcupacionE);

        this.lblCiudadE = new JLabel("Ciudad:");
        this.lblCiudadE.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblCiudadE.setBounds(50, 140, 90, 20);
        this.panelEditar.add(lblCiudadE);

        this.lblCorreoE = new JLabel("Correo:");
        this.lblCorreoE.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblCorreoE.setBounds(50, 170, 90, 20);
        this.panelEditar.add(lblCorreoE);

        this.campoContrasenaE = new JPasswordField();
        this.campoContrasenaE.setName("");
        this.campoContrasenaE.setToolTipText("Ingrese la Contraseña");
        this.campoContrasenaE.setBounds(150, 50, 134, 20);
        this.panelEditar.add(this.campoContrasenaE);

        this.campoEdadE = new JTextField();
        this.campoEdadE.setName("");
        this.campoEdadE.setToolTipText("Ingrese la edad");
        this.campoEdadE.setBounds(150, 80, 134, 20);
        this.panelEditar.add(this.campoEdadE);

        this.ocupacionE = new JComboBox<>();
        this.ocupacionE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Estudiante", "Trabajador", "Otro"}));
        this.ocupacionE.setBounds(150, 110, 134, 20);
        this.panelEditar.add(this.ocupacionE);

        this.campoCiudadE = new JTextField();
        this.campoCiudadE.setName("");
        this.campoCiudadE.setToolTipText("Ingrese su ciudad");
        this.campoCiudadE.setBounds(150, 140, 134, 20);
        this.panelEditar.add(this.campoCiudadE);

        this.campoCorreoE = new JTextField();
        this.campoCorreoE.setName("");
        this.campoCorreoE.setToolTipText("Ingrese su Correo");
        this.campoCorreoE.setBounds(150, 170, 134, 20);
        this.panelEditar.add(this.campoCorreoE);

        this.btnVolverE = new JButton("Volver");
        this.btnVolverE.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                volverPerfil();
            }
        });
        this.btnVolverE.setBounds(70, 200, 89, 23);
        panelEditar.add(this.btnVolverE);

        this.btnCambiarE = new JButton("Cambiar");
        this.btnCambiarE.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                guardarPerfil();
            }
        });
        this.btnCambiarE.setBounds(180, 200, 89, 23);
        panelEditar.add(this.btnCambiarE);

        this.setSize(350, 300);
        this.setLocation(350, 20);
        this.setVisible(true);

    }

    public void volverPerfil() {
        dispose();
        VentanaPerfil vper = new VentanaPerfil();
    }

    public void guardarPerfil() {

    }
}
