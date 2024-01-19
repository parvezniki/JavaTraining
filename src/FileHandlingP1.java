import java.io.File;

public class FileHandlingP1 {
    public static void main(String args[]) throws Exception {
        File file1 = new File("D:\\PracticePrograms\\file1.txt"); // Absolute Path
        //File file2 = new File("..\\AllTextFiles\\file1.txt"); // Relative Path
       /* System.out.println("Creating an Empty file");
        file1.createNewFile();
*/
//        System.out.println("Deleting the existing file");
//        file1.delete();

        System.out.println("Name: "+file1.getName());
        System.out.println("Path: "+file1.getAbsolutePath());
        System.out.println("Can Write:" + file1.canWrite());
        System.out.println("Can Read:" + file1.canRead());
        System.out.println("Can Execute:" + file1.canExecute());
        System.out.println("Is it a Folder?:" + file1.isDirectory());
        System.out.println("Is it Hidden?:"+file1.isHidden());
        System.out.println("Size of the File:"+ file1.length());
    }
}
