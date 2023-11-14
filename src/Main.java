// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String []args)
    {
        float answer;
        answer = QuadraticF1(10,20,30);
        System.out.println(answer);

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