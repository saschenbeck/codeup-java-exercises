public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish x){
        System.out.println(x.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish x){
        if(x.costInCents > AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average.");
        } else if (x.costInCents < AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("Less expensive than average.");
        } else {
            System.out.println("Just as expensive as average.");
        }
    }

    public static void flipRecommendation(Dish x){
        x.wouldRecommend = !x.wouldRecommend;
    }
}
