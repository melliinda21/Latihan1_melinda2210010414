
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class matematikaberaksi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan angka pertama
        double angka1 = 10;

        // Memasukkan operator
        char operator = '+';

        // Memasukkan angka kedua
        double angka2 = 5;

        double hasil = 0;

        // Melakukan operasi berdasarkan operator yang dipilih
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                break;
            case '-':
                hasil = angka1 - angka2;
                break;
            case '*':
                hasil = angka1 * angka2;
                break;
            case '/':
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Kesalahan: Tidak bisa membagi dengan nol.");
                    return;
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                return;
        }

        // Menampilkan hasil perhitungan
        System.out.println("Hasil: " + hasil);
    }
}
