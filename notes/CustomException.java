class SatyajitException extends Exception {
    public SatyajitException(String string) {
        super(string);
    }
}

public class CustomException {
    public static void main(String args[]) {
        int i = 20;
        int j = 0;
        try{
            j = 18/i;
            if(j==0)
                throw new SatyajitException("I don't want to print zero");
        }
        catch(SatyajitException e) {
            j = 18/1;
            System.out.println("This is the default output"); 
        }
        System.out.println(j);
        System.out.println("End");
    }
}