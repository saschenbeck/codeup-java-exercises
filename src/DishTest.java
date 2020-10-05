public class DishTest {
    public static void main(String[] args) {
       Dish d1 = new Dish();
       d1.costInCents = 5000;
       d1.nameOfDish = "Sushi";
       d1.wouldRecommend = true;

       Dish d2 = new Dish();
       d2.costInCents = 500;
       d2.nameOfDish = "McDouble";
       d2.wouldRecommend = true;


       d1.printSummary();
       d2.printSummary();

    }
}
