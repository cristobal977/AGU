package view;

import data.Gasto;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AgregarGasto extends JFrame {

    private JPanel panelAgregarGasto;

    private JLabel lblGasto;
    private JLabel lblDescripcion;
    private JLabel lblTipoDePago;
    private JLabel lblCategoria;

    private JTextField txtGasto;
    private JTextField txtDescripcion;
    private JComboBox<String> txtTipoDePago;
    private JComboBox<String> txtCategoria;

    private JButton btnNuevoGasto;
    private JButton btnVolver;

    public AgregarGasto() {
        initComponents();
    }

    private void initComponents() {

        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Add");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        panelAgregarGasto = new JPanel();
        panelAgregarGasto.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panelAgregarGasto);
        panelAgregarGasto.setLayout(null);

        lblGasto = new JLabel("Gasto:");
        lblGasto.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblGasto.setBounds(10, 10, 150, 20);
        panelAgregarGasto.add(lblGasto);

        lblDescripcion = new JLabel("Descripcion:");
        lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblDescripcion.setBounds(10, 60, 150, 20);
        panelAgregarGasto.add(lblDescripcion);

        lblTipoDePago = new JLabel("Tipo de pago:");
        lblTipoDePago.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblTipoDePago.setBounds(190, 10, 150, 20);
        panelAgregarGasto.add(lblTipoDePago);

        lblCategoria = new JLabel("Categoria:");
        lblCategoria.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblCategoria.setBounds(190, 60, 150, 20);
        panelAgregarGasto.add(lblCategoria);

        txtGasto = new JTextField();
        txtGasto.setName("");
        txtGasto.setToolTipText("Ingrese gasto realizado");
        txtGasto.setBounds(10, 30, 134, 20);
        panelAgregarGasto.add(txtGasto);

        txtDescripcion = new JTextField();
        txtDescripcion.setName("");
        txtDescripcion.setToolTipText("Ingrese una descripcion");
        txtDescripcion.setBounds(10, 80, 134, 20);
        panelAgregarGasto.add(txtDescripcion);

        txtTipoDePago = new JComboBox<>();
        txtTipoDePago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Efectivo", "Tarjeta", "Cheque", "Otro"}));
        txtTipoDePago.setBounds(190, 30, 134, 20);
        panelAgregarGasto.add(txtTipoDePago);

        txtCategoria = new JComboBox<>();
        txtCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Alimentos", "Transporte", "Vestuario", "Medicamentos", "Otro"}));
        txtCategoria.setBounds(190, 80, 134, 20);
        panelAgregarGasto.add(txtCategoria);

        btnNuevoGasto = new JButton("");
        btnNuevoGasto.setToolTipText("Agregar gasto");
        btnNuevoGasto.setIcon(new ImageIcon("C:/Users/Cristobal/Documents/NetBeansProjects/AGU/imagenes/plus.png"));
        btnNuevoGasto.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                agregarG();

            }
        });
        btnNuevoGasto.setBounds(103, 120, 50, 50);
        panelAgregarGasto.add(btnNuevoGasto);

        btnVolver = new JButton("");
        btnVolver.setToolTipText("volver");
        btnVolver.setIcon(new ImageIcon("C:/Users/Cristobal/Documents/NetBeansProjects/AGU/imagenes/back.png"));
        btnVolver.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                volver();
            }
        });
        btnVolver.setBounds(180, 120, 50, 50);
        panelAgregarGasto.add(btnVolver);

        this.setSize(350, 230);
        this.setLocation(500, 230);
        this.setVisible(true);

    }

    public void agregarG() {//Falta Validar//<-----------------------------------------------
        
        String a = txtGasto.getText();
        String b = txtDescripcion.getText();
        String c = txtTipoDePago.getSelectedItem().toString();
        String d = txtCategoria.getSelectedItem().toString();
        String e = getFechaActual();
        Gasto g = new Gasto(a, b, c, d, e);
        guardarGasto(g);
        this.dispose();
        Principal pr = new Principal();

    }

    public void volver() {
        this.dispose();
        Principal pr = new Principal();
    }

    public String getFechaActual() {
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        return formateador.format(ahora);
    }

    public void guardarGasto(Gasto g) {
        try {
            File f = new File("gasto.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(g.getgGasto() + "%" + g.getgDescripcion() + "%" + g.getgTipoDePago() + "%" + g.getgCategoria() + "%" + g.getgFecha());

            } else {
                fw = new FileWriter(f);
                bw = new BufferedWriter(fw);
                bw.write(g.getgGasto() + "%" + g.getgDescripcion() + "%" + g.getgTipoDePago() + "%" + g.getgCategoria() + "%" + g.getgFecha());

            }
            bw.close();
            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
