import java.io.*;
import java.nio.file.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== HANDS-ON 6 ===");
        System.out.println("Reading Text File");
        System.out.println();

        // A. Sebelum NIO.2
        System.out.println("A. Sebelum NIO.2");
        System.out.println("Daftar Karyawan:");

        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader("employees.txt"));

            String employee;

            while ((employee = reader.readLine()) != null) {
                System.out.println(employee);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        System.out.println();

        // B. Setelah NIO.2
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