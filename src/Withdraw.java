package MoneyExchanger;

import java.util.Scanner;
import static MoneyExchanger.Deposit.*;

public class Withdraw {

    Scanner in = new Scanner(System.in);
    static float withdrawMoney;
    void secondCase(){

        System.out.println("Which currency to extract from vault?");
        System.out.println(currencies.keySet());
        currency = in.next().toUpperCase();

        System.out.println("What amount?");
        withdrawMoney = in.nextFloat();

        if (!currencies.containsKey(currency))
            System.out.println("No such a currency in your account");

        else if (currencies.get(currency) - withdrawMoney > 0) {
            currencies.put(currency, currencies.get(currency) - withdrawMoney);
            System.out.println("Withdraw Successfully Performed!");
        }
        else
            System.out.println("Not enough resources");
    }
}
