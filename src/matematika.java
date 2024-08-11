/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class matematika {
     // Method untuk penjumlahan
    public double tambah(double a, double b) {
        return a + b;
    }

    // Method untuk pengurangan
    public double kurang(double a, double b) {
        return a - b;
    }

    // Method untuk perkalian
    public double kali(double a, double b) {
        return a * b;
    }

    // Method untuk pembagian
    public double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("kesalahan pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return a / b;
    }
}
