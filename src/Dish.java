public class Dish {

    public int costInCents;
    public String nameOfDish;
    public boolean wouldRecommend;


    public void printSummary(){
        System.out.printf("Cost: %d\n" +
                        "Name: %s\n" +
                        "Recommend: %s\n", this.costInCents, this.nameOfDish, this.wouldRecommend);
    }
}
