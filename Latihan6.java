package com.belajar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Latihan6 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        String nama;
        int umur;
        //Membuat objek imputstream
        InputStreamReader isr = new InputStreamReader(System.in);
        //Membuat objek buffereader
        BufferedReader br = new BufferedReader(isr);
        //Mengisi variabel nama dengan BufferedReader 
        System.out.print("Inputkan nama Anda : ");
        nama = br.readLine();
        System.out.println("Input umur anda : ");
        umur = Integer.parseInt(br.readLine());
        //Tampilkan output isi variabel nama 
        System.out.println("Nama Anda adalah " + nama);
        System.out.println("umur " + umur);



    }
    
}
