import java.util.Scanner;
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un n�mero decimal: ");
        double numero = lectura.nextDouble();
        long numeroRedondeado = Math.round(numero);
        System.out.println("El n�mero " + numero + " redondeado es: " + numeroRedondeado);
        lectura.close();
    }	
}
