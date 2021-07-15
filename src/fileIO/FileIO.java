package fileIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIO {

    public static void main(String[] args) {
//        System.out.println(getFilePath("Does the path exist?"));
//        System.out.println(doesPathExist(getFilePath("src", "fileIO", "test.txt")));
        Path path = getFilePath("src", "fileIO", "files");
        tryCreateDirectory(path);
        path = Paths.get(path.toString(), "test.txt");
        System.out.println(path.toAbsolutePath());

    }
    public static void tryCreateFile(Path path){
        if (!doesPathExist(path)){
            try {
                Files.createFile(path);
            }catch(IOException e){
                System.out.println("Could not create file");
            }
        }else{
            System.out.println("The file already exists");
        }
    }

    public static Path getFilePath(String filename){
        return Paths.get(filename);
    }
    public static Path getFilePath(String parentDirectory, String filename){
        return Paths.get(parentDirectory, filename);
    }
    public static Path getFilePath(String parentDirectory, String childDirectory, String filename){
        return Paths.get(parentDirectory, childDirectory, filename);
    }
    public static boolean doesPathExist(Path path){
        return Files.exists(path);
    }
    public static void tryCreateDirectory(Path pathToCreate){
        if (!doesPathExist(pathToCreate)){
            try {
                Files.createDirectory(pathToCreate);
            }catch (IOException e){
                System.out.println("Could not create the directory");
                System.out.println(pathToCreate.toAbsolutePath());
            }
        }else{
            System.out.println("The path at " + pathToCreate.toAbsolutePath() + " already exists.");
        }
    }
}
