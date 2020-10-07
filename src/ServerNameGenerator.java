public class ServerNameGenerator {
    public static void main(String[] args) {
        String adjectives[] = {"Quirky", "Awesome","Intelligent","Stubborn","Dreadful","Optimistic","Insightful", "Apathetic","Complicated","Simple"
        };
        String nouns[] = {"Proton","Electron","Neutron","Protein","Carbohydrate","Zygote","Amoeba","Heart","Brain","Virus"};
        nameGenerator(adjectives,nouns);
    }
    public static void nameGenerator(String[] x,String[] y){
        int chosenAdjective = (int) Math.floor(Math.random() * x.length + 1);
        int chosenNoun = (int) Math.floor(Math.random() * y.length + 1);

        System.out.println("Here is your server name:\n" +
                x[chosenAdjective] + "-" + y[chosenNoun]);

    }
}
