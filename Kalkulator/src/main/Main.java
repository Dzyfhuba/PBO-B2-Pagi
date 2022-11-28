/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ubaid
 */
public class Main extends JFrame {
    static JTextField bil_a;
    static JTextField bil_b;
    static JButton tambah;
    static JLabel hasil;

    public Main(){
        super();
        
        bil_a = new JTextField();
        bil_a.setBounds(5, 5, 492, 50);
        bil_b = new JTextField();
        bil_b.setBounds(502, 5, 492, 50);
        tambah = new JButton("+");
        tambah.setBounds(5, 60, 50, 50);
        hasil = new JLabel("0");
        hasil.setBounds(300, 200, 400, 50);
        hasil.setFont(hasil.getFont().deriveFont(64f));
    }
    
    void controller() {
        tambah.addActionListener((ActionEvent ae) -> {
            System.out.println(""
                    + "hasil: "
                    + (Integer.parseInt(bil_b.getText()) +
                            Integer.parseInt(bil_a.getText())));
            hasil.setText("" + (Integer.parseInt(bil_b.getText()) +
                    Integer.parseInt(bil_a.getText())));
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Main frame = new Main();
        frame.setBounds(10, 10, 1000, 500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setTitle("Kalkulator Sederhana");
        frame.setLayout(null);
        frame.setResizable(false);
        
        frame.controller();
        
        frame.add(bil_a);
        frame.add(bil_b);
        frame.add(tambah);
        frame.add(hasil);
    }
    
}























