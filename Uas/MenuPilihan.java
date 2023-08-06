/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Uas;

import javax.swing.JOptionPane;
/**
 *
 * @author Khariratul Istiqlaliyah
 * 22104410026
 */
public class MenuPilihan {

    public static void main(String[] args) {
        int a=100;
        int b=25;
        int hasil;
        
        System.out.println("menu pilihan");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        
        String input = JOptionPane.showInputDialog("Masukkan Pilihan Anda: " );
        int pilihan = Integer.parseInt(input);
        switch (pilihan) {
            case 1 -> {
                //jika user memilih 1 maka muncul penjumlahan
                hasil = a+b;
                System.out.println("Penjumlahan "+a+" + "+b+" Adalah "+hasil);
            }
             case 2 -> {
                 hasil = a-b;
                 System.out.println("Pengurangan "+a+" - "+b+" Adalah "+hasil);
            }
            default -> System.out.println("Anda Salah Memilih");
                //jika user memasukkan pilihan berupa huruf maka eror karena kita menggunakan JOP menggunakan integer bukan string
        }
    }
}
