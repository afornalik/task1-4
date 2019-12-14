import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lookedNumber = ThreadLocalRandom.current().nextInt(0,101);
        int number = -1;
        System.out.println("Welcome, try guess the number");
        System.out.println("range is between 1 and 100");

        do {
            System.out.print("type the number : ");
            try {
                number = scanner.nextInt();
                if(number < lookedNumber) {
                    System.out.println("too small");
                }else if(number > lookedNumber){
                    System.out.println("too high");
                }
            }catch (InputMismatchException e){
                System.out.println("\t only numbers !");
            }
        }while(lookedNumber != number );
        System.out.println("Congratulations you guessed the number !");
    }
}