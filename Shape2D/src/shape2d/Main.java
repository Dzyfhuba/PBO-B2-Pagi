/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape2d;

/**
 *
 * @author ubaid
 */
public class Main {
    public static void main(String[] args) {
        Shape2D segitiga = new Shape2D();
        System.out.println("luas segitiga: " + segitiga.luas(5, 4));
        System.out.println("keliling segitiga: " + segitiga.keliling(5));
        
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("luas lingkaran: " + lingkaran.luas(7));
        System.out.println("keliling lingkaran: " + lingkaran.keliling(7));
    }
}

/*

Tugas 1: melanjutkan project
Persegi panjang
Persegi
Jajargenjang
Trapesium siku-siku
Layang-layang

*/
