package BankApp;

import static BankApp.Deposit.*;


public class Balance {


   public static void thirdCase() {

        System.out.println("Your balance:\n");
        if (amountLei != 0)
            System.out.println(amountLei + " Lei\n");
        if (amountUSD != 0)
            System.out.println(amountUSD + " $");
        if (amountEURO != 0)
            System.out.println(amountEURO + " €\n");
        if (amountRUB != 0){
            System.out.println(amountRUB + " RUB");}

    }
}


