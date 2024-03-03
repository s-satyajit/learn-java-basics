import InheritanceClass.Calc;
import InheritanceClass.AdvCalc;
import InheritanceClass.VeryAdvCalc;

public class Inheritance {
    public static void main(String a[]) {
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,2);
        int r2 = obj.sub(9,2);
        int r3 = obj.multi(2,5);
        int r4 = obj.div(9,2);
        double r5 = obj.power(4,2);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);
    }
}