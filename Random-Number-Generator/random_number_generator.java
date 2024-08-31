import java.util.Random;

public class random_number_generator {
    
    public static void main (String[] args){

        Random random = new Random();

        int x = random.nextInt();

        System.out.print(x);

    }
}
