package BankApp;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import static BankApp.Deposit.*;

public class Withdraw {


    Scanner in = new Scanner(System.in);

    static int withdrawMoney;

    void secondCase(){

        System.out.println("Which currency to withdraw?");
        currency = in.next().toUpperCase();
        System.out.println("What amount?");
        withdrawMoney = in.nextInt();

        if (!currencies.containsKey(currency))
            System.out.println("No such a currency in your account");
        else
            if(currencies.get(currency) - withdrawMoney > currencies.get(currency)){
            currencies.put(currency, currencies.get(currency) - withdrawMoney);
            }
            else
                System.out.println("Not enough resources");

    }
}

