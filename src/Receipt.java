package BankApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import static BankApp.Deposit.*;

public class Receipt {
     void print(){
         DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
         LocalDateTime now = LocalDateTime.now();

         if(amountLeiInitial != 0 | amountLei != 0){
        System.out.println("Amount of Lei you had initially: "+ amountLeiInitial + " and after your withdrawals and exchanges " + amountLei );
         System.out.println("Receipt issued at: " + dt.format(now));
         }
         if(amountEuroInitial != 0 | amountEURO != 0) {
             System.out.println("Amount of Euro you had initially: " + amountEuroInitial + " and after your withdrawals and exchanges " + amountEURO);
             System.out.println("Receipt issued at: " + dt.format(now));
         }
         if(amountUsdInitial != 0 | amountUSD != 0) {
             System.out.println("Amount of Dollars you had initially: " + amountUsdInitial + " and after your withdrawals and exchanges " + amountUSD);
             System.out.println("Receipt issued at: " + dt.format(now));
         }
         if(amountRubInitial != 0 | amountRUB != 0) {
             System.out.println("Amount of Ruble you had initially: " + amountRubInitial + " and after your withdrawals and exchanges " + amountRUB);
             System.out.println("Receipt issued at: " + dt.format(now));
         }
         // example with arraylist
         ArrayList <Float> balance = new ArrayList<>();
         balance.add(amountEURO);
         balance.add(amountEuroInitial);
         balance.add(amountLei);
         balance.add(amountLeiInitial);
         balance.add(amountRUB);
         balance.add(amountRubInitial);
         balance.add(amountUSD);
         balance.add(amountUsdInitial);
         balance.removeIf( n -> (n == 0));
         System.out.println(balance);

     }
}
