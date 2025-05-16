import java.util.List;

public class Account {
    private String id;
    private List<Security> securities;

    public Account(String id, List<Security> securities) {
        this.id = id;
        this.securities = securities;
    }

    public double getTotalValue() {
        return securities.stream()
                .mapToDouble(Security::marketValue)
                .sum();
    }

}