import java.util.Random;
import java.util.Scanner;

public class random_number_generator_looped {
    
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of RANDOM NUMBERS to generate: ");
        int number_of_random = scanner.nextInt();

        System.out.print("Enter the maximum value of RANDOM NUMBERS: ");
        int RNG_limit = scanner.nextInt();

        System.out.print("Enter the number of LINES to generate: ");
        int number_of_lines = scanner.nextInt();

        for (int j = 0; j < number_of_lines; j++) {
            for (int i = 0; i < number_of_random; i++) {
                int x = random.nextInt(RNG_limit + 1);
                System.out.print(x);
            }
            System.out.println();
        }
        scanner.close();
    }
}
