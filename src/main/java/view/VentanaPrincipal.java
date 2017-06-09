package view;

import data.Gasto;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;


public class VentanaPrincipal extends JFrame {

    private javax.swing.JPanel panelVentanaPrincipal;

    private JLabel lblAgregarSaldo;
    private JLabel lblSaldoActual;

    private JTextField campoAgregarSaldo;
    private JTextField campoSaldoActual;

    private JButton btnAceptarP;
    private JButton btnDescontarP;
    private JButton btnAgregarGastoP;
    private JButton btnGraficoP;
    private JButton btnEliminarP;

    private JMenu mPerfil;
    private JMenu mAyuda;
    private JMenu mCerrarSesion;
    private JMenuBar bBarraMenu;

    private JScrollPane tablaContenedora;
    private JTable tabla;

    private ArrayList<Gasto> lista = new ArrayList<Gasto>();

    public VentanaPrincipal() {

        initComponents();
    }

    private void initComponents() {

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Administrador de Gastos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        this.panelVentanaPrincipal = new JPanel();
        this.panelVentanaPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(this.panelVentanaPrincipal);
        this.panelVentanaPrincipal.setLayout(null);

        this.lblAgregarSaldo = new JLabel("Agregar saldo");
        this.lblAgregarSaldo.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblAgregarSaldo.setBounds(43, 30, 90, 20);
        this.panelVentanaPrincipal.add(lblAgregarSaldo);

        this.lblSaldoActual = new JLabel("Saldo actual:");
        this.lblSaldoActual.setFont(new Font("Tahoma", Font.BOLD, 25));
        this.lblSaldoActual.setBounds(143, 100, 230, 20);
        this.panelVentanaPrincipal.add(this.lblSaldoActual);

        this.campoAgregarSaldo = new JTextField();
        this.campoAgregarSaldo.setName("");
        this.campoAgregarSaldo.setToolTipText("Ingrese o descuente su saldo");
        this.campoAgregarSaldo.setBounds(167, 30, 134, 20);
        this.panelVentanaPrincipal.add(this.campoAgregarSaldo);

        this.campoSaldoActual = new JTextField();
        this.campoSaldoActual.setText("0");
        this.campoSaldoActual.setToolTipText("Saldo actual");
        this.campoSaldoActual.setBounds(310, 70, 300, 80);
        this.campoSaldoActual.setEditable(false);
        this.campoSaldoActual.setFont(new java.awt.Font("Tahoma", 0, 48));
        this.panelVentanaPrincipal.add(this.campoSaldoActual);

        this.btnAceptarP = new JButton("Aceptar");
        this.btnAceptarP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                agregarSaldoB();
            }
        });
        this.btnAceptarP.setBounds(340, 28, 89, 23);
        this.panelVentanaPrincipal.add(btnAceptarP);

        this.btnDescontarP = new JButton("Descontar");
        this.btnDescontarP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                descontarSaldoB();
            }
        });
        this.btnDescontarP.setBounds(440, 28, 100, 23);
        this.panelVentanaPrincipal.add(btnDescontarP);

        this.btnAgregarGastoP = new JButton("Agregar Gasto");
        this.btnAgregarGastoP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                agregarGastoB();
            }
        });
        this.btnAgregarGastoP.setBounds(100, 180, 150, 23);
        this.panelVentanaPrincipal.add(btnAgregarGastoP);

        this.btnGraficoP = new JButton("Generar Grafico");
        this.btnGraficoP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                graficoB();
            }
        });
        this.btnGraficoP.setBounds(280, 180, 150, 23);
        this.panelVentanaPrincipal.add(btnGraficoP);

        this.btnEliminarP = new JButton("Eliminar Gasto");
        this.btnEliminarP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                borrarLineaB();
            }
        });
        this.btnEliminarP.setBounds(460, 180, 150, 23);
        this.panelVentanaPrincipal.add(btnEliminarP);

        this.mPerfil = new JMenu("Perfil");
        this.mPerfil.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                irPerfil();
            }
        });

        this.mAyuda = new JMenu("Ayuda");
        this.mAyuda.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, "Si necesita ayuda contactese con:\n"
                        + "\n"
                        + "Cristobal Carrion, Correo c.carrion01@ufromail.cl, Pais Chile\n"
                        + "Diego Agüero, Correo d.aguero02@ufromail.cl, Pais Chile");

            }
        });

        this.mCerrarSesion = new JMenu("Cerrar sesion");
        this.mCerrarSesion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cerrarSesionB();
            }
        });
        this.bBarraMenu = new JMenuBar();
        this.bBarraMenu.add(this.mPerfil);
        this.bBarraMenu.add(this.mAyuda);
        this.bBarraMenu.add(this.mCerrarSesion);
        setJMenuBar(this.bBarraMenu);
        this.bBarraMenu.setBounds(0, 0, WIDTH, HEIGHT);
        this.panelVentanaPrincipal.add(this.bBarraMenu);

        this.tablaContenedora = new JScrollPane();
        this.tabla = new JTable();
        this.tabla.setModel(new DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Gasto", "Descripcion", "Categoria", "Mes", "Año"
                }
        ));
        this.tabla.setEnabled(false);
        this.tablaContenedora.setViewportView(this.tabla);
        this.tablaContenedora.setBounds(100, 220, 510, 400);
        this.panelVentanaPrincipal.add(this.tablaContenedora);

        this.setSize(715, 700);
        this.setLocation(350, 20);
        this.setVisible(true);

    }

    public void setTabla(String[][] tablaGastos) {

        this.tabla.setModel(new DefaultTableModel(
                tablaGastos,
                new String[]{
                    "Gasto", "Descripcion", "Categoria", "Mes", "Año"
                }
        ));
        this.tabla.setEnabled(false);
        this.tablaContenedora.setViewportView(this.tabla);
        this.tablaContenedora.setBounds(100, 220, 510, 400);
        this.panelVentanaPrincipal.add(this.tablaContenedora);
    }

