class Person {
    private String name;
    private int age;

    public Person() {
        name = "Satyajit Samal";
        age = 21;
        System.out.println(name + " : " + age);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name + " : " + age);
    }
    public Person(String name) {
        this.name = name;
        this.age = 100;
        System.out.println(name + " : " + age);
    }
}


public class Constructor {
    public static void main(String a[]) {
        Person obj = new Person();
        Person obj1 = new Person("John", 90);
        Person obj2 = new Person("David");
    }
}