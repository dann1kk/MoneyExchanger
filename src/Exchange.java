package BankApp;


import java.util.Scanner;

import static BankApp.Deposit.*;


public class Exchange {

    static String currencyChoice;
    static String currencyExchange;
    static float toExchange;
    static float valueNew;
    Scanner in = new Scanner(System.in);

    void fourthCase() {

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
                    toExchange = in.nextInt();
                 float temp1 = toExchange * prices.get(currencyExchange);

                 float temp2 = currencies.get(currencyChoice) * prices.get(currencyChoice);

                 float temp3 = temp2 - temp1;

                 float temp4 = temp3 / prices.get(currencyChoice);

                    if(temp3 > 0) {
                        System.out.println(temp1 + temp2 + temp3 + temp4);
                        currencies.put(currencyChoice, currencies.get(currencyChoice) - temp4);
                        currencies.put(currencyExchange, currencies.get(currencyExchange) + toExchange);
                    }else System.out.println("\nNot enough resources for such exchange!");
                }
                    else {
                        currencies.put(currencyExchange, (float) 0);
                        System.out.println("Enter the price of the currency:");
                        valueNew = in.nextFloat();
                        prices.put(currencyExchange, valueNew);

                        System.out.println("How much you want to buy?");
                        toExchange = in.nextFloat();
                        float temp1 = toExchange * prices.get(currencyExchange);
                        float temp2 = currencies.get(currencyChoice) * prices.get(currencyChoice);
                        float temp3 = temp2 - temp1;
                        float temp4 = temp3 / prices.get(currencyChoice);

                        if(temp3 > 0) {
                            currencies.put(currencyChoice, temp4);
                            currencies.put(currencyExchange, currencies.get(currencyExchange) + toExchange);
                            System.out.println("\nExchange Successfully Performed");
                        }
                        else System.out.println("Not enough resources for such exchange");

                    }

            }

}



