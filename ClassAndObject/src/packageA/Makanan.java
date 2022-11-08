package packageA;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author ubaid
 */
public class Makanan {
    public String atributA;
    
    public Makanan(int bilangan) {
        this.atributA = String.valueOf(bilangan);
    }

    public Makanan(String atributA) {
        this.atributA = atributA;
    }
    
    public Makanan() {
        this.atributA = "tidak ada makanan";
    }
    
    private void jajan() {
        System.out.println("ini B");
    }
    
    private void jajan(String b) {
        System.out.println("ini " + b);
    }
    
    private void jajan(String b, int a) {
        System.out.println("ini " + b + a);
    }

    public String getAtributA() {
        return atributA;
    }

    public void setAtributA(String atributA) {
        this.atributA = atributA;
    }
    
    
}
