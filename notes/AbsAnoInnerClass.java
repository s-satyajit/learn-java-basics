abstract class A {
    public abstract void show();
    public abstract void config();
}

public class AbsAnoInnerClass {
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