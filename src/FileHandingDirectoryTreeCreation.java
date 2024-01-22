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
        File toBeCreated = null;
        for(String fileName:allFilesListed) {
            String path = absolutePathToTheDirectoryStructure + fileName;
            //System.out.println("Creating File/Folder: "+path);
            toBeCreated = new File(path);
            if(fileName.endsWith(".txt")) {
                // Create an Empty Text File
                System.out.println("File Created : "+path);
                toBeCreated.createNewFile();

            } else {
                // Create a Folder / Directory
                System.out.println("Folder Created : "+path);
                if(fileName.contains("\\"))
                    toBeCreated.mkdirs();
                else
                    toBeCreated.mkdir();

            }
        }

        System.out.println("Done.");

    }

  /*  public static void crateDirectory(String path) throws Exception {
        File file = new File(path);
        if(path.indexOf("\\")!=-1)
            file.mkdirs();
        else
            file.mkdir();
    }*/
    public static void crateFile(String path) throws  Exception {
        File file = new File(path);
        file.createNewFile();
    }
}