//    public String[][] agregarLista() {
//        String MatrizAgregar[][] = new String[lista.size()][5];
//        for (int i = 0; i < lista.size(); i++) {
//
//            MatrizAgregar[i][0] = lista.get(i).getgGasto();
//            MatrizAgregar[i][1] = lista.get(i).getgDescripcion();
//            MatrizAgregar[i][2] = lista.get(i).getgCategoria();
//            MatrizAgregar[i][3] = lista.get(i).getg();
//            MatrizAgregar[i][4] = lista.get(i).getgAno();
//        }
//        return MatrizAgregar;
//    }

    public void agregarGastosNuevos(Gasto gasto) {
        lista.add(gasto);
    }

    private void agregarSaldoB() {
        if (validadorDigitos(campoSaldoActual.getText()) && validadorDigitos(campoAgregarSaldo.getText())) {
            int a = Integer.parseInt(String.valueOf(campoSaldoActual.getText()));
            int b = Integer.parseInt(String.valueOf(campoAgregarSaldo.getText()));
            int c = a + b;
            campoSaldoActual.setText(String.valueOf(c));
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros");
        }

    }

    private void descontarSaldoB() {
        if (validadorDigitos(campoSaldoActual.getText()) && validadorDigitos(campoAgregarSaldo.getText())) {
            int a = Integer.parseInt(String.valueOf(campoSaldoActual.getText()));
            int b = Integer.parseInt(String.valueOf(campoAgregarSaldo.getText()));
            int c = a - b;
            if (c >= 0) {
                campoSaldoActual.setText(String.valueOf(c));
            } else {
                JOptionPane.showMessageDialog(null, "El saldo NO puede ser negativo");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ingrese solo numeros enteros");
            
        }
    }

    private void agregarGastoB() {
        dispose();
        VentanaAgregarGasto ag = new VentanaAgregarGasto(this);
    }

    private void cerrarSesionB() {
        dispose();
        VentanaLogin l = new VentanaLogin();

    }

    private void borrarLineaB() {

    }

    public static boolean validadorDigitos(String cadena) {
        boolean v = false;
        if (cadena.matches("[0-9]+")) {
            v = cadena.matches("[0-9]+");
            return v;
        }
        return v;
    }

    public void irPerfil() {
        dispose();
        VentanaPerfil vpp = new VentanaPerfil();
    }

    private void graficoB() {

    }

}
