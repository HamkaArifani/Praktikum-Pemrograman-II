import java.util.Scanner;

public class PRAK101_2410817110006_HamkaArifani {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String Name=input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String placeOfBirth=input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        String dateOfBirth=input.nextLine();

        System.out.print("Masukkan BulanLahir: ");
        String monthOfBirthInput=input.nextLine();
        String monthOfBirth=switch (monthOfBirthInput){
            case "1" -> "Januari";
            case "2" -> "Februari";
            case "3" -> "Maret";
            case "4" -> "April";
            case "5" -> "Mei";
            case "6" -> "Juni";
            case "7" -> "Juli";
            case "8" -> "Agustus";
            case "9" -> "September";
            case "10" -> "Oktober";
            case "11" -> "November";
            case "12" -> "Desember";
            default -> "ERROR";
        };

        System.out.print("Masukkan Tahun Lahir: ");
        String yearOfBirth=input.nextLine();

        System.out.print("Masukkan Tinggi Badan: ");
        int height=input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double weight= input.nextDouble();

        System.out.println("Nama Lengkap "+ Name + ", Lahir di "+ placeOfBirth +" pada Tanggal "+ dateOfBirth +" "+ monthOfBirth + " " + yearOfBirth);
        System.out.println("Tinggi Badan "+ height +" cm dan Berat Badan "+ weight +" Kilogram");
        input.close();
    }
}
