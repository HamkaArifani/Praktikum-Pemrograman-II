package soal1;

import java.util.Scanner;

public class Number1Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nama hewan peliharaan: ");
        String petName = scan.nextLine();

        System.out.print("Dengan ras: ");
        String petSpecies = scan.nextLine();

        pet Pet = new pet(petName, petSpecies);
        Pet.display();
        scan.close();
    }
}
