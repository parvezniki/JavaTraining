import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileHandingDirectoryTreeCreation {
//    public static void main(String []args) throws Exception {
//        String path = "D:\\PracticePrograms\\FilesPractice\\SampleFileTOCreate.txt";
//        File file = new File(path);
//        if(file.createNewFile())
//        {
//            System.out.println("Successfully crated a File at : "+path);
//        }
//    }

    public static void main(String []args) throws Exception {
        String absolutePathToTheDirectoryStructure = "D:\\PracticePrograms\\FilesPractice\\";
        int n;
        String allFiles="";
        FileReader fr = new FileReader("D:\\PracticePrograms\\filesfolderstobecrated.txt");
        char ch;
        do {
            n = fr.read();
            allFiles = allFiles + (char)n;
            //System.out.print((char)n);
        } while(n>0);
        fr.close();

//        System.out.println(allFiles);

        String []allFilesListed = allFiles.split("\n");
        for(String fileName:allFilesListed) {
            String path = absolutePathToTheDirectoryStructure + fileName;
            //System.out.println("Creating File/Folder: "+path);
            if(fileName.endsWith(".txt")) {
                // Create an Empty Text File
                System.out.println("File Created : "+path);
                crateFile(path);

            } else {
                // Create a Folder / Directory
                System.out.println("Folder Created : "+path);
                crateDirectory(path);
            }
        }

        System.out.println("Done.");

    }

    public static void crateDirectory(String path) throws Exception {
        File file = new File(path);
        file.mkdir();

    }
    public static void crateFile(String path) throws  Exception {
        File file = new File(path);
        file.createNewFile();
    }
}
