package com.mycompany.kombinyapma;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author derya
 */
public class lowerBody {
    public String[] pant = new String[5];
    public String[] shortt = new String[5];
    public String[] etek = new String[5];

    public lowerBody(String[] pant, String[] shortt, String[] etek ) {
        
        if(pant != null)
        {
            this.pant = pant;
            /*this.etek =null;
            this.shortt = null;*/
        }
        
        else if(shortt != null)
        {
           /* this.pant = null;
            this.etek =null;*/
            this.shortt = shortt;
        }
        else if(etek != null)
        {
            //this.pant = null;
            this.etek =etek;
            //this.shortt = null;
        }
    }
    
   /* public void degeratapant(int index, String value) {
        pant[index] = value;
    }
    public void degeratashortt(int index, String value) {
        shortt[index] = value;
    }
    public void degerataetek(int index, String value) {
        etek[index] = value;
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
    }*/
    
}
