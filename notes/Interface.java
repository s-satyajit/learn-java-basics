interface Computer {
    void code();
}

class Desktop implements Computer {
    public void code() {
        System.out.println("code, compile, run : Faster");
    }
}

class Laptop implements Computer {
    public void code() { 
        System.out.println("code, compile, run");
    }
}

class Developer {
    public void devApp(Computer var) {
        var.code();
    }
}


public class Interface {
    public static void main(String a[]) {
        Computer desk = new Desktop();
        Computer lap = new Laptop(); 

        Developer dev = new Developer();
        dev.devApp(desk);
    }
}