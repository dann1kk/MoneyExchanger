package BankApp;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Deposit {

    Scanner in = new Scanner(System.in);

    static String currency;
    static float price;
    static float money;
    static Map<String, Float> currencies = new HashMap<>();
    static Map<String, Float> prices = new HashMap<>();
    static Map<String, Float> initialCurrencies = new HashMap<>();

    void firstCase(){
             System.out.println("How much you want to deposit?");
             money = in.nextFloat();
             System.out.println("What currency?");
             currency = in.next().toUpperCase();
             System.out.println("What is the price of your currency?");
             price = in.nextFloat();

             if (currencies.containsKey(currency)){
                 currencies.put(currency, currencies.get(currency) + money);}
             else
                 initialCurrencies.put(currency, money);
                 currencies.put(currency, money);

             if(prices.containsKey(currency))
                 System.out.println();
             else
                 prices.put(currency, price);


         }
}


