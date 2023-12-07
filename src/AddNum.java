public class AddNum {
    public static void main(String []args) {
        double sum;  //  shot     int     long    -> float double
        double param1,param2;
        // Concatenation -> + and concatenate
        if(args.length==2) {
            System.out.println("Length: " + args.length);
            System.out.println("First Param: " + args[0]);
            System.out.println("First Param: " + args[1]);

            param1 = Double.parseDouble(args[0]);
            param2 = Double.parseDouble(args[1]);

            sum = param1 + param2;

            System.out.println("Sum is: "+sum);

        } else
        {
            System.out.println("Invalid number of paratmeters being passed, please pass atleast 1 parameter");
            System.out.println("Syntax to use this command: $ java Add <val1> <val2>");
            System.out.println("Example: $ java Add 10 20");
        }
    }
}
