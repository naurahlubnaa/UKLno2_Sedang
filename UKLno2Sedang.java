import java.util.Scanner;

public class UKLno2Sedang {

    //Fungsi untuk menghitung volume tabung
public static double hitungVolume(double JariJari, double Tinggi) {
    double volume = Math.PI * JariJari * JariJari * Tinggi;
    return volume;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("=== PROGRAM MENGHITUNG VOLUME TABUNG ===");
    System.out.println("Masukkan jari-jari tabung (cm): ");
    double r = input.nextInt();

    System.out.println("Masukkan tinggi tabung (cm): ");
    double t = input.nextInt();

    double hasil = hitungVolume(r, t);

    System.out.println("=== HASIL ===");
    System.out.println("Volume Tabung : " + hasil + "cm³");

    input.close();
}
}

