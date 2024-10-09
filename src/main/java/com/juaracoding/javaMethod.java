package com.juaracoding;

public class javaMethod {
    public static void main(String[] args) {

        // reuseable
        drawKotak(5);
        drawKotak(10);

        double sisi = 10;
        double luas = luasKotak(sisi);
        System.out.println(luas);
        System.out.println(luasKotak(12));

        System.out.println(setName("Juara Coding"));
        System.out.println(setText("coder"));

        // Login berhasil
        System.out.println(login("admin", "password"));

        // Login gagal
        System.out.println(login("gagal", "gagal"));

        // tax
//        calculateTax(8000, 'P');
//        calculateTax(3000, 'L');

        String[] cities = {"jakarta", "bandung", "surabaya", "bali", "makassar", "kalimantan"};
        cariKataTerpanjang(cities);


    }


    private static void drawKotak(int sisi) {
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static double luasKotak(double sisi) {
        return sisi * sisi;
    }

    static String setName(String name) {
        return name;
    }

    // komparasi Coder contains Code
    static boolean setText(String text) {
        return text.contains("Code");
    }

    // fungsi Login return boolean
    static boolean login(String username, String password) {
        if (username.equals("admin") && password.equals("password")) {
            return true;
        } else {
            return false;
        }
    }

    // calculateTax()
    // wajib pajak minimal 7000
    // gender L 10%, P 5%

//    static void calculateTax(int salary, char gender) {
//        if (salary >= 7000) {
//            if (gender == 'P') {
//                System.out.println(salary * 0.05);
//            } else {
//                System.out.println(salary * 0.1);
//            }else{
//                System.out.println(salary * 0.0);
//            }
//
//        }

    // cari kata terpanjang
    static void cariKataTerpanjang(String[] cities){
        int kataTerpanjang = 0;
        int index = 0;
        String city = null;
        for (int i = 0; i < cities.length; i++) {
            if (kataTerpanjang < cities[i].length()) {  // 0 < 8
                kataTerpanjang = cities[i].length();
                index = i;
                city = cities[i];
            }
        }
        System.out.println("Kata terpanjang berada pada index ke-" + index + "Yaitu"+city);
    }

}
