enum Status {
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String a[]) {
        // Status s = Status.Running;

        // System.out.println(s);
        // System.out.println(s.ordinal());

        Status ss[] = Status.values();
        
        for(Status s:ss) {
            System.out.println(s + " : " + s.ordinal());
        }

        // System.out.println(ss[0]);

    }
}