import java.util.Scanner;


public class SliceOfCircle {
    public static void main(String[] args) {
            double pi=3.14
                    ,alan,alfa,r;

            Scanner input=new Scanner(System.in);

            System.out.print("Alanı Bulunacak Dairenin Diliminin Merkez Açısını Giriniz: ");
            alfa=input.nextDouble();
            System.out.print("Yarı Çapı Giriniz  : ");
            r=input.nextDouble();

            alan=(pi*r*r*alfa)/360;
            System.out.println(alan);







        }
    }


