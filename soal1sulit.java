import java.util.Scanner;

public class soal1sulit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        double totalNilai = 0;

        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Nilai siswa ke-" + i + ": ");
            totalNilai += input.nextDouble();
        }

        System.out.println("Rata-rata nilai: " + (totalNilai / jumlahSiswa));
    }
}
