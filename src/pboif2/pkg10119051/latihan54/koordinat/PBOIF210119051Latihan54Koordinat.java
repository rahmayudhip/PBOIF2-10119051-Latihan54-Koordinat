/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan54.koordinat;

/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program Warna Koordinat
 */
public class PBOIF210119051Latihan54Koordinat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat = new WarnaKoordinat(10, 4, "Jingga");
        
        System.out.println("Warna Koordinat : " + warnaKoordinat.getNamaWarna());
        System.out.println("Koordinat Sumbu x : "
                + warnaKoordinat.getX() + ", y : " + warnaKoordinat.getY());
    
    }
    
}
