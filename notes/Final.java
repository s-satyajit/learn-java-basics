final class Calc {
    public final void show() {
        System.out.println("By Satyajit");
    }
    public void add(int n1, int n2) {
        System.out.println(n1+n2);
    }
}
// class AdvCalc extends Calc {
//     // public void show() {
//     //     System.out.println("By John");
//     // }
//     public void add(int n1, int n2) {
//         System.out.println((n1+n2)*10);
//     }
// }


public class Final {
    public static void main(String a[]) {
        final int num = 5;
        // num = 10;
        System.out.println(num);
        
        Calc obj = new Calc();
        obj.show();
        obj.add(5,2);
        
        
    }
}