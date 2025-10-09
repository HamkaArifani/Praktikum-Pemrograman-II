import java.util.Scanner;

public class PRAK105_2410817110006_HamkaArifani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double phi=3.14;

        System.out.print("Masukkan jari-jari: ");
        double radius=scan.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height=scan.nextDouble();

        double cylinderVolume= phi*radius*radius*height;

        System.out.printf("Volume tabung dengan jari-jari %.1f cm dan %n", radius);
        System.out.printf("tinggi %.1f cm adalah %.3f m3", height, cylinderVolume);
    }
}
