package com;

import java.text.NumberFormat;

public class utility {
    public static final int inputInt(String angka) {
        int inputan = -1;
        try {
            inputan = Integer.parseInt(angka);
        } catch (Exception e) {
        if (!angka.equals("")) {
            System.out.println("inputkan angka dengan benar");
        }
        }
        return inputan;
    }

    public static final String toRupiah(int angka) {
        double tempAngka = angka;
        NumberFormat formatter = NumberFormat.getCurrencyInstance(App.locale);
        String strFormat = formatter.format(tempAngka);
        return strFormat;
    }
}