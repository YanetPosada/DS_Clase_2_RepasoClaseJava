import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

     
    
    
     //Declarar variables
     int edad;
     double salario;
     float promedio;
     char sexo;
     boolean estado;
     String nombres;

     //entrada de datos por consola
     Scanner entrada = new Scanner(System.in);

     System.out.println("Digite el nombre del estudiante: ");
     nombres = entrada.nextLine(); //Johan Manuel
     System.out.println("Digite la edad: ");
     edad = entrada.nextInt();
     System.out.println("Digite el salario: ");
     salario = entrada.nextDouble();
     System.out.println("Digite el sexo: ");
     sexo = entrada.next().charAt(0); //johan - j
     System.out.println("Digite el estado del estudiante: ");
     estado = entrada.nextBoolean();


     //salida de datos por consola
     System.out.println("El nombre del estudiante es: "+ nombres + "la edad es: "+ edad);
     




    }
}
