import java.io.*;

public class CopyFiles4 {
    public static void main(String []args) throws Exception {
        String sourceFile,destinationFile;
        long startTime = System.currentTimeMillis();
        sourceFile = "D:\\PracticePrograms\\Copy Practice\\betterday.mp3";
        destinationFile = "D:\\PracticePrograms\\Copy Practice\\betterdayCopy.mp3";
        InputStream inputStream = new BufferedInputStream(new FileInputStream(sourceFile)); // 8 KB Buffer
        OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(destinationFile));
            final int BUFFER_SIZE = 262144; // 256 KB  -> 1/4 of 1MB
            byte[] buffer = new byte[BUFFER_SIZE];
            int numberOfBytesRead = 0;
            while( (numberOfBytesRead = inputStream.read(buffer)) != -1 ) {
                System.out.println(numberOfBytesRead+",");
                outputStream.write(buffer,0,numberOfBytesRead);
            }
        inputStream.close();
        outputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken is in Seconds: "+(endTime-startTime)/1000);
        System.out.println("Time taken is in MilliSeconds: "+(endTime-startTime));
    }
}
