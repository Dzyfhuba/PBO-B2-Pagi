
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ubaid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereScanner
        System.out.println("Pengkondisian");
        System.out.println(""
                + "1. Bilangan Terbesar dan Terkecil\n"
                + "Rata-rata bilangan\n"
                + "2. Menghitung Luas Lingkaran");
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Pilih 2 opsi di atas: ");
        
        int opsi = scn.nextInt();
        
        switch (opsi) {
            case 1:
                System.out.println("Bilangan Terbesar dan Terkecil");
                System.out.print("Masukkan bilangan 1: ");
                double smallest, biggest;
                double bil_a = scn.nextDouble();
                smallest = bil_a;
                biggest = bil_a;
                System.out.print("Masukkan bilangan 2: ");
                double bil_b = scn.nextDouble();
                if (bil_b > biggest)
                    biggest = bil_b;
                if (bil_b < smallest)
                    smallest = bil_b;
                System.out.print("Masukkan bilangan 3: ");
                double bil_c = scn.nextDouble();
                if (bil_c > biggest)
                    biggest = bil_c;
                if (bil_c < smallest)
                    smallest = bil_c;
                
                System.out.println("Bilangan Terkecil : " + smallest);
                System.out.println("Bilangan Terbesar : " + biggest);
                
                System.out.println("Rata-rata : " + (bil_a + bil_b + bil_c) / 3);
                
                break;
            case 2:
                System.out.println("Menghitung Luas Lingkaran");
                System.out.print("Masukkan nilai r: ");
                double r = scn.nextDouble();
                System.out.println("Hasil: " + (Math.PI * Math.pow(r, 2)));
            default:
                System.out.println("Out of options");
        }
    }
    
}
