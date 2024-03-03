class Laptop {
    String brand;
    int price;

    public String toString() {
        return brand + " : " + price;
    }

    public boolean equals(Laptop that) {
        return this.brand.equals(that.brand) && this.price == that.price;
    }


}


public class ObjtoString {
    public static void main(String a[]) {
        Laptop obj1 = new Laptop();
        obj1.brand = "Dell";
        obj1.price = 7000;

        Laptop obj2 = new Laptop();
        obj2.brand = "Dell";
        obj2.price = 7000;

        boolean result = obj1.equals(obj2);
        System.out.println(result);

        System.out.println(obj1);

    }
}