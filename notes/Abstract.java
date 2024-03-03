abstract class Car {
    public abstract void drive();
    public void playMusic() {
        System.out.println("Music Playing");
    }
}
abstract class wagonR extends Car {
    public void drive() {
        System.out.println("Driving");
    }
    public abstract void fly();
}
class updatedWagonR extends wagonR {
    public void fly() {
        System.out.println("Flying");
    }
}


public class Abstract {
    public static void main(String a[]) {
        updatedWagonR obj = new updatedWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}