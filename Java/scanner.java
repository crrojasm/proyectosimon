package Java;
import java.util.Scanner;
public class scanner {
    public static void main(String[] args) {
    System.out.println("Ingrese dos números");
    int suma;
        try (Scanner lectura= new Scanner (System.in)){
            int numero_1 = lectura.nextInt();
            int numero_2 = lectura.nextInt();
            suma = numero_1 + numero_2;
        

            if (30 < suma) {
                System.out.println("La suma es mayor a 30");
            } else {
                System.out.println("La suma es menor a 30");
            }

        
        }
    }
    
}
