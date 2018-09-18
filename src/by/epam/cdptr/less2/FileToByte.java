package by.epam.cdptr.less2;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;

public class FileToByte {
    public static void main(String[] args) throws IOException {
        Path file;
        file = Paths.get("src", "data123.txt");

        byte[] fileArray;
        fileArray = Files.readAllBytes(file);

        String fileString = new String(fileArray, "ISO-8859-1");
        System.out.println(fileString);

    }
}
