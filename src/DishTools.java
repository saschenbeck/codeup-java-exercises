public class DishTools {
    public static final int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish x){
        String name = x.getNameOfDish();
        System.out.println(name.toUpperCase());
    }

    public static void analyzeDishCost(Dish x){
        int cost = x.getCostInCents();
        if(cost > AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average.");
        } else if (cost < AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("Less expensive than average.");
        } else {
            System.out.println("Just as expensive as average.");
        }
    }

    public static void flipRecommendation(Dish x){
        boolean recommend = x.getWouldRecommend();
        recommend = !recommend;
        x.setWouldRecommend(recommend);
    }
}
