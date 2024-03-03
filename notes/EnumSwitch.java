enum Network {
    Blocked, Coverage, Busy, Running
}

public class EnumSwitch {
    public static void main(String a[]) {
        Network n = Network.Busy;

        switch(n) {
            case Blocked:
                System.out.println("Network is blocked");
            break;
            case Coverage:
                System.out.println("Network is covered");
            break;
            case Busy:
                System.out.println("Network is busy");
            break;
            case Running:
                System.out.println("Network is running");
            break;
        }
    }
}