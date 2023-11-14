public class SecondProgram
{
    public static void main(String []args)
    {
        int answer;
        answer = additionMethod(10,20);
        System.out.println(answer);
        answer = additionMethod(10,20,30);
        System.out.println(answer);
    }

    static int additionMethod(int x,int y) // Signature of the Method
    {
        int sum;
        sum = x + y;
        return sum;
    }

    static int additionMethod(int x,int y,int z) // Signature of the Method
    {
        int sum;
        sum = x + y + z;
        return sum;
    }
}
