package BankApp;

import java.util.InputMismatchException;
import java.util.Scanner;
import static BankApp.Deposit.*;

public class Exchange {

    Scanner in = new Scanner(System.in);
    static String currencyChoice;
    static String currencyExchange;
    static float toExchange;
    static float valueNew;
    static float value2New;

    void fourthCase() {
        System.out.println("Do you want to buy or sale?");
        String choice = in.next().toUpperCase();

        if (choice.equals("SALE")) {
            System.out.println("Which of your currencies yoo want to sale?");
            System.out.println(currencies.keySet());
            String currencytoSale = in.next().toUpperCase();
            if (!currencies.containsKey(currencytoSale)) {
                System.out.println("You introduced a wrong currency, you don't have such one in your account");
            } else {
                System.out.println("How much you want to sale?");
                float toSale = in.nextFloat();
                float temp1 = toSale * priceSale.get(currencytoSale);
                currencies.put(currencytoSale, currencies.get(currencytoSale) - toSale);
                if(currencies.get(currencytoSale) > toSale)
                    System.out.println("Sale performed successfully!");
                if (currencies.containsKey("MDL")) {
                    System.out.println("Sale performed successfully!");
                    currencies.put(currencytoSale, currencies.get(currencytoSale) + temp1);
                } else {
                    System.out.println("Sale performed successfully!");
                    currencies.put("MDL", temp1);
                    priceSale.put("MDL", 1F);
                    priceBuy.put("MDL", 1F);
                    initialCurrencies.put("MDL", 0F);
                }
            }

        } else {

            System.out.println("Which of your currencies you want to exchange?");
            System.out.println(currencies.keySet());

            currencyChoice = in.next().toUpperCase();
            if (!currencies.containsKey(currencyChoice)) {
                System.out.println("You introduced a wrong currency, you don't have such one in your account");
            }
            System.out.println("To which currency you want to exchange?");

            currencyExchange = in.next().toUpperCase();

            if (currencies.containsKey(currencyExchange)) {
                System.out.println("How much you want to buy?");
                try {
                    toExchange = in.nextFloat();
                }catch(InputMismatchException e) {
                    System.out.println("Wrong input");
                }
                float temp1 = toExchange * priceSale.get(currencyExchange);
                float temp2 = currencies.get(currencyChoice) * priceSale.get(currencyChoice);
                float temp3 = temp2 - temp1;
                float temp4 = temp3 / priceBuy.get(currencyChoice);

                if (temp3 > 0) {
                    currencies.put(currencyChoice, temp4);
                    currencies.put(currencyExchange, currencies.get(currencyExchange) + toExchange);
                } else
                    System.out.println("\nNot enough resources for such exchange!");
            } else {
                currencies.put(currencyExchange, (float) 0);

                System.out.println("Enter the buy-price of the currency:");
                valueNew = in.nextFloat();
                priceBuy.put(currencyExchange, valueNew);

                System.out.println("Enter the sale-price of the currency:");
                value2New = in.nextFloat();
                priceSale.put(currencyExchange, value2New);

                System.out.println("How much you want to buy?");
                toExchange = in.nextFloat();

                float temp1 = toExchange * priceSale.get(currencyExchange);
                float temp2 = currencies.get(currencyChoice) * priceSale.get(currencyChoice);
                float temp3 = temp2 - temp1;
                float temp4 = temp3 / priceBuy.get(currencyChoice);

                if (temp3 > 0) {
                    currencies.put(currencyChoice, temp4);
                    currencies.put(currencyExchange, currencies.get(currencyExchange) + toExchange);
                    System.out.println("\nExchange Successfully Performed");
                } else
                    System.out.println("Not enough resources for such exchange");

            }
        }
    }
}

