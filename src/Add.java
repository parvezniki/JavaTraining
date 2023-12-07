public class Add {
    public static void main(String []args) {
        // Concatenation -> + and concatenate
        if(args.length==2) {
            System.out.println("Length: " + args.length);
            System.out.println("First Param: " + args[0]);
            System.out.println("First Param: " + args[1]);
            System.out.println("Concatenated value :"+args[0]+" "+args[1]);
        } else
        {
            System.out.println("Invalid number of paratmeters being passed, please pass atleast 1 parameter");
            System.out.println("Syntax to use this command: $ java Add <val1> <val2>");
            System.out.println("Example: $ java Add apple orange");
        }
    }
}
