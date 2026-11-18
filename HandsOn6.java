import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class HandsOn6 {

    public static void main(String[] args) {

        System.out.println("=== HANDS-ON 6 ===");
        System.out.println("Reading Text File");
        System.out.println();

        // Sebelum NIO.2
        System.out.println("A. Sebelum NIO.2");
        System.out.println("Daftar Karyawan:");

        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader("employees.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        System.out.println();

        // Setelah NIO.2
        System.out.println("B. Setelah NIO.2");
        System.out.println("Daftar Karyawan:");

        try {
            Path path = Paths.get("employees.txt");

            List<String> employees = Files.readAllLines(path);

            for (String employee : employees) {
                System.out.println(employee);
            }

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}