package com.juaracoding;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {

        if(false){
            System.out.println("Statement");
        }
        System.out.println("Next Statement");

        int suhu = 37;
        if(suhu <= 36){ // 36 > 36 (false)
            System.out.println("Cuaca Normal");
        }  else {
            System.out.println("Cuaca Sangat Panas");
        }

        int angka = 5;
        if(angka % 2 == 0){ // 5 % 2 = 1 == 0(false)
            System.out.println(angka+" Bilangan Genap");
        }else{
            System.out.println(angka+" Bilangan Ganjil");
        }

        // if majemuk
        // Size S = 50000, Size M = 60000, Size L = 70000
        String size = "S";
        int qty = 2;
        int price = 0;
        if(size.equalsIgnoreCase("S")){
            price =50000;
        } else if (size.equalsIgnoreCase("M")){
            price =60000;
        } else if (size.equalsIgnoreCase("L")) {
            price =70000;
        }else {
            System.out.println("Tidak ada ukuran tersebut");
        }

        System.out.println("Size: "+size.toUpperCase()+" Price: "+price);

        //username = admin, password = p4ssw0rd => true

        String inputUsername = "admin";
        String inputPassword = "p4ssw0rd";

        if(inputUsername.equals("admin") && inputPassword.equals("p4ssw0rd")){
            System.out.println("Login berhasil");
        }else {
            System.out.println("Login gagal");
        }

        // platNomor ganjil, tanggal ganjil
        //platNomor genap, tanggal genap

        int platNomor = 1235;
        int tanggal = 3;
        if((platNomor % 2 == 0 && tanggal % 2 == 0) || (platNomor % 2 == 1 && tanggal % 2 == 1)){
            // false OR true
            System.out.println("bisa melalui jalan Soekarno Hatta");
        }else if (platNomor % 2 == 1 && tanggal % 2 == 1){
            System.out.println("tidak bisa melalui jalan Soekarno Hatta, Karena plat nomor ganjil tanggal genap");
        }else {
            System.out.println("tidak bisa melalui jalan Soekarno Hatta, Karena plat nomor genap tanggal ganjil");
        }

        // nested if
        // isMember = 10%, isFirstTimerBuyer = 5%, hasCoupon = 2%
        // totalAmount > 500000
        Scanner scanner = new Scanner(System.in);
        double totalAmount = scanner.nextDouble();
        double discount = 0.0;
        boolean isMember = true;
        boolean isFirsTimerBuyer = false;
        boolean hasCoupon = false;
        System.out.println("Masukan total bayar = ");
        if (totalAmount > 500000){
            if(isMember){
                discount = 0.1; // 10%
            } else if(isFirsTimerBuyer){
                discount = 0.05; // 5%
            }else if (hasCoupon){
                discount = 0.02; // 2%
            }
        }
        System.out.println("Discount = "+discount*100);
        System.out.println("Total bayar = Rp. "+(totalAmount-totalAmount*discount));

        //Switch case
        System.out.println("Pilih Menu [1-5]: ");
        int chooseMenu = scanner.nextInt();
        switch (chooseMenu){
            case 1:
                System.out.println("Menu ke 1");
                //blok program
                break;
            case 2:
                System.out.println("Menu ke 2");
                //blok program
                break;
            case 3:
                System.out.println("Menu ke 3");
                //blok program
                break;
            case 4:
                System.out.println("Menu ke 4");
                //blok program
                break;
            default:
                System.out.println("Menu tidak terdaftar");
                break;
        }

        //ternery
        System.out.println("Masukan nilai: ");
        int nilai = scanner.nextInt();
        String keterangan = nilai >= 75 ? "Lulus" : "tidak lulus"; // dalam String ':' bisa dijadikan sebagai else
        System.out.println(keterangan);

    }
}