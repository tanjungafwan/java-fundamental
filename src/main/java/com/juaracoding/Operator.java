package com.juaracoding;

public class Operator {

    public static void main(String[] args) {

        //aritmatik
        double result = 5.0/2;
        System.out.println(result);
        int modulus = 8 % 2;
        System.out.println(modulus);

        //increment prefix ++x, suffix x++
        int x = 2;
        int hasil = 10 * x++; // (++x) hasil menjadi 30, (--x) hasil menjadi 10
        System.out.println(hasil);

        int total = (10+2)*5; // 10+2*5 hasil 20
        System.out.println(total);

        // assingtment operator
        int a = 10;
        int b = 12;
        a += b; // a = a + b
        System.out.println(a);

        //relational operator hanya menggunakan boolean
        boolean isResult = 5 < 5;
        System.out.println(isResult);

        //bitwise
        int bitwise = 10 | 12;
        // 1010 = 10  or
        // 1100 = 12
        // 1000 = 14 (konfersi ke desimal)
        System.out.println(bitwise);
    }
}