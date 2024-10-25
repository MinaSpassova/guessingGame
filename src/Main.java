import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int tries = 1;
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int number = 0;
        String invalidInput = "";
        System.out.println("Welcome, in this game you have to try to guess the secret number between 1 and 100!");
        while(tries < 100 && number!=randomNumber && !invalidInput.equals("quit")) {
            System.out.println("Enter a number:");


            if (reader.hasNextInt()) {
                number = reader.nextInt();
                System.out.println("You entered the number " + number);
                if(number == randomNumber){
                    System.out.println("Bravo! You guessed the number!");
                }
                else if(number < randomNumber){
                    System.out.println("Your guess is too small, choose a bigger number! This is your " + tries + " guess.");
                    tries++;
                }
                else{
                    System.out.println("Your guess is too high, choose a smaller number! This is your " + tries + " guess.");
                    tries++;
                }
            }
            else {
                invalidInput = reader.next();
                if(invalidInput.equals("quit")) {
                    System.out.println("You have quit the game. The secret number is: " + randomNumber);
                }
                else{
                    System.out.println(invalidInput + " is not a valid number.");
                }
            }
        }
    }
}