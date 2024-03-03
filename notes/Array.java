public class Array
{
    public static void main(String a[])
    {
        // int nums[] = {4,2,1,5};
        // for(int i=0; i<4; i++)
        // {
        //     System.out.println(nums[i]);
        // }

        int nums[] = new int[4];
        nums[0] = 5;
        nums[1] = 4;
        nums[2] = 6;
        nums[3] = 9;

        // for(int i = 0;i<4;i++)
        // {
        //     System.out.println(nums[i]);
        // }

       for(int n:nums)
       {
        System.out.println(n);
       }


    }
}