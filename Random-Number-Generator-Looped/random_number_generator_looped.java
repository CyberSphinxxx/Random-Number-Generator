import java.util.Random;

public class random_number_generator_looped {
    
    public static void main (String[] args){

        Random random = new Random();

        while (true) { 
            int x = random.nextInt();

            System.out.print(x);
        }
    }
}
