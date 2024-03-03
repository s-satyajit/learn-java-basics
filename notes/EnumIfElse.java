enum Network {
    Blocked, Coverage, Busy, Running
}

public class EnumIfElse {
    public static void main(String a[]) {
        Network n = Network.Running;

        if(n == Network.Blocked) {
            System.out.println("Network is blocked;");
        } else if (n == Network.Coverage) {
            System.out.println("Network is covered");
        } else if (n == Network.Busy) {
            System.out.println("Network is busy");
        } else {
            System.out.println("Network is running");
        }

    }
}