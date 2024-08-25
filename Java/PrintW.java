package Java;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.InputMismatchException;

public class PrintW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        try {
        out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        scanner.nextLine();
        out.println("Hola, " + nombre + " tienes " + edad + " años");
        } catch (InputMismatchException e) {
            out.println("Error: Debe ingresar un número entero");
        } finally {
            scanner.close();
            out.close();
        }        
      } 
    }

    
    


    