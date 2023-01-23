package com.controllers;

import java.util.Date;
import java.util.List;

import com.utility;
import com.models.transaksi;

public class laporantransaksicontroller {
    private List<transaksi> listTransaksi;
    Date date = new Date ();

    public laporantransaksicontroller(List<transaksi> listTransaksi) {
        this.listTransaksi = listTransaksi;

        showdata();
    }

void showdata() {
    System.out.println(
        "__________________________________________________________________________________________________________________________");
System.out.println(
        "| NO |     MENU AYAM     |QTY|       Harga jual      |      Total      |    KEUNTUNGAN    |       TANGGAL TRANSAKSI      |");
System.out.println(
        "==========================================================================================================================");
    int i = 1;
    for (transaksi Transaksi : listTransaksi) {
        System.out.printf("|%-4s|%-19s|%-3s|%-23s|%-17s|%-18s|%-30s| %n",
        i++,
        Transaksi.getNamamenu(),
        Transaksi.getQty(),
        utility.toRupiah(Transaksi.getHarga_jual()),
        utility.toRupiah(Transaksi.getHarga_jual() * Transaksi.getQty()),
        utility.toRupiah(Transaksi.getHarga_jual() * Transaksi.getQty() - Transaksi.getHarga_modal() * Transaksi.getQty()),
        (date.toString()));

        }

        
    
    }
   
}
