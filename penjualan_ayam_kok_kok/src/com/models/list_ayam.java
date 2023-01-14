package com.models;

public class list_ayam {
    private String Menu;
    private int Harga_modal,harga_jual,Stok;
    public String getMenu() {
        return this.Menu;
    }
    public void setMenu(String menu) {
        this.Menu = menu;
    }
    public int getHarga_modal() {
        return Harga_modal;
    }
    public void setHarga_modal(int harga_modal) {
        Harga_modal = harga_modal;
    }
    public int getHarga_jual() {
        return harga_jual;
    }
    public void setHarga_jual(int harga_jual) {
        this.harga_jual = harga_jual;
    }
    public int getStok() {
        return Stok;
    }
    public void setStok(int stok) {
        Stok = stok;
    }
}
