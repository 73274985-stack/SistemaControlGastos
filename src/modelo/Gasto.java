package modelo;

public class Gasto {

    private String descripcion;
    private String categoria;
    private double monto;
    private String fecha;

    public Gasto(String descripcion, String categoria, double monto, String fecha) {
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }
}