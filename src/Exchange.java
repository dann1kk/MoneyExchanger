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
        System.out.println("SALE -> [Currency -> Lei ]; BUY -> [Lei/Currency -> Currency]");
        String choice = in.next().toUpperCase();

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
            System.out.println("Which kind of buy you want to perform?");
            System.out.println("1. Lei -> Currency ; 2. Currency -> Currency");
            int buyChoice = in.nextInt();

            switch (buyChoice) {
                case 1:
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
                    } else
                        System.out.println("No such currency in vault!");
                case 2:
                    System.out.println("With which currency you want to buy?");
                    String currencySell = in.next().toUpperCase();

                    if (!currencies.containsKey(currencySell)) {
                        System.out.println("What is the buy-price of your currency?");
                        priceB = in.nextFloat();
                        priceBuy.put(currencySell, priceB);
                        System.out.println("What is the sale-price of your currency?");
                        priceS = in.nextFloat();
                        priceSale.put(currencySell, priceS);
                    }
                    System.out.println("Which currency you want to buy?");
                    String currencyBuy = in.next().toUpperCase();

                    if (!currencies.containsKey(currencyBuy)) {
                        System.out.println("No such currency in vault!");
                    } else {
                        System.out.println("How much " + currencyBuy + " you want to buy?");

                        float amountBuy = in.nextInt();

                        float temp1 = amountBuy * priceSale.get(currencyBuy);

                        float temp2 = temp1 / priceBuy.get(currencySell);
                        if (currencies.containsKey(currencyBuy)) {
                            if (amountBuy < currencies.get(currencyBuy)) {
                                System.out.println("Transaction Successful!");
                                currencies.put(currencyBuy, currencies.get(currencyBuy) - amountBuy);
                                initialCurrencies.put(currencySell, 0F);
                                if (currencies.containsKey(currencySell)) {
                                    currencies.put(currencySell, currencies.get(currencySell) + temp2);
                                } else {
                                    currencies.put(currencySell, temp2);
                                }
                            } else {
                                System.out.println("Not enough resources!");

                            }
                        } else
                            System.out.println("Not enough resources");

                    }
            }

        }
    }
}
