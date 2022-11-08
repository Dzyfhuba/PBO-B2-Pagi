/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packageA;

import packageB.Buah;

/**
 *
 * @author ubaid
 */
class Makanan {
    String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    Makanan(String nama){
        this.nama = nama;
    }
    
    void output(){
        System.out.println("Nama Makanan = " + nama);
    }
}

public class Main {
    int bilanganA;

    public void setBilanganA(int bilanganA) {
        this.bilanganA = bilanganA;
    }

    public int getBilanganA() {
        return bilanganA;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main mainObject = new Main();
        
        Makanan makananObjectA = new Makanan("Tahu");
        Makanan makananObjectB = new Makanan("Bakso");
        
        makananObjectA.output();
        makananObjectB.output();
        
        System.out.println("\n===================="
                + "================\n");
        
        Buah buahObject = new Buah();
        buahObject.aturNama("mangga");
        buahObject.setJenisBiji("Dikotil");
        
        System.out.println(buahObject.getJenisBiji());
        String buahJenisBiji = buahObject.getJenisBiji();
        System.out.println(buahJenisBiji);
        
        System.out.println(buahObject.ambilNama());
    }
    
}
