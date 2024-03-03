public class MultiCatchException {
    public static void main(String args[]) {
        int i = 0;
        int j = 0;
        int nums[] = new int[5];
        String str = null;
        try{
            j = 18/i;
            System.out.println(nums[5]);
            System.out.println(str.length());
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit.");
        }
        catch(Exception e) { 
            System.out.println("Something Went Wrong" + " : " + e);
        }
        System.out.println("End");
    }
}