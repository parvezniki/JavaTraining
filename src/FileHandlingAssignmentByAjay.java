import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingAssignmentByAjay {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path of the Directory of which you want to write all its file names: ");
        String Dir = sc.nextLine();
        File file = new File(mainPath);
        file.createNewFile();
        System.out.println("File created");
        File file2 = new File(Dir);
        File[] arr = file2.listFiles();
        System.out.println(arr.length);
        printFileNames(mainPath, arr);
        System.out.println("File names in DIR written to result.txt");

    }
    public static String mainPath = "E:\\Result\\result.txt";

    public static void printFileNames(String path, File[] arr) throws IOException {

        FileWriter fw = new FileWriter(path, true);

        for(int i=0; i<arr.length;i++){
            if(!arr[i].isDirectory() && arr[i].isFile()){

                fw.write(arr[i].getName() + "\r\n");

                //System.out.println(arr[i].getName() + "\r\n");
            }else{
                fw.write(arr[i].getName() + "\r\n");
                File f = new File(arr[i].toString());
                File[] arr1 = f.listFiles();
                printFileNames(mainPath, arr1);
            }

        }
        fw.close();

    }

}