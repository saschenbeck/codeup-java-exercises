public class Person {
    public Person(String name) {
        this.name = name;
    }

    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello() {
        String thisName = getName();
        System.out.printf("Hello, %s\n", thisName);
    }

    public static void main(String[] args) {
//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }
}


