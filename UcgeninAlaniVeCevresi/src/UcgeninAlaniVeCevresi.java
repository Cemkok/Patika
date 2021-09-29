
import java.util.Scanner;
public class UcgeninAlaniVeCevresi {
    public static void main(String[] args) {
        double a,b,c;
        Scanner girdi=new Scanner(System.in);

        System.out.print("1.Kenarı giriniz : ");
        a=girdi.nextDouble();
        System.out.print("2.kenarı giriniz : ");
        b=girdi.nextDouble();
        System.out.print("3.Kenarı giriniz : ");
        c=girdi.nextDouble();
        double girilenDeğerler=a+b+c;
        System.out.println("Üçgenin çevresi : " + girilenDeğerler);

        //Üçgenin çevresine 2u dersek; üçgenin alanının "karesi" =u*(u-a)*(u-b)*(u-c) dir

        double u=((a+b+c)/2);
        double ücgeninAlanı=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin alanı  :  "+ücgeninAlanı);






    }
}

