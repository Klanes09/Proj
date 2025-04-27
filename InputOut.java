import java.util.Scanner;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class InputOut {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter File Name >>>> ");
        String fileName = scanner.nextLine();
        
        try {
            Path path = Paths.get(fileName).toAbsolutePath();
            BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
            Path basePath = Paths.get("").toAbsolutePath();
            Path relativePath = basePath.relativize(path);
            
            System.out.println("File exists.");
            System.out.println("File name: " + path.getFileName());
            System.out.println("Absolute Path: " + path.toAbsolutePath());
            System.out.println("File size: " + attr.size() + " bytes");
            System.out.println("Creation time: " + attr.creationTime());
            System.out.println("Relative Path: " + relativePath);
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
            System.out.println("File does not exist.");
        } finally {
            scanner.close();
        }
    }
}


