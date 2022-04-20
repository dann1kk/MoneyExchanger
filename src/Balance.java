package BankApp;

import static BankApp.Deposit.*;

public class Balance {
    public static void thirdCase() {
        System.out.println("Your balance:\n");

        for (String currency: currencies.keySet()){
            System.out.println(currency+ " = " + currencies.get(currency));
        }
    }
}

