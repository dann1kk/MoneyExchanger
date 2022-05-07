package MoneyExchanger;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import static MoneyExchanger.Deposit.*;

public class Exchange {

    Scanner in = new Scanner(System.in);
    static String currencyChoice;
    static String currencyExchange;
    static float toBuy;
    static float valueNew;
    static float value2New;

    void fourthCase() {
        System.out.println("Do you want to buy or sale?");
        System.out.println("SALE[Currency -> Lei ]; BUY -> [Lei -> Currency]");
        String choice = in.next().toUpperCase();

  /*      if (choice.equals("SALE")) {
            System.out.println("What currency you want to sale?           [Currency -> Lei]");
            System.out.println(currencies.keySet());
            String currencytoSale = in.next().toUpperCase();
            if (!currencies.containsKey(currencytoSale)) {
                System.out.println("What is the buy-price of your currency?");
                priceB = in.nextFloat();
                priceBuy.put(currencytoSale, priceB);
                System.out.println("What is the sale-price of your currency?");
                priceS = in.nextFloat();
                priceSale.put(currencytoSale, priceS);
                System.out.println("How much you want to sale");
                float toSale = in.nextFloat();
                float temp1 = toSale * priceSale.get(currencytoSale);

                }*/


        if (choice.equals("SALE")) {
            System.out.println("What currency you want to sale?");

            String currencytoSale = in.next().toUpperCase();
            if (!currencies.containsKey(currencytoSale)) {
                System.out.println("What is the buy-price of your currency?");
                priceB = in.nextFloat();
                priceBuy.put(currencytoSale, priceB);
                System.out.println("What is the sale-price of your currency?");
                priceS = in.nextFloat();
                priceSale.put(currencytoSale, priceS);
                System.out.println("How much you want to sale?");
                float toSale = in.nextFloat();
                float temp1 = toSale * priceSale.get(currencytoSale);
                if (currencies.containsKey("MDL")) {
                    if (temp1 > currencies.get("MDL"))
                        System.out.println("Not Enough Resources!");
                    else {
                        System.out.println("Exchange Performed Successfully!");
                        if (currencies.containsKey(currencytoSale)) {
                            currencies.put(currencytoSale, currencies.get(currencytoSale) + toSale);
                        } else {
                            currencies.put(currencytoSale, toSale);
                        }
                        currencies.put("MDL", currencies.get("MDL") - temp1);
                    }
                } else
                    System.out.println("Not enough resources!");
            } else {
                System.out.println("How much you want to sale?");
                float toSale = in.nextFloat();
                float temp1 = toSale * priceSale.get(currencytoSale);
                if (currencies.containsKey("MDL")) {
                    if (temp1 > currencies.get("MDL"))
                        System.out.println("Not Enough Resources!");
                    else {
                        System.out.println("Exchange Succeeded!");
                        if (currencies.containsKey(currencytoSale)) {
                            currencies.put(currencytoSale, currencies.get(currencytoSale) + toSale);
                        } else {
                            currencies.put(currencytoSale, toSale);
                        }
                        currencies.put("MDL", currencies.get("MDL") - temp1);
                    }
                }
            }
        } else {

            System.out.println("Which currency you want to buy?");

            currencyChoice = in.next().toUpperCase();

            if (currencies.containsKey(currencyChoice)) {
                System.out.println("How much you want to buy?");
                try {
                    toBuy = in.nextFloat();
                } catch (InputMismatchException e) {
                    System.out.println("Wrong input");
                }
                float temp1 = toBuy * priceBuy.get(currencyChoice);
                if (currencies.containsKey(currencyChoice)) {
                    if (toBuy < currencies.get(currencyChoice)) {
                        currencies.put(currencyChoice, currencies.get(currencyChoice) - toBuy);
                        System.out.println("Exchange Succeeded!");
                        if (currencies.containsKey("MDL")) {
                            currencies.put("MDL", currencies.get("MDL") + temp1);
                        } else {
                            currencies.put("MDL", temp1);
                            initialCurrencies.put("MDL", 0F);
                        }
                    } else
                        System.out.println("Not enough resources!");

                } else
                    System.out.println("No such currency in vault!");
            }
            else
                System.out.println("No such currency in vault!");
        }

    }
}
