/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packageB;

/**
 *
 * @author ubaid
 */
public class Buah {
    String jenis_biji;
    String nama;

    public String ambilNama() {
        return nama;
    }

    public void aturNama(String nama) {
        this.nama = nama;
    }
    
    public void setJenisBiji(String jenis_biji){
        this.jenis_biji = jenis_biji;
    }
    
    public String getJenisBiji(){
        return jenis_biji;
    }
}
