import java.lang.Math;

import javax.swing.JOptionPane;

public class Ejercicio8 {
    public static void main(String[] args) {

        final int potencia = 2;
        float valor_a, valor_b, valor_c, discriminante, base1, base2;

        valor_a = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de A: "));
        valor_b = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de B: "));
        valor_c = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de C: "));

        discriminante = (float) (Math.pow(valor_b, potencia) - 4 * valor_a * valor_c);

        if (discriminante >= 0) {
            base1 = (-valor_b + (float) Math.sqrt(discriminante)) / (2 * valor_a);
            base2 = (-valor_b - (float) Math.sqrt(discriminante)) / (2 * valor_a);

            JOptionPane.showMessageDialog(null, "Las respuestas a X son: "+base1+" y "+base2);
        } else {
            JOptionPane.showMessageDialog(null, "No hay solucion real");
        }
    }
}
