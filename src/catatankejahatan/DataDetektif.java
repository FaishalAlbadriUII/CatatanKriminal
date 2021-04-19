/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catatankejahatan;

/**
 * @author Ahmad Faishal Albadri
 * @nim 20523166
 */
public class DataDetektif {
    
    private String namaDetektif, statusDetektif;
    private int umurDetektif;
    private static int umurMaxPensiun = 65;

    public DataDetektif() {
        
    }

    public DataDetektif(String namaDetektif, String statusDetektif, int umurDetektif) {
        this.namaDetektif = namaDetektif;
        this.statusDetektif = statusDetektif;
        this.umurDetektif = umurDetektif;
    }

    public int getUmurMaxPensiun() {
        return umurMaxPensiun;
    }
    
    public void setUmurMaxPensiun(int umur) {
        this.umurMaxPensiun = umur;
    }
    
    public String getNamaDetektif() {
        return namaDetektif;
    }

    public void setNamaDetektif(String namaDetektif) {
        this.namaDetektif = namaDetektif;
    }

    public String getStatusDetektif() {
        return statusDetektif;
    }

    public void setStatusDetektif(String statusDetektif) {
        this.statusDetektif = statusDetektif;
    }

    public int getUmurDetektif() {
        return umurDetektif;
    }

    public void setUmurDetektif(int umurDetektif) {
        this.umurDetektif = umurDetektif;
    }
    
}
