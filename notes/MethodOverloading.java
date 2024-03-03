class Overloading {
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}


public class MethodOverloading {
    public static void main(String a[]) {
        Overloading obj = new Overloading();
        int r1 = obj.add(3,4,5);
        System.out.println(r1);
    }
}