package com.controllers;

import java.util.List;
import java.util.Scanner;

import com.utility;
import com.models.list_ayam;
import com.models.transaksi;

public class transaksicontroller {
    private List<transaksi> listtransaksi;
    private List<list_ayam> listayam;
    Scanner scan = new Scanner(System.in);

    public transaksicontroller(List<transaksi> listtransaksi, List<list_ayam> listayam) {
        this.listtransaksi = listtransaksi;
        this.listayam = listayam;
        showAyam();
        store();

    }
    
    void showAyam() {
        System.out.println(
            "______________________________________________________________________________");
    System.out.println(
            "| NO |     Nama Barang     |          Harga          |          Stok         |");
    System.out.println(
            "==============================================================================="); 
            int i = 1;
            for (list_ayam list_ayam : listayam) {
                System.out.printf ("|%-4s|%-21s|%-25s|%-23s| %n" , i++, list_ayam.getMenu(),
                        utility.toRupiah(list_ayam.getHarga_jual()), list_ayam.getStok());
        }
}

void store() {
    String inputan = "Y";
    do {

        System.out.println("\n~Ketik 0 kembali ke menu utama-");
        System.out.println("Input No :");
        int lokasiAyam = utility.inputInt(scan.nextLine());
        if (lokasiAyam > 0 && --lokasiAyam < listayam.size()) {
            System.out.println("jumlah");
            int jumlah = utility.inputInt(scan.nextLine());
            int stok = listayam.get(lokasiAyam).getStok();

            if (jumlah <= stok) {
                listayam.get(lokasiAyam).setStok(stok -= jumlah);

                String namaAyam = listayam.get(lokasiAyam).getMenu();
                int harga = listayam.get(lokasiAyam).getHarga_jual();
                int hargo = listayam.get(lokasiAyam).getHarga_modal();

                System.out.println("------------------------------------------------------------");
                    System.out.printf("Nama Barang |%-21s|Harga  |%-25s|Stok|%-23s| %n",
                            namaAyam,
                            utility.toRupiah (harga),
                            listayam.get(lokasiAyam).getStok());

                            System.out.println("total : " + utility.toRupiah(jumlah * harga));
                            transaksi Transaksi = new transaksi();
                            Transaksi.setNamamenu(namaAyam); 
                            Transaksi.setQty(jumlah);
                            Transaksi.setHarga_jual(harga);
                            Transaksi.setHarga_modal(hargo);
                            listtransaksi.add(Transaksi);

                            System.out.println("pembelian berhasil");
            } else {
                System.out.println("Jumlah Pembelian Melebihi Stok");
            }
            }

            System.out.println("apakah ingin melanjutkan transaksi (Y/N) ? ");
            inputan = scan.nextLine(); 
        } while (inputan.equalsIgnoreCase("y"));
    }
}

