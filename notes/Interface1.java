// class-class -> extends
// interface-interface -> extends
// interface-class -> implements


interface A {
    String area="Billboard";            //final & static
    int span=100;                       //final & static

    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X {

}
class B implements A,Y {
    public void show() {
        System.out.println("in show");
    }
    public void config() {
        System.out.println("in config");
    }
    public void run() {
        System.out.println("in run");
    }
}


public class Interface1 {
    public static void main(String a[]) {
        A obj = new B();
        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        System.out.println(A.area + " : " + A.span);
    }
}