package MoneyExchanger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Deposit {

    Scanner in = new Scanner(System.in);

    static String currency;
    static float priceB;
    static float priceS;
    static float money;
    static Map<String, Float> currencies = new HashMap<>();
    static Map<String, Float> priceBuy = new HashMap<>();
    static Map<String, Float> priceSale = new HashMap<>();
    static Map<String, Float> initialCurrencies = new HashMap<>();

    void firstCase(){
        System.out.println("How much you want to deposit?");
        money = in.nextFloat();

        System.out.println("What currency?");
        currency = in.next().toUpperCase();

        System.out.println("What is the buy-price of your currency?");
        priceB = in.nextFloat();

        System.out.println("What is the sale-price of your currency?");
        priceS = in.nextFloat();

        if (currency.equals("MDL")){
            if (currencies.containsKey("MDL")){
                currencies.put("MDL", currencies.get("MDL") + money);
                initialCurrencies.put("MDL", initialCurrencies.get("MDL") + money);
            }
            else{
                initialCurrencies.put("MDL", money);
                currencies.put("MDL", money);
            }
            priceBuy.put(currency, priceB);
            priceSale.put(currency, priceS);
        }
        else if(currency.equals(("LEU"))){
            if (currencies.containsKey("MDL")){
                currencies.put("MDL", currencies.get("MDL") + money);
                initialCurrencies.put("MDL", initialCurrencies.get("MDL") + money);
            }
            else{
                currencies.put("MDL", money);
                initialCurrencies.put("MDL", money);

            }
            priceBuy.put("MDL", priceB);
            priceSale.put("MDL", priceS);
        }
        else if(currency.equals("LEI")){
            if (currencies.containsKey("MDL")){
                currencies.put("MDL", currencies.get("MDL") + money);
            initialCurrencies.put("MDL", initialCurrencies.get("MDL") + money);}
            else{
                currencies.put("MDL", money);
                initialCurrencies.put("MDL", money);

            }
            priceBuy.put("MDL", priceB);
            priceSale.put("MDL", priceS);
        }
        else{

        if (currencies.containsKey(currency)){
            currencies.put(currency, currencies.get(currency) + money);
            initialCurrencies.put(currency, initialCurrencies.get(currency) + money);
        }
        else
            initialCurrencies.put(currency, money);
        currencies.put(currency, money);

        if (priceBuy.containsKey(currency))
            System.out.println();
        else
            priceBuy.put(currency, priceB);

        if (priceSale.containsKey(currency))
            System.out.println();
        else
            priceSale.put(currency, priceS);
    }
}}

