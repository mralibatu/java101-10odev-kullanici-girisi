import java.util.Scanner;
public class Giris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gkullaniciadi,gsifre;                //Kullanıcının gireceği değerler
        String kullaniciadi = "mralibatu", sifre ="404";    //doğru olan değerler

        System.out.println("Hosgeldiniz!\n" +"Lutfen kullanici adi giriniz :");
        gkullaniciadi = input.nextLine();
        System.out.println("Lutfen sifre giriniz :");
        gsifre = input.nextLine();

        if (gkullaniciadi.equals(kullaniciadi) && (gsifre.equals(sifre))){
            /*
                equals ile gkullaniciadi ve kullaniciadi ni karsılastırıyoruz
                && ise hem kullanıcı adının hem sifrenin dogrusunu istedigimizden kullanıyoruz.
            */
            System.out.println("Basariyla giris yaptiniz!");
        }else {
            System.out.println("Bilgileriniz yanlis, sifrenizi sifirlamak isterseniz 1 e basin");

            int x = input.nextInt();        /*sıfırlayıp isteyip istemedigini ogrenmek icin bir x degiskeni atayıp
                                     bunun dogru olup olmadıgına bakacaz case ile       */
            switch(x) {
                case 1:
                    System.out.println("Yeni sifrenizi giriniz : ");
                    gsifre = input.nextLine();
                break;
                default:
                    System.out.println("Sıfre degistirilmek istenmedi");
            }
            gsifre = input.nextLine();
            if (gsifre.equals(sifre) && x == 1){            /*sifrenin onceki sifreyle aynı olup olmadıgını kontrol ediyoruz
                                                        x==1 kullanımının sebebi eger sifre degistirme talebi yoksa if e girmemesi */
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
