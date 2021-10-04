import java.util.Scanner;

    public class Taximeter {
        public static void main(String[] args) {
            int km;
            double perKmPrice=2.20, total, startPrice=10;
            Scanner inputKm=new Scanner(System.in);
            System.out.print("Mesafeyi KM cinsinden giriniz  :  ");
            km= inputKm.nextInt();


            total =(km*perKmPrice);
            total+=startPrice;

            total=(total<20)? 20 : total;

            System.out.println("Toplam Tutar  :  " +total);






        }
    }



