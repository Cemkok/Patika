import java.util.Scanner;
public class SinifGecmeDurumu {

    public static void main(String[] args) {
        double turkce,matematik,fizik,kimya,muzik;
        double avarage;

        Scanner input=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        matematik=input.nextInt();
        if(matematik>=0 && matematik<=100){

        } else {matematik=0;
            System.out.println("Yanlış aralıkta not girdiniz....(0-100). Bu not hesaplamya dahil edilmeyecek");
        }


        System.out.print("Türkçe notunuzu giriniz : ");
        turkce=input.nextInt();
        if(turkce>=0 && turkce<=100){

        } else {
            turkce=0;
            System.out.println("Yanlış aralıkta not girdiniz....(0-100). Bu not hesaplamya dahil edilmeyecek");}


        System.out.print("Fizik notunuzu giriniz : ");
        fizik=input.nextInt();
        if(fizik>=0 && fizik<=100){

        } else {System.out.println("Yanlış aralıkta not girdiniz....(0-100). Bu not hesaplamya dahil edilmeyecek");}

        System.out.print("Kimya notunuzu giriniz : ");
        kimya=input.nextInt();
        if(kimya>=0 && kimya<=100){

        } else {
            kimya=0;
            System.out.println("Yanlış aralıkta not girdiniz....(0-100). Bu not hesaplamya dahil edilmeyecek");}

        System.out.print("Muzik notunuz giriniz : ");
        muzik=input.nextInt();
        if(muzik>=0 && muzik<=100){

        } else {
            muzik=0;
            System.out.print("Yanlış aralıkta not girdiniz....(0-100). Bu not hesaplamya dahil edilmeyecek");}

        avarage=(matematik+turkce+fizik+kimya+muzik)/5;
        if(avarage>55){System.out.print("Tebrikler sınıfı geçtiniz ortalamanız : "+ avarage);}
        else{System.out.print("Sınıfta kaldınız, seneye görüşmek üzere! ortalamanız  :  " +avarage);}


    }


}
