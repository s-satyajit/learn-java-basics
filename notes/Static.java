class Mobile
{
    String brand;
    int price;
    static String name;

    static{
        name = "SmartPhone";
        System.out.println(name);
    }
    
    public Mobile()
    {
        brand = "Apple";
        price = 1500;
    }

    // public void show()
    // {
    //     System.out.println(brand + " : " + price + " : " + name);
    // }

    // public static void show1(Mobile var)
    // {
    //     System.out.println(var.brand + " : " + var.price + " : " + name);
    // }
    

}



public class Static
{
    public static void main(String a[]) throws ClassNotFoundException
    {
        Class.forName("Mobile");
        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 1500;
        
        // Mobile obj2 = new Mobile();
        // obj2.brand = "Samsung";
        // obj2.price = 1700;

        // Mobile.name = "SmartPhone";

        // obj1.show();
        // obj2.show();

        // Mobile.show1(obj1);

    }
}