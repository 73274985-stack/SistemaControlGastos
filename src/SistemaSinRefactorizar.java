import javax.swing.JOptionPane;

public class SistemaSinRefactorizar {

    public static void main(String[] args) {

        String descripcion = JOptionPane.showInputDialog("Descripción");
        String categoria = JOptionPane.showInputDialog("Categoría");
        double monto = Double.parseDouble(
                JOptionPane.showInputDialog("Monto")
        );
        String fecha = JOptionPane.showInputDialog("Fecha");

        JOptionPane.showMessageDialog(
                null,
                "Gasto registrado:\n" +
                descripcion + "\n" +
                categoria + "\nS/. " +
                monto + "\n" +
                fecha
        );
    }
}