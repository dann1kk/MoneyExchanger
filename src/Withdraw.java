package BankApp;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import static BankApp.Deposit.*;

public class Withdraw {


    Scanner in = new Scanner(System.in);


    float amounttoWithdrawLei = 0f;
    float amounttoWithdrawUSD = 0f;
    float amounttoWithdrawEuro = 0f;
    float amounttoWithdrawRUB = 0f;

    void secondCase(){
                System.out.println("Which money currency to withdraw: \n");
                String currencytoWithdraw = in.next().toUpperCase();
                switch (currencytoWithdraw) {
                    case "LEI":
                        System.out.print("Amount to withdraw: ");
                        try {
                            amounttoWithdrawLei = in.nextFloat();
                        }catch(InputMismatchException e){
                            System.out.println("Input Error");
                        }
                        if (amounttoWithdrawLei <= 0 || amounttoWithdrawLei >= amountLei)
                            System.out.println("Withdrawal can't be completed.");
                        else {
                            amountLei -= amounttoWithdrawLei;
                            System.out.println(amounttoWithdrawLei + " Lei has been withdrawn.");
                            break;
                        }
                        break;

                    case "$": case "DOLLARS": case "DOLAR": case "DOLARI": case "DOLLAR":
                        System.out.print("Amount to withdraw: ");
                        try {
                            amounttoWithdrawUSD = in.nextFloat();
                        }catch (InputMismatchException e){
                            System.out.println("Input Error");
                        }
                        if (amounttoWithdrawUSD <= 0 || amounttoWithdrawUSD > amountUSD)
                            System.out.println("Withdrawal can't be completed.");
                        else {
                            amountUSD -= amounttoWithdrawUSD;
                            System.out.println(amounttoWithdrawUSD + " $ has been withdrawn.");
                        }
                        break;

                    case "EUR": case "EURO":
                        System.out.print("Amount to withdraw: ");
                        try {
                            amounttoWithdrawEuro = in.nextFloat();
                        }catch (InputMismatchException e){
                            System.out.println("Input Error");
                        }
                        if (amounttoWithdrawEuro <= 0 || amounttoWithdrawEuro > amountEURO)
                            System.out.println("Withdrawal can't be completed.");
                        else {
                            amountEURO -= amounttoWithdrawEuro;
                            System.out.println(amounttoWithdrawEuro + " € has been withdrawn.");
                        }
                        break;

                    case "RUBLA": case "RUBLE": case "RUBLET": case "RUB":
                        System.out.print("Amount to withdraw: ");
                        try {
                            amounttoWithdrawRUB = in.nextFloat();
                        }catch (InputMismatchException e){
                            System.out.println("Input Error");
                        }
                        if (amounttoWithdrawRUB <= 0 || amounttoWithdrawRUB > amountRUB)
                            System.out.println("Withdrawal can't be completed.");
                        else {
                            amountRUB -= amounttoWithdrawRUB;
                            System.out.println(amounttoWithdrawRUB + " RUB has been withdrawn.");
                        }
                        break;

                    default:
                        System.out.println("Wrong Input.");
                        break;
                }

        }

}

