import java.util.Scanner;

public class AreaOfATriangle {
    public static void main(String []args) {
        Scanner sc1 = new Scanner(System.in);
        int length, breadth;
        //float area;
        double area;
        System.out.print("Enter Length: ");
        length = sc1.nextInt();
        System.out.print("Enter Breadth: ");
        breadth = sc1.nextInt();

        area = (0.5) * length * breadth;

        System.out.println("Area of Triangle with the Length: "+length+" and Breadth: "+breadth+" is : "+area);

    }
}

