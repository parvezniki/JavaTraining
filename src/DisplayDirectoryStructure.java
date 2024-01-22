import java.io.File;

public class DisplayDirectoryStructure {
    public static void main(String []args) throws Exception {
        String path = "D:\\PracticePrograms\\FilesPractice\\";
        File file = new File(path);
        printDirectoryStructure(file);
    }

    public static void printDirectoryStructure(File file) throws Exception {
        File filesList[] = file.listFiles();

        for(File file1:filesList) {
            if(file1.isFile())
                System.out.println(file1.getAbsolutePath());
            else
                printDirectoryStructure(file1);
        }
    }
}
