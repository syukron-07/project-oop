package com.models;

public class transaksi {

private String namamenu;
/**
 *
 */
private int qty;
/**
 *
 */
private int getHarga_jual;
private int getHarga_modal;

public String getNamamenu() {
    return namamenu;
}
public void setNamamenu(String namamenu) {
    this.namamenu = namamenu;
}
public int getQty() {
    return qty;
}
public void setQty(int qty) {
    this.qty = qty;
}
/**
 * @return
 */
public int getHarga_jual() {
    return getHarga_jual;
}
public void setHarga_jual(int getHarga_jual) {
    this.getHarga_jual = getHarga_jual;
}
public int getHarga_modal() {
    return getHarga_modal;
}
public void setHarga_modal(int getHarga_modal) {
    this.getHarga_modal = getHarga_modal;
}





public transaksi() {

}

}
