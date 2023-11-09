import javax.swing.JOptionPane;
import java.lang.Math;

public class Ejercicio6 {

    public static void main(String[] args) {

        final int potencia = 2;
        float a, b, base, resultado;

        a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de A"));
        b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de B"));

        base = (a + b);
        resultado = (float) Math.pow(base, potencia);
        JOptionPane.showMessageDialog(null, "Su resultado es: " + resultado);
    }
}
