public class ExceptionThrow {
    public static void main(String args[]) {
        int i = 20;
        int j = 0;
        try{
            j = 18/i;
            if(j==0)
                throw new ArithmeticException("I don't want to print zero");
        }
        catch(ArithmeticException e) {
            j = 18/1;
            System.out.println("This is the default output " + e);
        }
        System.out.println(j);
        System.out.println("End");
    }
}