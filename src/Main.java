import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int opcion;
        int int1, int2, int3;
        Coche coche = new Coche();

        do
        {
            System.out.println("\n\nHola soy Christian Figueredo, bienvenido a mi programa.\n");
            System.out.println("-  Que quieres hacer? - Ingresa el numero de la opcion?");
            System.out.println("1. Sumar 3 numeros enteros");
            System.out.println("2. Incrementar las puertas al objeto coche ");
            System.out.println("3. Salir del programa");

            opcion = leerNumeroEntero();

            switch (opcion)
            {
                case 1:
                    {
                        System.out.println("Ingresa el primer numero");
                        int1 = leerNumeroEntero();
                        System.out.println("Ingresa el segundo numero");
                        int2 = leerNumeroEntero();
                        System.out.println("Ingresa el tercer numero");
                        int3 = leerNumeroEntero();

                        System.out.println("El resultado es: " + suma (int1, int2, int3));

                        break;
                    }
                case 2:
                {
                    coche.AddPuerta();
                    System.out.println("La puerta fue agrego con exito");
                    if (coche.puertas > 1)
                    {
                        System.out.println("El coche tiene: " + coche.puertas + " puertas");
                        break;
                    }

                    System.out.println("El coche tiene: " + coche.puertas + " puerta");
                    break;
                }
                case 3:
                {
                    System.out.println("Hasta pronto...");
                    break;
                }
                default:
                {
                    System.out.println("El comando no ha sido reconocido, intenta de nuevo");
                    break;
                }
            }
        } while (opcion != 3);
    }

    public static int suma (int int1, int int2, int int3)
    {
        return (int1 + int2 + int3);
    }

    public static int leerNumeroEntero()
    {
        int valorDeEntrada;

        Scanner leerEntradaDeTeclado = new Scanner(System.in);

        try
        {
            valorDeEntrada = leerEntradaDeTeclado.nextInt();
        }
        catch (Exception ex)
        {
            valorDeEntrada = 0;
        }

        return valorDeEntrada;
    }
}

