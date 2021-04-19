package catatankejahatan;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Ahmad Faishal Albadri
 * @nim 20523166
 */
public class CatatanKejahatan {
    
    public static ArrayList<DataDetektif> listDataDetektif;
    public static ArrayList<DataKejahatanCyberCrime> listDataKejahatanCyberCrime;
    public static ArrayList<DataKejahatanKonvensional> listDataKejahatanKonvensional;
    public static Scanner scannerMenu;
    public static DataDetektif dataDetektif;
    
    public static void main(String[] args) {
        
        int pilihan = 0;
        scannerMenu = new Scanner(System.in);
        listDataKejahatanCyberCrime = new ArrayList<DataKejahatanCyberCrime>();
        listDataKejahatanKonvensional = new ArrayList<DataKejahatanKonvensional>();
        listDataDetektif = new ArrayList<DataDetektif>();
        dataDetektif = new DataDetektif();

        daftarMenu();
        pilihMenu(pilihan);
    }

    private static void daftarMenu() {
        System.out.println(
                "======== Daftar Menu ========" + 
                        "\n1. Masukkan Data Detektif" +
                        "\n2. Masukkan Data Kejahatan" +
                        "\n3. Tampilkan Data Detektif" +
                        "\n4. Tampilkan Data Kejahatan" +
                        "\n5. Edit Maximal Umur Pensiun Detektif" +
                        "\n6. Exit Program"
                        );
    }

    private static void pilihMenu(int pilihan) {
        System.out.print("\nPilih Berdasarkan Angka : ");
        while (!scannerMenu.hasNextInt()) {
            System.err.println("MASUKKAN ANGKA!!!!");
            scannerMenu.next();
            System.out.print("Pilih Berdasarkan Angka : ");
        }
        pilihan = scannerMenu.nextInt();
        menuSwitch(pilihan);
    } 

    private static void menuSwitch(int pilihan) {
        switch(pilihan) {
            case 1 :
                System.out.println("\n");
                inputDataDetektif();
                break;
                
            case 2 :
                System.out.println("\n");
                inputDataKejahatan();
                break;
            
            case 3 :
                System.out.println("\n");
                showDataDetektif();
                break;
                            
            case 4 :
                System.out.println("\n");
                showDataKejahatan();
                break;  
            
            case 5 :
                System.out.println("\n");
                editMaximalUmurPensiun();
                break;  
            
            default:
                System.exit(0);
                break;
        }
    }
    
    private static void repeatProgram(int pilihan) {
        System.out.println("");
        daftarMenu();
        pilihMenu(pilihan);
    }

    private static void inputDataDetektif() {
        Scanner scDetektif = new Scanner(System.in);
        String namaDetektif;
        int umurDetektif;
        System.out.println("======== Masukkan Data Detektif ========");
        System.out.print("Input Nama Detektif : ");
        namaDetektif = scDetektif.nextLine();
      
        System.out.print("Input Umur Detektif: ");
        while (!scDetektif.hasNextInt()) {
            System.err.println("MASUKKAN ANGKA!!!!");
            scDetektif.next();
            System.out.print("Input Umur Detektif: ");
        }
        umurDetektif = scDetektif.nextInt();
            
        if (umurDetektif >= dataDetektif.getUmurMaxPensiun()) {
            listDataDetektif.add(new DataDetektif(namaDetektif, "Pensiun", umurDetektif));
        } else {
            listDataDetektif.add(new DataDetektif(namaDetektif, "Aktif", umurDetektif));
        }
        repeatProgram(0);
    }

    private static void showDataDetektif() {
        System.out.println("======== Data Detektif ========");
        if (listDataDetektif.size() > 0) {
            for (int i = 0; i < listDataDetektif.size(); i++) {
                String namaDetektif = listDataDetektif.get(i).getNamaDetektif();
                String statusDetektif = listDataDetektif.get(i).getStatusDetektif();
                int umurDetektif = listDataDetektif.get(i).getUmurDetektif();
                int nomorUrut = i;
                nomorUrut = nomorUrut + 1;
                System.out.println(
                        nomorUrut + ". " + namaDetektif + " | Umur : " + umurDetektif + " | Status : " + statusDetektif   
                );
            }
        } else {
            System.out.println("Tidak Ada Data Detektif");
        }
        repeatProgram(0);
    }

