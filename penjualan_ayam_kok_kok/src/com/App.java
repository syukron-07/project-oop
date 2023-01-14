package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.controllers.laporantransaksicontroller;
import com.controllers.list_ayamController;
import com.controllers.transaksicontroller;
import com.models.list_ayam;
import com.models.transaksi;

public class App {
    static Scanner scan = new Scanner(System.in);
    public  static final Locale locale = new Locale ("in","ID");

    public static void main(String[] args) throws Exception {
        List<list_ayam> listbarang = new ArrayList<list_ayam>();
        List<transaksi> listTransaksi = new ArrayList<transaksi>();
        
        do {
            System.out.println("---Menu List---");
            System.out.println("(1) LIST MENU");
            System.out.println("(2) TRANSAKSI");
            System.out.println("(3) LAPORAN TRANSAKSI");
            System.out.println("----------------------------");
            System.out.println("PILIH MENU > ");
        } while (showMenu(listbarang, listTransaksi) !=0);
        }

    public static int showMenu(List<list_ayam> listbarang,List<transaksi> ltransaksi) {
        int selectedMenu = utility.inputInt(scan.nextLine());
    
        switch (selectedMenu) {
            case 1:

            new list_ayamController(listbarang);
            break;

            case 2:

            new transaksicontroller(ltransaksi,listbarang);

            case 3 :
            new laporantransaksicontroller(ltransaksi);
            break;
            
        }

        return selectedMenu;
    }
    }
