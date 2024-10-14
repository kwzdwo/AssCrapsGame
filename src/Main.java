import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1;
        int roll2;
        int sum;
        int thePoint = 0;
        String yn;
        boolean done = false;
        boolean secondDone = false;

        System.out.println("You are about to play craps!");
        while (!done) {
            if (secondDone) {
                System.out.println("You must roll a " + thePoint + " to win. If you get a 7 you lose!");
                roll1 = (int)(Math.random() * 6) + 1;
                roll2 = (int)(Math.random() * 6) + 1;
                sum = roll1+roll2;
                System.out.println("roll 1 is: " + roll1);
                System.out.println("roll 2 is: " + roll2);
                System.out.println("sum is: " + sum);
                System.out.println();
                if (sum == 7) {
                    System.out.println("You lose!");
                    secondDone = false;
                    System.out.println();
                    System.out.println("Would you like to continue? [Y/N]");
                    System.out.println();
                    yn = scan.nextLine();
                    if (yn.equals("N")) {
                        done = true;
                    }
                }else if (sum == thePoint){
                    System.out.println("You win!");
                    secondDone = false;
                    System.out.println();
                    System.out.println("Would you like to continue? [Y/N]");
                    System.out.println();
                    yn = scan.nextLine();
                    if (yn.equals("N")) {
                        done = true;
                    }
                }
            }else{

                roll1 = (int)(Math.random() * 6) + 1;
                roll2 = (int)(Math.random() * 6) + 1;
                sum = roll1+roll2;
                System.out.println("roll 1 is: " + roll1);
                System.out.println("roll 2 is: " + roll2);
                System.out.println("sum is: " + sum);
                System.out.println();
                if (sum == 7 || sum == 11) {
                    System.out.println("You rolled a " + sum + ". You win!");
                    System.out.println();
                    System.out.println("Would you like to continue? [Y/N]");
                    System.out.println();
                    yn = scan.nextLine();
                    if (yn.equals("N")) {
                        done = true;
                    }
                }else if (sum == 2 || sum == 12 || sum ==3){
                    System.out.println("You rolled a " + sum + ". You crapped yourself :(");
                    System.out.println("Would you like to continue? [Y/N]");
                    System.out.println();
                    yn = scan.nextLine();
                    if (yn.equals("N")) {
                        done = true;
                    }
                } else{
                    thePoint = sum;
                    secondDone = true;
                }
            }


        }

    }
}