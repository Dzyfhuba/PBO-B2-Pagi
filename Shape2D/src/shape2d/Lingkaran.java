/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shape2d;

/**
 *
 * @author ubaid
 */
public class Lingkaran extends Shape2D {
    double luas (double r) {
        return Math.PI * r * r;
    }
    
    @Override
    double keliling (double r) {
        return 2 * Math.PI * r;
    }
    
//    double keliling (int r) {
//        return 2 * Math.PI * r;
//    }
}
