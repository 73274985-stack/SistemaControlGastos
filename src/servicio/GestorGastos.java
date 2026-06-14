package servicio;

import modelo.Gasto;
import java.util.ArrayList;

public class GestorGastos {

    private ArrayList<Gasto> gastos;

    public GestorGastos() {
        gastos = new ArrayList<>();
    }

    public void agregarGasto(Gasto gasto) {

        if (gasto == null) {
            throw new IllegalArgumentException(
                "El gasto no puede ser nulo"
            );
        }

        gastos.add(gasto);
    }

    public void eliminarGastoSeleccionado(int indice) {

        if (indice >= 0 && indice < gastos.size()) {
            gastos.remove(indice);
        }

    }

    public ArrayList<Gasto> obtenerGastos() {
        return gastos;
    }

    public double calcularTotal() {

        return gastos.stream()
                     .mapToDouble(Gasto::getMonto)
                     .sum();
    }
}
