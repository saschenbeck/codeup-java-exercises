public class DishTest {
    public static void main(String[] args) {
       Dish d1 = new Dish();
       d1.setCostInCents(5000);
       d1.setNameOfDish("Sushi");
       d1.setWouldRecommend(true);

       Dish d2 = new Dish();
       d2.setCostInCents(500);
       d2.setNameOfDish("McDouble");
       d2.setWouldRecommend(true);


       d1.printSummary();
       d2.printSummary();

    }
}
