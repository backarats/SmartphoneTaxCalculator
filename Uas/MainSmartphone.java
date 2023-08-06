/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Uas;

/**
 *
 * @author Khariratul Istiqlaliyah
 * 22104410026
 */
public class MainSmartphone implements InterfacePajak{ 
    private String vendor;
    private String tipe;
    private double harga;

    public MainSmartphone(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
        
      
    }
/// ini method abstrac dari impelemtasi pajak 
    @Override
    public double hitungHargaPPN(double harga) {
        double hargaPPN;
        if (harga > 4500000) {
            hargaPPN = harga + (harga * PAJAK_3);
        } else if (harga > 4200000) {
            hargaPPN = harga + (harga * PAJAK_2);
        } else if (harga > 4000000) {
            hargaPPN = harga + (harga * PAJAK_1);
        } else {
            hargaPPN = harga;
        }
        return hargaPPN;
    }
    public String getVendor() {
        return vendor;
    }

    public String getTipe() {
        return tipe;
    }

    public double getHarga() {
        return harga;
    }

    public void printHargaPPN() {
        System.out.println("Vendor : " + getVendor());
        System.out.println("Tipe : " + getTipe());
        System.out.println("Harga Asli :  " + getHarga());
        System.out.println("Harga Setelah PPN : Rp" + hitungHargaPPN(getHarga()));
        System.out.println(""); 
    }



    public static void main(String[] args) {
        MainSmartphone samsung = new MainSmartphone("Samsung", "A 51", 5000000);
        samsung.printHargaPPN();

        MainSmartphone oppo = new MainSmartphone("Oppo", "Reno 5", 4400000);
        oppo.printHargaPPN();

        MainSmartphone xiaomi = new MainSmartphone("Xiaomi", "A1", 4100000);
        xiaomi.printHargaPPN();
    }

     
        
    }