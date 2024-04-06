package tugas;

/**
 *
 * @author Hendrawan
 */
import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai alas: ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan nilai tinggi: ");
        double tinggi = scanner.nextDouble();

        // Menghitung luas segitiga
        double luas = (alas * tinggi) / 2;

        System.out.println("Luas segitiga adalah: " + luas);

        // Menutup scanner
        scanner.close();
    }
}

