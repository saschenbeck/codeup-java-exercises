public class Dish {
    private int costInCents;
    private String nameOfDish;
    private boolean wouldRecommend;

    public Dish(int cost, String name, boolean recommend) {
        this.costInCents = cost;
        this.nameOfDish = name;
        this.wouldRecommend = recommend;
    }

    public int getCostInCents(){
        return this.costInCents;
    }

    public void setCostInCents(int costInCents){
        this.costInCents = costInCents;
    }

    public String getNameOfDish(){
        return this.nameOfDish;
    }

    public void setNameOfDish(String nameOfDish){
        this.nameOfDish = nameOfDish;
    }

    public boolean getWouldRecommend(){
        return this.wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend){
        this.wouldRecommend = wouldRecommend;
    }


    public void printSummary(){
        System.out.printf("Cost: %d\n" +
                        "Name: %s\n" +
                        "Recommend: %s\n", this.costInCents, this.nameOfDish, this.wouldRecommend);
    }
}
