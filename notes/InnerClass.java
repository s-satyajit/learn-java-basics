class A {
    String desk;

    public void show() {
        System.out.println("in A show");
    }

    class B {
        public void config() {
            System.out.println("in B config");
        }
    }
}


public class InnerClass {
    public static void main(String a[]) {
        A obj = new A();
        
        A.B obj1 = obj.new B();
        obj1.config();
    }
}