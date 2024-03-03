enum Laptop {
    Macbook(2000), XPS(2200), Surface, ThinkPad(1800);

    private int price;

    private Laptop(int price) {
        this.price = price;
        System.out.println("in Laptop " + this.name());
    }

    private Laptop() {
        price = 500;
    }

    public int getPrice() {
        return price;
    }

    // public void setPrice() {
    //     this.price = price;
    // }
}



public class EnumClass {
    public static void main(String a[]) {
        for(Laptop lap:Laptop.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }
    }
}