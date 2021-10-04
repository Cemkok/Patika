import java.util.Scanner;

public class GreenGrocerCal {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, Muz=0.95, patlıcan=5, toplam;
        double kgArmut,kgElma,kgDomat,kgMuz, kgPatlıcan;


        Scanner input=new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        kgArmut=input.nextDouble();

        System.out.print("Elma Kaç Kilo ? : ");
        kgElma=input.nextDouble();

        System.out.print("Domates Kaç Kilo ? : ");
        kgDomat=input.nextDouble();

        System.out.print("Muz Kaç Kilo ? : ");
        kgMuz=input.nextDouble();


        System.out.print("Patlıcan Kaç Kilo ?  :  ");
        kgPatlıcan=input.nextDouble();

        toplam=(armut*kgArmut)+(elma*kgElma)+(Muz*kgMuz)+(domates*kgDomat)+(patlıcan*kgPatlıcan);

        System.out.print("Toplam tutar : : "+toplam);



    }
}



