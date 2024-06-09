import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        var consola = new Scanner(System.in);
        System.out.println("nombre");
         var nombre = consola.nextLine();
        System.out.println("edad");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.println("sueldo");
        var sueldo = Float.floatToIntBits(consola.nextByte());
        System.out.println("es empleado de confianza");
        var empleadoconfianza = Boolean.parseBoolean(consola.nextLine());

        // Aplicar valores

        System.out.println("nombre");
        System.out.println("edad");
        System.out.println("sueldo");
        System.out.println("empleadodeconfianza");

        }
    }
