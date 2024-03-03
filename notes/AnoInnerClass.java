class A {
    public void show() {
        System.out.println("in A show");
    }
    public void config() {
        System.out.println("in A config");
    }
}

public class AnoInnerClass {
    public static void main(String a[]) {
        A obj = new A() {
            public void show() {
                System.out.println("in new show");
            }
            public void config() {
                System.out.println("in new config");
            }
        };
        obj.show();
        obj.config();
    }
}