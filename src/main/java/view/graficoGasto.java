package view;

import data.Proceso;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class graficoGasto extends JFrame {

    private Principal vp;
    private Proceso pr;
    private int gasto[] = new int[12];
    JFreeChart grafica;
    DefaultCategoryDataset datos = new DefaultCategoryDataset();

    public graficoGasto(Principal vp, Proceso pr) {
        this.pr = pr;
        conteoMes();
        this.vp = vp;
        initComponent();
    }

    private void initComponent() {
        this.addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent e) {
                vp.setVisible(true);
                graficoGasto.this.dispose();
            }
        });
        DefaultCategoryDataset data = new DefaultCategoryDataset();
        final String x = "gasto";

        data.addValue(gasto[0], x, "Ene");
        data.addValue(gasto[1], x, "Feb");
        data.addValue(gasto[2], x, "Mar");
        data.addValue(gasto[3], x, "Abr");
        data.addValue(gasto[4], x, "May");
        data.addValue(gasto[5], x, "Jun");
        data.addValue(gasto[6], x, "Jul");
        data.addValue(gasto[7], x, "Ago");
        data.addValue(gasto[8], x, "Sep");
        data.addValue(gasto[9], x, "Oct");
        data.addValue(gasto[10], x, "Nov");
        data.addValue(gasto[11], x, "Dic");

        JFreeChart grafica = ChartFactory.createBarChart("Grafica gastos del año", "Meses", "Dinero gastado", data, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel contenedor = new ChartPanel(grafica);
        JFrame ventana = new JFrame("Grafic expense");
        ventana.add(contenedor);
        ventana.setSize(900, 600);
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);

    }

    public void sumaGastoMes(String mes, int m) {
        for (int i = 0; i < pr.cantidadRegistro(); i++) {
            if (mes.equals(pr.obtenerRegistro(i).getgFecha().split("-")[1])) {
                gasto[m] = Integer.valueOf(pr.obtenerRegistro(i).getgGasto()) + gasto[m];
            }
        }
    }

    public void conteoMes() {
        for (int i = 0; i < 12; i++) {
            String mes = null;
            if (String.valueOf(i + 1).length() == 1) {
                mes = "0" + String.valueOf(i + 1);
            } else {
                mes = String.valueOf(i + 1);
            }
            sumaGastoMes(mes, i);
        }
    }
}
