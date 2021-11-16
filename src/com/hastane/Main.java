package com.hastane;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Hemsire hemsire = new Hemsire();
        Doktor doktor = new Doktor();

        hemsire.ad = "Bahar";
        hemsire.soyad = "Yılmaz";
        hemsire.kimlikNo = "12345678901";

        doktor.ad = "Selim";
        doktor.soyad = "Yılmaz";
        doktor.birim = "Genel Cerrahi";

        System.out.println("Hemşireler");
        System.out.println("Ad       : "+hemsire.ad);
        System.out.println("Soyad    : "+hemsire.soyad);
        System.out.println("Kimlik No: "+hemsire.kimlikNo);

        System.out.println("**********************************");

        System.out.println("Doktorlar");
        System.out.println("Ad       : "+doktor.ad);
        System.out.println("Soyad    : "+doktor.soyad);
        System.out.println("Birimi   : "+doktor.birim);
    }
}
