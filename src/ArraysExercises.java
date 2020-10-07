import java.io.ObjectStreamException;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
        //You need Arrays.toString, otherwise it will print out the id of the array rather than the content

        //Person people[] = new Person[3];
        //System.out.println(Arrays.toString(people));
        //for (Person person : people){
        //    System.out.println(person);
        //}

        Person bob = new Person("Bob");
        Person billy = new Person("Billy");
        Person benjamin = new Person("Benjamin");

        Person[] people = new Person[3];
        people[0] = bob;
        people[1] = billy;
        people[2] = benjamin;

        //for (Person person : people){
        //  System.out.println(person.getName());
        //}
        addPerson(people, new Person("Brandon"));



    }
    public static void addPerson(Person[] people, Person personToAdd){
        Person[] copyPeopleArray = Arrays.copyOf(people, people.length+1);
        copyPeopleArray[copyPeopleArray.length-1] = personToAdd;
        for(Person individual: copyPeopleArray){
            System.out.println(individual.getName());
        }
    }
}
