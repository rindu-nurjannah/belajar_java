package com.belajar;
import javax.swing.JOptionPane;
public class Latuhan5 {
    public static void main(String[] args) {
        String nama = "";
        nama = JOptionPane.showInputDialog("silakan masukkan nama anda");
        String msg = "Hello " + nama + "!";
        JOptionPane.showMessageDialog(null, msg);

    }
}
       