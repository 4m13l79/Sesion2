import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingrese el primer n�mero: ");
        int numero1 = lectura.nextInt();       
        System.out.print("Ingrese el segundo n�mero: ");
        int numero2 = lectura.nextInt();      
         int maximo = Math.max(numero1, numero2);       
        System.out.println("El n�mero mayor entre " + numero1 + " y " + numero2 + " es: " + maximo);
        lectura.close();
    }	
}
