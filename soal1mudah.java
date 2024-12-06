import java.util.Scanner;  

public class soal1mudah {  
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { 
            System.out.print("Berat (kg): ");
            double berat = input.nextDouble();

            System.out.print("Jarak (km): ");
            double jarak = input.nextDouble();

            System.out.print("Panjang, lebar, tinggi (cm, pisahkan dengan spasi): ");
            double volume = input.nextDouble() * input.nextDouble() * input.nextDouble();

            double biayaTotal = berat * (jarak <= 10 ? 4250 : 6000) + (volume > 100 ? 50000 : 0);
            System.out.printf("Total Biaya: Rp %.2f%n", biayaTotal);
        }
    }
}