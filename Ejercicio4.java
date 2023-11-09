import javax.swing.JOptionPane;

public class Ejercicio4 {

    public static void main(String[] args) {

        int numero_carros;
        final double bono_venta = 0.05;
        final double salario_base = 1000;
        double salario_final = 0, precio_carro;

        numero_carros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de carros vendidos: "));

        for (int i = 1; i <= numero_carros; i++) {
            precio_carro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del carro " + i + " : "));
            salario_final += (precio_carro*bono_venta) + 150;
        }
        salario_final += salario_base;
        JOptionPane.showMessageDialog(null, "El valor total de los carros vendidos es: " + salario_final);
    }
}  