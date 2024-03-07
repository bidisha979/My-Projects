import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors_Game {
    public static void main(String[] args) {
        while(true){
            System.out.println("\n'1' --> Rock\n'2' --> Paper\n'3' --> Scissors\n'0' --> Quit");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your response: ");
            int user = sc.nextInt();
            Random number = new Random();
            int upperbound = 3;
            int int_random = number.nextInt(upperbound) + 1;
            if (user<=3 && user>=1) {
                System.out.println("Number by Computer is : " + int_random);
            }
            if(int_random == 1 && user == 1) {
                System.out.println("Result: Match Draw");
            }
            else if(int_random ==1 && user == 2) {
                System.out.println("Result: You Won");
            }
            else if(int_random == 1 && user == 3) {
                System.out.println("Result: Computer Won");
            }
            else if(int_random == 2 && user == 1) {
                System.out.println("Result: Computer Won");
            }
            else if(int_random == 2 && user == 2) {
                System.out.println("Result: Match Draw");
            }
            else if(int_random == 2 && user == 3) {
                System.out.println("Result: You Won");
            }
            else if(int_random == 3 && user == 1) {
                System.out.println("Result: You Won");
            }
            else if(int_random == 3 && user == 2) {
                System.out.println("Result: Computer Won");
            }
            else if(int_random == 3 && user == 3) {
                System.out.println("Result: Match Draw");
            } else if (user == 0) {
                break;
            } else {
                System.out.println("Please enter a valid number");
            }
        }
    }
}
