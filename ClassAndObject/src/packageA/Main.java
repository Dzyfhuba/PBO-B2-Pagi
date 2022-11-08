package packageA;

import java.util.Scanner;


public class Main extends Gorengan {
    public Main(String atributA) {
        super(atributA);
    }
    
    public static void main(String[] args) {
        Makanan sego = new Makanan("sego");
        Main tahu = new Main("tahu");
        Makanan baso = new Main("baso");
        Minuman teh = new Minuman();
        Main tempe = new Main("tempe");
        
        System.out.println(tempe.atributA);
        
        sego.setAtributA("sego bakar");
        System.out.println(sego.getAtributA());
        
        Scanner scn = new Scanner(System.in);
    }
}
