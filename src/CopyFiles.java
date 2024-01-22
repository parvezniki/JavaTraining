import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

// Read the contents of a given file and write to another file [ creating copy of the original ]
public class CopyFiles {
    public static void main(String []args) throws Exception {
        String sourceFile,destinationFile;
        sourceFile = "D:\\PracticePrograms\\Copy Practice\\source.png";
        destinationFile = "D:\\PracticePrograms\\Copy Practice\\destinationFile.png";
        InputStream inputStream = new FileInputStream(sourceFile);
        OutputStream outputStream = new FileOutputStream(destinationFile);
        int readBytes = -1;
        while((readBytes = inputStream.read()) != -1) {
            outputStream.write(readBytes);
        }
        inputStream.close();
        outputStream.close();
    }
}
