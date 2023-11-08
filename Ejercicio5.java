package tutorial;

import javax.swing.JOptionPane;

public class Ejercicio5 {

    public static void main(String[] args) {

        final float ponderacion1 = 0.1f, ponderacion2 = 0.25f, ponderacion3 = 0.25f, ponderacion4 = 0.4f;
        float nota1, nota2, nota3, nota4, nota_final;

        nota1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota de participacion"));
        nota2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del primer parcial"));
        nota3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial"));
        nota4 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del examen final"));

        nota1 *= ponderacion1;
        nota2 *= ponderacion2;
        nota3 *= ponderacion3;
        nota4 *= ponderacion4;

        nota_final = nota1 + nota2 + nota3 + nota4;
        JOptionPane.showMessageDialog(null, "La nota final del estudiante es de: " + nota_final);
    }
}
