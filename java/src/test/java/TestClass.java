import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {


    // Google is $2 /share
    // Apple is $1 / share
    // the split is supposed to be 50/50 (in terms of how much money is for each security)
    // I want to add 100$ to my account
    // how many shares should I buy of each?

    @Test
    public void test_determine_how_many_shares_to_buy() {
        Security google = new Security("Google", 0, 2);
        Security apple = new Security("Apple", 0, 1);
        List<Security> securityList = List.of(google, apple);
        Map<Security, Double> desiredPercentages = Map.of(
                google, .5,
                apple, .5
        );

        Account account = new Account(1, securityList, desiredPercentages);

        assertEquals(1, 1);
    }

}
