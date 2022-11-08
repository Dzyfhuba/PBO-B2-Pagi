/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vertebrata;

/**
 *
 * @author ubaid
 */
public class Vertebrata {
    // Reptil Buaya
    String nama = "Buaya";
    String makanan = "Karnivora";
    String habitat = "Darat";
    String reproduksi = "Ovovivipar";

    public Vertebrata() {
    }
    
    public Vertebrata(
            String nama, 
            String makanan, 
            String habitat, 
            String reproduksi
    ) {
        this.nama = nama;
        this.makanan = makanan;
        this.habitat = habitat;
        this.reproduksi  = reproduksi;
    }
    
    public void bersisik() {
        System.out.println(nama + " bersisik keras");
    }
    
    public void ukuran() {
        System.out.println(nama + " berukuran besar");
    }
    
    public void detailHewan() {
        System.out.println(""
                + "Hewan: " + nama + "\n"
                + "Makanan: " + makanan + "\n"
                + "Habitat: " + habitat + "\n"
                + "Reproduksi: " + reproduksi
        );
    }
}
