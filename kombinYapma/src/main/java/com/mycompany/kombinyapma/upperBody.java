/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kombinyapma;

import java.util.Random;

/**
 *
 * @author derya
 */
public class upperBody extends aksesuar  implements methodlar {

    //bu classta üst beden için giyinilebilecek kıyafetler bulunacak 
    //ceket , kazak , mont , tişört , askılı , straplez
    private String[] askili = new String[5];
    private String[] straplez = new String[5];
    private String[] tshirt = new String[5];
    private String[] kazak = new String[5];
    private String[] ceket = new String[5];
    private String[] mont = new String[5];
   
    private int i;

    public upperBody(String[] askili, String[] straplez, String[] tshirt, String[] kazak, String[] ceket, String[] mont ,String[] kolye , String[] bilezik, String[] kupe ) {
        super(kolye , bilezik , kupe);
        //kullanıcı askılıyı seçerse straplez veya tshirt seçemez
        if (askili != null) {
            this.askili = askili;
            this.straplez = null;
            this.tshirt = null;
            this.kazak = kazak;
        }
        if (straplez != null) {
            this.straplez = straplez;
            this.tshirt = null;
            this.askili = null;
            this.kazak = kazak;
        }
        if (tshirt != null) {
            this.tshirt = tshirt;
            this.askili = null;
            this.straplez = null;
            this.kazak = null;
        }
        
    }
//buradaki methodlar kullanıcının değerlerini atıyor
    public void degerataaskili(int index, String value) {
        askili[index] = value;
    }

    public void degeratastraplez(int index, String value) {
        straplez[index] = value;
    }

    public void degeratatshirt(int index, String value) {
        tshirt[index] = value;
    }

    public void degeratakazak(int index, String value) {
        kazak[index] = value;
    }

    public void degerataceket(int index, String value) {
        ceket[index] = value;
    }

    public void degeratamont(int index, String value) {
        mont[index] = value;
    }
    public void degeratakolye(int index, String value) {
        kolye[index] = value;
        
    }
    public void degeratabilezik(int index, String value) {
        bilezik[index] = value;
    }
    public void degeratakupe(int index, String value) {
        kupe[index] = value;
    }
//aşağıdaki methodlar kullanıcının girdiklerinden rastgele bir tanesini seçiyor
    public void rastgeleaskili() {

        try {
            int sayi = (int) (Math.random() * askili.length);
            if (askili[sayi] != null) {
                System.out.println("Rastgele secilen askili kiyafet: " + askili[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("askili kiyafetler bulunmuyor veya atanmamis");
        }
    }

    public void rastgelestraplez() {

        try {
            int sayi = (int) (Math.random() * straplez.length);
            if (straplez[sayi] != null) {
                System.out.println("Rastgele secilen straplez kiyafet: " + straplez[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("straplez kiyafetler bulunmuyor veya atanmamis");
        }
    }

    public void rastgeletshirt() {

        try {
            int sayi = (int) (Math.random() * tshirt.length);
            if (tshirt[sayi] != null) {
                System.out.println("Rastgele secilen tisort kiyafet: " + tshirt[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("tisort kiyafetler bulunmuyor veya atanmamis");
        }
    }

    public void rastgelekazak() {
        try {
            int sayi = (int) (Math.random() * kazak.length);
            if (kazak[sayi] != null) {
                System.out.println("Rastgele secilen kazak kiyafet: " + kazak[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("kazak kiyafetler bulunmuyor veya atanmamis");
        }

    }

    public void rastgeleceket() {

        try {
            int sayi = (int) (Math.random() * ceket.length);
            if (ceket[sayi] != null) {
                System.out.println("Rastgele secilen ceket kiyafet: " + ceket[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("Ceket kiyafetler bulunmuyor veya atanmamis");
        }
    }

    public void rastgelemont() {

        try {
            int sayi = (int) (Math.random() * mont.length);
            if (mont[sayi] != null) {
                System.out.println("Rastgele secilen mont kiyafet: " + mont[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("mont kiyafetler bulunmuyor veya atanmamis");
        }
    }
    public void rastgelekolye() {

        try {
            int sayi = (int) (Math.random() * kolye.length);
            if (kolye[sayi] != null) {
                System.out.println("Rastgele secilen kolye kiyafet: " + kolye[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("kolye kiyafetler bulunmuyor veya atanmamis");
        }
    }
    public void rastgelekupe() {

        try {
            int sayi = (int) (Math.random() * kupe.length);
            if (kupe[sayi] != null) {
                System.out.println("Rastgele secilen kupe kiyafet: " + kupe[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("kupe kiyafetler bulunmuyor veya atanmamis");
        }
    }
    public void rastgelebilezik() {

        try {
            int sayi = (int) (Math.random() * bilezik.length);
            if (bilezik[sayi] != null) {
                System.out.println("Rastgele secilen bilezik kiyafet: " + bilezik[sayi]);
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("bilezik kiyafetler bulunmuyor veya atanmamis");
        }
    }

    
//bu method kullanıcının seçtiği seçenekleri kulllanıcıya gösteriyor
    @Override
    public void goster() {
        if (askili != null) {
            System.out.println("Askili Kiyafetler:");
            for (String item : askili) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }

        if (kazak != null) {
            System.out.println("kazak Kiyafetler:");
            for (String item : kazak) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }

        if (straplez != null) {
            System.out.println("straplez Kiyafetler:");
            for (String item : straplez) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }

        if (tshirt != null) {
            System.out.println("tişört Kiyafetler:");
            for (String item : tshirt) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }

        if (ceket != null) {
            System.out.println("ceket Kiyafetler:");
            for (String item : ceket) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }

        if (mont != null) {
            System.out.println("mont Kiyafetler:");
            for (String item : mont) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }
         if (kupe != null) {
            System.out.println("kupeler:");
            for (String item : kupe) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }
          if (kolye != null) {
            System.out.println("kolyeler:");
            for (String item : kolye) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }
           if (bilezik != null) {
            System.out.println("bilezikler:");
            for (String item : bilezik) {
                if (item != null) {
                    System.out.println(item);
                }
            }
        }
    }

}
