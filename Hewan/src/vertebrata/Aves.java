/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vertebrata;

/**
 *
 * @author ubaid
 */
public class Aves extends Vertebrata{

    public Aves(
        String nama, 
        String makanan, 
        String habitat, 
        String reproduksi
    ) {
        super(nama, makanan, habitat, reproduksi);
    }
    
    @Override
    public void ukuran() {
        System.out.println(this.nama + " berukuran kecil");
    }
}
