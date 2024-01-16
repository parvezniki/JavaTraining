import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandlingProg2 {
    public static void main(String []args) throws Exception {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();

        FileWriter fw = new FileWriter("D:\\PracticePrograms\\myFirstJavaTextFile.txt");
//        fw.write("Hey, this is a sample statement which we are trying to write to a flat file");
//        fw.write("\nAnother statemnt ");
        for(i=1;i<=10;i++) {
            fw.write(n + " x " + i + " = " + (n * i) + "\n");
        }
        fw.close();

        FileReader fr =  new FileReader("D:\\PracticePrograms\\myFirstJavaTextFile.txt");
        char ch;
        do {
            n = fr.read();
            System.out.print((char)n);
        } while(n>0);
        fr.close();

    }
}
