package com.juaracoding;

public class ExceptionHandling {
    public static void main(String[] args) {

        try{
            int result = 100/0;
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Tidak bisa dibagi 1");
        }

        System.out.println("Next statement");

    }
}
