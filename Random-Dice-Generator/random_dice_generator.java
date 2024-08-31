import java.util.Random;

public class random_dice_generator {
    
    public static void main (String[] args){

        Random random = new Random();

        int x = random.nextInt(6) + 1;

        System.out.print(x);

    }
}
