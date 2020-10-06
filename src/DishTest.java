public class DishTest{
    public static void main(String[] args) {
       Dish d1 = new Dish(5000, "Sushi", true);


       Dish d2 = new Dish(500,"McDouble", false);



       d1.printSummary();
       d2.printSummary();

       DishTools.shoutDishName(d1);
       DishTools.analyzeDishCost(d1);
       DishTools.flipRecommendation(d1);

       d1.printSummary();
    }
}
