interface A {
    int add(int i, int j);
}

public class LambdaExpReturn {
    public static void main(String a[]) {
        A obj = (i,j) -> i+j;
        int result = obj.add(5,6);
        System.out.println(result);
    }
}