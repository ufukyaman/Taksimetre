import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenlerin tanımlanması
        int km;
        double perKm=2.2,total=10;

        //Scanner sınıfı
        Scanner imp=new Scanner(System.in);

        //Kullanıcıdan değer alıp değişkene atanması
        System.out.print("Kaç km gideceğinizi giriniz: ");
        km= imp.nextInt();

        //İlgili hesaplamaların yapılıp ekrana bastırılması
        total += perKm*km;
        total = (total > 20) ? total:20;
        System.out.println("Ödemeniz gereken tutar: "+total);
    }
}