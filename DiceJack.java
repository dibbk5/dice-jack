import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6.");

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if (num1 < 1 || num2 < 1 || num3 < 1) {
            System.out.println("Numbers can not be less than 1");
            System.exit(0);
        }

        if (num1 > 6 || num2 > 6 || num3 > 6) {
            System.out.println("Numbers can not be greater than 6");
            System.exit(0);
        }

        int sumOfNumbers = num1 + num2 + num3;
        int sumOfRolls = roll1 + roll2 + roll3;

        System.out.println("You rolled " + sumOfNumbers + " your opponenet rolled " + sumOfRolls);

        checkWin(sumOfNumbers, sumOfRolls);

        scan.close();
    }

    public static int rollDice() {
        double rolling = Math.random() * 6;
        rolling += 1;
        return (int) rolling;

    }

    public static void checkWin(int sumNumbers, int sumDiceRolls) {
        if (sumNumbers > sumDiceRolls) {
            System.out.println("Congradulations you beat your opponent");
        } else if (sumNumbers < sumDiceRolls) {
            System.out.println("Sorry your opponenet rolled higher than you and you lost");
        } else {
            System.out.println("Wow! It looks like you tied");
        }
    }
}