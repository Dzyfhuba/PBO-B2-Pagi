package main;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main extends JFrame{
    JTextField player1, player2;
    JLabel player1_label, player2_label, 
            winner_label, winner, warning1, warning2;
    JButton start;

    public Main() {
        player1 = new JTextField();
        player1.setBounds(20, 60, 200, 40);
        
        player1_label = new JLabel("Player 1");
        player1_label.setBounds(20, 30, 200, 40);
        
        warning1 = new JLabel("Input salah");
        warning1.setBounds(20, 90, 200, 40);
        warning1.setVisible(false);
        
        player2 = new JTextField();
        player2.setBounds(20, 180, 200, 40);
        
        player2_label = new JLabel("Player 2");
        player2_label.setBounds(20, 150, 200, 40);
        
        warning2 = new JLabel("Input salah");
        warning2.setBounds(20, 210, 200, 40);
        warning2.setVisible(false);
        
        winner_label = new JLabel("Winner");
        winner_label.setBounds(500, 30, 200, 40);
        
        start = new JButton("Start");
        start.setText("Mulai");
        start.setBounds(300, 125, 100, 40);
        
        start.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                String player1_value = player1.getText().toLowerCase();
                System.out.println("player1_value: " + player1_value);
                if (!("batu".equals(player1_value) ||
                        "gunting".equals(player1_value) ||
                        "kertas".equals(player1_value))){
                    warning1.setVisible(true);
                } else {
                    warning1.setVisible(false);
                }
                
                String player2_value = player2.getText().toLowerCase();
                System.out.println("player2_value: " + player2_value);
                if (!("batu".equals(player2_value) ||
                        "gunting".equals(player2_value) ||
                        "kertas".equals(player2_value))){
                    warning2.setVisible(true);
                } else {
                    warning2.setVisible(false);
                }
                
                String menang = Main.tanding(player1_value, player2_value);
                System.out.println(menang);
            }
        });
    }
    
    static String tanding(String player1_value, String player2_value){
        // tugas 2: implementasi logika batu kertas gunting 
        // terakhir hari ini.
        
        return "siapa yang menang?";
    }
    
    public static void main(String[] args) {
        Main frame = new Main();
        frame.setTitle("Batu Gunting Kertas");
        frame.setBounds(100, 100, 700, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(true);
        
        frame.add(frame.player1);
        frame.add(frame.player1_label);
        frame.add(frame.warning1);
        frame.add(frame.warning2);
        frame.add(frame.player2);
        frame.add(frame.player2_label);
        frame.add(frame.winner_label);
        frame.add(frame.start);
    }
}