    private static void inputDataKejahatan() {
        System.out.println("======== Masukkan Data Kejahatan ========");
        Scanner scKejahatan = new Scanner(System.in);
        int idDetektif, tahunKasusTerjadi, tahunKasusSelesai, rangeTahunKasus;
        String namaKasus, statusKasus, kategoriKasus;
        String daerahKejadiaKasus = "", platformPencatatanKasus = "";
        
        if (listDataDetektif.size() > 0) {
            System.out.print("Jenis Kategori Kasus Cybercrime atau Konvensional (c/k): ");
            kategoriKasus = scKejahatan.nextLine();
            
            System.out.print("Nama Kasus : ");
            namaKasus = scKejahatan.nextLine();
            
            System.out.print("Status Kasus Aktif atau Selesai atau Ditutup (a/s/d): ");
            statusKasus = scKejahatan.nextLine();
            
            if (statusKasus.equalsIgnoreCase("a")) {
                statusKasus = "Aktif";
            } else if (statusKasus.equalsIgnoreCase("s")) {
                statusKasus = "Selesai";
            } else {
                statusKasus = "Ditutup";
            }
            
            if (kategoriKasus.equalsIgnoreCase("c")) {
                kategoriKasus = "Cybercrime";
                System.out.print("Platform Kejahatan : ");
                platformPencatatanKasus = scKejahatan.nextLine();
            } else {
                kategoriKasus = "Konvensional";
                System.out.print("Daerah Kejadian Kasus : ");
                daerahKejadiaKasus = scKejahatan.nextLine();
            }
            
            System.out.print("Tahun Kasus Terjadi : ");
            while (!scKejahatan.hasNextInt()) {
                System.err.println("MASUKKAN ANGKA!!!!");
                scKejahatan.next();
                System.out.print("Tahun Kasus Terjadi : ");
            }
            tahunKasusTerjadi = scKejahatan.nextInt();
            
            System.out.print("Tahun Kasus Selesai : ");
            while (!scKejahatan.hasNextInt()) {
                System.err.println("MASUKKAN ANGKA!!!!");
                scKejahatan.next();
                System.out.print("Tahun Kasus Selesai : ");
            }
            tahunKasusSelesai = scKejahatan.nextInt();
            
            rangeTahunKasus = tahunKasusSelesai - tahunKasusTerjadi;
            
            if (statusKasus.equalsIgnoreCase("Aktif") && rangeTahunKasus >= 10) {
                statusKasus = "Ditutup";
            }
            
            System.out.println("");
            for (int i = 0; i < listDataDetektif.size(); i++) {
                String namaDetektif = listDataDetektif.get(i).getNamaDetektif();
                System.out.println(i + ". " + namaDetektif);
            }
            
            System.out.print("Input Detektif (masukkan berdasarkan nomor) : ");
            while (!scKejahatan.hasNextInt()) {
                System.err.println("MASUKKAN ANGKA!!!!");
                scKejahatan.next();
                System.out.print("Input Detektif (masukkan berdasarkan nomor) : ");
            }
            idDetektif = scKejahatan.nextInt();
            
            if (kategoriKasus.equalsIgnoreCase("Cybercrime")) {
                listDataKejahatanCyberCrime.add(new DataKejahatanCyberCrime(idDetektif,tahunKasusTerjadi, tahunKasusSelesai, namaKasus,statusKasus, kategoriKasus, platformPencatatanKasus));
            } else if (kategoriKasus.equalsIgnoreCase("Konvensional")) {
                listDataKejahatanKonvensional.add(new DataKejahatanKonvensional(idDetektif,tahunKasusTerjadi, tahunKasusSelesai, namaKasus,statusKasus, kategoriKasus, daerahKejadiaKasus));
            }
        } else {
            System.out.println("Harap Input Data Detektif Terlebih Dahulu");
        }
        repeatProgram(0);
    }

