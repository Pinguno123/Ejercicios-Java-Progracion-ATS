import javax.swing.JOptionPane;

public class Ejercicio7 {

    public static void main(String[] args) {

        int horas, semanas, dias, horas_totales;

        horas_totales = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de horas a convertir: "));

        semanas = horas_totales / 168;
        dias = horas_totales % 168 / 24;
        horas = horas_totales % 24;

        JOptionPane.showMessageDialog(null, "El numero total de semanas es de: " + semanas + "\n"
                + "El numero total de dias es de: " + dias + "\n" + "El numero total de horas es de: " + horas);
    }
}
