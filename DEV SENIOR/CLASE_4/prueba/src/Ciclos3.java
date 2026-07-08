import java.util.Scanner;
    public class Ciclos3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

    do {
        System.out.println("1. Continuar 2. Salir");
            System.out.println("Elige");
            opcion = sc.nextInt();
        } while (opcion != 2);
        
        System.out.println("Saliste del menu");


    }        
        
}    