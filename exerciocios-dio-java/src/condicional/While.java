package condicional;
import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double budget = 100;
        while(budget > 0){
            double candyValue = randomValue();
            if(candyValue > budget){
                break;
            }
            budget = budget - candyValue;
            String candyValue2F = String.format("%.2f", candyValue);
            System.out.println("The value of the candy:v" + candyValue2F + " it's okay, it was added in your shopping basket");
        }

        System.out.println("Sorry! Your budget isn't enough");
        String budget2F = String.format("%.2f", budget);
        System.out.println("Your budget is: " + budget2F);
    }

    private static double randomValue() {
        return ThreadLocalRandom.current().nextDouble(1, 60);
    }
}
