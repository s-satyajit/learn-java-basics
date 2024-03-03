class A {
    public void show1() {
        System.out.println("in A show");
    }
}
class B extends A {
    public void show2() {
        System.out.println("in B show");
    }
}


public class Casting {
    public static void main(String a[]) {
        A obj1 = new B(); //Upcasting
        obj1.show1();

        B obj2 = (B) obj1; //Downcasting
        obj2.show2();

    }
}