import java.util.Scanner;

public class Conversor {
    public String convertirMoneda(String monedaBase, String monedaAConvertir){
        ConsultarMoneda consulta = new ConsultarMoneda();
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el valor:");
        String input = lectura.nextLine();

        if (input.trim().isEmpty()) {
            return "Error: el valor ingresado está vacío.";
        }

        Double valor;
        try {
            valor = Double.valueOf(input.trim());
        } catch (NumberFormatException e) {
            return "Error: el valor ingresado no es un número válido.";
        }

        Moneda moneda = consulta.buscarMoneda(monedaBase);
        Double valorParaConvertir = moneda.conversion_rates().get(monedaAConvertir);
        Double valorConvertido = valor  * valorParaConvertir;
        return ("El valor de "+ valor + " [" +monedaBase+"] corresponde al valor final de =>>> "+ valorConvertido+" ["+monedaAConvertir+"]");
    }
}
