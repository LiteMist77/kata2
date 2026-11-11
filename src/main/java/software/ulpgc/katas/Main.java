package software.ulpgc.katas;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    static void main() throws IOException {
        File input = new File("input.txt");
        File output = new File("output.txt");

        try(FileInputStream fileInputStream = new FileInputStream(input);
            FileOutputStream fileOutputStream = new FileOutputStream(output)){

            byte[] bytes = fileInputStream.readAllBytes();
            fileOutputStream.write(bytes);
            System.out.println("TODO OK!!!!");
        }
    }
}
