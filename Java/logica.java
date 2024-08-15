package Java;
import java.util.Scanner;

public class logica {
    public static void main(String[] args) {
        System.out.println("Condicionales");
        System.out.println(" ");
        System.out.println("Por favor ingrese su edad: ");

        Scanner lectura = new Scanner (System.in);
        int edad = lectura.nextInt();

        
        if (18 <= edad) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("es menor de edad");
        }
    }
    
}
