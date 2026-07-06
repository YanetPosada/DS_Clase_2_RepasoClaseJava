public class App {
    public static void main(String[] args) throws Exception {

     
    
    
     //Declarar variables
     int edad;
     double salario;
     float promedio;
     char sexo;
     boolean estado;
     String nombres;

     //entrada de datos por ventana emergente
     nombres = JOptionPane.showInputDialog(message: "Digite el nombre del estudiante: ");
     edad = Integer.parseInt(JOptionPane.showInputDialog(message: "Digite la edad del estudiante: "));
     salario = Double.parseDouble(JOptionPane.showInputDialog(message: "Digite el salario del estudiante: "));
     promedio = Float.parseFloat(JOptionPane.showInputDialog(message: "Digite el promedio del estudiante: "));
     sexo = JOptionPane.showInputDialog(message: "Digite el sexo del estudiante: ").charAt(0);
     estado = Boolean.parseBoolean(JOptionPane.showInputDialog(message: "Digite el estado del estudiante: "));

     //salida de datos por ventana emergente
     JOptionPane.showMessageDialog(null, "El nombre del estudiante es: " + nombres + "\nLa edad es: " + edad);


     

    }
}





     
     