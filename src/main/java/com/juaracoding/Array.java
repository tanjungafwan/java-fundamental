package com.juaracoding;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // cara 1
        int[] angka = {1,2,3,4,5}; // index 0 - 4
        System.out.println(angka[2]); // panggil index ke 2

        // cara 2
        int[] grades = new int[5];
        grades[0] = 80;
        grades[1] = 81;
        grades[2] = 82;
        grades[3] = 83;
        grades[4] = 84;
        grades[2] = 85;
        System.out.println(grades[2]);
        System.out.println(grades.length);

        System.out.println("For i");
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("For Each");
        for (int grade : grades){
            System.out.println(grade);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String car : cars){
            System.out.println(car.toUpperCase());
        }

        // array multidimensi
        int [][] angkaKu = {{1,2,3,4},{5,6,7}};
        System.out.println(angkaKu[1][2]); // baris, kolom

        System.out.println("Jumlah baris = "+angkaKu.length);
        System.out.println("Jumlah baris ke 1 = "+angkaKu[0].length);
        System.out.println("Jumlah baris ke 2 = "+angkaKu[1].length);

        for (int i = 0; i < angkaKu.length; i++) {
            for (int j = 0; j < angkaKu[i].length; j++) {
                System.out.println(angkaKu[i][j]); // [1][0]
            }
        }

        // buatkan scanner input data city: jakarta, bandung, surabaya, bali, makassar
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan jumlah data yang di input : ");
        int jmlData = scanner.nextInt();
        String [] citi = new String[jmlData];
        System.out.println("Input nama kota = ");
        // Lengkapi input data




        // menjumlahkan list data harga
        double[] prices = {10000,50000,70000,90000,100000};
        double sum = 0;
//        for (int i = 0; i < prices.length; i++) {
//            sum += prices[i]; // sum = 220000 + 100000
//        }
        for(double price : prices){
            sum += price;
        }
        System.out.println("Jumlah baya = "+sum);

        // mencari sebuah data
        String[] cities = {"jakarta", "bandung", "surabaya", "bali", "makassar"};
        System.out.println("Masukkan data yang ingin dicari = ");
        String search = scanner.next();
        boolean found = false;
        int index = 0;
        for (int i = 0; i < cities.length; i++) {
            if(search.equalsIgnoreCase(cities[i])){
                found = true;
                index = i;
                break;
            }
        }
        // data ditemukan, data tidak ditemukan
//        if (found) {
//            System.out.println("Data ditemukan pada index ke - " + index);
//        } else {
//            System.out.println("Data tidak ditemukan: " + search);
//        }
        // 1 - 10, 11 - 20

        // ternary
        System.out.println(found ? "Data ditemukan pada index ke - " + index : "Data tidak ditemukan: " + search);


    }
}
