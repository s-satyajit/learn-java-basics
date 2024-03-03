class A {
    public A() {
        super();
        System.out.println("in A");
    }
    public A(int n) {
        super();
        System.out.println("in int A");
    }
}
class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }
    public B(int n) {
        this();
        System.out.println("in int B");
    }
}



public class Super {
    public static void main(String a[]) {
        B obj = new B(5);
    }
}