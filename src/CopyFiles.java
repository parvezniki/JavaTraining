import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

// Read the contents of a given file and write to another file [ creating copy of the original ]
public class CopyFiles {
    public static void main(String []args) throws Exception {
        String sourceFile,destinationFile;
        long startTime = System.currentTimeMillis();
        sourceFile = "D:\\PracticePrograms\\Copy Practice\\betterday.mp3";
        destinationFile = "D:\\PracticePrograms\\Copy Practice\\betterdayCopy.mp3";
        InputStream inputStream = new FileInputStream(sourceFile);
        OutputStream outputStream = new FileOutputStream(destinationFile);
        int readBytes = -1;
        while((readBytes = inputStream.read()) != -1) {
            outputStream.write(readBytes);
        }
        inputStream.close();
        outputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken is in Seconds: "+(endTime-startTime)/1000);
        System.out.println("Time taken is in MilliSeconds: "+(endTime-startTime));
    }
}
