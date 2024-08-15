package Java;
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("Condicionales");


        
        Scanner lectura = new Scanner (System.in);

        System.out.println(" ");
        System.out.println("Por favor ingrese su edad: ");
        int edad = lectura.nextInt();

        if (18 <= edad) {
            System.out.println("es mayor de edad");
        } else {
            System.out.println("es menor de edad");
        }

        System.out.println(" ");
        System.out.println("Por favor ingrese su color favorito: ");
        String colorFavorito = lectura.next();

        colorFavorito = colorFavorito.toLowerCase();


        if (colorFavorito.equals("rojo")) {
            System.out.println("El color favorito es el rojo");
        } else if (colorFavorito.equals("amarillo")) {
            System.out.println("El color favorito es el amarillo");
        } else if (colorFavorito.equals("verde")) {
            System.out.println("El color favorito es el verde");
        } else {
            System.out.println("Sin color fav o no reconocido");
        }
    }
}
