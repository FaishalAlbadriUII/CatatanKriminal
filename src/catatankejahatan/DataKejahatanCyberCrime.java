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
public class DataKejahatanCyberCrime extends DataKejahatan{

    protected String platform;
            
    public DataKejahatanCyberCrime(int idDetektif, int tahunKasusTerjadi, int tahunKasusSelesai, String namaKasus, String statusKasus, String kategoriKasus, String platform) {
        super(idDetektif, tahunKasusTerjadi, tahunKasusSelesai, namaKasus, statusKasus, kategoriKasus);
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

}
