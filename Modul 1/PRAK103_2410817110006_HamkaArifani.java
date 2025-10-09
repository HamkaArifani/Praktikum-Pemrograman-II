import java.util.Scanner;

public class PRAK103_2410817110006_HamkaArifani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count=scan.nextInt();
        int startNumber=scan.nextInt();

        int counter=0;
        do {
            if(startNumber % 2 != 0){
                System.out.print(startNumber+ ", ");
                counter++;
            }
            startNumber++;
        } while(counter<count);
        scan.close();
    }
}
