/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kombinyapma;

/**
 *
 * @author derya
 */
public class lowerBodyFeet extends lowerBody implements methodlar {

    String[] ayakkabi = new String[5];

    public lowerBodyFeet(String[] pant, String[] shortt, String[] etek, String[] ayakkabi) {
        super(pant, shortt, etek);
        this.ayakkabi = ayakkabi;
    }

    public void degeratapant(int index, String value) {
        pant[index] = value;
    }

    public void degeratashortt(int index, String value) {
        shortt[index] = value;
    }

    public void degerataetek(int index, String value) {
        etek[index] = value;
    }

    public void degerataayak(int index, String value) {
        ayakkabi[index] = value;
    }

    public void rastgelepant() {

        try {
            int sayi = (int) (Math.random() * pant.length);
            if (pant[sayi] != null) {
                System.out.println("Rastgele secilen pantalon kiyafet: " + pant[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("pantalon kiyafetler bulunmuyor veya atanmamis");
        }
    }

    public void rastgeleshort() {

        try {
            int sayi = (int) (Math.random() * shortt.length);
            if (shortt[sayi] != null) {
                System.out.println("Rastgele secilen short kiyafet: " + shortt[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("short kiyafetler bulunmuyor veya atanmamis");
        }
    }

    public void rastgeleetek() {

        try {
            int sayi = (int) (Math.random() * etek.length);
            if (etek[sayi] != null) {
                System.out.println("Rastgele secilen etek kiyafet: " + etek[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("etek kiyafetler bulunmuyor veya atanmamis");
        }
    }

    public void rastgeleayakkabi() {

        try {
            int sayi = (int) (Math.random() * ayakkabi.length);
            if (ayakkabi[sayi] != null) {
                System.out.println("Rastgele secilen ayakkabi: " + ayakkabi[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("ayakkabi bulunmuyor veya atanmamis");
        }
    }

    @Override
    public void goster() {
        if (pant != null) {
            System.out.println("pantalon Kiyafetler:");
            for (String item : pant) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }
        if (shortt != null) {
            System.out.println("short Kiyafetler:");
            for (String item : shortt) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }
        if (etek != null) {
            System.out.println("etek Kiyafetler:");
            for (String item : etek) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }
        if (ayakkabi != null) {
            System.out.println("ayakkabilar:");
            for (String item : ayakkabi) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }
    }

}
