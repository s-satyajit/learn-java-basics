class Human {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {z
        return age;
    }

}



public class Encapsulation {
    public static void main(String a[]) {
        Human obj = new Human();
        obj.setName("Satyajit Samal");
        obj.setAge(21);

        System.out.println(obj.getName() + " : " + obj.getAge());
       
    }
}