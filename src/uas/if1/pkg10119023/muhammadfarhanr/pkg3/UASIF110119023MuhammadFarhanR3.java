/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uas.if1.pkg10119023.muhammadfarhanr.pkg3;

import java.util.Scanner;

/**
 *
 * @author
 * Nama : Muhammad Farhan R<farhan.10119023@mahasiswa.unikom.ac.id>
 * NIM  : 10119023
 * Kelas: IF1
 * NoSoal: 3
 * 
 */
public class UASIF110119023MuhammadFarhanR3 {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Masukkan Umur Anda :");
        Umur umur = new Umur();
        umur.setUmur(scan.nextInt());
        
        String dewasa = Boolean.toString(umur.isDewasa());
        System.out.println("Status Dewasa : ".concat(dewasa));
    }

}
