package tugas2;

import java.util.Scanner;

public class Tugas2algo {
    public static void main(String[] args) {

        // membuat scanner baru
        Scanner input = new Scanner(System.in);

        System.out.println("====== PROGRAM MENGHITUNG GAJI KARYAWAN =======");

        // Input Data Karyawan
        System.out.print("Masukkan golongan (A/B/C): ");
        char golongan = input.next().toUpperCase().charAt(0);

        System.out.print("Masukkan jamLembur: ");
        int jamLembur = input.nextInt();

        // Variabel gajiPokok, gajiLembur, persenLembur, dan totalGaji
        // Sebagai inisialisasi dengan nilai awal = 0
        double gajiPokok = 0;
        double gajiLembur = 0;
        double persenLembur = 0;
        double totalGaji = 0;

        // Menghitung Gaji Pokok berdasarkan golongan
        if (golongan == 'A') {
            gajiPokok = 5000000;
        } else if (golongan == 'B') {
            gajiPokok = 6500000;
        } else if (golongan == 'C') {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid! Masukkan golongan A, B, atau C.");
            return;
        }

        // Menghitung Persen Lembur berdasarkan jam lembur
        if (jamLembur == 0) {
            persenLembur = 0;
        } else if (jamLembur == 1) {
            persenLembur = 0.30;
        } else if (jamLembur == 2) {
            persenLembur = 0.32;
        } else if (jamLembur == 3) {
            persenLembur = 0.34;
        } else if (jamLembur == 4) {
            persenLembur = 0.36;
        } else if (jamLembur >= 5) {
            persenLembur = 0.38;
        }

        // Menghitung Gaji Lembur & Total Gaji
        gajiLembur = gajiPokok * persenLembur;
        totalGaji = gajiPokok + gajiLembur;

        // Menggabungkan angka jam lembur dengan kata "Jam" secara otomatis
        String jamString = jamLembur + " Jam";

        // Output Hasil Gaji Karyawan
        System.out.println("============== SLIP GAJI KARYAWAN =============");
        System.out.printf(" Golongan      : %-22s %n", golongan);
        System.out.printf(" Jam Lembur    : %-22s %n", jamString);
        System.out.printf(" Gaji Pokok    : Rp%,.2f %n", gajiPokok);
        System.out.printf(" Gaji Lembur   : Rp%,.2f %n", gajiLembur);
        System.out.println("+---------------------------------------------+");
        System.out.printf(" Total Gaji    : Rp%,.2f %n", totalGaji);
        System.out.println("===============================================");

    }
}