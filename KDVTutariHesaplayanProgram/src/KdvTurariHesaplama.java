import java.util.Scanner;
public class KdvTurariHesaplama {
    public static void main(String[] args) {

        double tutar,tutar2,kdvOran1=0.18,kdvOran2=0.08;
        Scanner input=new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz : ");
        tutar=input.nextDouble();

        if(tutar<=1000){
            double kdvTutarı1=tutar*kdvOran1;
            double kdvliTutar1=tutar+kdvTutarı1;
            System.out.println("KDV Oranı : "+kdvOran1);
            System.out.println("KDV Tutarı : "+kdvTutarı1);
            System.out.println("KDV'li Tutar : "+kdvliTutar1);}
        else {
            double kdvTutarı2=tutar*kdvOran2;
            double kdvliTutar2=tutar+kdvTutarı2;
            System.out.println("KDV Oranı : "+kdvOran2);
            System.out.println("KDV Tutarı : "+kdvTutarı2);
            System.out.println("KDV'li Tutar : "+kdvliTutar2);}

        //İkinci tutar(girdi)

        tutar2=input.nextDouble();
        if(tutar2<=1000){
            double kdvTutarı1=tutar2*kdvOran1;
            double kdvliTutar1=tutar2+kdvTutarı1;
            System.out.println("KDV Oranı : "+kdvOran1);
            System.out.println("KDV Tutarı : "+kdvTutarı1);
            System.out.println("KDV'li Tutar : "+kdvliTutar1);}
        else {
            double kdvTutarı2=tutar2*kdvOran2;
            double kdvliTutar2=tutar2+kdvTutarı2;
            System.out.println("KDV Oranı : "+kdvOran2);
            System.out.println("KDV Tutarı : "+kdvTutarı2);
            System.out.println("KDV'li Tutar : "+kdvliTutar2);}







    }
}




