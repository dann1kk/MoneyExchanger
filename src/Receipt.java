package MoneyExchanger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static MoneyExchanger.Deposit.*;

public class Receipt {
    void fifthCase() {
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        for (String currency : currencies.keySet()) {
            System.out.println("\nAmount of: " + currency + " you had initially: " + initialCurrencies.get(currency) +
                               " and after your withdrawals and exchanges: " + currencies.get(currency));
            System.out.println("Receipt issued at: " + dt.format(now));
        }
    }
}
