import java.util.Scanner;

public class Etkinlik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sicaklik;
        System.out.print("Lütfen hava sıcaklığını giriniz :");
        sicaklik =scan.nextInt();

        if(sicaklik< 5) {
            System.out.println("Kayak yapabilirsiniz");
        } else if (5<sicaklik && sicaklik<15) {
            System.out.println("Sinemaya gidebilirsiniz");
        }
           else if(15<sicaklik && sicaklik<25) {
            System.out.println("Piknik yapabilirsiniz");
        }
            else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }
        }
    }

