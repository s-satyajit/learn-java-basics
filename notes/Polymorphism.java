class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("in C show");
    }
}


public class Polymorphism {
    public static void main(String a[]) {
        A obj = new A();
        obj.show();

        A obj1 = new B();
        obj1.show();

        obj1 = new C();
        obj1.show();
    }
}