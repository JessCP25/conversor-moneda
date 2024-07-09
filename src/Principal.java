import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int opcion = 0;

        while (opcion!=7){
            System.out.println("******************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción valida:");
            System.out.println("******************************************************");
            opcion = Integer.valueOf(lectura.nextLine());
            Conversor convertir = new Conversor();
            String respuesta;
            switch (opcion) {
                case 1:
                    respuesta = convertir.convertirMoneda("USD", "ARS");
                    System.out.println(respuesta);
                    break;
                case 2:
                    respuesta = convertir.convertirMoneda("ARS", "USD");
                    System.out.println(respuesta);
                    break;
                case 3:
                    respuesta = convertir.convertirMoneda("USD", "BRL");
                    System.out.println(respuesta);
                    break;
                case 4:
                    respuesta = convertir.convertirMoneda("BRL", "USD");
                    System.out.println(respuesta);
                    break;
                case 5:
                    respuesta = convertir.convertirMoneda("USD", "COP");
                    System.out.println(respuesta);
                    break;
                case 6:
                    respuesta = convertir.convertirMoneda("COP", "USD");
                    System.out.println(respuesta);
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
                    break;
            }
        }
    }
}
