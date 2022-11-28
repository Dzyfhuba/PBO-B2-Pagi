package abstractPackage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ubaid
 */
public abstract class Hewan {
    public String nama = "Buaya";
    public String makanan = "Karnivora";
    public String habitat = "Darat";
    public String reproduksi = "Ovovivipar";
    
    public abstract void ukuran();
    public void detailHewan() {
        System.out.println(""
                + "Hewan: " + nama + "\n"
                + "Makanan: " + makanan + "\n"
                + "Habitat: " + habitat + "\n"
                + "Reproduksi: " + reproduksi
        );
    }
}
