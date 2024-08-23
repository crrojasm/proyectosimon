package Java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class EscribirArchivo {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = lectura.nextInt();

        File archivo = new File("resultado.txt");
        try (FileWriter escritor = new FileWriter(archivo)) {
            if (num % 2 == 0) {
                escritor.write("El número es par"); 
            } else {
                escritor.write("El número es impar");

            }
          System.out.println("Archivo creado y escrito con éxito");
       } catch (IOException e) {
           System.out.println("Error al crear o escribir en el archivo: " + e.getMessage());
       } finally {
        lectura.close();

       }
    }
}



      