package Java;
import java.util.Scanner;
public class oprmodulo {
    public static void main(String[] args) {
        Scanner par = new Scanner (System.in);
        System.out.println("Ingrese un número");
        int num = par.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
    
}
