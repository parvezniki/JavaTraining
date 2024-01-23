import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles3 {
    public static void main(String []args) throws Exception {
        String sourceFile, destinationFile;
        sourceFile = "D:\\PracticePrograms\\Copy Practice\\betterday.mp3";
        destinationFile = "D:\\PracticePrograms\\Copy Practice\\betterdayCopy.mp3";
        long startTime = System.currentTimeMillis();
        InputStream inputStream = new FileInputStream(sourceFile);
        OutputStream outputStream = new FileOutputStream(destinationFile);

        final int BUFFER_SIZE = 262144; // 256 KB  -> 1/4 of 1MB
        byte[] buffer = new byte[BUFFER_SIZE];
        int numberOfBytesRead = 0;
        while( (numberOfBytesRead = inputStream.read(buffer)) != -1 ) {
            System.out.println(numberOfBytesRead+",");
            outputStream.write(buffer,0,numberOfBytesRead);
        }
        // 2.10 MB ->  1 2 3 4 5 6 7 8 (.10MB)

        inputStream.close();
        outputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken is in Seconds: "+(endTime-startTime)/1000);
        System.out.println("Time taken is in MilliSeconds: "+(endTime-startTime));
    }
}
