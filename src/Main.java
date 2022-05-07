package MoneyExchanger;

import java.util.Scanner;

public class Main {

        private static boolean quit = false;

        public static void main (String [] args) {
                Scanner in = new Scanner(System.in);

                do {
                        System.out.println("1. Add money in vault");
                        System.out.println("2. Withdraw money");
                        System.out.println("3. Check balance");
                        System.out.println("4. Exchange money");
                        System.out.println("5. Financial receipt ");
                        System.out.print("Your choice, 0 to quit: ");
                        int userChoice = in.nextInt();

                        switch (userChoice) {
                                case 1:
                                        Deposit dp = new Deposit();
                                        dp.firstCase();
                                        break;
                                case 2:
                                        Withdraw wd = new Withdraw();
                                        wd.secondCase();
                                        break;
                                case 3:
                                        Balance bl = new Balance();
                                        bl.thirdCase();
                                        break;
                                case 4:
                                        Exchange ex = new Exchange();
                                        ex.fourthCase();
                                        break;
                                case 5:
                                        Receipt rc = new Receipt();
                                        rc.fifthCase();
                                        break;
                                case 0:
                                        quit = true;
                                        break;
                                default:
                                        System.out.println("Wrong Choice");
                        }
                        System.out.println();
                } while (!quit);

                System.out.println("Good Bye!");
        }
}
