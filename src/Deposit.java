package BankApp;


import java.util.Scanner;

public class Deposit {

    Scanner in = new Scanner(System.in);
    static float amountUSD;
    static float amountEURO;
    static float amountRUB;
    static float amountLei;
    static float salePriceLei = (float) 12.3;
    static float salePriceEuro = (float) 20.42;
    static float salePriceDollars = 14;
    static float salePriceRub = (float) 12.33;
    static float buyPriceLei = (float) 14.11;
    static float buyPriceEuro = (float) 7.51;
    static float buyPriceDollars = (float) 18.69;
    static float buyPriceRub = (float) 0.24;
    static float amountLeiInitial;
    static float amountEuroInitial;
    static float amountUsdInitial;
    static float amountRubInitial;

    void firstCase() {

        System.out.println("How much money you wanna deposit?");
        float temp = in.nextFloat();
        System.out.println("Which currency you wanna deposit?");
        String currenctoDeposit = in.next().toUpperCase();
        System.out.println("The sale price for your currency:");
        float salePrice = in.nextFloat();
        System.out.println("The buy price for your currency:");
        float buyPrice = in.nextFloat();
        switch (currenctoDeposit) {
            case "LEI":
                if (temp <= 0)
                    System.out.println("Can't deposit non-positive amount.");
                else
                    System.out.println(temp + " Lei has been deposited.");
                amountLeiInitial = amountLei + temp;
                amountLei = amountLei + temp;
                salePriceLei = salePrice;
                buyPriceLei = buyPrice;
                break;

            case "EUR": case "EURO":
                if (temp <= 0)
                    System.out.println("Can't deposit non-positive amount.");
                else
                    System.out.println(temp + " € has been deposited.");
                amountEuroInitial = amountEURO + temp;
                amountEURO = amountEURO + temp;
                salePriceEuro = salePrice;
                buyPriceEuro = buyPrice;
                break;

            case "$": case "DOLLARS": case "DOLAR": case "DOLARI": case "DOLLAR": case "USD":
                if (temp <= 0)
                    System.out.println("Can't deposit non-positive amount.");
                else
                    System.out.println(temp + " $ has been deposited.");
                amountUsdInitial = amountUSD + temp;
                amountUSD = amountUSD + temp;
                salePriceDollars = salePrice;
                buyPriceDollars = buyPrice;
                break;

            case "RUBLA": case "RUBLE": case "RUBLET": case "RUB":
                if (temp <= 0)
                    System.out.println("Can't deposit non-positive amount.");
                else
                    System.out.println(temp + " RUB has been deposited.");
                amountRubInitial = amountRUB + temp;
                amountRUB = amountRUB + temp;
                salePriceRub = salePrice;
                buyPriceRub = buyPrice;
                break;

            default:
                System.out.println("Wrong Input");
        }
    }
}

