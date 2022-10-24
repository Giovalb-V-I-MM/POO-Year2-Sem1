import java.util.Objects;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Dice {

    public static void main(String[] args) {
        BankAccount playerAccount = new BankAccount(1000);
        BankAccount casinoAccount = new BankAccount(100000);
        int predictedValue, actualValue;
        double bet = 0;
        String choice = "no";
        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Insert an n [1 <= n <= 6]: ");
        int input = Integer.parseInt(in.nextLine());
        n = input;
        System.out.println("");
        if(n < 1)
            n = 1;
        else if(n > 6)
            n = 6;

        System.out.print("Insert bet: ");
        double input2 = Double.parseDouble(in.nextLine());
        System.out.println("");
        if(bet >= playerAccount.getBalance()){
            System.out.println(" > WARNING BET higher or equal to your balance <");
            System.out.println("Are you sure youwant to continue? yes/no");
            if(Objects.equals(in.nextLine(), "yes"))
                bet = input2;
            else
                System.exit(0);
        }

        Random diceThrow = new Random();
        actualValue = diceThrow.nextInt(6);
        actualValue++;
        System.out.print("Dice: ");
        System.out.println(diceThrow);

        if(n == actualValue){
            System.out.println("°**.*WIN*_*°*   -   Deposisting money...");
            playerAccount.deposit(bet*5);
            casinoAccount.withdraw(bet*5);
        }
        else{
            System.out.println("___YOU LOST___   -   Processing transaction...");
            playerAccount.withdraw(bet);
            casinoAccount.withdraw(bet);
        }

        if(playerAccount.getBalance() > 0){
            System.out.print("Continue playing? yes/no: No");
        }




        System.out.println("Il tuo saldo è " + playerAccount.getBalance());
        System.exit(1);
    }
}