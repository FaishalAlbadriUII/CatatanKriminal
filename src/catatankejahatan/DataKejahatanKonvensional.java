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
public class DataKejahatanKonvensional extends DataKejahatan{

    protected String tempatKejadian;
     
    public DataKejahatanKonvensional(int idDetektif, int tahunKasusTerjadi, int tahunKasusSelesai, String namaKasus, String statusKasus, String kategoriKasus, String tempatKejadian) {
        super(idDetektif, tahunKasusTerjadi, tahunKasusSelesai, namaKasus, statusKasus, kategoriKasus);
        this.tempatKejadian = tempatKejadian;
    }

    public String getTempatKejadian() {
        return tempatKejadian;
    }

    public void setTempatKejadian(String tempatKejadian) {
        this.tempatKejadian = tempatKejadian;
    }
}
