import java.util.Scanner;

public class PRAK102_2410817110006_HamkaArifani {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int startNumber= scan.nextInt();
        int counter= 0;
        while(counter<11){
            if (startNumber % 5 == 0) {
                System.out.print(startNumber/5-1);
            } else {
                System.out.print(startNumber);
            }
            System.out.print(", ");
            startNumber++;
            counter++;
        }
        scan.close();
    }
}
