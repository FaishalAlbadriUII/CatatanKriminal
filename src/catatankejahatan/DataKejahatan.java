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
public class DataKejahatan {
    
    protected int idDetektif, tahunKasusTerjadi, tahunKasusSelesai;
    protected String namaKasus, statusKasus, kategoriKasus;

    public DataKejahatan() {
    }

    
    public DataKejahatan(int idDetektif, int tahunKasusTerjadi, int tahunKasusSelesai, String namaKasus, String statusKasus, String kategoriKasus) {
        this.idDetektif = idDetektif;
        this.tahunKasusTerjadi = tahunKasusTerjadi;
        this.tahunKasusSelesai = tahunKasusSelesai;
        this.namaKasus = namaKasus;
        this.statusKasus = statusKasus;
        this.kategoriKasus = kategoriKasus;
    }

    public int getIdDetektif() {
        return idDetektif;
    }

    public void setIdDetektif(int idDetektif) {
        this.idDetektif = idDetektif;
    }

    public int getTahunKasusTerjadi() {
        return tahunKasusTerjadi;
    }

    public void setTahunKasusTerjadi(int tahunKasusTerjadi) {
        this.tahunKasusTerjadi = tahunKasusTerjadi;
    }

    public int getTahunKasusSelesai() {
        return tahunKasusSelesai;
    }

    public void setTahunKasusSelesai(int tahunKasusSelesai) {
        this.tahunKasusSelesai = tahunKasusSelesai;
    }

    public String getNamaKasus() {
        return namaKasus;
    }

    public void setNamaKasus(String namaKasus) {
        this.namaKasus = namaKasus;
    }

    public String getStatusKasus() {
        return statusKasus;
    }

    public void setStatusKasus(String statusKasus) {
        this.statusKasus = statusKasus;
    }

    public String getKategoriKasus() {
        return kategoriKasus;
    }

    public void setKategoriKasus(String kategoriKasus) {
        this.kategoriKasus = kategoriKasus;
    }
    
}
