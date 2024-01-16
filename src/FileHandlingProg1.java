import java.io.DataInput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileHandlingProg1 {
    public static void main(String []args) throws Exception {
        // Opening FileOutputStream
        FileOutputStream fis = new FileOutputStream("D:\\PracticePrograms\\myFirstJavaTextFile.txt");
        // Opening DataOutputStream
        DataOutputStream dos = new DataOutputStream(fis);
        dos.writeChars("Hey, this is a sample statement which we are trying to write to a flat file");
        // Writing a String to the File
        dos.writeInt(66);
        // Closing DataOutputStream
        dos.close();
        // Closing FileOutputStream
        fis.close();
    }
}
