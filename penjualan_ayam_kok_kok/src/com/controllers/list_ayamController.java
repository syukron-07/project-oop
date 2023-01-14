package com.controllers;

import java.util.List;
import java.util.Scanner;

import com.utility;
import com.models.list_ayam;

public class list_ayamController {


    private List<list_ayam> listAyam;
    static Scanner scan = new Scanner(System.in);

    public list_ayamController(List<list_ayam> listAyam) {
        this.listAyam = listAyam;
        menuAyam();

    } 
    void menuAyam() {
        int pilih = 0;
        do {
            show ();

            System.out.println("[1] Input Barang");
            System.out.println("[2] Update Barang");
            System.out.println("[3] Hapus Barang");
            System.out.println("[0] Halaman Utama");
            System.out.println("Pilih Menu \n ============");
            pilih = utility.inputInt(scan.nextLine());
            
            switch (pilih) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    Store();
                    break;
                case 2:
                    Update();
                    break;
                case 3:
                    destroy();
                    break;
                default:
                    break;
            }
        } while (pilih != 0);

    }
    void destroy() {
        System.out.println("MASUKKAN NO");
        int inputan = utility.inputInt(scan.nextLine());
        
        if (inputan > 0 && --inputan < listAyam.size()) {
            listAyam.remove(inputan);
            System.out.println("\n data berhasil dihapus \n");

        }

    }
    /**
     * 
     */
    void Update() {
        System.out.println("======Ubah Data Barang======");
        System.out.println("~Kosongkan Data Jika Tidak Ingin Dirubah~");
        System.out.println("~Ketik 0 kembali ke menu utama-");
        System.out.println("Pilih NO :");
        int inputan = utility.inputInt(scan.nextLine());
        if (inputan > 0 && --inputan < listAyam.size()) {
            System.out.println("masukkan nama");
            String nama = scan.nextLine();
            
            if (!nama.equals("")) {
                listAyam.get(inputan).setMenu(nama);
            } 

            System.out.println("masukkan harga");
            int harga = utility.inputInt(scan.nextLine());

            if (harga >= 0){
                listAyam.get(inputan).setHarga_modal(harga);
            }

            System.out.println("masukkan harga jual");
            int getHarga_jual = utility.inputInt(scan.nextLine());

            if (harga >= 0){
                listAyam.get(inputan).setHarga_jual(getHarga_jual);
            }

            System.out.println("masukkan stok");
            int stok = utility.inputInt(scan.nextLine());
            if (stok >= 0) {
                listAyam.get(inputan).setStok(stok);
            } 
        }
    }
    void Store() {
        list_ayam b = new list_ayam();
        System.out.println("Masukkan MENU AYAM");
        b.setMenu(scan.nextLine());
        System.out.println("Masukkan Harga");
        b.setHarga_modal(utility.inputInt(scan.nextLine()));
        System.out.println("masukkan harga jual");
        b.setHarga_jual(utility.inputInt(scan.nextLine()));
        System.out.println("Masukkan Stok Barang");
        b.setStok(utility.inputInt(scan.nextLine()));
        listAyam.add(b);
    }
    void show() {
        System.out.println(
            "_________________________________________________________________________________________________________________________");
        System.out.println(
            "| NO |     MENU AYAM       |           HARGA MODAL          |             HARGA JUAL         |           STOK            |");
        System.out.println(
            "=========================================================================================================================");
        int i = 1;
        for (list_ayam list_ayam : listAyam) {
            System.out.printf ("|%-4s|%-21s|%-32s|%-32s|%-27s| %n" , i++, 
                    list_ayam.getMenu(),
                    utility.toRupiah(list_ayam.getHarga_modal()),
                    utility.toRupiah(list_ayam.getHarga_jual()),
                    list_ayam.getStok());
        }
        }


}