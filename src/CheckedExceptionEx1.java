import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionEx1 {
    public static void main(String []args) throws Exception {
        try{
            readFromAFile();
        }catch(IOException fnfe) {
            System.out.println("Given file may not be present or some File Opening Error occurred.");
        }

        System.out.println("---------------------------------------------------");
        readFromAFile2();
        System.out.println("---------------------------------------------------");
        readFromAFile3();

    }

    public static void readFromAFile() throws IOException {
            FileReader fr = new FileReader("D:\\PracticePrograms\\sampletextdoc1.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        fr.close();
    }

    public static void readFromAFile2()  {
        try{
            FileReader fr = new FileReader("D:\\PracticePrograms\\sampletextdoc1.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
            fr.close();
        }catch(IOException fnfe) {
            System.out.println("Given file may not be present or some File Opening Error occurred.");
        }
    }


    public static void readFromAFile3()  {
        FileReader fr = null;


        try {
            fr = new FileReader("D:\\PracticePrograms\\sampletextdoc1.txt");
        }catch(Exception fnfe) {
            System.out.println("Something went wrong during the opening of file.");
            return;
        }

            int i;
        try {
                    while ((i = fr.read()) != -1) {
                        System.out.print((char) i);
                    }
        }catch(Exception fnfe) {
                System.out.println("Something went wrong while reading the contents of the file.");
        }
        System.out.println();
        try {
            fr.close();
        }catch(Exception fnfe) {
            System.out.println("Unable to close the file.");
        }

        System.out.println("End of Method");
    }
}
