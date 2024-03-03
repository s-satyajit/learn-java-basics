class Computer
{
    public void PlayMusic()
    {
        System.out.println("Music Playing...");
    }

    public String getMeAPen(int cost)
    {
        if(cost >= 10)
            return "Pen";
        
        return "Nothing";
    }
}


public class Method
{
    public static void main(String a[])
    {
        Computer obj = new Computer();
        obj.PlayMusic();
        String str = obj.getMeAPen(2);
        System.out.println(str);



    }
}