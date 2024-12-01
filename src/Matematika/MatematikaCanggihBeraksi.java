/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Matematika;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        // Membuat objek Scanner
        Scanner input = new Scanner(System.in);

        // Membuat objek dari MatematikaCanggih
        MatematikaCanggih matematika = new MatematikaCanggih();

        // Meminta input
        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();

        // Melakukan operasi
        int hasilPenjumlahan = matematika.hitungPenjumlahan(angka1, angka2);
        int hasilPerkalian = matematika.hitungPerkalian(angka1, angka2);
        int hasilModulus = matematika.hitungModulus(angka1, angka2);

        // 30Menampilkan hasil
        System.out.println("Hasil penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil perkalian: " + hasilPerkalian);
        System.out.println("Hasil modulus: " + hasilModulus);

        input.close();
    }
}
