import java.util.Scanner;
import java.lang.Math;;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        int intentos = 0, aleatorio, numero;

        aleatorio = (int)(Math.random()*100);

        do {
            System.out.print("Ingrese un numero: ");
            numero = tc.nextInt();
            
            if (numero > aleatorio) {
                System.out.println(numero + " es mayor");
            } 
            else if (numero < aleatorio) {
                System.out.println(numero + " es menor");
            }
            intentos++;
        } while (aleatorio != numero);        

        System.out.println("El numero es: " + aleatorio + " le ha tomado " + intentos + " intentos");
    }
}