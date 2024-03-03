class A {
    public void A() {
        System.out.println("Object Created");
    }
    public void show() {
        System.out.println("in A");
    }
}


public class AnonymousObj {
    public static void main(String a[]) {
        new A().show();
    }
}