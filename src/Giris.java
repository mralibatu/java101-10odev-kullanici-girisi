import java.util.Scanner;
public class Giris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gkullaniciadi,gsifre;
        String kullaniciadi = "mralibatu", sifre ="404";
        System.out.println("Hosgeldiniz!\n" +"Lutfen kullanici adi giriniz :");
        gkullaniciadi = input.nextLine();
        System.out.println("Lutfen sifre giriniz :");
        gsifre = input.nextLine();

        if (gkullaniciadi.equals(kullaniciadi) && (gsifre.equals(sifre))){
            System.out.println("Basariyla giris yaptiniz!");
        }else {
            System.out.println("Bilgileriniz yanlis, sifrenizi sifirlamak isterseniz 1 e basin");
            int x = input.nextInt();

            switch(x) {
                case 1:
                    System.out.println("Yeni sifrenizi giriniz : ");
                    gsifre = input.nextLine();
                break;
                default:
                    System.out.println("Sıfre degistirilmek istenmedi");
            }
            gsifre = input.nextLine();
            if (gsifre.equals(sifre) && x == 1){
                System.out.println("Girdiginiz sifre onceki sifre ile ayni, tekrar deneyin");
                gsifre = input.nextLine();
            } else if (x != 1) {
                System.out.println("Iyi gunler");
            } else{
                System.out.println("Yeni sifre basariyla olusturuldu");
            }
        }

    }
}
