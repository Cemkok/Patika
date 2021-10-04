import java.util.Scanner;

public class BMI_Calculator {


        public static void main(String[] args) {
            double boy,kilo,index;

            Scanner input = new Scanner(System.in);

            System.out.print("Boyunuzu Giriniz (metre) : ");
            boy=input.nextDouble();
            System.out.print("Kilonuzu Giriniz  (kg): ");
            kilo=input.nextDouble();

            index=(kilo)/(boy*boy);

            System.out.print("Vücut Kitle İndexiniz : "+index);


        }
    }


