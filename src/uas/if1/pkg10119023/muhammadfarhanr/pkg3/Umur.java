/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if1.pkg10119023.muhammadfarhanr.pkg3;

/**
 *
 * @author Muhammad Farhan R<farhan.10119023@mahasiswa.unikom.ac.id>
 */
public class Umur {
    private int umur;
    public boolean dewasa = false;

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }
    
    public boolean isDewasa() {
        if(umur>=17){
            dewasa = true;
        }else{
            dewasa = false;
        }
        return dewasa;
    }

    
    
}
