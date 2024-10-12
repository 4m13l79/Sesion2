import java.util.Scanner;
public class Ejercicio02 {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = lectura.nextInt();
        int valorAbsoluto = Math.abs(numero);
        System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
        lectura.close();
    }
}

