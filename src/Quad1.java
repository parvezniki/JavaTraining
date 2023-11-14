import java.util.Scanner;

public class Quad1
{
    public static void main(String []args)
    {
        int a,b,c;
        float answer;
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Please input 3 integer values: ");
        a = sc1.nextInt();
        b = sc1.nextInt();
        c = sc1.nextInt();

        answer = QuadraticF1(a,b,c);

        System.out.println("Result of Quad equation is :"+answer); //String
        //System.out.println(answer);
    }

    // Quadratic Formula -> b^2 - 4ac -> (b*b) - (4*a*c)
    // <returnType> <FunctionName>(<datatype param1>,<datatype param2>,<datatype param3>,....)
    static float QuadraticF1(int a,int b,int c) // Method Signature
    {
        float result;
        result = (b*b) - (4*a*c);
        return result;
    }
}