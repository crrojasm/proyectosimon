package Java;

public class ciclos {
    public static void main(String[] args) {
        String nombreSimon = "Simon";
        char[] listLetrasSimon = nombreSimon.toCharArray();

        for (int i=0; i < 5 ; i++) {
            String letra = Character.toString(listLetrasSimon[i]);

            if (letra.equals("m")) {
                System.out.println("m");
            } else if (letra.equals("o")) {
                System.out.println("o");
            } else if (letra.equals("n")) {
                System.out.println("n");
            }

        }
    }
}