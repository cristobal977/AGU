package data;

import java.util.ArrayList;

public class Proceso {

    private ArrayList<Object> a = new ArrayList<Object>();

    public Proceso() {//constructor vacio
    }

    public Proceso(ArrayList<Object> a) {//constructor normal
        this.a = a;
    }

    public void agregarRegistro(Gasto g) {//agrega un gasto al arraylist
        this.a.add(g);
    }

    public void eliminarRegistro(int i) {//elimina un gasto del arraylist
        this.a.remove(i);
    }

    public Gasto obtenerRegistro(int i) {//obtener el arraylist de gastos
        return (Gasto) a.get(i);
    }

    public int cantidadRegistro() {//Cantidad de gastos 
        return this.a.size();
    }

}
