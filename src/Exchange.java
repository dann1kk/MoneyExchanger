package BankApp;


import java.util.Scanner;

import static BankApp.Deposit.*;

public class Exchange {

    Scanner in = new Scanner(System.in);

    void forthCase() {

        System.out.println("What currency you wanna sale?");
        String currencytoExchange = in.next().toUpperCase();

        switch (currencytoExchange) {
            case "LEI":
                System.out.println("What currency you wanna buy?");
                String currencyBuy = in.next().toUpperCase();
                switch (currencyBuy) {
                    case "$": case "DOLLARS": case "DOLAR": case "DOLARI": case "DOLLAR": case "USD":  {
                        System.out.println("How much dollars you wanna buy?");
                        int amountDollarsBuy = in.nextInt();
                        if(amountDollarsBuy * buyPriceDollars > amountLei)
                            System.out.println("Not enough resources");
                        else
                        amountLei -= amountDollarsBuy * buyPriceDollars;
                        amountUSD += amountDollarsBuy;
                        System.out.println(amountDollarsBuy + " $ bought");
                        break;
                    }
                    case "EUR": case "EURO": {
                        System.out.println("How much euro you wanna buy?");
                        int amountEuroBuy = in.nextInt();
                        if(amountEuroBuy * buyPriceEuro > amountLei)
                            System.out.println("You don't have enough resources");
                        else
                        amountLei -= amountEuroBuy * buyPriceEuro;
                        amountEURO += amountEuroBuy;
                        System.out.println(amountEuroBuy + " Euro bought");
                        break;
                    }
                    case "RUBLA": case "RUBLE": case "RUBLET": case "RUB": {
                        System.out.println("How much ruble you wanna buy?");
                        int amountRubleBuy = in.nextInt();
                        if(amountRubleBuy * buyPriceRub > amountLei)
                            System.out.println("You don't have enough resources");
                        else
                        amountLei -= amountRubleBuy * buyPriceRub;
                        amountRUB += amountRubleBuy;
                        System.out.println(amountRubleBuy + " Ruble bought");
                        break;
                    }

                    default:
                        System.out.println("Wrong Input.");
                }
                break;
            case "EUR": case "EURO":
                System.out.println("What currency you wanna buy?");
                currencyBuy = in.next().toUpperCase();
                switch (currencyBuy) {
                    case "$": case "DOLLARS": case "DOLAR": case "DOLARI": case "DOLLAR": case "USD": {
                        System.out.println("How much dollars you wanna buy?");
                        int amountDollarsBuy = in.nextInt();
                        if(amountDollarsBuy * salePriceDollars > amountEURO)
                            System.out.println("You don't have enough resources");
                        else
                        amountEURO -= amountDollarsBuy * salePriceDollars;
                        amountUSD += amountDollarsBuy;
                        System.out.println(amountDollarsBuy + "$ bought");
                        break;
                    }
                    case "LEI": {
                        System.out.println("How much lei you wanna buy?");
                        int amountLeiBuy = in.nextInt();
                        if(amountLeiBuy * salePriceLei > amountEURO)
                            System.out.println("You don't have enough resources");
                        else
                        amountEURO -= amountLeiBuy * salePriceLei;
                        amountLei += amountLeiBuy;
                        System.out.println(amountLeiBuy + "Lei bought");
                        break;
                    }
                    case "RUBLA": case "RUBLE": case "RUBLET": case "RUB":  {
                        System.out.println("How much ruble you wanna buy?");
                        int amountRubleBuy = in.nextInt();
                        if (amountRubleBuy * salePriceRub > amountEURO)
                            System.out.println("You don't have enough resources");
                        else
                        amountEURO -= amountRubleBuy * salePriceRub;
                        amountRUB += amountRubleBuy;
                        System.out.println(amountRubleBuy + "Ruble bought");
                        break;
                    }

                    default:
                        System.out.println("Wrong Input.");
                }
            case "$": case "DOLLARS": case "DOLAR": case "DOLARI": case "DOLLAR": case "USD":
                System.out.println("What currency you wanna buy?");
                currencyBuy = in.next().toUpperCase();
                switch (currencyBuy) {
                    case "EURO": case "EUR": {
                        System.out.println("How much euro you wanna buy?");
                        int amountEUROBuy = in.nextInt();
                        if (amountEUROBuy * salePriceEuro > amountUSD)
                            System.out.println("You don't have enough resources");
                        else
                        amountUSD -= amountEUROBuy * salePriceEuro;
                        amountEURO += amountEUROBuy;
                        System.out.println(amountEUROBuy + "Euro bought");
                        break;
                    }
                    case "LEI": {
                        System.out.println("How much lei you wanna buy?");
                        int amountLeiBuy = in.nextInt();
                        if(amountLeiBuy * salePriceLei > amountUSD)
                            System.out.println("You don't have enough resources");
                        else
                        amountUSD -= amountLeiBuy * salePriceLei;
                        amountLei += amountLeiBuy;
                        System.out.println(amountLeiBuy + "Lei bought");
                        break;
                    }
                    case "RUBLA": case "RUBLE": case "RUBLET": case "RUB":  {
                        System.out.println("How much ruble you wanna buy?");
                        int amountRubleBuy = in.nextInt();
                        if(amountRubleBuy * salePriceRub > amountUSD)
                            System.out.println("You don't have enough resources");
                        else
                        amountUSD -= amountRubleBuy * salePriceRub;
                        amountRUB += amountRubleBuy;
                        System.out.println(amountRubleBuy + "Ruble bought");
                        break;
                    }

                    default:
                        System.out.println("Wrong Input.");
                }
                break;

            default:
                System.out.println("Wrong Input.");
        }
    }
}


