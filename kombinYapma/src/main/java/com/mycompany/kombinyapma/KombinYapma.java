/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.kombinyapma;

import java.util.Scanner;

/**
 *
 * @author derya
 */
public class KombinYapma {

    public static String[] ceket = new String[5];
    public static String[] kazak = new String[5];
    public static String[] mont = new String[5];
    public static String[] tshirt = new String[5];
    public static String[] askili = new String[5];
    public static String[] straplez = new String[5];
    public static String[] ayakkabi = new String[5];
    public static String[] kolye = new String[5];
    public static String[] bilezik = new String[5];
    public static String[] kupe = new String[5];
    public static upperBody ustvucut;
    public static lowerBodyFeet altvucut;
    public static int num;
    public static String cikismi;
    public static String option = "";
    static Scanner scan = new Scanner(System.in);

    // main methodunun içerisinde kullanılan methodlar
    public static void askiliekle() {
        System.out.println("5 adet askili giriniz");
        for (int i = 0; i < 5; i++) {

            String eleman = scan.nextLine();
            ustvucut.degerataaskili(i, eleman);
        }

    }

    public static void kazaksorgulaekle() {
        System.out.println("kazak giymek istiyor musunuz?");
        option = scan.nextLine();
        if (option.equals("s")) {
            System.out.println("kazak secenegini atladiniz");
            kazak = null;
        } else {
            System.out.println("5 adet kazak giriniz");
            for (int i = 0; i < 5; i++) {

                String eleman = scan.nextLine();
                ustvucut.degeratakazak(i, eleman);
            }

        }
    }

    public static void ceketsorgulaekle() {
        System.out.println("ceket giymek istiyor musunuz?");
        option = scan.nextLine();
        if (option.equals("s")) {
            System.out.println("ceket secenegini atladiniz");
            ceket = null;
        } else {
            System.out.println("5 adet ceket giriniz");
            for (int i = 0; i < 5; i++) {

                String eleman = scan.nextLine();
                ustvucut.degerataceket(i, eleman);
            }

        }
    }

    public static void montsorgulaekle() {
        System.out.println("mont giymek istiyor musunuz?");
        option = scan.nextLine();
        if (option.equals("s")) {
            System.out.println("mont secenegini atladiniz");
            mont = null;
        } else {
            System.out.println("5 adet mont giriniz");
            for (int i = 0; i < 5; i++) {

                String eleman = scan.nextLine();
                ustvucut.degeratamont(i, eleman);
            }

        }
    }

    public static void tshirtekle() {
        System.out.println("5 adet tisört giriniz");
        for (int i = 0; i < 5; i++) {

            String eleman = scan.nextLine();
            ustvucut.degeratatshirt(i, eleman);
        }
    }

    public static void straplezekle() {

        System.out.println("5 tane straplez giriniz");
        for (int i = 0; i < 5; i++) {

            String eleman = scan.nextLine();
            ustvucut.degeratastraplez(i, eleman);
        }

    }

    public static void etekekle() {
        System.out.println("5 adet etek giriniz");
        for (int i = 0; i < 5; i++) {

            String eleman = scan.nextLine();
            altvucut.degerataetek(i, eleman);
        }

    }

    public static void shortekle() {
        System.out.println("5 adet short giriniz");
        for (int i = 0; i < 5; i++) {

            String eleman = scan.nextLine();
            altvucut.degeratashortt(i, eleman);
        }

    }

    public static void pantalonekle() {
        System.out.println("5 adet pantalon giriniz");
        for (int i = 0; i < 5; i++) {

            String eleman = scan.nextLine();
            altvucut.degeratapant(i, eleman);
        }

    }

    public static void ayakkabiekle() {
        System.out.println("5 adet ayakkabi giriniz");
        for (int i = 0; i < 5; i++) {

            String eleman = scan.nextLine();
            altvucut.degerataayak(i, eleman);
        }

    }

