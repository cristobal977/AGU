package data;

public class Gasto {

    private String gGasto;
    private String gDescripcion;
    private String gTipoDePago;
    private String gCategoria;
    private String gFecha;

    public Gasto(String gGasto, String gDescripcion, String gTipoDePago, String gCategoria, String gFecha) {
        this.gGasto = gGasto;
        this.gDescripcion = gDescripcion;
        this.gTipoDePago = gTipoDePago;
        this.gCategoria = gCategoria;
        this.gFecha = gFecha;
    }

    public String getgGasto() {
        return gGasto;
    }

    public void setgGasto(String gGasto) {
        this.gGasto = gGasto;
    }

    public String getgDescripcion() {
        return gDescripcion;
    }

    public void setgDescripcion(String gDescripcion) {
        this.gDescripcion = gDescripcion;
    }

    public String getgTipoDePago() {
        return gTipoDePago;
    }

    public void setgTipoDePago(String gTipoDePago) {
        this.gTipoDePago = gTipoDePago;
    }

    public String getgCategoria() {
        return gCategoria;
    }

    public void setgCategoria(String gCategoria) {
        this.gCategoria = gCategoria;
    }

    public String getgFecha() {
        return gFecha;
    }

    public void setgFecha(String gFecha) {
        this.gFecha = gFecha;
    }
    
    
    
}