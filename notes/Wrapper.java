public class Wrapper {
    public static void main(String a[]) {
        int num1 = 5;
        // Integer num2 = new Integer(num1);            //boxing
        Integer num2 = num1;                            //autoboxing

        // int num3 = num2.intValue();                  //unboxing
        int num3 = num2;                                //auto-unboxing

        String str = "8";
        int num4 = Integer.parseInt(str);
        

        System.out.println(num4);
    }
}