public class Person {
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String sayHello() {
        String thisName = getName();
        return String.format("Hello, %s", thisName);
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("John");
        System.out.println(person1.sayHello());

        Person person2 = new Person();
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}


