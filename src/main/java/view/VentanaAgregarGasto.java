package view;

import data.Gasto;
import java.awt.Font;
import javax.swing.JFrame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class VentanaAgregarGasto extends JFrame {

    ArrayList<Gasto> lista = new ArrayList<Gasto>();

    private JPanel panelAgregarGasto;

    private JLabel lblGasto;
    private JLabel lblDescripcion;
    private JLabel lblCategoria;
    private JLabel lblMes;
    private JLabel lblAno;

    private JComboBox<String> categoria;
    private JComboBox<String> mes;
    private JComboBox<String> ano;

    private JTextField campoGastoA;
    private JTextField campoDescripcionA;

    private JButton btnAgregar;
    private JButton btnCancelar;

    private VentanaPrincipal p;

    public VentanaAgregarGasto(VentanaPrincipal p) {
        this.p = p;
        initComponents();

    }

    private void initComponents() {

        this.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        this.setTitle("Agregar gasto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        this.panelAgregarGasto = new JPanel();
        this.panelAgregarGasto.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(this.panelAgregarGasto);
        this.panelAgregarGasto.setLayout(null);

        this.lblGasto = new JLabel("Gasto:");
        this.lblGasto.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblGasto.setBounds(43, 30, 90, 20);
        this.panelAgregarGasto.add(this.lblGasto);

        this.lblDescripcion = new JLabel("Descripcion:");
        this.lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblDescripcion.setBounds(43, 60, 90, 20);
        this.panelAgregarGasto.add(this.lblDescripcion);

        this.lblCategoria = new JLabel("Categoria:");
        this.lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblCategoria.setBounds(43, 90, 90, 20);
        this.panelAgregarGasto.add(this.lblCategoria);

        this.lblMes = new JLabel("Mes:");
        this.lblMes.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblMes.setBounds(43, 120, 90, 20);
        this.panelAgregarGasto.add(this.lblMes);

        this.lblAno = new JLabel("año:");
        this.lblAno.setFont(new Font("Tahoma", Font.BOLD, 12));
        this.lblAno.setBounds(43, 150, 90, 20);
        this.panelAgregarGasto.add(this.lblAno);

        this.campoGastoA = new JTextField();
        this.campoGastoA.setName("");
        this.campoGastoA.setToolTipText("Ingrese gasto hecho");
        this.campoGastoA.setBounds(137, 30, 134, 20);
        this.panelAgregarGasto.add(this.campoGastoA);

        this.campoDescripcionA = new JTextField();
        this.campoDescripcionA.setName("");
        this.campoDescripcionA.setToolTipText("Ingrese una pequeña descripcion");
        this.campoDescripcionA.setBounds(137, 59, 134, 20);
        this.panelAgregarGasto.add(this.campoDescripcionA);

        this.categoria = new JComboBox<>();
        this.categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Alimentos", "Transporte", "Vestuario", "Medicamentos", "Otros"}));
        this.categoria.setBounds(137, 88, 134, 20);
        this.panelAgregarGasto.add(this.categoria);

        this.mes = new JComboBox<>();
        this.mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"}));
        this.mes.setBounds(137, 117, 134, 20);
        this.panelAgregarGasto.add(this.mes);

        this.ano = new JComboBox<>();
        this.ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038"}));
        this.ano.setBounds(137, 146, 134, 20);
        this.panelAgregarGasto.add(this.ano);

        this.btnAgregar = new JButton("Aceptar");
        this.btnAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                AceptarAgregarGasto();
            }
        });
        this.btnAgregar.setBounds(70, 185, 89, 23);
        this.panelAgregarGasto.add(this.btnAgregar);

        this.btnCancelar = new JButton("Cancelar");
        this.btnCancelar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                CancelarAgregarGasto();
            }
        });
        this.btnCancelar.setBounds(170, 185, 89, 23);
        this.panelAgregarGasto.add(this.btnCancelar);

        this.setSize(330, 290);
        this.setLocation(500, 230);
        this.setVisible(true);
    }
    /////ACCIONES DE LOS BOTONES

//    private void AceptarAgregarGasto() {
//
//        if (validadorDigitos(campoGastoA.getText())) {
//
//            String a = campoGastoA.getText();
//            String b = campoDescripcionA.getText();
//            String c = categoria.getSelectedItem().toString();
//            String d = mes.getSelectedItem().toString();
//            String f = ano.getSelectedItem().toString();
//            Gasto g = new Gasto(a, b, c, d, f);
//            lista.add(g);
//
//            for (int i = 0; i < lista.size(); i++) {
//                p.agregarGastosNuevos(lista.get(i));
//            }
//
////            dispose();
////            //VentanaPrincipal p = new VentanaPrincipal();
////            p.setVisible(true);
////            p.setTabla(p.agregarLista());
////        } else {
////            JOptionPane.showMessageDialog(null, "En [Gastos] ingrese numero enteros");
////        }
//
//    }

    private void CancelarAgregarGasto() {
        dispose();
        VentanaPrincipal p = new VentanaPrincipal();
    }

    public static boolean validadorDigitos(String cadena) {
        boolean v = false;
        if (cadena.matches("[0-9]+")) {
            v = cadena.matches("[0-9]+");
            return v;
        } else if (cadena.matches("[0-9]+\\.[0-9]+")) {
            v = cadena.matches("[0-9]+\\.[0-9]+");
            return v;
        }
        return v;
    }
}