    public static void kolyeekle() {
        System.out.println("5 adet kolye giriniz");
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                scan.nextLine();
            }
            String eleman = scan.nextLine();
            ustvucut.degeratakolye(i, eleman);
        }

    }

    public static void bilezikekle() {
        System.out.println("5 adet bilezik giriniz");
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                scan.nextLine();
            }
            String eleman = scan.nextLine();
            ustvucut.degeratabilezik(i, eleman);
        }

    }

    public static void kupeekle() {
        System.out.println("5 adet kupe giriniz");
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                scan.nextLine();
            }
            String eleman = scan.nextLine();
            ustvucut.degeratakupe(i, eleman);
        }

    }

    public static void aksesuarsorgulaekle() {
        System.out.println("aksesuar kullanmak ister misiniz?");
        String aksesecenek = scan.nextLine();
        if (aksesecenek.equals("s")) {
            kolye = null;
            bilezik = null;
            kupe = null;
        } else {
            System.out.println("kolye icin 1 / bilezik icin 2/ kupe icin 3  e basin");
           
                num = scan.nextInt();
            
            
            switch (num) {
                case 1:
                    kolyeekle();
                    System.out.println("-------------------------------");
                    
                    break;
                case 2:
                    bilezikekle();
                    System.out.println("-------------------------------");
                    
                    break;
                case 3:
                    kupeekle();
                    System.out.println("-------------------------------");
                    
                    break;
                default:
                    System.out.println("yanlis karakter");
                    break;

            }
        }
    }

    //main methodu
    public static void main(String[] args) {

        ustvucut = new upperBody(null, null, null, null, null, null, kolye, bilezik, kupe);
        altvucut = new lowerBodyFeet(null, null, null, ayakkabi);

        int secenek;
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Hosgeldiniz\n");
        String mesaj = " ceket \n kazak \n mont \n tisort \n askili \n straplez"
                + "\nunutmayin ki tisort askili ve straplezlerden sadece bir tane tur secebilirsiniz"
                + " tisort secerseniz kazak secemezsiniz"
                + " eger secenegi gecmek isterseniz s ye basin";
        System.out.println(mesaj);

        System.out.println("askili için 1 / tshirt için 2 / straplez için 3 / e basın \nkazak icin "
                + "straplez veya askili giymek zorundasiniz usutmeyin diye");
        secenek = scan2.nextInt();

        switch (secenek) {
            case 1:
                //askılı
                askiliekle();

                kazaksorgulaekle();

                ceketsorgulaekle();

                montsorgulaekle();

                aksesuarsorgulaekle();

                System.out.println("tum girdiler:\n");
                ustvucut.goster();
                System.out.println("-------------------------------");

                ustvucut.rastgeleaskili();
                System.out.println("-------------------------------");

                ustvucut.rastgelekazak();
                System.out.println("-------------------------------");

                ustvucut.rastgeleceket();
                System.out.println("-------------------------------");

                ustvucut.rastgelemont();
                System.out.println("-------------------------------");

                ustvucut.rastgelekolye();
                System.out.println("-------------------------------");
                
                ustvucut.rastgelebilezik();
                System.out.println("-------------------------------");
                
                ustvucut.rastgelekupe();
                System.out.println("-------------------------------");
                break;

            case 2:

                tshirtekle();

                ceketsorgulaekle();

                montsorgulaekle();

                aksesuarsorgulaekle();

                System.out.println("tum girdiler:\n");
                ustvucut.goster();
                System.out.println("-------------------------------");

                ustvucut.rastgeletshirt();
                System.out.println("-------------------------------");

                ustvucut.rastgeleceket();
                System.out.println("-------------------------------");

                ustvucut.rastgelemont();
                System.out.println("-------------------------------");

                ustvucut.rastgelekolye();
                System.out.println("-------------------------------");
                
                ustvucut.rastgelebilezik();
                System.out.println("-------------------------------");
                
                ustvucut.rastgelekupe();
                System.out.println("-------------------------------");
                break;

            case 3:

                straplezekle();

                kazaksorgulaekle();

                ceketsorgulaekle();

                montsorgulaekle();

                aksesuarsorgulaekle();

                System.out.println("tum girdiler:\n");
                ustvucut.goster();
                System.out.println("-------------------------------");

                ustvucut.rastgelestraplez();
                System.out.println("-------------------------------");

                ustvucut.rastgelekazak();
                System.out.println("-------------------------------");

                ustvucut.rastgeleceket();
                System.out.println("-------------------------------");

                ustvucut.rastgelemont();
                System.out.println("-------------------------------");

                ustvucut.rastgelekolye();
                System.out.println("-------------------------------");
                
                ustvucut.rastgelebilezik();
                System.out.println("-------------------------------");
                
                ustvucut.rastgelekupe();
                System.out.println("-------------------------------");
                break;
            default:
                System.out.println("yanlis karakter");
                break;
        }

        System.out.println("sıra geldi alt beden kiyafetlerine\n");
        System.out.println("secenekleriniz: Pantalon / Etek / Short / ayakkabi\n");
        System.out.println("Pantalon / Etek / Short seceneklerinden sadece bir tanesini seçebilirsiniz"
                + " ayakkabi secmek zorundasiniz. Baslayalim! ");
        System.out.println("pantalon icin 1 / etek icin 2 / short icin 3 / e basin \n");
        secenek = scan2.nextInt();
        switch (secenek) {
            case 1:
                pantalonekle();
                ayakkabiekle();
                System.out.println("tum girdiler:\n");
                altvucut.goster();
                System.out.println("-------------------------------");
                altvucut.rastgelepant();
                System.out.println("-------------------------------");
                altvucut.rastgeleayakkabi();
                break;
            case 2:
                etekekle();
                ayakkabiekle();
                System.out.println("tum girdiler:\n");
                altvucut.goster();
                System.out.println("-------------------------------");
                altvucut.rastgeleetek();
                System.out.println("-------------------------------");
                altvucut.rastgeleayakkabi();
                break;
            case 3:
                shortekle();
                ayakkabiekle();
                System.out.println("tum girdiler:\n");
                altvucut.goster();
                System.out.println("-------------------------------");
                altvucut.rastgeleshort();
                System.out.println("-------------------------------");
                altvucut.rastgeleayakkabi();
                break;
            default:
                System.out.println("yanlis karakter");
                break;

        }

    }
}
