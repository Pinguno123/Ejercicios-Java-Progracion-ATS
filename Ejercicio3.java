// import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ejercicio3 {
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        double luis, guillermo, juan, resultado;
        guillermo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero de Guillermo"));
        luis = guillermo/2;
        juan = (guillermo + luis)/2;
        resultado = luis + juan + guillermo;

        JOptionPane.showMessageDialog(null, "La cantidad de dinero que tienen entre los tres es de: "+resultado);
    }
}
