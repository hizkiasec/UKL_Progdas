import java.util.Scanner;

public class soal2sedang {
    // menghitung volume tabung
    public static double hitungVolume(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // input data
        System.out.print("Masukkan jari-jari alas tabung (cm): ");
        double jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = input.nextDouble();

        // Hitung volume
        double volume = hitungVolume(jariJari, tinggi);

        // Output hasil
        System.out.println("Volume tabung: " + volume + " cm³");
    }
}