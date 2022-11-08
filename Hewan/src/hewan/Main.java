/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan;
import vertebrata.Aves;
import vertebrata.Vertebrata;

/**
 *
 * @author ubaid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vertebrata buaya = new Vertebrata();
        buaya.bersisik();
        buaya.ukuran();
        buaya.detailHewan();
        
        System.out.println("=========================");
        
        Vertebrata merpati2 = new Aves("merpati", "herbivora", 
                "darat dan udara", "bertelur");
        merpati2.ukuran();
        merpati2.detailHewan();
        
//        Aves merpati3 = new Vertebrata("merpati", "herbivora", 
//                "darat dan udara", "bertelur");
        
        System.out.println("=========================");
        
        Aves merpati = new Aves("merpati", "herbivora", 
                "darat dan udara", "bertelur");
        merpati.ukuran();
        merpati.detailHewan();
    }
    
}
