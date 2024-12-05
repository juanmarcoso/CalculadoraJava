import java.util.Scanner;

/*
 * Por Juan Orellana
 * juanmadev69@gmail.com
*/

public class CalculadoraApp {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        while (true) {

            System.out.println("---- Aplicacion Calculadora ---");

            mostrarMenu();

            try {

            var operacion = Integer.parseInt(teclado.nextLine());

            // Revisar que este dentro de nuestras opciones
            if (operacion >= 1 && operacion <= 4) {

                // Ejecutamos la opcion deseada
                ejecutarOperacion(operacion, teclado);
            
            } else if (operacion == 5) { // Salir
                System.out.println("Hasta pronto!");
                break;
            } else { // Error
                System.out.println("Opcion erronea: " + operacion);
            }
            // Imprimimos un salto de linea antes de ejecutar el ciclo
            System.out.println("  ");

        } catch(Exception e){
            // Aqui vamos a "atrapar" los strings por si no son numeros
            System.out.println("No coloque letras, solo numeros: " + e.getMessage());
            System.out.println(" ");
        }
        
        }
        
        teclado.close();

    }

    private static void mostrarMenu(){

        // Mostramos el menu
        System.out.println("""
            1. Suma
            2. Resta
            3. Multiplicacion
            4. Division
            5. Salir
            """);

    System.out.print("Operacion a realizar?: ");

    }

    private static void ejecutarOperacion(int operacion, Scanner teclado){

        System.out.print("Ingrese el valor del primer numero: ");
        var operando1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Ingrese el valor del segundo numero: ");
        var operando2 = Double.parseDouble(teclado.nextLine());

        double resultado;

        switch (operacion) {
            case 1: // Suma
                resultado = operando1 + operando2;
                System.out.print("La suma es: " + resultado);
                System.out.println(" ");
                break;
            case 2: // Resta
                resultado = operando1 - operando2;
                System.out.print("La resta entre " + operando1 + " y " + operando2 + " es: " + resultado);
                System.out.println(" ");
                break;
            case 3: // Multiplicacion
                resultado = operando1 * operando2;
                System.out.print("El resultado de la multiplicacion es: " + resultado);
                System.out.println(" ");
                break;
            case 4: // Division
                resultado = (operando1 / operando2);
                System.out.print("El resultado de la division es: " + resultado);
                System.out.println(" ");
                break;

            default:
                System.out.println("Operacion erronea" + operacion);
                break;
        }

    }

}
