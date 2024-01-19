import java.io.File;

public class FileHandlingP2 {
    public static void main(String args[]) throws Exception {
        File file1 = new File("D:\\Java Trainings\\Project1\\src");

        /*if(file1.isDirectory()) {
            String filesListArr1[] = file1.list();
            for(String fileName:filesListArr1) {
                System.out.println(fileName);
            }

        } else {
            System.out.println("This is a file and not a Directory/Folder to list out files of it");
        }*/
         File allfiles[] = file1.listFiles();
         for(File currentFile:allfiles) {
             if(currentFile.isDirectory())
                System.out.println("[" + currentFile.getName() +"]");
             else
                System.out.println(currentFile.getName());
         }
    }
}
