import java.util.Map;

public record Moneda(String result, String base_code, Map<String, Double> conversion_rates) {
}
