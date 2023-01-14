package com.controllers;

import java.util.List;

import com.utility;
import com.models.transaksi;

public class laporantransaksicontroller {
    private List<transaksi> listTransaksi;

    public laporantransaksicontroller(List<transaksi> listTransaksi) {
        this.listTransaksi = listTransaksi;

        showdata();
    }

void showdata() {
    System.out.println(
        "_______________________________________________________________________________________________________________________");
System.out.println(
        "| NO |     MENU AYAM     |   QTY    |          Harga          |          Total         |           KEUNTUNGAN          ");
System.out.println(
        "=======================================================================================================================");
    int i = 1;
    for (transaksi Transaksi : listTransaksi) {
        System.out.printf("|%-4s|%-21s|%-10s|%-25s|%-24s|%-23s| %n",
        i++,
        Transaksi.getNamamenu(),
        Transaksi.getQty(),
        utility.toRupiah(Transaksi.getHarga_jual()),
        utility.toRupiah(Transaksi.getHarga() * Transaksi.getQty()),
        utility.toRupiah(Transaksi.getHarga_jual() - Transaksi.getHarga_modal()));

        }
    }
   
}
