package soal2;

import java.util.Scanner;

public class Number2Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:");
        System.out.println("1= Kucing");
        System.out.println("2= Anjing");
        System.out.print("Masukkan pilihan: ");
        int choice=scan.nextInt();
        scan.nextLine();

        System.out.print("Nama hewan peliharaan: ");
        String petName=scan.nextLine();
        System.out.print("Ras: ");
        String petSpecies=scan.nextLine();

        if(choice==1){
            System.out.print("Warna Bulu: ");
            String furColor=scan.nextLine();
            Cat cat = new Cat(petName, petSpecies, furColor);
            cat.display();
        }
        else if(choice==2){
            System.out.print("Warna bulu: ");
            String furColor=scan.nextLine();
            System.out.print("Kemampuan: ");
            String petAbillity=scan.nextLine();
            Dog dog = new Dog(petName, petSpecies, furColor, petAbillity);
            dog.display();
        } else{
            System.out.print("ERROR!");
        }
    }
}
