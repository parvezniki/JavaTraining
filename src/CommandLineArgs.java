public class CommandLineArgs {
    public static void main(String []args) { // --> Commandline arguments / Commandline parameters
        System.out.println("Number of Command line arguments being passed are : "+args.length);

        System.out.println("Commandline Arguments are :");
        for(int i=0;i<args.length;i++) {
            System.out.println(args[i]);
        }
    }
}
