import java.io.*;

public class CopyFiles2 {
    public static void main(String []args) throws Exception {
        String sourceFile,destinationFile;
        sourceFile = "D:\\PracticePrograms\\Copy Practice\\betterday.mp3";
        destinationFile = "D:\\PracticePrograms\\Copy Practice\\betterdayCopy.mp3";
        long startTime = System.currentTimeMillis();
        InputStream inputStream = new FileInputStream(sourceFile);
        OutputStream outputStream = new FileOutputStream(destinationFile);
        // Indentify the size of the source file
        File fileX = new File(sourceFile);
        System.out.println("Size of the source file in Bytes: " +fileX.length());
        // create a buffe / byte array of the size equals to the size of source file
        byte[] buffer = new byte[(int)fileX.length()];
        // Read all bytes from the source file
        inputStream.read(buffer);
        // Write all bytes (present in buffer byte array) to the destination file
        outputStream.write(buffer,0,buffer.length);
        inputStream.close();
        outputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken is in Seconds: "+(endTime-startTime)/1000);
        System.out.println("Time taken is in MilliSeconds: "+(endTime-startTime));
    }
}
