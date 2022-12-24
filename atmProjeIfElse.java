import java.util.Scanner;

public class atmProjeIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int select;
        int paraYatirma;
        int paraCekme;
        int bakiye = 2000;

        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = input.nextLine();
            System.out.print("Parolanızı giriniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.print("Merhabalar Kodluyoruz bankasına hoşgeldiniz ");
                do {
                    System.out.println(" Lütfen yapmak istediğiniz işlemi seçin : ");
                    System.out.print("\n1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış Yap\n");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.println("Yatırmak istediğiniz tutarı giriniz: ");
                        paraYatirma = input.nextInt();
                        int py = bakiye + paraYatirma;
                        System.out.println("İşlem sonrası bakiyeniz :" + py);
                        break;
                    }
                    if (select == 2) {
                        System.out.println("Çekmek istediğiniz tutarı giriniz:");
                        paraCekme = input.nextInt();
                        int pc = bakiye - paraCekme;
                        if (paraCekme > bakiye) {
                            System.out.println("Yetersiz bakiye");
                        }
                        System.out.println("İşlem sonrası bakiyeniz:" + pc);
                        break;
                    }
                    if (select == 3) {
                        System.out.println("Hesap bakiyeniz :" + bakiye);
                        break;
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek üzere");
                break;
            } else {

                right--;
                if (right > 0) {
                    System.out.println("Hatalı Kullanıcı Adı veya Parola,Lütfen tekrar deneyiniz.");
                }
            }
            if (right == 0) {
                System.out.println("Hesabınız bloke olmuştur.Lütfen banka şubenizle görüşün.");

            } else {
                System.out.println("Kalan hakkınız " + right);
            }

        }


    }
}