    private static void showDataKejahatan() {
        System.out.println("======== Data Kejahatan ========");
        if (listDataKejahatanCyberCrime.size() > 0 || listDataKejahatanKonvensional.size() > 0) {
            int nomor = 0;
            
            for (int i = 0; i < listDataKejahatanKonvensional.size(); i++) {
                nomor++;
                System.out.println(
                        nomor + ". " + listDataKejahatanKonvensional.get(i).getNamaKasus() + 
                                "\n    Nama Detektif : " + listDataDetektif.get(listDataKejahatanKonvensional.get(i).getIdDetektif()).getNamaDetektif() +
                                "\n    Tahun Terjadi : " + listDataKejahatanKonvensional.get(i).getTahunKasusTerjadi() + 
                                "\n    Tahun Selesai : " + listDataKejahatanKonvensional.get(i).getTahunKasusSelesai() + 
                                "\n    Tempat Kejadian : " + listDataKejahatanKonvensional.get(i).getTempatKejadian() +
                                "\n    Status Kasus : " + listDataKejahatanKonvensional.get(i).getStatusKasus() +
                                "\n"
                );
            }
            
            for (int i = 0; i < listDataKejahatanCyberCrime.size(); i++) {
                nomor++;
                System.out.println(
                        nomor + ". " + listDataKejahatanCyberCrime.get(i).getNamaKasus() + 
                                "\n    Nama Detektif : " + listDataDetektif.get(listDataKejahatanCyberCrime.get(i).getIdDetektif()).getNamaDetektif() +
                                "\n    Tahun Terjadi : " + listDataKejahatanCyberCrime.get(i).getTahunKasusTerjadi() + 
                                "\n    Tahun Selesai : " + listDataKejahatanCyberCrime.get(i).getTahunKasusSelesai() + 
                                "\n    Platform : " + listDataKejahatanCyberCrime.get(i).getPlatform()+
                                "\n    Status Kasus : " + listDataKejahatanCyberCrime.get(i).getStatusKasus() +
                                "\n"
                );
            }
        } else {
            System.out.println("Tidak Ada Data Kejahatan");
        }
        repeatProgram(0);
    }

    private static void editMaximalUmurPensiun() {
        System.out.println("======== Edit Maximal Umur Pensiun Detektif ========");
        ArrayList<DataDetektif> listData = new ArrayList<DataDetektif>();
        listData.addAll(listDataDetektif);
        
        Scanner scMaxUmur = new Scanner(System.in);
        int maxUmur = 0;
        
        System.out.println("Umur Maximal Sebelumnya Adalah " + dataDetektif.getUmurMaxPensiun());
        System.out.print("Edit Umur Maximal Detektif: ");
        while (!scMaxUmur.hasNextInt()) {
            System.err.println("MASUKKAN ANGKA!!!!");
            scMaxUmur.next();
            System.out.print("Edit Umur Maximal Detektif: ");
        }
        maxUmur = scMaxUmur.nextInt();
        
        dataDetektif.setUmurMaxPensiun(maxUmur);
        
        listDataDetektif.clear();
        
        for (int i = 0; i < listData.size(); i++) {
            String namaDetektif = listData.get(i).getNamaDetektif();
            int umurDetektif = listData.get(i).getUmurDetektif();
            
            if (umurDetektif >= dataDetektif.getUmurMaxPensiun()) {
                listDataDetektif.add(new DataDetektif(namaDetektif, "Pensiun", umurDetektif));
            } else {
                listDataDetektif.add(new DataDetektif(namaDetektif, "Aktif", umurDetektif));
            }
        }
        repeatProgram(0);
    }
}
