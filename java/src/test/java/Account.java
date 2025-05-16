import java.util.List;
import java.util.Map;

public class Account {
    private int id;
    private List<Security> securities;
    private Map<Security, Double> desiredPercentages;

    public Account(int id, List<Security> securities, Map<Security, Double> desiredPercentages) {
        this.id = id;
        this.securities = securities;
        this.desiredPercentages = desiredPercentages;
    }

    public double getTotalValue() {
        return securities.stream()
                .mapToDouble(Security::marketValue)
                .sum();
    }

}