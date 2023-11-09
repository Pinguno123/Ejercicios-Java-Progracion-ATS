// import java.util.Scanner;

import javax.swing.JOptionPane;
public class Ejercicio1 {
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, resultado;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su primera nota"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su segunda nota"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su tercera nota"));
        resultado = nota1 + nota2 + nota3;

        JOptionPane.showMessageDialog(null, "La suma de sus notas es de: "+resultado);
    }
}
